% File          : izh03.m
% Author        : created by Eugene M. Izhikevich, Feb 25, 2003
%                 modified by Jewel Y. Lee, Nov 20, 2016
% Description   :
% simulation of a network of 1000 randomly coupled spiking neurons.
% - ratio of excitatory to inhibitory neurons is 4 to 1
% - make inhibitory synaptic connections stronger (Matrix S)
% - each neuron receives a noisy thalamic input (Matrix I)
% - Use uniformly distributed random number r to set neuron type
% - r = 0 => RS cell; r = 1 => chattering CH cell. 
% - r^2 to achieve heterogeneity (bias the distribution towards RS cells
% -----------------------------------------------------------------------
% Network of 1000 neurons
% - set ratio of excitatory to inhibitory neurons to be 4 to 1
% -----------------------------------------------------------------------
N_exc = 800;                                % 800 excitatory neurons
N_inh = 200;                                % 200 inhibitory neurons
N_total = N_exc + N_inh;                    % total of 1000 neurons
% -----------------------------------------------------------------------
% Excitatory neurons parameters (800x1 matrices)
% -----------------------------------------------------------------------
r_exc = rand(N_exc,1);                      % random r generated for exc n
a_exc = 0.02*ones(N_exc,1);
b_exc = 0.2*ones(N_exc,1);
c_exc = -65+15*r_exc.^2;
d_exc = 8+(-6)*r_exc.^2;
% -----------------------------------------------------------------------
% Inhibitory neurons parameters (200x1 matrices)
% -----------------------------------------------------------------------
r_inh = rand(N_inh,1);                      % random r generated for inh n
a_inh = 0.02+(0.08*r_inh);
b_inh = 0.25+(-0.05*r_inh);
c_inh = -65*ones(N_inh,1);
d_inh = 2*ones(N_inh,1);
% -----------------------------------------------------------------------
% Combining exc matrix (800x1) and ihn matrix (200x1) = 1000x1
% -----------------------------------------------------------------------
a = [a_exc;a_inh]; % time scale of u, smaller a results in slower recovery
b = [b_exc;b_inh]; % sensitivity of u to subthreshold fluctuations of v
c = [c_exc;c_inh]; % after-spike reset value of v 
d = [d_exc;d_inh]; % after-spike reset value of u
% -----------------------------------------------------------------------
% Snaptic connection weight
% - make S_exc weaker by multiply 0.5, so S_inh is stronger
% -----------------------------------------------------------------------
S_exc = 0.5*rand(N_total,N_exc);            % 1000x800 matrix
S_ihn = -rand(N_total,N_inh);               % 1000x200 matrix
S = [S_exc,S_ihn];                          % 1000X1000 matrix
% -----------------------------------------------------------------------
% membrane potential - initial value = -65 mv
% -----------------------------------------------------------------------
v = -65*ones(N_total,1);                    % 1000x1
% -----------------------------------------------------------------------
% membrane recovery variable - initial value
% -----------------------------------------------------------------------
u = b.*v;                                   % 1000x1
% -----------------------------------------------------------------------
% for random number generator. Gaussian with seed
% -----------------------------------------------------------------------
r_state = rng;
rng(777,'v4');

% -----------------------------------------------------------------------
% simulation of 1000 (ms) with 0.5 ms time step
% -----------------------------------------------------------------------
step = 0.5;                                 % time step
scale = 1/step;                             % scale for 
firings = [];                               % keep track of spike timings
for t=1:2000            
  I=[9*randn(N_exc,1);9*randn(N_inh,1)];    % noisy thalamic input 
  fired=find(v>=30);                        % find neurons that spikes
  firings=[firings;t+0*fired,fired];        % record time and spikes
  v(fired)=c(fired);                        % reset v after spike
  u(fired)=u(fired)+d(fired);               % reset u after spike
  I=I+scale*sum(S(:,fired),2);              % apply connection weights
  v=v+step*(0.04*v.^2+5*v+140-u+I);         % step 0.5 ms
  %v=v+0.5*(0.04*v.^2+5*v+140-u+I);         % for numerical
  u=u+a.*(b.*v-u);                          % stability
end;
plot(firings(:,1),firings(:,2),'.');


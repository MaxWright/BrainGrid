#include "Connections.h"
#include "ParseParamError.h"
#include "AllSynapses.h"

/* ------------- CONNECTIONS STRUCT ------------ *\
 * Below all of the resources for the various
 * connections are instantiated and initialized.
 * All of the allocation for memory is done in the
 * constructor’s parameters and not in the body of
 * the function. Once all memory has been allocated
 * the constructor fills in known information
 * into “radii” and “rates”.
\* --------------------------------------------- */
/* ------------------- ERROR ------------------- *\
 * terminate called after throwing an instance of 'std::bad_alloc'
 *      what():  St9bad_alloc
 * ------------------- CAUSE ------------------- *|
 * As simulations expand in size the number of
 * neurons in total increases exponentially. When
 * using a MATRIX_TYPE = “complete” the amount of
 * used memory increases by another order of magnitude.
 * Once enough memory is used no more memory can be
 * allocated and a “bsd_alloc” will be thrown.
 * The following members of the connection constructor
 * consume equally vast amounts of memory as the
 * simulation sizes grow:
 *      - W             - radii
 *      - rates         - dist2
 *      - delta         - dist
 *      - areai
 * ----------------- 1/25/14 ------------------- *|
 * Currently when running a simulation of sizes
 * equal to or greater than 100 * 100 the above
 * error is thrown. After some testing we have
 * determined that this is a hardware dependent
 * issue, not software. We are also looking into
 * switching matrix types from "complete" to
 * "sparce". If successful it is possible the
 * problematic matricies mentioned above will use
 * only 1/250 of their current space.
\* --------------------------------------------- */
Connections::Connections()
{
}

Connections::~Connections()
{
}

bool Connections::updateConnections(AllNeurons &neurons, const SimulationInfo *sim_info, Layout *layout)
{
    return false;
}

#if defined(USE_GPU)
void Connections::updateSynapsesWeights(const int num_neurons, AllNeurons &neurons, AllSynapses &synapses, const SimulationInfo *sim_info, AllSpikingNeurons* m_allNeuronsDevice, AllSpikingSynapses* m_allSynapsesDevice, Layout *layout)
{
}
#else
/**
 *  Update the weight of the Synapses in the simulation.
 *  Note: Platform Dependent.
 *  @param  num_neurons number of neurons to update.
 *  @param  neurons the Neuron list to search from.
 *  @param  synapses    the Synapse list to search from.
 *  @param  sim_info    SimulationInfo to refer from.
 */
void Connections::updateSynapsesWeights(const int num_neurons, AllNeurons &neurons, AllSynapses &synapses, const SimulationInfo *sim_info, Layout *layout)
{
}
#endif // !USE_GPU
package edu.uwb.braingrid.workbench.ui;

import edu.uwb.braingrid.workbench.WorkbenchManager;
import edu.uwb.braingrid.workbench.utils.DateTime;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JFileChooser;

/**
 * The workbench control frame is responsible for specifying BrainGrid project
 * files. It is the center of all input specification and provenance recording.
 *
 * @author Del Davis
 * @version 0.1
 */
public class WorkbenchControlFrame extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="Auto-Generated">
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProjectTitleLabel = new javax.swing.JLabel();
        simulationLabel = new javax.swing.JLabel();
        analyzeOutputSatusLabel = new javax.swing.JLabel();
        scriptSpecifiedLabel = new javax.swing.JLabel();
        configureSimulationButton = new javax.swing.JButton();
        specifyScriptButton = new javax.swing.JButton();
        analyzeOutputButton = new javax.swing.JButton();
        projectTitleTextLabel = new javax.swing.JLabel();
        simulationConfigurationLabel = new javax.swing.JLabel();
        scriptSpecificationLabel = new javax.swing.JLabel();
        outputFilenameLabel = new javax.swing.JLabel();
        projectOverviewLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        msgLabel = new javax.swing.JLabel();
        scriptGenerateButton = new javax.swing.JButton();
        generatedScriptFilenameLabel = new javax.swing.JLabel();
        scriptGeneratedLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        runScriptButton = new javax.swing.JButton();
        runScriptStatusLabel = new javax.swing.JLabel();
        scriptStatusMsgLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgText = new javax.swing.JTextArea();
        transferProgressBar = new javax.swing.JProgressBar();
        MainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newProjectMenuItem = new javax.swing.JMenuItem();
        openProjectMenuItem = new javax.swing.JMenuItem();
        saveProjectMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        viewProvenanceMenuItem = new javax.swing.JMenuItem();
        toolsMenu = new javax.swing.JMenu();
        NLEditMenuItem = new javax.swing.JMenuItem();
        ManageParamsClasses = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BrainGrid Workbench");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(414, 378));

        ProjectTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectTitleLabel.setText("Current Project: ");
        ProjectTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        simulationLabel.setText("Simulation:");

        analyzeOutputSatusLabel.setText("Execution:");

        scriptSpecifiedLabel.setText("Script:");

        configureSimulationButton.setText("Configure");
        configureSimulationButton.setEnabled(false);
        configureSimulationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configureSimulationButtonActionPerformed(evt);
            }
        });

        specifyScriptButton.setText("Specify");
        specifyScriptButton.setEnabled(false);
        specifyScriptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specifyScriptButtonActionPerformed(evt);
            }
        });

        analyzeOutputButton.setText("Analyze");
        analyzeOutputButton.setEnabled(false);
        analyzeOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeOutputButtonActionPerformed(evt);
            }
        });

        projectTitleTextLabel.setText("None");

        simulationConfigurationLabel.setText("None");
        simulationConfigurationLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        scriptSpecificationLabel.setText("None");
        scriptSpecificationLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        outputFilenameLabel.setText("None");
        outputFilenameLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        projectOverviewLabel.setText("Project Overview");

        msgLabel.setText("<html><i>Workbench Message: </i><b><p style=\"color:green\"></p></html>");
        msgLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        scriptGenerateButton.setText("Generate");
        scriptGenerateButton.setEnabled(false);
        scriptGenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scriptGenerateButtonActionPerformed(evt);
            }
        });

        generatedScriptFilenameLabel.setText("None");
        generatedScriptFilenameLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        scriptGeneratedLabel.setText("Script:");
        scriptGeneratedLabel.setPreferredSize(null);

        runScriptButton.setText("Run Script");
        runScriptButton.setEnabled(false);
        runScriptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runScriptButtonActionPerformed(evt);
            }
        });

        runScriptStatusLabel.setText("Status:");
        runScriptStatusLabel.setPreferredSize(null);

        scriptStatusMsgLabel.setText("None");

        msgText.setBackground(new java.awt.Color(225, 225, 225));
        msgText.setColumns(20);
        msgText.setRows(5);
        msgText.setAutoscrolls(false);
        msgText.setFocusable(false);
        jScrollPane1.setViewportView(msgText);

        transferProgressBar.setAlignmentX(-0.5F);
        transferProgressBar.setFocusable(false);

        fileMenu.setText("File");

        newProjectMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newProjectMenuItem.setText("New");
        newProjectMenuItem.setToolTipText("<html><i>Specify a new project</i></html>");
        newProjectMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        newProjectMenuItem.setIconTextGap(0);
        newProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProjectMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newProjectMenuItem);

        openProjectMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openProjectMenuItem.setText("Open");
        openProjectMenuItem.setToolTipText("<html><i>Open an existing project file</i></html>");
        openProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProjectMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openProjectMenuItem);

        saveProjectMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveProjectMenuItem.setText("Save");
        saveProjectMenuItem.setToolTipText("<html><i>Write the currently<br>open project to disk</i></html>");
        saveProjectMenuItem.setEnabled(false);
        saveProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProjectMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveProjectMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        MainMenuBar.add(fileMenu);

        viewMenu.setText("View");

        viewProvenanceMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        viewProvenanceMenuItem.setText("Provenance");
        viewProvenanceMenuItem.setToolTipText("<html><i>Display a visualization<br>of the current<br>project provenance</i></html>");
        viewProvenanceMenuItem.setEnabled(false);
        viewProvenanceMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProvenanceMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(viewProvenanceMenuItem);

        MainMenuBar.add(viewMenu);

        toolsMenu.setText("Tools");

        NLEditMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        NLEditMenuItem.setText("NLEdit");
        NLEditMenuItem.setToolTipText("<html><i>Launch the neuron layout editor</i></html>");
        NLEditMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NLEditMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(NLEditMenuItem);

        ManageParamsClasses.setText("Manage Params Classes");
        ManageParamsClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageParamsClassesActionPerformed(evt);
            }
        });
        toolsMenu.add(ManageParamsClasses);

        MainMenuBar.add(toolsMenu);

        setJMenuBar(MainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectOverviewLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProjectTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projectTitleTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(scriptGenerateButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(scriptGeneratedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(runScriptStatusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(configureSimulationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(specifyScriptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scriptSpecifiedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(simulationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(runScriptButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(analyzeOutputButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(analyzeOutputSatusLabel)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scriptStatusMsgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addComponent(generatedScriptFilenameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scriptSpecificationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outputFilenameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(simulationConfigurationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transferProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {analyzeOutputButton, configureSimulationButton, runScriptButton, scriptGenerateButton, specifyScriptButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {analyzeOutputSatusLabel, runScriptStatusLabel, scriptGeneratedLabel, scriptSpecifiedLabel, simulationLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectTitleTextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(projectOverviewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simulationConfigurationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(simulationLabel)
                        .addComponent(configureSimulationButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scriptSpecificationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(scriptSpecifiedLabel)
                        .addComponent(specifyScriptButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scriptGeneratedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scriptGenerateButton)
                    .addComponent(generatedScriptFilenameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(runScriptButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(runScriptStatusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scriptStatusMsgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(analyzeOutputSatusLabel)
                    .addComponent(analyzeOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputFilenameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ProjectTitleLabel, projectTitleTextLabel});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {analyzeOutputButton, analyzeOutputSatusLabel, configureSimulationButton, generatedScriptFilenameLabel, outputFilenameLabel, runScriptButton, runScriptStatusLabel, scriptGenerateButton, scriptGeneratedLabel, scriptSpecificationLabel, scriptSpecifiedLabel, scriptStatusMsgLabel, simulationConfigurationLabel, simulationLabel, specifyScriptButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Saves the current project to XML.
     *
     * <i>Assumption: This action is unreachable prior to specifying a new
     * project or loading a project from disk</i>
     *
     * @param evt - The event that triggered this action
     */
    private void saveProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProjectMenuItemActionPerformed
        workbenchMgr.saveProject();
        setMsg();
        pack();
    }//GEN-LAST:event_saveProjectMenuItemActionPerformed

    /**
     * Performs the action associated with clicking on the new project menu item
     * Starts a new project and creates a new XML document to go with it as well
     * as a new provenance constructor with an empty model.
     *
     * @param evt The event that triggered this action
     */
    private void newProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProjectMenuItemActionPerformed
        if (workbenchMgr.newProject()) {
            resetUILabelText();
            transferProgressBar.setVisible(false);
            enableInitialButtons();
            projectTitleTextLabel.setText(workbenchMgr.getProjectName());
            viewProvenanceMenuItem.setEnabled(workbenchMgr.isProvEnabled());
        }
        setMsg();
        pack();
    }//GEN-LAST:event_newProjectMenuItemActionPerformed

    /**
     * Launches the neuron list editor (NLEdit). NLEdit provides a means to
     * graphically specify Brain Grid simulation input files. InputAnalyzer
     * files represent lists of neurons with regard to their position in a
     * neuron array (e.g. position 12 is x: 1, y: 2 on a 10x10 grid)
     *
     * @param evt - The event that triggered this action
     */
    private void NLEditMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NLEditMenuItemActionPerformed
        workbenchMgr.launchNLEdit(this);
    }//GEN-LAST:event_NLEditMenuItemActionPerformed

    /**
     * Prompts the user to specify the simulator used. This should be the file
     * that was invoked, which used the input files specified, in order to write
     * the output file that was specified.
     *
     * @param evt - The event that triggered this action
     */
    private void specifyScriptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specifyScriptButtonActionPerformed
        if (workbenchMgr.specifyScript()) {
            workbenchMgr.invalidateScriptGenerated();
            workbenchMgr.invalidateScriptRan();
            workbenchMgr.invalidateScriptAnalyzed();
            updateProjectOverview();
        }
        setMsg();
        pack();
    }//GEN-LAST:event_specifyScriptButtonActionPerformed

    /**
     * Allows the user to open a previously defined BrainGrid project from an
     * XML file. The information from the project is queried to update the UI
     * and load the provenance model.
     *
     * @param evt - The event that triggered this action
     */
    private void openProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProjectMenuItemActionPerformed
        int code = workbenchMgr.openProject();
        switch (code) {
            case JFileChooser.APPROVE_OPTION:
                updateProjectOverview();
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
            case JFileChooser.ERROR_OPTION:
                break;
            case WorkbenchManager.EXCEPTION_OPTION:
            default:
                resetUILabelText();
                break;
        }
        setMsg();
        pack();
    }//GEN-LAST:event_openProjectMenuItemActionPerformed

    /**
     * Closes the frame. All child frames are also closed.
     *
     * @param evt - The event that triggered this action
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * Allows the user to select a simulation output file from the file system.
     * This file then validated and added to the project XML and provenance
     * model.
     *
     * @param evt - The event that triggered this action
     */
    private void analyzeOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeOutputButtonActionPerformed
        long timeCompleted = workbenchMgr.analyzeScriptOutput();
        if (timeCompleted != DateTime.ERROR_TIME) {
            analyzeOutputButton.setEnabled(false);
            outputFilenameLabel.setText("Completed at: "
                    + DateTime.getTime(timeCompleted));
        } else {
            outputFilenameLabel.setText("Script execution incomplete, try again later.");
        }
        setMsg();
        pack();
    }//GEN-LAST:event_analyzeOutputButtonActionPerformed

    private void scriptGenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scriptGenerateButtonActionPerformed
        if (workbenchMgr.generateScript()) {
            updateProjectOverview();
        }
        setMsg();
        pack();
    }//GEN-LAST:event_scriptGenerateButtonActionPerformed

    /**
     * Runs the script on the remote host.
     *
     * Connection information is entered in a SSHConnectionDialog
     *
     * @param evt
     */
    private void runScriptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runScriptButtonActionPerformed
        runScriptButton.setEnabled(false);
        if (workbenchMgr.runScript()) {
            String time = DateTime.getTime(new Date().getTime());
            String msg = "Script execution started at: " + time;
            scriptStatusMsgLabel.setText(msg);
            runScriptButton.setEnabled(false);
            analyzeOutputButton.setEnabled(true);
        } else {
            runScriptButton.setEnabled(true);
            analyzeOutputButton.setEnabled(false);
        }
        setMsg();
        pack();
    }//GEN-LAST:event_runScriptButtonActionPerformed

    /**
     * Prompts the user to select files for the simulation input. InputAnalyzer
     * files are created with NLEdit or by hand in XML. InputAnalyzer files
     * represent lists of neurons with regard to their position in a neuron
     * array (e.g. position 12 is x: 1, y: 2 on a 10x10 grid)
     *
     * @param evt - The event that triggered this action
     */
    private void configureSimulationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configureSimulationButtonActionPerformed
        if (workbenchMgr.configureSimulation()) {
            workbenchMgr.invalidateScriptGenerated();
            workbenchMgr.invalidateScriptRan();
            workbenchMgr.invalidateScriptAnalyzed();
            updateProjectOverview();
        }
        setMsg();
        pack();
    }//GEN-LAST:event_configureSimulationButtonActionPerformed

    private void viewProvenanceMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProvenanceMenuItemActionPerformed
        pack();
        setMsg();

        workbenchMgr.viewProvenance();
    }//GEN-LAST:event_viewProvenanceMenuItemActionPerformed

    private void ManageParamsClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageParamsClassesActionPerformed
        if (workbenchMgr.configureParamsClasses()) {
            updateProjectOverview();
        }
        setMsg();
        pack();
    }//GEN-LAST:event_ManageParamsClassesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MainMenuBar;
    private javax.swing.JMenuItem ManageParamsClasses;
    private javax.swing.JMenuItem NLEditMenuItem;
    private javax.swing.JLabel ProjectTitleLabel;
    private javax.swing.JButton analyzeOutputButton;
    private javax.swing.JLabel analyzeOutputSatusLabel;
    private javax.swing.JButton configureSimulationButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel generatedScriptFilenameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JTextArea msgText;
    private javax.swing.JMenuItem newProjectMenuItem;
    private javax.swing.JMenuItem openProjectMenuItem;
    private javax.swing.JLabel outputFilenameLabel;
    private javax.swing.JLabel projectOverviewLabel;
    private javax.swing.JLabel projectTitleTextLabel;
    private javax.swing.JButton runScriptButton;
    private javax.swing.JLabel runScriptStatusLabel;
    private javax.swing.JMenuItem saveProjectMenuItem;
    private javax.swing.JButton scriptGenerateButton;
    private javax.swing.JLabel scriptGeneratedLabel;
    private javax.swing.JLabel scriptSpecificationLabel;
    private javax.swing.JLabel scriptSpecifiedLabel;
    private javax.swing.JLabel scriptStatusMsgLabel;
    private javax.swing.JLabel simulationConfigurationLabel;
    private javax.swing.JLabel simulationLabel;
    private javax.swing.JButton specifyScriptButton;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JProgressBar transferProgressBar;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JMenuItem viewProvenanceMenuItem;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Members">
    private WorkbenchManager workbenchMgr;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Construction">
    /**
     * Responsible for allocating this frame and initializing auto-generated, as
     * well as custom, members
     */
    public WorkbenchControlFrame() {
        initComponents();
        initCustomMembers();
        center();
    }

    private void initCustomMembers() {
        workbenchMgr = new WorkbenchManager();

        transferProgressBar.setVisible(false);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="UI Manipulation">
    /**
     * Centers the frame in the operating system's GUI window
     */
    private void center() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
    }

    @Override
    /**
     * Fits the window to the maximum width and height of all the contained
     * components. The minimum size is reset to the current size after the pack
     * to make sure that the window can not get any smaller. As in the parent
     * component's implementation of pack, the window will always be within the
     * bounds of it's maximum size.
     */
    public void pack() {
        super.pack();
        setMinimumSize(getSize());
    }

    /**
     * Enables all of the buttons and menu items which are disabled prior to a
     * project being loaded or initialized.
     */
    private void enableInitialButtons() {
        configureSimulationButton.setEnabled(true);
        specifyScriptButton.setEnabled(true);
        saveProjectMenuItem.setEnabled(true);
    }

    /**
     * Disables all of the buttons and menu items related to project attribute
     * specification. Since the default behavior is to leave the previous
     * project open, this should only be called when an error is encountered
     * resulting in a null value for the open project.
     */
    private void disableProjectAttributeRelatedButtons() {
        configureSimulationButton.setEnabled(false);
        specifyScriptButton.setEnabled(false);
        runScriptButton.setEnabled(false);
        scriptGenerateButton.setEnabled(false);
        analyzeOutputButton.setEnabled(false);
        saveProjectMenuItem.setEnabled(false);
    }

    /**
     * Resets the UI text
     */
    private void resetUILabelText() {
        projectTitleTextLabel.setText("None");
        simulationConfigurationLabel.setText("None");
        scriptSpecificationLabel.setText("None");
        generatedScriptFilenameLabel.setText("None");
        scriptStatusMsgLabel.setText("None");
        outputFilenameLabel.setText("None");
        transferProgressBar.setValue(0);
    }

    private void updateSimOverview() {
        String overview = workbenchMgr.getSimulationOverview();
        scriptSpecificationLabel.setText(overview);
        scriptGenerateButton.setEnabled(
                workbenchMgr.scriptGenerationAvailable());
    }

    private void displaySimConfigFile() {
        String labelText = workbenchMgr.getSimConfigFileOverview();
        simulationConfigurationLabel.setText(labelText);
    }

    private void displayScriptGenerationOverview() {
        String filename = workbenchMgr.getScriptPath();
        if (filename != null) {
            generatedScriptFilenameLabel.setText(filename);
        }
    }

    private void displayScriptRunOverview() {
        String runAtMsg = workbenchMgr.getScriptRunOverview();
        if (runAtMsg != null) {
            scriptStatusMsgLabel.setText(runAtMsg);
        }
    }

    private void displayScriptAnalysisOverview() {
        String overview = workbenchMgr.getScriptAnalysisOverview();
        if (overview != null) {
            outputFilenameLabel.setText(overview);
        }
    }

    private void updateProjectOverview() {
        resetUILabelText();
        projectTitleTextLabel.setText(workbenchMgr.getProjectName());
        displaySimConfigFile();
        updateSimOverview();
        //transferProgressBar.setVisible(workbenchMgr.isSimExecutionRemote());
        displayScriptGenerationOverview();
        displayScriptRunOverview();
        displayScriptAnalysisOverview();
        enableInitialButtons();
        scriptGenerateButton.setEnabled(
                workbenchMgr.scriptGenerationAvailable());
        runScriptButton.setEnabled(!workbenchMgr.scriptRan()
                && workbenchMgr.scriptGenerated());
        analyzeOutputButton.setEnabled(workbenchMgr.scriptRan() && !workbenchMgr.scriptAnalyzed());
        viewProvenanceMenuItem.setEnabled(workbenchMgr.isProvEnabled());
    }

//    private void setMacCopyPaste() {
//        if (FileManager.getFileManager().isMacSystem()) {
//            InputMap im = (InputMap) UIManager.get("TextField.focusInputMap");
//            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_C,
//                    KeyEvent.META_DOWN_MASK), DefaultEditorKit.copyAction);
//            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_V,
//                    KeyEvent.META_DOWN_MASK), DefaultEditorKit.pasteAction);
//            im.put(KeyStroke.getKeyStroke(KeyEvent.VK_X,
//                    KeyEvent.META_DOWN_MASK), DefaultEditorKit.cutAction);
//        }
//    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="User Communication">
    /**
     * Sets the workbench message content. The content of this message is based
     * on the accumulated messages of produced by the functions of the workbench
     * manager.
     *
     */
    public void setMsg() {
        msgText.setText(workbenchMgr.getMessages());
    }
    // </editor-fold>
}
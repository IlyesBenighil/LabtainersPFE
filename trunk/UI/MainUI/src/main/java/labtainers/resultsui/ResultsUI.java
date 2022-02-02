/*
This software was created by United States Government employees at 
The Center for Cybersecurity and Cyber Operations (C3O) 
at the Naval Postgraduate School NPS.  Please note that within the 
United States, copyright protection is not available for any works 
created  by United States Government employees, pursuant to Title 17 
United States Code Section 105.   This software is in the public 
domain and is not subject to copyright. 
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
  1. Redistributions of source code must retain the above copyright
     notice, this list of conditions and the following disclaimer.
  2. Redistributions in binary form must reproduce the above copyright
     notice, this list of conditions and the following disclaimer in the
     documentation and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT,
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 */
package labtainers.resultsui;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import labtainers.mainui.MainWindow;
import static labtainers.resultsui.ResultsData.artifactValuesDiffer;

/**
 *
 * @author Daniel Liao
 */
public class ResultsUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJDialog
     */
    ResultsData data;
    ResultsData saved;
    MainWindow mainUI;
    
    public ResultsUI(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();
        this.setVisible(true);
        resultsScrollPaneBar = ScrollPaneOfArtifacts.getVerticalScrollBar();
        
        this.mainUI = (MainWindow)parent;
        this.data = new ResultsData(this.mainUI.getCurrentData().getResultsData());
        this.saved = new ResultsData(this.data);
        
        loadUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPaneOfArtifacts = new javax.swing.JScrollPane();
        PanelofArtifacts = new javax.swing.JPanel();
        CreateButton = new javax.swing.JButton();
        RemoveAllButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Results Configuration");
        setMaximumSize(new java.awt.Dimension(1590, 10000));
        setMinimumSize(new java.awt.Dimension(1590, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelofArtifacts.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        ScrollPaneOfArtifacts.setViewportView(PanelofArtifacts);

        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        RemoveAllButton.setText("Remove All");
        RemoveAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAllButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("OK");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("File");
        jLabel5.setToolTipText("File should either be a file path or a program/utility name with the \".stdin\", \".stdout\", or \".prgout\" extension.\n\n Ex. \"test.stdin\", \".local/result/sniff.txt\" ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Field Type");
        jLabel3.setToolTipText("The mode in which a value is found.");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Container");
        jLabel2.setToolTipText("Identifies the container hosting the file. \nIf \"ALL\" is selected, then the file is across all the containers.");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Result Tag");
        jLabel1.setToolTipText("The symbolic name of the result, which will be referenced in the goals configuration file. \n\n(It must be alphanumeric, underscores permitted) ");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoveAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel2)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel5)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(ScrollPaneOfArtifacts, javax.swing.GroupLayout.PREFERRED_SIZE, 1566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateButton)
                    .addComponent(RemoveAllButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneOfArtifacts, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(CancelButton))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
       createButton();
    }//GEN-LAST:event_CreateButtonActionPerformed
    
    private void RemoveAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAllButtonActionPerformed
        removeAllButton();
    }//GEN-LAST:event_RemoveAllButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if(updateButon()){
            mainUI.setResultsClosed();
            setVisible(false);
            dispose(); 
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       mainUI.setResultsClosed();
    }//GEN-LAST:event_formWindowClosing

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
       mainUI.setResultsClosed();
       setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    // BUTTONS //
    
    // Adds a new artifact panel
    private void createButton(){
        addResultsPanel(new ArtifactPanels(this, ResultsData.containerList,data.rowCount+1));
        resultsScrollPaneBar.setValue(resultsScrollPaneBar.getMaximum());
    }
    
    // Updates the results data object basd on the current results configuration UI state
    private boolean updateButon(){
        boolean retval = true;
        data.updateListofArtifacts(PanelofArtifacts);
        saved = new ResultsData(data);
        String fname = saved.writeResultsConfig(true);
        if(fname == null){
            retval = false;
        }else{ 
            this.mainUI.getCurrentData().setResultsData(saved);
        }
        return retval;
    }
    
    // Removes all the artifact panels
    private void removeAllButton(){
       if(JOptionPane.showConfirmDialog(null, "Are you sure you want to remove all?") == JOptionPane.YES_OPTION){
            removeAllArtifacts();
       }          
    }
    
    
    // CORE FUNCTIONS//
      
    // Adds artifact panel
    public int resultsPanePanelLength = 0;
    private JScrollBar resultsScrollPaneBar;
    private void addResultsPanel(ArtifactPanels panel){
        //Resize the JPanel Holding all the ResultArtifactsPanels to fit another one (makes the scroll bar resize and should show all objects listed)
        //as of 8/24/2020 the PanelofArtifacts uses a flow layout with a horizontal gap of 5, that's where the 5 comes from in the line below
        resultsPanePanelLength+=panel.getPreferredSize().height+5;
        PanelofArtifacts.setPreferredSize(new Dimension(0,resultsPanePanelLength));
        
        // Create the Result Artifact Panel and add it
        data.rowCount++;
        PanelofArtifacts.add(panel); //takes in parent(this), containerlist, rowcount
        
        // Redraw GUI with the new Panel
        PanelofArtifacts.revalidate();
        PanelofArtifacts.repaint(); 
    }    
    
    // Removes all the artifact lines for the lab *note: this doesn't update results.config or the resultsData until the user hits the update button
    private void removeAllArtifacts(){
        data.rowCount = 0;
        resultsPanePanelLength = 0;
        PanelofArtifacts.setPreferredSize(new Dimension(0,resultsPanePanelLength));
        Component[] componentList = PanelofArtifacts.getComponents();
        for(Component c: componentList){
            PanelofArtifacts.remove(c);
        }

        PanelofArtifacts.revalidate();
        PanelofArtifacts.repaint();
    }
    
    // loads the artifact panels based on the current data
    protected void loadUI(){
        removeAllArtifacts();               
        //redraw the artifacts
        for(int i=0; i < data.listofArtifacts.size(); i++)
            loadArtifact(data.listofArtifacts.get(i), i+1);
    }
    
    // Load the artifactlinePanel into GUI
    private void loadArtifact(ArtifactValues artifactVal, int rowNum){
        ArtifactPanels newArtifact = new ArtifactPanels(this, ResultsData.containerList, rowNum,
                                                        artifactVal.resultTag, 
                                                        artifactVal.container, 
                                                        artifactVal.fileID, 
                                                        artifactVal.fieldType, 
                                                        artifactVal.fieldID, 
                                                        artifactVal.lineType, 
                                                        artifactVal.lineID, 
                                                        artifactVal.timeStampType, 
                                                        artifactVal.timeStampDelimiter,
                                                        artifactVal.comments);
        addResultsPanel(newArtifact);
    }
    
    //Updates the list of artifacts and redraws them on screen
    public void refresh(){
       data.updateListofArtifacts(PanelofArtifacts);       
       loadUI();
    }
    
    
    // OTHER //
    
    public void refactorContainerReferenceInUI(String oldName, String newName){
        data.updateListofArtifacts(PanelofArtifacts); 
        data.refactorContainerReference(oldName, newName);
        saved.refactorContainerReference(oldName, newName);
        loadUI();
    }
    
    //Check if the the current state of the UI matches with what's saved in the results.config
    /*
    void checkUnsavedChangesMade(){
            data.updateListofArtifacts(PanelofArtifacts);

            if(artifactValuesDiffer(data.listofArtifacts, data.getArtifactValuesOfConfigFile())){
                int confirmed = JOptionPane.showConfirmDialog(null, 
                    "There are Unsaved Changes. Are you sure you want to exit the program?", "Unsaved Changes",
                    JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) 
                    dispose();
                else
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
            else
                dispose();
    }
    */
    
    
    // GETTERS //
    
    //Gets the panel holding the artifacts
    protected JPanel getPanelofArtifacts(){
        return PanelofArtifacts;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultsUI dialog = new ResultsUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CreateButton;
    private javax.swing.JPanel PanelofArtifacts;
    private javax.swing.JButton RemoveAllButton;
    private javax.swing.JScrollPane ScrollPaneOfArtifacts;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
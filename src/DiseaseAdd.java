/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke Walsh
 */
public class DiseaseAdd extends javax.swing.JFrame {

    /**
     * Creates new form DiseaseAdd
     */
    public DiseaseAdd() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NoTextErrorMessage = new javax.swing.JOptionPane();
        DiseaseNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CurrentRadioButton = new javax.swing.JRadioButton();
        PastRadioButton = new javax.swing.JRadioButton();
        DoneButton = new javax.swing.JButton();
        AddAnotherButton = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Disease:");

        buttonGroup1.add(CurrentRadioButton);
        CurrentRadioButton.setText("Current");

        buttonGroup1.add(PastRadioButton);
        PastRadioButton.setText("Past");

        DoneButton.setText("Done");
        DoneButton.setMaximumSize(new java.awt.Dimension(123, 29));
        DoneButton.setMinimumSize(new java.awt.Dimension(123, 29));
        DoneButton.setPreferredSize(new java.awt.Dimension(123, 29));
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        AddAnotherButton.setText("Add Another");
        AddAnotherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAnotherButtonActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.setMaximumSize(new java.awt.Dimension(123, 29));
        Cancel.setMinimumSize(new java.awt.Dimension(123, 29));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DiseaseNameTextField)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(CurrentRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PastRadioButton)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddAnotherButton)
                .addGap(17, 17, 17)
                .addComponent(DoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiseaseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PastRadioButton)
                    .addComponent(CurrentRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddAnotherButton)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //saves the disease under the current medical record into the database
    //closes the window and reopens the AddMedicalRecord window
    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        boolean empty = false;
        if (CurrentRadioButton.isSelected()) {
            newDisease[counter] = "Current";
        } else if (PastRadioButton.isSelected()) {
            newDisease[counter] = "Past";
        } else {
            empty = true;
        }
        if (DiseaseNameTextField.getText().isEmpty()) {
            empty = true;
        }
        if (empty) {
             NoTextErrorMessage.showMessageDialog(DoneButton, "Please answer all fields name.");
        } else {
            counter++;
            newDisease[counter] = DiseaseNameTextField.getText();
            counter++;
            AddMedicalRecord pop = new AddMedicalRecord();
            pop.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_DoneButtonActionPerformed

    //saves the disease under the current medical record into the database
    //reopens the current window
    private void AddAnotherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAnotherButtonActionPerformed
        // TODO add your handling code here:
         boolean empty = false;
        if (CurrentRadioButton.isSelected()) {
            newDisease[counter] = "Current";
        } else if (PastRadioButton.isSelected()) {
            newDisease[counter] = "Past";
        } else {
            empty = true;
        }
        if (DiseaseNameTextField.getText().isEmpty()) {
            empty = true;
        }
        if (empty) {
             NoTextErrorMessage.showMessageDialog(DoneButton, "Please answer all fields.");
        } else {
            counter++;
            newDisease[counter] = DiseaseNameTextField.getText();
            counter++;
            DiseaseAdd pop = new DiseaseAdd();
            pop.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_AddAnotherButtonActionPerformed

    //reopens the AddMedicalRecord window and closes the current window
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        AddMedicalRecord pop = new AddMedicalRecord();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(DiseaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiseaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiseaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiseaseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiseaseAdd().setVisible(true);
            }
        });
    }
    String[] newDisease = new String[100];
    int counter = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAnotherButton;
    private javax.swing.JButton Cancel;
    private javax.swing.JRadioButton CurrentRadioButton;
    private javax.swing.JTextField DiseaseNameTextField;
    private javax.swing.JButton DoneButton;
    private javax.swing.JOptionPane NoTextErrorMessage;
    private javax.swing.JRadioButton PastRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke Walsh
 */
public class AddMedicalRecord extends javax.swing.JFrame {

    /**
     * Creates new form PopUpAdd
     */
    public AddMedicalRecord() {
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

        NoTextErrorMessage = new javax.swing.JOptionPane();
        MRDone = new javax.swing.JButton();
        MRCancelAdd = new javax.swing.JButton();
        PetNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NewPetButton = new javax.swing.JButton();
        AddDiseaseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MRDone.setText("Done");
        MRDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRDoneActionPerformed(evt);
            }
        });

        MRCancelAdd.setText("Cancel");
        MRCancelAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRCancelAddActionPerformed(evt);
            }
        });

        PetNameTextField.setOpaque(false);
        PetNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetNameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Pet Name:");

        jLabel2.setText("Diseases:");

        NewPetButton.setText("New Pet?");
        NewPetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPetButtonActionPerformed(evt);
            }
        });

        AddDiseaseButton.setText("Add Diseases Here");
        AddDiseaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDiseaseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MRCancelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MRDone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PetNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddDiseaseButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(43, 43, 43)
                        .addComponent(NewPetButton)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PetNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewPetButton))
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AddDiseaseButton))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MRCancelAdd)
                    .addComponent(MRDone))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PetNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PetNameTextFieldActionPerformed

    private void AddDiseaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDiseaseButtonActionPerformed
        // TODO add your handling code here:
        DiseaseAdd pop = new DiseaseAdd();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddDiseaseButtonActionPerformed

    private void NewPetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPetButtonActionPerformed
        // TODO add your handling code here:
        NewPet pop = new NewPet();
        pop.setVisible(true);
    }//GEN-LAST:event_NewPetButtonActionPerformed

    private void MRDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRDoneActionPerformed
        // TODO add your handling code here:
        if (PetNameTextField.getText().isEmpty()) {
             NoTextErrorMessage.showMessageDialog(MRDone, "Please enter a pet name.");
        } else {
            String newMedicalRecord = PetNameTextField.getText();
            VetDatabase pop = new VetDatabase();
            pop.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_MRDoneActionPerformed

    private void MRCancelAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRCancelAddActionPerformed
        // TODO add your handling code here:
        VetDatabase pop = new VetDatabase();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MRCancelAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicalRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDiseaseButton;
    private javax.swing.JButton MRCancelAdd;
    private javax.swing.JButton MRDone;
    private javax.swing.JButton NewPetButton;
    private javax.swing.JOptionPane NoTextErrorMessage;
    private javax.swing.JTextField PetNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

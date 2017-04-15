
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke Walsh
 */
public class AddVaccination extends javax.swing.JFrame {

    /**
     * Creates new form AddVaccination
     */
    public AddVaccination() {
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
        VaccinationTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        DoneButton = new javax.swing.JButton();
        AddAnotherButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        PetNameLabel = new javax.swing.JLabel();
        PetNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vaccination:");

        DoneButton.setText("Done");
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

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        PetNameLabel.setText("Pet Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addGap(49, 49, 49)
                        .addComponent(AddAnotherButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(DoneButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PetNameLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VaccinationTextField)
                            .addComponent(PetNameTextField))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PetNameLabel)
                    .addComponent(PetNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(VaccinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoneButton)
                    .addComponent(AddAnotherButton)
                    .addComponent(CancelButton))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //assigns the vaccination to the per's information and closes the window, while reopening the NewPet window
    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        if (VaccinationTextField.getText().isEmpty()) {
            NoTextErrorMessage.showMessageDialog(DoneButton, "Please enter a vaccination name.");
        } else {
            newVaccination[counter] = VaccinationTextField.getText();
            counter++;
            String[] newVaccine = new String[2];
            newVaccine[0] = PetNameTextField.getText();
            newVaccine[1] = VaccinationTextField.getText();
            boolean empty = false;
            for(int i = 0; i < 2; i++) {
                if(newVaccine[i].isEmpty()) {
                    empty = true;
                }
            }
            if (empty) {
                NoTextErrorMessage.showMessageDialog(DoneButton, "Please fill in all text fields.");
            } 
            else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into vaccinations(pet_name, vaccine_name)VALUES('"+newVaccine[0]+"', '"+newVaccine[1]+"');");
                    ps.executeUpdate();
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            this.dispose();
        }
    }//GEN-LAST:event_DoneButtonActionPerformed

    //Saves nothing to the database, but closes the window
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    //assigns the vaccination to the pet's info in the database, and reopens the current window
    private void AddAnotherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAnotherButtonActionPerformed
        // TODO add your handling code here:
        if (!VaccinationTextField.getText().isEmpty()) {
            newVaccination[counter] = VaccinationTextField.getText();
            counter++;
            AddVaccination pop = new AddVaccination();
            pop.setVisible(true);
            this.dispose();
        } else {
            NoTextErrorMessage.showMessageDialog(AddAnotherButton, "Please enter a vaccination name.");
        }
    }//GEN-LAST:event_AddAnotherButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddVaccination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVaccination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVaccination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVaccination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVaccination().setVisible(true);
            }
        });
    }
    String[] newVaccination = new String[100];
    int counter = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAnotherButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DoneButton;
    private javax.swing.JOptionPane NoTextErrorMessage;
    private javax.swing.JLabel PetNameLabel;
    private javax.swing.JTextField PetNameTextField;
    private javax.swing.JTextField VaccinationTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

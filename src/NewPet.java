
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
public class NewPet extends javax.swing.JFrame {

    /**
     * Creates new form NewPet
     */
    public NewPet() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //checks to see if there is already a pet with that name in the database
    public boolean petExists(String petName) throws SQLException {
        boolean exists = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
            PreparedStatement ps = con.prepareStatement("select pet_name from pets_info;");
            ResultSet rs = ps.executeQuery();
            List<String> results = new ArrayList<String>();
            while(rs.next()) {
                results.add(rs.getString(1));
            }
            for(int i = 0; i < results.size(); i++) {
                if(results.get(i).equals(petName)) {
                    exists = true;
                    i = results.size();
                }
            }
        } 
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return exists;
    }
    
    //checks to see if an owner with that name currently exists in the database
    public boolean ownerExists(String ownerName) throws SQLException {
        boolean exists = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
            PreparedStatement ps = con.prepareStatement("select owner_name from owners;");
            ResultSet rs = ps.executeQuery();
            List<String> results = new ArrayList<String>();
            while(rs.next()) {
                results.add(rs.getString(1));
            }
            for(int i = 0; i < results.size(); i++) {
                if(results.get(i).equals(ownerName)) {
                    exists = true;
                    i = results.size();
                }
            }
        } 
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return exists;
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
        PetNameTextField = new javax.swing.JTextField();
        OwnerAgeTextField = new javax.swing.JTextField();
        PetAgeTextField = new javax.swing.JTextField();
        AddVaccinationButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        DoneButton = new javax.swing.JButton();
        AnimalTypeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        breedTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddVaccinationButton.setText("Add Vaccination");
        AddVaccinationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVaccinationButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Pet's Name:");

        jLabel2.setText("Owner's Name:");

        jLabel3.setText("Pet's Age (in months):");

        jLabel4.setText("Vaccinations:");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Animal Type");

        jLabel6.setText("Breed (\"null\" if none):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(CancelButton)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddVaccinationButton)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addComponent(OwnerAgeTextField)
                    .addComponent(PetNameTextField)
                    .addComponent(PetAgeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AnimalTypeTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DoneButton))
                    .addComponent(breedTextField))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PetNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OwnerAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PetAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AnimalTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(breedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4))
                    .addComponent(AddVaccinationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(DoneButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // opens the AddVaccination window
    private void AddVaccinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVaccinationButtonActionPerformed
        AddVaccination pop = new AddVaccination();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddVaccinationButtonActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        String[] newPet = new String[5];
        newPet[0] = PetNameTextField.getText();
        newPet[1] = OwnerAgeTextField.getText();
        newPet[2] = PetAgeTextField.getText();
        newPet[3] = AnimalTypeTextField.getText();
        newPet[4] = breedTextField.getText();
        boolean empty = false;
        for (int i = 0; i < 5; i++) {
            if (newPet[i].isEmpty()) {
                empty = true;
            }
        }
        if (empty) {
             NoTextErrorMessage.showMessageDialog(DoneButton, "Please fill in all text fields.");
        } 
        else {
            try {
                if(petExists(newPet[0])) {
                    NoTextErrorMessage.showMessageDialog(DoneButton, "This pet already exists.");
                    this.dispose();
                }
                else if(!ownerExists(newPet[1])) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into pets_info(pet_name, owner_name, age_months, pet_type, breed)VALUES('"+newPet[0]+"', '"+newPet[1]+"', '"+newPet[2]+"', '"+newPet[3]+"', '"+newPet[4]+"');");
                    ps.executeUpdate();
                    
                    NoTextErrorMessage.showMessageDialog(DoneButton, "This owner does not exist yet, don't forget to create an owner record.");
                    this.dispose();
                }
                else {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into pets_info(pet_name, owner_name, age_months, pet_type, breed)VALUES('"+newPet[0]+"', '"+newPet[1]+"', '"+newPet[2]+"', '"+newPet[3]+"', '"+newPet[4]+"');");
                    ps.executeUpdate();
                    this.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_DoneButtonActionPerformed

    //closes the current window
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVaccinationButton;
    private javax.swing.JTextField AnimalTypeTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DoneButton;
    private javax.swing.JOptionPane NoTextErrorMessage;
    private javax.swing.JTextField OwnerAgeTextField;
    private javax.swing.JTextField PetAgeTextField;
    private javax.swing.JTextField PetNameTextField;
    private javax.swing.JTextField breedTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

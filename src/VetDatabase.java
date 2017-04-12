
import java.awt.LayoutManager;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke Walsh
 */
public class VetDatabase extends javax.swing.JFrame {

    /**
     * Creates new form VetDatabase
     */
    public VetDatabase() {
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

        SearchPane = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        MedicalRecordsLabel = new javax.swing.JLabel();
        AppointmentsSearch = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Search = new javax.swing.JMenu();
        SearchAppointments = new javax.swing.JMenu();
        AppointmentsForToday = new javax.swing.JMenuItem();
        AOwner = new javax.swing.JMenuItem();
        Date = new javax.swing.JMenuItem();
        Pets = new javax.swing.JMenuItem();
        Outstanding = new javax.swing.JMenuItem();
        Resolved = new javax.swing.JMenuItem();
        SearchMedicalRecords = new javax.swing.JMenu();
        Pet = new javax.swing.JMenuItem();
        MROwner = new javax.swing.JMenuItem();
        AnimalKind = new javax.swing.JMenuItem();
        Add = new javax.swing.JMenu();
        AddAppointment = new javax.swing.JMenuItem();
        AddMedicalRecord = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Enter Results From Appointments Search Here" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        MedicalRecordsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MedicalRecordsLabel.setText("Medical Records");

        AppointmentsSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AppointmentsSearch.setText("Appointments");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Enter Results From Medical Records Search Here" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        Search.setText("Search Filters");

        SearchAppointments.setText("Appointments");

        AppointmentsForToday.setText("Appointments For Today");
        AppointmentsForToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsForTodayActionPerformed(evt);
            }
        });
        SearchAppointments.add(AppointmentsForToday);

        AOwner.setText("Owner");
        AOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AOwnerActionPerformed(evt);
            }
        });
        SearchAppointments.add(AOwner);

        Date.setText("Date");
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        SearchAppointments.add(Date);

        Pets.setText("Pets");
        Pets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetsActionPerformed(evt);
            }
        });
        SearchAppointments.add(Pets);

        Outstanding.setText("Outstanding");
        Outstanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutstandingActionPerformed(evt);
            }
        });
        SearchAppointments.add(Outstanding);

        Resolved.setText("Resolved");
        Resolved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolvedActionPerformed(evt);
            }
        });
        SearchAppointments.add(Resolved);

        Search.add(SearchAppointments);

        SearchMedicalRecords.setText("Medical Records");

        Pet.setText("Pet");
        Pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetActionPerformed(evt);
            }
        });
        SearchMedicalRecords.add(Pet);

        MROwner.setText("Owner");
        MROwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MROwnerActionPerformed(evt);
            }
        });
        SearchMedicalRecords.add(MROwner);

        AnimalKind.setText("Animal Kind");
        AnimalKind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimalKindActionPerformed(evt);
            }
        });
        SearchMedicalRecords.add(AnimalKind);

        Search.add(SearchMedicalRecords);

        jMenuBar1.add(Search);

        Add.setText("Add");

        AddAppointment.setText("Appointment");
        AddAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAppointmentActionPerformed(evt);
            }
        });
        Add.add(AddAppointment);

        AddMedicalRecord.setText("Medical Record");
        AddMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMedicalRecordActionPerformed(evt);
            }
        });
        Add.add(AddMedicalRecord);

        jMenuBar1.add(Add);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppointmentsSearch)
                    .addComponent(MedicalRecordsLabel))
                .addGap(0, 827, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AppointmentsSearch)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MedicalRecordsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAppointmentActionPerformed
        AddAppointment pop = new AddAppointment();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddAppointmentActionPerformed

    private void AddMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMedicalRecordActionPerformed
        // TODO add your handling code here:
        AddMedicalRecord pop = new AddMedicalRecord();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddMedicalRecordActionPerformed

    private void AppointmentsForTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsForTodayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppointmentsForTodayActionPerformed

    private void AOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AOwnerActionPerformed
        // TODO add your handling code here:
        String s = SearchPane.showInputDialog("Please enter the owner's name.");
        
    }//GEN-LAST:event_AOwnerActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
        String s = SearchPane.showInputDialog("Please enter the date.");
    }//GEN-LAST:event_DateActionPerformed

    private void PetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetsActionPerformed
        // TODO add your handling code here:
        String s = SearchPane.showInputDialog("Please enter the pet's name.");
    }//GEN-LAST:event_PetsActionPerformed

    private void OutstandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutstandingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutstandingActionPerformed

    private void ResolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolvedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResolvedActionPerformed

    private void PetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetActionPerformed
        // TODO add your handling code here:
        String s = SearchPane.showInputDialog("Please enter the pet's name.");
    }//GEN-LAST:event_PetActionPerformed

    private void MROwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MROwnerActionPerformed
        // TODO add your handling code here:
        String s = SearchPane.showInputDialog("Please enter the owner's name.");
    }//GEN-LAST:event_MROwnerActionPerformed

    private void AnimalKindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalKindActionPerformed
        // TODO add your handling code here:
        String s = SearchPane.showInputDialog("Please enter the what type of animal.");
    }//GEN-LAST:event_AnimalKindActionPerformed

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
            java.util.logging.Logger.getLogger(VetDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VetDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VetDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VetDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VetDatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AOwner;
    private javax.swing.JMenu Add;
    private javax.swing.JMenuItem AddAppointment;
    private javax.swing.JMenuItem AddMedicalRecord;
    private javax.swing.JMenuItem AnimalKind;
    private javax.swing.JMenuItem AppointmentsForToday;
    private javax.swing.JLabel AppointmentsSearch;
    private javax.swing.JMenuItem Date;
    private javax.swing.JMenuItem MROwner;
    private javax.swing.JLabel MedicalRecordsLabel;
    private javax.swing.JMenuItem Outstanding;
    private javax.swing.JMenuItem Pet;
    private javax.swing.JMenuItem Pets;
    private javax.swing.JMenuItem Resolved;
    private javax.swing.JMenu Search;
    private javax.swing.JMenu SearchAppointments;
    private javax.swing.JMenu SearchMedicalRecords;
    private javax.swing.JOptionPane SearchPane;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

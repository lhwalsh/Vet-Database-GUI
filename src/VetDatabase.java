
import com.mysql.jdbc.Statement;
import java.awt.LayoutManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
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
        jPopupMenu1 = new javax.swing.JPopupMenu();
        MedicalRecordsLabel = new javax.swing.JLabel();
        AppointmentsSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        AppointmentsSearch1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
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
        VaccinationMenuItem = new javax.swing.JMenuItem();
        InfoMenuItem = new javax.swing.JMenuItem();
        OwnerInfoMenuItem = new javax.swing.JMenuItem();
        Add = new javax.swing.JMenu();
        AddAppointment = new javax.swing.JMenuItem();
        AddMedicalRecord = new javax.swing.JMenuItem();
        Update = new javax.swing.JMenu();
        AppointmentsUpdate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MedicalRecordsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MedicalRecordsLabel.setText("Medical Records");

        AppointmentsSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AppointmentsSearch.setText("Appointments");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        AppointmentsSearch1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AppointmentsSearch1.setText("Pet/Owner Information");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        Search.setText("View");

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

        VaccinationMenuItem.setText("Vaccinations");
        VaccinationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaccinationMenuItemActionPerformed(evt);
            }
        });
        SearchMedicalRecords.add(VaccinationMenuItem);

        Search.add(SearchMedicalRecords);

        InfoMenuItem.setText("Pet Information");
        InfoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoMenuItemActionPerformed(evt);
            }
        });
        Search.add(InfoMenuItem);

        OwnerInfoMenuItem.setText("Owner Information");
        OwnerInfoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerInfoMenuItemActionPerformed(evt);
            }
        });
        Search.add(OwnerInfoMenuItem);

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

        Update.setText("Update");

        AppointmentsUpdate.setText("Appointments");
        AppointmentsUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentUpdateActionPerformed(evt);
            }
        });
        Update.add(AppointmentsUpdate);

        jMenuBar1.add(Update);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppointmentsSearch)
                    .addComponent(MedicalRecordsLabel))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(AppointmentsSearch1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AppointmentsSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedicalRecordsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppointmentsSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //when you press Appointment from the Add menu, it should make the AddAppointment form visible and get rid of the current window.
    private void AddAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAppointmentActionPerformed
        AddAppointment pop = new AddAppointment();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddAppointmentActionPerformed

    //when you press Medical Record from the Add menu, it should make the AddMedicalRecord form visible and get rid of the current window.
    private void AddMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMedicalRecordActionPerformed
    AddMedicalRecord pop = new AddMedicalRecord();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddMedicalRecordActionPerformed

    //clicking this menu item, should take you to a new window that will display appointments for today 
    //and allow the user to search for a specific appointment
    private void AppointmentsForTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsForTodayActionPerformed
        jTextArea1.setText(null);
        String format = "%1$-15s %2$25s %3$25s %4$25s %5$25s";
        String someLine = String.format(format, "apptID", "apptDateTime", "petName", "ownerName", "status");
        jTextArea1.append(someLine + "\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
            PreparedStatement ps = con.prepareStatement("select * from appointments WHERE CAST(appt_date_time AS date) = CURDATE();");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
               int apptID = rs.getInt("apptID");
               String apptDateTime = rs.getString("appt_date_time");
               String petName = rs.getString("pet_name");
               String ownerName = rs.getString("owner_name");
               String status = rs.getString("status");
               String dash = "---";
                for(int i = 0; i < 50; i++) {
                    jTextArea1.append(dash);
                }
                jTextArea1.append("\n");
               format = "%1$-15s %2$25s %3$25s %4$30s %5$25s";
               someLine = String.format(format, apptID, apptDateTime, petName, ownerName, status);
               jTextArea1.append(someLine + "\n");
            }
            con.close();
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_AppointmentsForTodayActionPerformed

    //This should open a text box asking for the owner's name, followed by showing a list of the owners who have that name in the text field below
    private void AOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AOwnerActionPerformed
        String s = SearchPane.showInputDialog(null, "Please enter the owner's name.");
        jTextArea1.setText(null);
        String format = "%1$-15s %2$25s %3$25s %4$25s %5$25s";
        String someLine = String.format(format, "apptID", "apptDateTime", "petName", "ownerName", "status");
        jTextArea1.append(someLine + "\n");
        if(s == null) {
            //go back to the main menu because the user hit cancel
        }
        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                PreparedStatement ps = con.prepareStatement("select * from appointments WHERE owner_name = '"+s+"';");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                   int apptID = rs.getInt("apptID");
                   String apptDateTime = rs.getString("appt_date_time");
                   String petName = rs.getString("pet_name");
                   String ownerName = rs.getString("owner_name");
                   String status = rs.getString("status");
                   String dash = "---";
                    for(int i = 0; i < 50; i++) {
                        jTextArea1.append(dash);
                    }
                    jTextArea1.append("\n");
                   format = "%1$-15s %2$25s %3$25s %4$30s %5$25s";
                   someLine = String.format(format, apptID, apptDateTime, petName, ownerName, status);
                   jTextArea1.append(someLine + "\n");
                }
                con.close();
            } catch(ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_AOwnerActionPerformed

    //This should open a text box asking for the date, followed by showing a list of the appointments set for that date in the text field below
    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        String s = SearchPane.showInputDialog("Please enter the date. (Format: YYYY-MM-DD)");
        jTextArea1.setText(null);
        String format = "%1$-15s %2$25s %3$25s %4$25s %5$25s";
        String someLine = String.format(format, "apptID", "apptDateTime", "petName", "ownerName", "status");
        jTextArea1.append(someLine + "\n");
        if(s == null) {
            //go back to the main menu because the user hit cancel
        }
        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                PreparedStatement ps = con.prepareStatement("select * from appointments WHERE CAST(appt_date_time AS date) = '"+s+"';");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                   int apptID = rs.getInt("apptID");
                   String apptDateTime = rs.getString("appt_date_time");
                   String petName = rs.getString("pet_name");
                   String ownerName = rs.getString("owner_name");
                   String status = rs.getString("status");
                   String dash = "---";
                    for(int i = 0; i < 50; i++) {
                        jTextArea1.append(dash);
                    }
                    jTextArea1.append("\n");
                   format = "%1$-15s %2$25s %3$25s %4$30s %5$25s";
                   someLine = String.format(format, apptID, apptDateTime, petName, ownerName, status);
                   jTextArea1.append(someLine + "\n");
                }
                con.close();
            } catch(ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_DateActionPerformed

    //This should open a text box asking for the pet's name, followed by showing a list of the pets who have that name in the text field below
    private void PetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetsActionPerformed
        String s = SearchPane.showInputDialog("Please enter the pet's name.");
        jTextArea1.setText(null);
        String format = "%1$-15s %2$25s %3$25s %4$25s %5$25s";
        String someLine = String.format(format, "apptID", "apptDateTime", "petName", "ownerName", "status");
        jTextArea1.append(someLine + "\n");
        if(s == null) {
            //go back to the main menu because the user hit cancel
        }
        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                PreparedStatement ps = con.prepareStatement("select * from appointments WHERE pet_name = '"+s+"';");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                   int apptID = rs.getInt("apptID");
                   String apptDateTime = rs.getString("appt_date_time");
                   String petName = rs.getString("pet_name");
                   String ownerName = rs.getString("owner_name");
                   String status = rs.getString("status");
                   String dash = "---";
                    for(int i = 0; i < 50; i++) {
                        jTextArea1.append(dash);
                    }
                    jTextArea1.append("\n");
                   format = "%1$-15s %2$25s %3$25s %4$30s %5$25s";
                   someLine = String.format(format, apptID, apptDateTime, petName, ownerName, status);
                   jTextArea1.append(someLine + "\n");
                }
                con.close();
            } catch(ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_PetsActionPerformed

    //This should show a list of the outstanding appointments in the text field below
    private void OutstandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutstandingActionPerformed
        jTextArea1.setText(null);
        String format = "%1$-15s %2$25s %3$25s %4$25s %5$25s";
        String someLine = String.format(format, "apptID", "apptDateTime", "petName", "ownerName", "status");
        jTextArea1.append(someLine + "\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
            PreparedStatement ps = con.prepareStatement("select * from appointments WHERE status = 'outstanding' ORDER BY appt_date_time;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int apptID = rs.getInt("apptID");
                String apptDateTime = rs.getString("appt_date_time");
                String petName = rs.getString("pet_name");
                String ownerName = rs.getString("owner_name");
                String status = rs.getString("status");
                String dash = "---";
                for(int i = 0; i < 50; i++) {
                    jTextArea1.append(dash);
                }
                jTextArea1.append("\n");
                format = "%1$-15s %2$25s %3$25s %4$30s %5$25s";
                someLine = String.format(format, apptID, apptDateTime, petName, ownerName, status);
                jTextArea1.append(someLine + "\n");
            }
            con.close();
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_OutstandingActionPerformed

    //This should show a list of the resolved appointments in the text field below
    private void ResolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolvedActionPerformed
        jTextArea1.setText(null);
        String format = "%1$-15s %2$25s %3$25s %4$25s %5$25s";
        String someLine = String.format(format, "apptID", "apptDateTime", "petName", "ownerName", "status");
        jTextArea1.append(someLine + "\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
            PreparedStatement ps = con.prepareStatement("select * from appointments WHERE status = 'resolved' ORDER BY appt_date_time;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int apptID = rs.getInt("apptID");
                String apptDateTime = rs.getString("appt_date_time");
                String petName = rs.getString("pet_name");
                String ownerName = rs.getString("owner_name");
                String status = rs.getString("status");
                String dash = "---";
                for(int i = 0; i < 50; i++) {
                    jTextArea1.append(dash);
                }
                jTextArea1.append("\n");
                format = "%1$-15s %2$25s %3$25s %4$30s %5$25s";
                someLine = String.format(format, apptID, apptDateTime, petName, ownerName, status);
                jTextArea1.append(someLine + "\n");
            }
            con.close();
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_ResolvedActionPerformed

    //this should allow the user to enter the pet's name, then show all pets with that name in the corresponding text field below
    private void PetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetActionPerformed
        String s = SearchPane.showInputDialog("Please enter the pet's name.");
        jTextArea2.setText(null);
        String format = "%1$-15s %2$15s %3$35s %4$25s";
        String someLine = String.format(format, "recordID", "petName", "disease", "status");
        jTextArea2.append(someLine + "\n");
        if(s == null) {
            //go back to the main menu because the user hit cancel
        }
        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                PreparedStatement ps = con.prepareStatement("select * from medical_records WHERE pet_name = '"+s+"';");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                   int recordID = rs.getInt("recordID");
                   String petName = rs.getString("pet_name");
                   String diseaseName = rs.getString("disease_name");
                   String status = rs.getString("status");
                   String dash = "---";
                    for(int i = 0; i < 40; i++) {
                        jTextArea2.append(dash);
                    }
                    jTextArea2.append("\n");
                   format = "%1$-15s %2$25s %3$35s %4$25s";
                   someLine = String.format(format, recordID, petName, diseaseName, status);
                   jTextArea2.append(someLine + "\n");
                }
                con.close();
            } catch(ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_PetActionPerformed

    //this should allow the user to enter the owner's name, then show all owners with that name in the corresponding text field below
    private void MROwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MROwnerActionPerformed
        String s = SearchPane.showInputDialog("Please enter the owner's name.");
        jTextArea2.setText(null);
        String format = "%1$-15s %2$15s %3$35s %4$25s";
        String someLine = String.format(format, "recordID", "petName", "disease", "status");
        jTextArea2.append(someLine + "\n");
        if(s == null) {
            //go back to the main menu because the user hit cancel
        }
        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                PreparedStatement ps = con.prepareStatement("select * from medical_records AS mr, pets_info AS pi WHERE mr.pet_name = pi.pet_name AND pi.owner_name = '"+s+"';");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                   int recordID = rs.getInt("recordID");
                   String petName = rs.getString("pet_name");
                   String diseaseName = rs.getString("disease_name");
                   String status = rs.getString("status");
                   String dash = "---";
                    for(int i = 0; i < 40; i++) {
                        jTextArea2.append(dash);
                    }
                    jTextArea2.append("\n");
                   format = "%1$-15s %2$25s %3$35s %4$25s";
                   someLine = String.format(format, recordID, petName, diseaseName, status);
                   jTextArea2.append(someLine + "\n");
                }
                con.close();
            } catch(ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_MROwnerActionPerformed

    //this should allow the user to enter the pet's type, then show all pets with that type in the corresponding text field below
    private void AnimalKindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalKindActionPerformed
        String s = SearchPane.showInputDialog("Please enter the what type of animal.");
        jTextArea2.setText(null);
        String format = "%1$-15s %2$15s %3$35s %4$25s";
        String someLine = String.format(format, "recordID", "petName", "disease", "status");
        jTextArea2.append(someLine + "\n");
        if(s == null) {
            //go back to the main menu because the user hit cancel
        }
        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
                PreparedStatement ps = con.prepareStatement("select * from pet_types AS pt, pets_info AS pi, medical_records AS mr WHERE animal LIKE '"+s+"' AND pt.animal = pi.pet_type  AND pi.pet_name = mr.pet_name;");
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                   int recordID = rs.getInt("recordID");
                   String petName = rs.getString("pet_name");
                   String diseaseName = rs.getString("disease_name");
                   String status = rs.getString("status");
                   String dash = "---";
                    for(int i = 0; i < 40; i++) {
                        jTextArea2.append(dash);
                    }
                    jTextArea2.append("\n");
                   format = "%1$-15s %2$25s %3$35s %4$25s";
                   someLine = String.format(format, recordID, petName, diseaseName, status);
                   jTextArea2.append(someLine + "\n");
                }
                con.close();
            } catch(ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_AnimalKindActionPerformed

    //this should take you to the addappointment menu
    private void AppointmentUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentUpdateActionPerformed
        // TODO add your handling code here:
        UpdateForm pop = new UpdateForm();
        pop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AppointmentUpdateActionPerformed

    private void InfoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoMenuItemActionPerformed
        jTextArea3.setText(null);
        String format = "%1$-15s %2$15s %3$35s %4$30s %5$30s %6$30s";
        String someLine = String.format(format, "petID", "petName", "ownerName", "ageMonths", "pet_type", "breed");
        jTextArea3.append(someLine + "\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
            PreparedStatement ps = con.prepareStatement("select * from pets_info;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                    int petID = rs.getInt("petID");
                    String petName = rs.getString("pet_name");
                    String ownerName = rs.getString("owner_name");
                    int ageMonths = rs.getInt("age_months");
                    String pet_type = rs.getString("pet_type");
                    String breed = rs.getString("breed");
                    String dash = "---";
                    for(int i = 0; i < 70; i++) {
                        jTextArea3.append(dash);
                    }
                    jTextArea3.append("\n");
                    format = "%1$-15s %2$20s %3$40s %4$30s %5$35s %6$45s";
                    someLine = String.format(format, petID, petName, ownerName, ageMonths, pet_type, breed);
                    jTextArea3.append(someLine + "\n");
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_InfoMenuItemActionPerformed
        //this menu item will display owner information
    private void OwnerInfoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerInfoMenuItemActionPerformed
        jTextArea3.setText(null);
        String format = "%1$-15s %2$20s %3$50s %4$80s";
        String someLine = String.format(format, "ownerID", "ownerName", "address", "phone");
        jTextArea3.append(someLine + "\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
            PreparedStatement ps = con.prepareStatement("select * from owners;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                    int ownerID = rs.getInt("ownerID");
                    String ownerName = rs.getString("owner_name");
                    String address = rs.getString("address");
                    String phone = rs.getString("phone_number");
                    String dash = "---";
                    for(int i = 0; i < 70; i++) {
                        jTextArea3.append(dash);
                    }
                    jTextArea3.append("\n");
                    format = "%1$-15s %2$25s %3$60s %4$40s";
                    someLine = String.format(format, ownerID, ownerName, address, phone);
                    jTextArea3.append(someLine + "\n");
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_OwnerInfoMenuItemActionPerformed
        //this menu item will display all vaccinations in the table
    private void VaccinationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaccinationMenuItemActionPerformed
        jTextArea2.setText(null);
        String format = "%1$-15s %2$20s %3$40s";
        String someLine = String.format(format, "vaccineID", "petName", "vaccineName");
        jTextArea2.append(someLine + "\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets?useSSL=false", "root", "root");
            PreparedStatement ps = con.prepareStatement("select * from vaccinations;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                    int vaccineID = rs.getInt("vaccineID");
                    String petName = rs.getString("pet_name");
                    String vaccineName = rs.getString("vaccine_name");
                    String dash = "---";
                    for(int i = 0; i < 40; i++) {
                        jTextArea2.append(dash);
                    }
                    jTextArea2.append("\n");
                    format = "%1$-15s %2$30s %3$40s";
                    someLine = String.format(format, vaccineID, petName, vaccineName);
                    jTextArea2.append(someLine + "\n");
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_VaccinationMenuItemActionPerformed

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
    private javax.swing.JLabel AppointmentsSearch1;
    private javax.swing.JMenuItem AppointmentsUpdate;
    private javax.swing.JMenuItem Date;
    private javax.swing.JMenuItem InfoMenuItem;
    private javax.swing.JMenuItem MROwner;
    private javax.swing.JLabel MedicalRecordsLabel;
    private javax.swing.JMenuItem Outstanding;
    private javax.swing.JMenuItem OwnerInfoMenuItem;
    private javax.swing.JMenuItem Pet;
    private javax.swing.JMenuItem Pets;
    private javax.swing.JMenuItem Resolved;
    private javax.swing.JMenu Search;
    private javax.swing.JMenu SearchAppointments;
    private javax.swing.JMenu SearchMedicalRecords;
    private javax.swing.JOptionPane SearchPane;
    private javax.swing.JMenu Update;
    private javax.swing.JMenuItem VaccinationMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}

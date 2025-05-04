
package project;
import java.awt.Color;
import javax.swing.JOptionPane;  // For JOptionPane dialog boxes


public class AddDoctor extends javax.swing.JFrame {

    /**
     * Creates new form AddDoctor
     */
    public AddDoctor() {
        initComponents();
        int nextID = Admin.generateNextDoctorID();
        LabelDocID.setText(String.valueOf(nextID));
        helloAdminLabel.setText("Welcome Admin " + Admin.AdminName + "!");
        departmentIDTextField.setEditable(false);
        scheduleTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                scheduleTextFieldMousePressed(evt);
            }
        });
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        helloAdminLabel = new javax.swing.JLabel();
        LabelDocID = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UserNameTextField1 = new javax.swing.JTextField();
        specializationComboBox = new javax.swing.JComboBox<>();
        departmentIDTextField = new javax.swing.JTextField();
        scheduleTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Add New Doctor:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 298, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("DoctorID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 123, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Department ID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Specialization:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Schedule:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\addDoc.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        helloAdminLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        helloAdminLabel.setForeground(new java.awt.Color(0, 102, 153));
        helloAdminLabel.setText("Hello Admin [Name]!");
        jPanel1.add(helloAdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 278, -1));

        LabelDocID.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        LabelDocID.setForeground(new java.awt.Color(153, 153, 153));
        LabelDocID.setText("[ Doctor ID]");
        LabelDocID.setToolTipText("Next Doctor ID");
        jPanel1.add(LabelDocID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 130, 30));

        firstNameTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        firstNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 140, 35));

        lastNameTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lastNameTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(lastNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 140, 35));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("User Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, 40));

        UserNameTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UserNameTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(UserNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 170, 35));

        specializationComboBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        specializationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentist", "Ophthalmologist", "General Physician", "Cardiologist", "Orthopedic Surgeon", "Dermatologist", "Pediatrician" }));
        specializationComboBox.setSelectedIndex(-1);
        specializationComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        specializationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(specializationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 237, -1));

        departmentIDTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        departmentIDTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(departmentIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 140, 35));

        scheduleTextField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        scheduleTextField.setForeground(new java.awt.Color(102, 102, 102));
        scheduleTextField.setText("day-day timings");
        scheduleTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        scheduleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(scheduleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 290, 35));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("Password:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 40));

        PasswordTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PasswordTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 170, 35));

        CancelButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(0, 102, 153));
        CancelButton.setText("Cancel");
        CancelButton.setToolTipText("Cancel Adding Doctor");
        CancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 190, 61));

        AddButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(0, 102, 153));
        AddButton.setText("Add Doctor");
        AddButton.setToolTipText("Press to Add Doctor");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 190, 61));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void specializationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationComboBoxActionPerformed
        Admin admin = new Admin();
        String selectedSpecialization = (String) specializationComboBox.getSelectedItem();
        String departmentID = admin.getDepartmentIDBySpecialization(selectedSpecialization);
        departmentIDTextField.setText(departmentID);
    }//GEN-LAST:event_specializationComboBoxActionPerformed

    private void scheduleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleTextFieldActionPerformed

    }//GEN-LAST:event_scheduleTextFieldActionPerformed
   
    private void scheduleTextFieldMousePressed(java.awt.event.MouseEvent evt) {
    if (scheduleTextField.getText().equals("day-day timings")) {
        scheduleTextField.setText("");   
        scheduleTextField.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 18));
        scheduleTextField.setForeground(Color.BLACK);
    }
}
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed

        Admin_doctor adminFrame = new Admin_doctor();
        adminFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String FirstName = firstNameTextField.getText().trim();
        String LasttName = lastNameTextField1.getText().trim();
        String specialization = specializationComboBox.getSelectedItem().toString();
        String departmentIDText = departmentIDTextField.getText().trim();
        String schedule = scheduleTextField.getText().trim();
        String doctorIDText = LabelDocID.getText().trim();
        String Username = UserNameTextField1.getText().trim();
        String Password = PasswordTextField.getText().trim();

        if (FirstName.isEmpty() || LasttName.isEmpty() || specialization.isEmpty()
            || departmentIDText.isEmpty() || schedule.isEmpty() || doctorIDText.isEmpty()
            || Username.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String regex = "^(Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday) to "
        + "(Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday) "
        + "\\d{1,2}(am|pm)-\\d{1,2}(am|pm)$";

        if (!schedule.matches(regex)) {
            JOptionPane.showMessageDialog(this,
                "Invalid schedule format.\nPlease use: Sunday to Thursday 8am-3pm\nCase Sensitive!",
                "Schedule Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!FirstName.matches("[a-zA-Z]+") || !LasttName.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "First name and Last name must contain letters only.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Username.matches("^[a-zA-Z0-9@._-]{5,15}$")) {
            JOptionPane.showMessageDialog(this, "Username must be 5-15 characters and can include letters, numbers, and @ . _ -", "Username Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!Password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!^&+=]).{8,}$")) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long and include uppercase, lowercase, number, and special character.", "Password Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int doctorID = Integer.parseInt(doctorIDText);
            int departmentID = Integer.parseInt(departmentIDText);

            Admin admin = new Admin();
            admin.addDoctorToDatabase(doctorID, FirstName, LasttName, specialization, departmentID, schedule, Username, Password);

            JOptionPane.showMessageDialog(this, "Doctor added successfully!\nReturning to Services..");
            Admin_doctor adminFrame = new Admin_doctor();
            adminFrame.setVisible(true);
            this.setVisible(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Doctor ID and Department ID must be numbers only.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_AddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel LabelDocID;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JTextField UserNameTextField1;
    private javax.swing.JTextField departmentIDTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel helloAdminLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTextField1;
    private javax.swing.JTextField scheduleTextField;
    private javax.swing.JComboBox<String> specializationComboBox;
    // End of variables declaration//GEN-END:variables
}

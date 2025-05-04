/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;  // For JOptionPane dialog boxes
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class AddPatient extends javax.swing.JFrame {

    /**
     * Creates new form AddPatient
     */
    public AddPatient() {
        initComponents();
         Admin admin = new Admin();
        int nextID = admin.generateNextPatientID();
        labelPatientID.setText(String.valueOf(nextID));
        jLabel8.setText("Hello Admin " + Admin.AdminName + " !");
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
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelPatientID = new javax.swing.JLabel();
        FNameTextField = new javax.swing.JTextField();
        DOBTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MedHistoryTextField = new javax.swing.JTextField();
        ContactNoTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PasswordNoTextField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Add New Patient:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 290, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Full Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Patient ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 123, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Date Of Birth:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Contact Number:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Medical History:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\addDoc.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Hello Admin [Name]!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 278, -1));

        labelPatientID.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        labelPatientID.setForeground(new java.awt.Color(153, 153, 153));
        labelPatientID.setText("[ Patient ID]");
        labelPatientID.setToolTipText("Next Patient ID");
        jPanel1.add(labelPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 130, 30));

        FNameTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        FNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(FNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 140, 35));

        DOBTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DOBTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        DOBTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(DOBTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 140, 35));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("User Name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, 40));

        UsernameTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UsernameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 160, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("<html>(eg, Allergy, Diabetes, Asthma, High Blood Sugar...)<br> If no previous record please write: No previous medical conditions.<html>");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 400, 70));

        MedHistoryTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MedHistoryTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        MedHistoryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedHistoryTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(MedHistoryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 210, 35));

        ContactNoTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ContactNoTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(ContactNoTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, 180, 35));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setText("Password:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 40));

        PasswordNoTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PasswordNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        PasswordNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordNoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 180, 35));

        CancelButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(0, 102, 153));
        CancelButton.setText("Cancel");
        CancelButton.setToolTipText("Cancel Addiing ");
        CancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 190, 61));

        AddButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(0, 102, 153));
        AddButton.setText("Add Patient");
        AddButton.setToolTipText("Press to Add Patient");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 188, 61));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, -1, -1));

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

    private void FNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameTextFieldActionPerformed

    private void DOBTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBTextField1ActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void MedHistoryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedHistoryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedHistoryTextFieldActionPerformed

    private void PasswordNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordNoTextFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed

        Admin_patient admin_patient = new Admin_patient();
        admin_patient.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String PatientID = labelPatientID.getText().trim();
        String fullName = FNameTextField.getText().trim();
        String DateOfBirth = DOBTextField1.getText().trim();
        String ContactInfo = ContactNoTextField1.getText().trim();
        String MedicalHistory = MedHistoryTextField.getText().trim();
        String Username = UsernameTextField.getText().trim();
        String Password = PasswordNoTextField.getText().trim();

        // Check if any field is empty
        if (PatientID.isEmpty()|| fullName.isEmpty()|| DateOfBirth.isEmpty()|| ContactInfo.isEmpty()
            || MedicalHistory.isEmpty() || Username.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate Saudi contact number: must start with 05 and be 10 digits long
        if (!ContactInfo.matches("^05\\d{8}$")) {
            JOptionPane.showMessageDialog(this, "Contact number must start with 05 and be 10 digits long!");
            return;

        }
        if (!fullName.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Full name must contain only letters!", "Name Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Username.matches("^[a-zA-Z0-9@._-]{5,15}$")) {
            JOptionPane.showMessageDialog(this, "Username must be 5-15 characters long and can include letters, numbers, and @ . _ -.", "Username Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!Password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!^&+=]).{8,}$")) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long and include uppercase, lowercase, number, and special character.", "Password Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if input contains only letters and spaces (no digits or symbols)
        if (!MedicalHistory.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "Incorrect Medical History!\nPlease enter only letters.\n Numbers and symbols are not allowed!.");
            return;
        }

        // Validate Date format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);

        java.sql.Date sqlDateOfBirth = null;

        try {
            java.util.Date utilDate = sdf.parse(DateOfBirth);
            sqlDateOfBirth = new java.sql.Date(utilDate.getTime());

            java.util.Date today = new java.util.Date();
            if (sqlDateOfBirth.after(today)) {
                JOptionPane.showMessageDialog(this, "Date of Birth cannot be in the future!", "Date Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Date of Birth must be in format YYYY-MM-DD!", "Date Format Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int patientID = Integer.parseInt(PatientID);
            int contactInfo = Integer.parseInt(ContactInfo);
            Admin admin = new Admin();

            admin.addPatientToDatabase(patientID, Username, Password, fullName, sqlDateOfBirth, contactInfo, MedicalHistory);
            JOptionPane.showMessageDialog(this, "Patient added successfully!\nReturning to Services..");
            Admin_patient adminPFrame = new Admin_patient();
            adminPFrame.setVisible(true);
            this.setVisible(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Patient ID and Contact Number must be numbers!", "Number Format Error", JOptionPane.ERROR_MESSAGE);

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField ContactNoTextField1;
    private javax.swing.JTextField DOBTextField1;
    private javax.swing.JTextField FNameTextField;
    private javax.swing.JTextField MedHistoryTextField;
    private javax.swing.JTextField PasswordNoTextField;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPatientID;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Updatepatients extends javax.swing.JFrame {
private Connection conn;
    
    public Updatepatients() {
        initComponents();
        jLabel7.setText("Hello Patient  " + Patient.PatientName + " !");
        connectToDatabase();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        patientIDTextField = new javax.swing.JTextField();
        firstNameCheckBox = new javax.swing.JCheckBox();
        firstNameTextField = new javax.swing.JTextField();
        contactNoCheckBox = new javax.swing.JCheckBox();
        contactNoTextField = new javax.swing.JTextField();
        DOBCheckBox = new javax.swing.JCheckBox();
        DOBTextField = new javax.swing.JTextField();
        medHistoryCheckBox = new javax.swing.JCheckBox();
        medHistoryTextField = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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
        jLabel1.setText("Update Patient");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 278, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Enter Patient ID to Update:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 278, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Choose Fields to Update:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 278, -1));

        CancelButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(0, 102, 153));
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 190, 61));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\updateDoc.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 270, 290));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Hello Admin [Name]!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 278, -1));

        patientIDTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        patientIDTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        patientIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(patientIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 123, 30));

        firstNameCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        firstNameCheckBox.setForeground(new java.awt.Color(0, 102, 153));
        firstNameCheckBox.setText("Name");
        firstNameCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(firstNameCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 117, -1));

        firstNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        firstNameTextField.setEnabled(false);
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 130, 30));

        contactNoCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        contactNoCheckBox.setForeground(new java.awt.Color(0, 102, 153));
        contactNoCheckBox.setText("Contact Number");
        contactNoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(contactNoCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        contactNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        contactNoTextField.setEnabled(false);
        contactNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(contactNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 130, 30));

        DOBCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DOBCheckBox.setForeground(new java.awt.Color(0, 102, 153));
        DOBCheckBox.setText("Date Of birth");
        DOBCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(DOBCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 150, -1));

        DOBTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        DOBTextField.setEnabled(false);
        jPanel1.add(DOBTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 130, 30));

        medHistoryCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        medHistoryCheckBox.setForeground(new java.awt.Color(0, 102, 153));
        medHistoryCheckBox.setText("Medical History");
        medHistoryCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medHistoryCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(medHistoryCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 170, -1));

        medHistoryTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        medHistoryTextField.setEnabled(false);
        jPanel1.add(medHistoryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 130, 30));

        UpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(0, 102, 153));
        UpdateButton.setText("Update Patient");
        UpdateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 190, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
 this.setVisible(false);
        Admin_patient adminPFrame = new Admin_patient();
        adminPFrame.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void patientIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDTextFieldActionPerformed
        try {
            int patientID = Integer.parseInt(patientIDTextField.getText().trim());

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Patient WHERE PatientID = " + patientID);

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Patient ID not found. Please enter a valid ID.");

               
                firstNameCheckBox.setEnabled(false);
                contactNoCheckBox.setEnabled(false);
                DOBCheckBox.setEnabled(false);
                medHistoryCheckBox.setEnabled(false);

                firstNameTextField.setEnabled(false);
                contactNoTextField.setEnabled(false);
                DOBTextField.setEnabled(false);
                medHistoryTextField.setEnabled(false);
            } else {
                
                firstNameCheckBox.setEnabled(true);
                contactNoCheckBox.setEnabled(true);
                DOBCheckBox.setEnabled(true);
                medHistoryCheckBox.setEnabled(true);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric Patient ID.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_patientIDTextFieldActionPerformed

    private void firstNameCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameCheckBoxActionPerformed
        firstNameTextField.setEnabled(firstNameCheckBox.isSelected());
    }//GEN-LAST:event_firstNameCheckBoxActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void contactNoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoCheckBoxActionPerformed
        contactNoTextField.setEnabled(contactNoCheckBox.isSelected());
    }//GEN-LAST:event_contactNoCheckBoxActionPerformed

    private void contactNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoTextFieldActionPerformed

    private void DOBCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBCheckBoxActionPerformed
        DOBTextField.setEnabled(DOBCheckBox.isSelected());
    }//GEN-LAST:event_DOBCheckBoxActionPerformed

    private void medHistoryCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medHistoryCheckBoxActionPerformed
        medHistoryTextField.setEnabled(medHistoryCheckBox.isSelected());
    }//GEN-LAST:event_medHistoryCheckBoxActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        try {
            int patientID = Integer.parseInt(patientIDTextField.getText().trim());

            
            Statement checkStmt = conn.createStatement();
            ResultSet rs = checkStmt.executeQuery("SELECT * FROM Patient WHERE PatientID = " + patientID);

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, " Patient ID not found. Please enter a valid ID.");
               
                firstNameCheckBox.setSelected(false);
                contactNoCheckBox.setSelected(false);
                DOBCheckBox.setSelected(false);
                medHistoryCheckBox.setSelected(false);

                firstNameTextField.setEnabled(false);
                contactNoTextField.setEnabled(false);
                DOBTextField.setEnabled(false);
                medHistoryTextField.setEnabled(false);
                return; 
            }

          
            StringBuilder sql = new StringBuilder("UPDATE Patient SET ");
            boolean update = false;

            if (firstNameCheckBox.isSelected()) {
                sql.append("Name = '").append(firstNameTextField.getText()).append("', ");
                update = true;
            }
            if (contactNoCheckBox.isSelected()) {
                sql.append("ContactInfo = '").append(contactNoTextField.getText()).append("', ");
                update = true;
            }
            if (DOBCheckBox.isSelected()) {
                sql.append("DateOfBirth = '").append(DOBTextField.getText()).append("', ");
                update = true;
            }
            if (medHistoryCheckBox.isSelected()) {
                sql.append("MedicalHistory = '").append(medHistoryTextField.getText()).append("', ");
                update = true;
            }

            if (!update) {
                JOptionPane.showMessageDialog(this, " Please select at least one field to update.");
                return;
            }

            sql.setLength(sql.length() - 2); 
            sql.append(" WHERE PatientID = ").append(patientID);

            Statement updateStmt = conn.createStatement();
            int result = updateStmt.executeUpdate(sql.toString());

            if (result > 0) {
                JOptionPane.showMessageDialog(this, " Patient information updated successfully.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " Please enter a valid numeric Patient ID.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "️ Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void connectToDatabase() {
    try {
       
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB","hospital", "hospital");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
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
            java.util.logging.Logger.getLogger(Updatepatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updatepatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updatepatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updatepatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updatepatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JCheckBox DOBCheckBox;
    private javax.swing.JTextField DOBTextField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JCheckBox contactNoCheckBox;
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JCheckBox firstNameCheckBox;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox medHistoryCheckBox;
    private javax.swing.JTextField medHistoryTextField;
    private javax.swing.JTextField patientIDTextField;
    // End of variables declaration//GEN-END:variables
}

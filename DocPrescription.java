/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;
public class DocPrescription extends javax.swing.JFrame {

    /**
     * Creates new form DocPrescription
     */
    public DocPrescription() {
        initComponents();
        doctorIDTextField.setText(String.valueOf(Doctor.doctorID));
        helloDocLabel.setText("Welcome, Doctor " + Doctor.doctorName + "!");
        PresjLabel11.setText(String.valueOf(Doctor.nextPrescriptionID));
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        helloDocLabel = new javax.swing.JLabel();
        doctorIDTextField = new javax.swing.JTextField();
        patientIDTextField = new javax.swing.JTextField();
        medicationsTextField = new javax.swing.JTextField();
        dosageTextField = new javax.swing.JTextField();
        frequencyTextField = new javax.swing.JTextField();
        durationTextField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        prescribeButton = new javax.swing.JButton();
        PresjLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
        jLabel1.setText(" Prescription:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 220, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Patient ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("DoctorID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 123, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Medications:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Dosage:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, -1, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Duration:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\pres.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 390, 460));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Frequency");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 130, 80));

        helloDocLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        helloDocLabel.setForeground(new java.awt.Color(0, 102, 153));
        helloDocLabel.setText("Hello Doctor [Name]!");
        jPanel1.add(helloDocLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 278, -1));

        doctorIDTextField.setEditable(false);
        doctorIDTextField.setBackground(new java.awt.Color(255, 255, 255));
        doctorIDTextField.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        doctorIDTextField.setForeground(new java.awt.Color(153, 153, 153));
        doctorIDTextField.setToolTipText("Your ID");
        doctorIDTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        doctorIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIDTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(doctorIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 140, 35));

        patientIDTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientIDTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(patientIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 140, 35));

        medicationsTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        medicationsTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(medicationsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 140, 35));

        dosageTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dosageTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(dosageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 140, 35));

        frequencyTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        frequencyTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        frequencyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(frequencyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 140, 35));

        durationTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        durationTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.add(durationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 140, 35));

        CancelButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(0, 102, 153));
        CancelButton.setText("Cancel");
        CancelButton.setToolTipText("Cancel prescribing");
        CancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 190, 61));

        prescribeButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prescribeButton.setForeground(new java.awt.Color(0, 102, 153));
        prescribeButton.setText("Prescibe");
        prescribeButton.setToolTipText("Finish prescribing");
        prescribeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        prescribeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(prescribeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 190, 61));

        PresjLabel11.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        PresjLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(PresjLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 160, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, -1, -1));

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

    private void doctorIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIDTextFieldActionPerformed

    private void frequencyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyTextFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);
        DoctorServiceList docServiceFrame = new DoctorServiceList();
        docServiceFrame.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void prescribeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeButtonActionPerformed

        String patientID = patientIDTextField.getText();
        String medications = medicationsTextField.getText();
        String dosage = dosageTextField.getText();
        String frequency = frequencyTextField.getText();
        String duration = durationTextField.getText();

        // Validate the inputs
        if (patientID.isEmpty() || medications.isEmpty() || dosage.isEmpty() || frequency.isEmpty() || duration.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!Doctor.isNumeric(patientID)) {
            JOptionPane.showMessageDialog(null, "Patient ID must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int patientIDInt = Integer.parseInt(patientID);  // Convert String to int

        if (!Doctor.isPatientIDValid(patientIDInt)) {
            JOptionPane.showMessageDialog(null, "Patient ID does not exist.\nPlease enter a valid Patient ID", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Doctor.isValidDosage(dosage)) {
            JOptionPane.showMessageDialog(null, "Invalid Dosage format. Add number(mg, drops, IU, puffs)\ne.g., 5mg", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!Doctor.isValidFrequency(frequency)) {
            JOptionPane.showMessageDialog(null, "Invalid! Please enter a valid frequency.\ne.g., 'twice daily' or 'three times weekly/monthly'.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!Doctor.isValidDuration(duration)) {
            JOptionPane.showMessageDialog(null, "Invalid Duration format. Must be (x days)\ne.g., 7 days", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Add the prescription record
        Doctor.addPrescription( patientID, Doctor.doctorID, medications, dosage, frequency, duration);

        // Increment the PrescriptionID for the next record
        JOptionPane.showMessageDialog(this, "Prescription has been successfully added!\nReturning to your services page...", "Success", JOptionPane.INFORMATION_MESSAGE);
        Doctor.nextPrescriptionID++;
        this.setVisible(false);
        DoctorServiceList docServiceFrame = new DoctorServiceList();
        docServiceFrame.setVisible(true);
    }//GEN-LAST:event_prescribeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DocPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocPrescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel PresjLabel11;
    private javax.swing.JTextField doctorIDTextField;
    private javax.swing.JTextField dosageTextField;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JTextField frequencyTextField;
    private javax.swing.JLabel helloDocLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medicationsTextField;
    private javax.swing.JTextField patientIDTextField;
    private javax.swing.JButton prescribeButton;
    // End of variables declaration//GEN-END:variables
}

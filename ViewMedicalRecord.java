/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;


public class ViewMedicalRecord extends javax.swing.JFrame {

    /**
     * Creates new form ViewMedicalRecord
     */
    public ViewMedicalRecord() {
        initComponents();
        helloPatientLabel.setText("Welcome, patient " + Patient.PatientName + "!");
        Patient.loadPatientData(PatientIDLabel, PatientNameLabel, DOBLabel, PhoneNoLabel, AgeLabel, MedHistoryLabel);
        Patient.loadAppointmentHistory(appTable);
        Patient.loadTestHistory(testTable);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        helloPatientLabel = new javax.swing.JLabel();
        PatientIDLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PatientNameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        PhoneNoLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        MedHistoryLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        testTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        appTable = new javax.swing.JTable();
        backButton1 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("View Medical Record");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 330, -1));

        jLabel3.setBackground(new java.awt.Color(196, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText(" Appointments History:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Test History:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Age:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 50, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("First name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 100, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Phone Number:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 130, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\medRecord.png")); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 370, 280));

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, -20, 100, 90));

        helloPatientLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        helloPatientLabel.setForeground(new java.awt.Color(0, 102, 153));
        helloPatientLabel.setText("Hello Patient [Name]!");
        jPanel1.add(helloPatientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 278, -1));

        PatientIDLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PatientIDLabel.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(PatientIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 130, 20));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 153));
        jLabel20.setText("Patient ID:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 100, -1));

        PatientNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PatientNameLabel.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(PatientNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 130, 30));

        AgeLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(AgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 70, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 153));
        jLabel21.setText("Date Of Birth:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 130, -1));

        DOBLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DOBLabel.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(DOBLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 120, 20));

        PhoneNoLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PhoneNoLabel.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(PhoneNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 150, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 153));
        jLabel17.setText("Medical History:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 140, -1));

        MedHistoryLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MedHistoryLabel.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(MedHistoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 240, 20));

        jScrollPane2.setForeground(new java.awt.Color(153, 204, 255));

        testTable.setBackground(new java.awt.Color(196, 225, 255));
        testTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Test ID ", "Test Date", "Test Type", "Results", "Doctor ID"
            }
        ));
        testTable.setToolTipText("Your Test History Table");
        testTable.setShowHorizontalLines(true);
        testTable.setShowVerticalLines(true);
        jScrollPane2.setViewportView(testTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 730, 70));

        jScrollPane1.setForeground(new java.awt.Color(153, 204, 255));

        appTable.setBackground(new java.awt.Color(196, 225, 255));
        appTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Date", "Status", "Doctor ID", "Dr. First Name", "Dr. Last Name"
            }
        ));
        appTable.setToolTipText("Your Appointments History Table");
        appTable.setShowHorizontalLines(true);
        appTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(appTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 730, 70));

        backButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton1.setForeground(new java.awt.Color(0, 102, 153));
        backButton1.setText("Back");
        backButton1.setToolTipText("Back to Services List");
        backButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 190, 61));

        exitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 102, 153));
        exitButton.setText("Exit");
        exitButton.setToolTipText("Exit the Program");
        exitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 190, 61));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        this.setVisible(false);
        PatientServiceList patientServiceFrame = new PatientServiceList();
        patientServiceFrame.setVisible(true);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        EXITHospital EXIT = new EXITHospital();
        EXIT.setVisible(true); // Show the window
        this.setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMedicalRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel MedHistoryLabel;
    private javax.swing.JLabel PatientIDLabel;
    private javax.swing.JLabel PatientNameLabel;
    private javax.swing.JLabel PhoneNoLabel;
    private javax.swing.JTable appTable;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel helloPatientLabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable testTable;
    // End of variables declaration//GEN-END:variables
}

package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class ViewPatientsList extends javax.swing.JFrame {

    public ViewPatientsList() {
        initComponents();
        helloAdminLabel.setText("Welcome Admin " + Admin.AdminName + "!");
        Admin.viewPatientList(PatientsListTable);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientsListTable = new javax.swing.JTable();
        backButton1 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        helloAdminLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel1.setText("Patients List:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 53));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        PatientsListTable.setBackground(new java.awt.Color(196, 225, 255));
        PatientsListTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PatientsListTable.setForeground(new java.awt.Color(0, 102, 153));
        PatientsListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Full Name", "Date Of Birth", "Contact Info", "Medical History", "Username", "Password"
            }
        ));
        PatientsListTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        PatientsListTable.setIntercellSpacing(new java.awt.Dimension(5, 30));
        PatientsListTable.setRowHeight(40);
        PatientsListTable.setShowHorizontalLines(true);
        PatientsListTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(PatientsListTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 970, 330));

        backButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton1.setForeground(new java.awt.Color(0, 102, 153));
        backButton1.setText("Back");
        backButton1.setToolTipText("Back to Service List");
        backButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 190, 61));

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
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 190, 61));

        helloAdminLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        helloAdminLabel.setForeground(new java.awt.Color(0, 102, 153));
        helloAdminLabel.setText("Hello Admin [Name]!");
        jPanel1.add(helloAdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 278, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, -1, -1));

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

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        this.setVisible(false);
        Admin_patient adminPFrame = new Admin_patient();
        adminPFrame.setVisible(true);
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
            java.util.logging.Logger.getLogger(ViewPatientsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatientsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatientsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatientsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatientsList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientsListTable;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel helloAdminLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

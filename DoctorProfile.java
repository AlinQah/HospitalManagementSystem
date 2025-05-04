/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class DoctorProfile extends javax.swing.JFrame {

    private static final String DB_URL = "jdbc:derby://localhost:1527/hospitalDB";
    private static final String DB_USER = "hospital"; 
    private static final String DB_PASSWORD = "hospital";
    
    public DoctorProfile() {
        initComponents();
        jLabel5.setText("Hello Doctor " + Doctor.doctorName + " !");
        loadDoctorProfile();
    }

   private void loadDoctorProfile() {
        try {
            // Establish the connection to the database
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            PreparedStatement pst = conn.prepareStatement("SELECT DR_FIRSTNAME, DR_LASTTNAME, Specialization, DepartmentID, Schedule FROM Doctor WHERE DoctorID = ?");
            pst.setInt(1, Doctor.doctorID);
             ResultSet rs = pst.executeQuery();

            
            // Execute the query
            
            
            // If the result set contains a row, retrieve the data and set it to the labels
            if (rs.next()) {
                String firstName = rs.getString("DR_FIRSTNAME");
                String lastName = rs.getString("DR_LASTTNAME");
                String specialization = rs.getString("Specialization");
                String departmentId = rs.getString("DepartmentID");
                String schedule = rs.getString("Schedule");
                
                // Set the values to the labels
                FNameLabel.setText(firstName);
                LNameLabel.setText(lastName);
                SpecLabel.setText(specialization);
                DepIDLabel.setText(departmentId);
                ScheduleEntryLabel.setText(schedule);
            }
            
            // Close the connections
            rs.close();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace(); // Handle any errors
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FName = new javax.swing.JLabel();
        LName = new javax.swing.JLabel();
        Spec = new javax.swing.JLabel();
        DepID = new javax.swing.JLabel();
        ScheduleLabel = new javax.swing.JLabel();
        FNameLabel = new javax.swing.JLabel();
        LNameLabel = new javax.swing.JLabel();
        SpecLabel = new javax.swing.JLabel();
        DepIDLabel = new javax.swing.JLabel();
        ScheduleEntryLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backButton1 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Your Profile");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        FName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FName.setForeground(new java.awt.Color(0, 102, 153));
        FName.setText("First Name:");
        jPanel1.add(FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        LName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LName.setForeground(new java.awt.Color(0, 102, 153));
        LName.setText("Last Name:");
        jPanel1.add(LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, 41));

        Spec.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Spec.setForeground(new java.awt.Color(0, 102, 153));
        Spec.setText("Specialization:");
        jPanel1.add(Spec, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 176, 41));

        DepID.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DepID.setForeground(new java.awt.Color(0, 102, 153));
        DepID.setText("Department ID:");
        jPanel1.add(DepID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 176, 41));

        ScheduleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ScheduleLabel.setForeground(new java.awt.Color(0, 102, 153));
        ScheduleLabel.setText("Schedule timing:");
        jPanel1.add(ScheduleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 204, 41));

        FNameLabel.setBackground(new java.awt.Color(204, 204, 255));
        FNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FNameLabel.setForeground(new java.awt.Color(51, 153, 255));
        FNameLabel.setText("[    ]");
        jPanel1.add(FNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 30));

        LNameLabel.setBackground(new java.awt.Color(204, 204, 255));
        LNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LNameLabel.setForeground(new java.awt.Color(51, 153, 255));
        LNameLabel.setText("[    ]");
        jPanel1.add(LNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        SpecLabel.setBackground(new java.awt.Color(204, 204, 255));
        SpecLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SpecLabel.setForeground(new java.awt.Color(51, 153, 255));
        SpecLabel.setText("[    ]");
        jPanel1.add(SpecLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        DepIDLabel.setBackground(new java.awt.Color(204, 204, 255));
        DepIDLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DepIDLabel.setForeground(new java.awt.Color(51, 153, 255));
        DepIDLabel.setText("[    ]");
        jPanel1.add(DepIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        ScheduleEntryLabel.setBackground(new java.awt.Color(204, 204, 255));
        ScheduleEntryLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ScheduleEntryLabel.setForeground(new java.awt.Color(51, 153, 255));
        ScheduleEntryLabel.setText("[    ]");
        jPanel1.add(ScheduleEntryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\prof.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 320, 260));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Hello Doctor [Name]!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 278, -1));

        backButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton1.setForeground(new java.awt.Color(0, 102, 153));
        backButton1.setText("Back");
        backButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 190, 61));

        exitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 102, 153));
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 190, 61));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        this.setVisible(false);
        DoctorServiceList docServiceFrame = new DoctorServiceList();
        docServiceFrame.setVisible(true);
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
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepID;
    private javax.swing.JLabel DepIDLabel;
    private javax.swing.JLabel FName;
    private javax.swing.JLabel FNameLabel;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel LNameLabel;
    private javax.swing.JLabel ScheduleEntryLabel;
    private javax.swing.JLabel ScheduleLabel;
    private javax.swing.JLabel Spec;
    private javax.swing.JLabel SpecLabel;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

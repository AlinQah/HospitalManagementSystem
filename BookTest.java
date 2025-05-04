package project;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Locale;
import java.sql.Timestamp;

public class BookTest extends javax.swing.JFrame {

    private Map<String, List<String>> availableDateTimes;
    
    public BookTest() {
        initComponents();
        loadTestTypes();
        jLabel11.setText("Hello Patient " + Patient.PatientName + " !");
        jComboBox4.setSelectedIndex(-1);  // Unselect the date combo box
        jComboBox3.setSelectedIndex(-1);
    }
    
// Constructor 
    private void loadTestTypes() {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB", "hospital", "hospital");
            String sql = "SELECT DISTINCT TestType FROM MedicalTest";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            jComboBox5.removeAllItems();  
            while (rs.next()) {
                String testType = rs.getString("TestType");
                jComboBox5.addItem(testType);
            }
            
            jComboBox5.setSelectedIndex(-1);

            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while loading the Test Types.");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Select Doctor:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Book Test");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 160, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Book Your test:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Select time:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("After selecting the test:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Select Date:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 130, 80));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Select Test:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\تنزيل رررر.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 200, 130));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Hello Patient [Name]!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 278, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 180, 40));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 180, 40));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[DD/MM/YY] 1", "[DD/MM/YY]  2", "[DD/MM/YY]  3", "[DD/MM/YY]  4" }));
        jComboBox4.setSelectedIndex(-1);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 180, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("Available Dates for the next 2 weeks:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 200, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00 Am", "1:00 Am", "2:00 Am", "3:00 Am", "4:00 Am" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 180, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("Cancel");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 140, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 153));
        jButton2.setText("Book Test");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(1500, 800));
        jLabel2.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 1520, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1516, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB", "hospital", "hospital");
            String selectedTest = (String) jComboBox5.getSelectedItem();

            String sql = "SELECT DISTINCT D.DoctorID, D.DR_FIRSTNAME, D.DR_LASTTNAME FROM Doctor D JOIN MedicalTest M ON D.DoctorID = M.DoctorID WHERE M.TestType = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, selectedTest);
            ResultSet rs = pst.executeQuery();

            jComboBox1.removeAllItems();

            while (rs.next()) {
                int doctorId = rs.getInt("DoctorID");
                String doctorName = rs.getString("DR_FIRSTNAME") + " " + rs.getString("DR_LASTTNAME");
                jComboBox1.addItem(new DoctorItem(doctorId, doctorName));
            }

            rs.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        DoctorItem selectedDoctor = (DoctorItem) jComboBox1.getSelectedItem();
        if (selectedDoctor == null) {
            return;
        }

        int doctorId = selectedDoctor.getId();

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB", "hospital", "hospital");

            String sql = "SELECT Schedule FROM Doctor WHERE DoctorID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, doctorId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String schedule = rs.getString("Schedule");

                availableDateTimes = ScheduleUtil.getAvailableDateTimes(schedule, doctorId);
                jComboBox4.removeAllItems();

                for (String date : availableDateTimes.keySet()) {
                    jComboBox4.addItem(date);
                }
                jComboBox4.setSelectedIndex(-1);
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

        String selectedDate = (String) jComboBox4.getSelectedItem();
        if (selectedDate == null || availableDateTimes == null) {
            return;
        }

        jComboBox3.removeAllItems();
        List<String> times = availableDateTimes.get(selectedDate);

        if (times != null && !times.isEmpty()) {
            for (String t : times) {
                jComboBox3.addItem(t);
            }
        } else {
            jComboBox3.addItem("No Available Timings!");
        }
        jComboBox3.setSelectedIndex(-1);

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PatientServiceList patientServiceList = new PatientServiceList();
        patientServiceList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            int currentPatientId = Patient.PatientID;
            if (currentPatientId == 0) {
                JOptionPane.showMessageDialog(this, "Please Login First!");
                return;
            }

            if (jComboBox5.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Please Choose a Test!", "Error choosing Test", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (jComboBox4.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Please Choose a Date!","Error choosing Date", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (jComboBox3.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Please Choose a Time!", "Error choosing Time", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int testId = 1;
            String sql = "SELECT MAX(TestID) FROM MedicalTest";

            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB", "hospital", "hospital"); PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

                if (rs.next()) {
                    testId = rs.getInt(1) + 1;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            DoctorItem selectedDoctor = (DoctorItem) jComboBox1.getSelectedItem();
            int doctorId = selectedDoctor.getId();
            String testType = jComboBox5.getSelectedItem().toString();
            String selectedDate = jComboBox4.getSelectedItem().toString();
            String selectedTime = jComboBox3.getSelectedItem().toString();
            String result = "Pending";

            String timeFormatted = selectedTime
            .replace("morning", "AM")
            .replace("evening", "PM")
            .replace(" ", "")
            .toUpperCase();

            String dateTimeString = selectedDate + " " + timeFormatted;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mma", Locale.ENGLISH);
            LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
            Timestamp timestamp = Timestamp.valueOf(parsedDateTime);

            String insertSql = "INSERT INTO MEDICALTEST (TESTID, TESTTYPE, PATIENTID, TESTDATE, RESULTS, DOCTORID) VALUES (?, ?, ?, ?, ?, ?)";
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB", "hospital", "hospital"); PreparedStatement pstInsert = conn.prepareStatement(insertSql)) {

                pstInsert.setInt(1, testId);
                pstInsert.setString(2, testType);
                pstInsert.setInt(3, currentPatientId);
                pstInsert.setTimestamp(4, timestamp);
                pstInsert.setString(5, result);
                pstInsert.setInt(6, doctorId);

                pstInsert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Test Booked Successfully!\nReturning to Services List...");
                PatientServiceList Patientservice = new PatientServiceList();
                Patientservice.setVisible(true); // Show the window
                this.setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Select Fields!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BookTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<DoctorItem> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
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
    // End of variables declaration//GEN-END:variables
}

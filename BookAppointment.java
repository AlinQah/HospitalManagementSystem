
package project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import project.PatientServiceList;

/**
 *
 * @author Sasy4
 */
public class BookAppointment extends javax.swing.JFrame {
     private Connection conn;
    private int currentPatientId; 

    /**
     * Creates new form BookAppointment
     */
    public BookAppointment(int patientId) {
        initComponents();
        jLabel11.setText("Hello Patient  " + Patient.PatientName + " !");
         this.currentPatientId = patientId;
        connectToDatabase();
        loadDepartments();
        updatePatientNameLabel();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Select  Department:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 130, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Select time:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, -1, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Select Doctor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emergency Department", "Dermatology", "Orthopedics", "ENT", "General Surgery" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 210, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. [Name] 1", "Dr. [Name] 2", "Dr. [Name] 3", "Dr. [Name] 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 150, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("After selecting the Medical Department:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, 20));

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 150, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Book Appointment");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 300, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Select Date:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, 20));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("Book Appointment");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, 180, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\تنزيل رررر.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, 100, 100));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 153));
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 170, 60));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Hello Patient [Name]!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 278, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\medRecord.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 300, 280));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        /* if (jComboBox3.getSelectedIndex() == 1 ||
            jComboBox4.getSelectedIndex() == 1 ||
            jComboBox1.getSelectedIndex() == 1) {

            JOptionPane.showMessageDialog(this, "Please select doctor, date and time",
                "Error", JOptionPane.ERROR_MESSAGE);
        } */

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String selectedDept = (String) jComboBox2.getSelectedItem(); 
        if (selectedDept != null) {
            loadDoctors(selectedDept);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        String selectedDoctor = (String) jComboBox3.getSelectedItem();  
        if (selectedDoctor != null && !selectedDoctor.equals("Select Doctor")) {
            loadAvailableDates(selectedDoctor);
            jComboBox4.setEnabled(true);
        } else {
            jComboBox4.setEnabled(false);
            jComboBox4.setModel(new DefaultComboBoxModel<>(new String[] { "Select Date" }));
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        String selectedDoctor = (String) jComboBox3.getSelectedItem();
        String selectedDate = (String) jComboBox4.getSelectedItem();
        if (selectedDoctor != null && selectedDate != null && !selectedDate.equals("Select Date")) {
            loadAvailableTimes(selectedDoctor, selectedDate);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bookAppointment();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          PatientServiceList Patientservice = new PatientServiceList();
        Patientservice.setVisible(true); // Show the window
        this.setVisible(false); // Close the current Doctor_Test window 
                            
    }//GEN-LAST:event_jButton2ActionPerformed
 private void connectToDatabase() {
    try {
    
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB","hospital", "hospital");    } 
    catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void updatePatientNameLabel() {
    try {
        String sql = "SELECT FULLNAME FROM Patient WHERE PatientID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, currentPatientId);
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            jLabel11.setText("Hello " + rs.getString("FullName") + "!");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching patient data: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void loadDepartments() {
    try {
        String sql = "SELECT Name FROM Department";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        List<String> departments = new ArrayList<>();
        while (rs.next()) {
            departments.add(rs.getString("Name"));
        }
        
        jComboBox2.setModel(new DefaultComboBoxModel<>(departments.toArray(new String[0])));
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading departments: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void loadDoctors(String departmentName) {
    try {
        String sql = "SELECT DR_FIRSTNAME, DR_LASTTNAME FROM Doctor WHERE DepartmentID = "
                + "(SELECT DepartmentID FROM Department WHERE Name = ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, departmentName);
        ResultSet rs = pstmt.executeQuery();
        
        List<String> doctors = new ArrayList<>();
        while (rs.next()) {
            doctors.add("Dr. " + rs.getString("DR_FIRSTNAME") + " " + rs.getString("DR_LASTTNAME"));
        }
        
        jComboBox3.setModel(new DefaultComboBoxModel<>(doctors.toArray(new String[0])));
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading doctors: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void loadAvailableDates(String doctorName) {
    try {
        String[] doctorParts = doctorName.split(" ");
        String firstName = doctorParts[1];
        String lastName = doctorParts[2];

        String sql = 
    "SELECT DISTINCT AppointmentDate AS AvailableDate " +
    "FROM Appointment " +
    "WHERE DoctorID = (SELECT DoctorID FROM Doctor WHERE DR_FIRSTNAME = ? AND DR_LASTTNAME = ?) " +
    "AND Status = 'Available' " +
    "ORDER BY AvailableDate";


        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, firstName);
        pstmt.setString(2, lastName);
        ResultSet rs = pstmt.executeQuery();

        List<String> dates = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (rs.next()) {
            Date date = rs.getDate("AvailableDate");
            dates.add(sdf.format(date));
        }

        if (dates.isEmpty()) {
            dates.add("No available dates");
        }

        jComboBox4.setModel(new DefaultComboBoxModel<>(dates.toArray(new String[0])));

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading available dates: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void loadAvailableTimes(String doctorName, String date) {
        try {
            String[] doctorParts = doctorName.split(" ");
            String firstName = doctorParts[1];
            String lastName = doctorParts[2];

            
            java.sql.Date sqlDate = new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(date).getTime());

            String sql = "SELECT AppointmentTime AS AvailableTime FROM Appointment "
               + "WHERE DoctorID = (SELECT DoctorID FROM Doctor WHERE DR_FIRSTNAME = ? AND DR_LASTTNAME = ?) "
               + "AND AppointmentDate = ? AND Status = 'Available' ORDER BY AppointmentTime";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setDate(3, sqlDate);
            ResultSet rs = pstmt.executeQuery();

            List<String> times = new ArrayList<>();
            while (rs.next()) {
                times.add(rs.getTime("AvailableTime").toString());
            }

            if (times.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No available times for this date", 
                        "Info", JOptionPane.INFORMATION_MESSAGE);
            }

            jComboBox1.setModel(new DefaultComboBoxModel<>(times.toArray(new String[0])));
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(this, "Error loading times: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        }

    private void bookAppointment() {
    try {
        String doctor = (String) jComboBox3.getSelectedItem();
        String dateStr = (String) jComboBox4.getSelectedItem();
        String timeStr = (String) jComboBox1.getSelectedItem();

        if (doctor == null || dateStr == null || timeStr == null ||
            doctor.equals("Select Doctor") || dateStr.equals("Select Date") || timeStr.equals("Select Time")) {
            JOptionPane.showMessageDialog(this, "Please select doctor, date, and time", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        String[] doctorParts = doctor.split(" ");
        String firstName = doctorParts[1];
        String lastName = doctorParts[2];

    
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date sqlDate = new java.sql.Date(sdf.parse(dateStr).getTime());
        java.sql.Time sqlTime = java.sql.Time.valueOf(timeStr);

       
        String query = "SELECT AppointmentID FROM Appointment " +
                       "WHERE DoctorID = (SELECT DoctorID FROM Doctor WHERE DR_FIRSTNAME = ? AND DR_LASTTNAME = ?) " +
                       "AND AppointmentDate = ? AND AppointmentTime = ? AND Status = 'Available'";

        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, firstName);
        pst.setString(2, lastName);
        pst.setDate(3, sqlDate);
        pst.setTime(4, sqlTime);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int appointmentId = rs.getInt("AppointmentID");

       
           String update = "UPDATE Appointment SET PatientID = ?, Status = 'Confirmed' WHERE AppointmentID = ?";

            PreparedStatement updatePst = conn.prepareStatement(update);
            updatePst.setInt(1, currentPatientId);
            updatePst.setInt(2, appointmentId);

            int affected = updatePst.executeUpdate();

            if (affected > 0) {
                JOptionPane.showMessageDialog(this, "Appointment successfully booked!", "Success", JOptionPane.INFORMATION_MESSAGE);
                PatientServiceList Patientservice = new PatientServiceList();
                Patientservice.setVisible(true); // Show the window
                this.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(this, "Failed to book appointment.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "This slot is no longer available.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error booking appointment: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int loggedInPatientId = getLoggedInPatientId(); 
            new BookAppointment(loggedInPatientId).setVisible(true);
            }

            private int getLoggedInPatientId() {
                return 1;}
                
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
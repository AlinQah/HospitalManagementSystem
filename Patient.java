/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Patient {

    public static int PatientID;
    public static String PatientName;

    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/hospitalDB";
    private static final String USERNAME = "hospital";
    private static final String PASSWORD = "hospital";
    private Connection conn;
    private int currentPatientId;

    //To Read prescribtion class & methods
    public class ReadTextFile {

        private String filePath;
        private Scanner input;
        private JTable jTable1;
        private JLabel jLabel1, jLabel12, jLabel9, jLabel7, jLabel16;

        // Constructor to initialize with file path and required components
        public ReadTextFile(String filePath, JTable jTable1, JLabel jLabel1, JLabel jLabel12,
                JLabel jLabel9, JLabel jLabel7, JLabel jLabel16) {
            this.filePath = filePath;
            this.jTable1 = jTable1;
            this.jLabel1 = jLabel1;
            this.jLabel12 = jLabel12;
            this.jLabel9 = jLabel9;
            this.jLabel7 = jLabel7;
            this.jLabel16 = jLabel16;
        }

        // Open file method
        public void openFile() {
            try {
                input = new Scanner(Paths.get(filePath));
            } catch (IOException ioException) {
                System.err.println("Error opening file. Terminating.");
                System.exit(1);
            }
        }

        // Method to read and process records from the file and update the UI
        public void readRecords() {
            Connection con = null;
            PreparedStatement pst = null;
            PreparedStatement pst1 = null;
            ResultSet rs = null;
            ResultSet rs1 = null;

            // Table model for displaying medication data
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Duration");
            model.addColumn("Frequency");
            model.addColumn("Dosage");
            model.addColumn("Medication");

          try {
                // Process each record from the file
                while (input.hasNext()) {
                    String prescriptionIDLine = input.nextLine();
                    String patientIDLine = input.nextLine();
                    String doctorIDLine = input.nextLine();
                    String medicationLine = input.nextLine();
                    String dosageLine = input.nextLine();
                    String frequencyLine = input.nextLine();
                    String durationLine = input.nextLine();

                    // Split the lines and trim spaces after the colon
                    String prescriptionID = (prescriptionIDLine.contains(":")) ? prescriptionIDLine.split(":")[1].trim() : "";
                    String patientID = (patientIDLine.contains(":")) ? patientIDLine.split(":")[1].trim() : "";
                    String doctorID = (doctorIDLine.contains(":")) ? doctorIDLine.split(":")[1].trim() : "";
                    String medication = (medicationLine.contains(":")) ? medicationLine.split(":")[1].trim() : "";
                    String dosage = (dosageLine.contains(":")) ? dosageLine.split(":")[1].trim() : "";
                    String frequency = (frequencyLine.contains(":")) ? frequencyLine.split(":")[1].trim() : "";
                    String duration = (durationLine.contains(":")) ? durationLine.split(":")[1].trim() : "";

                   
                    // Ensure the prescription belongs to the currently logged-in patient
           if (Integer.parseInt(patientID) != Patient.PatientID) {
              JOptionPane.showMessageDialog(null, "This prescription does not belong to you.", "Access Denied", JOptionPane.ERROR_MESSAGE);

              // Redirect to the Patient Services interface
               PatientServiceList patientService = new PatientServiceList();
                patientService.setVisible(true); // Open the Patient Services window
                    this.setVisible(false); // Close the current window
                    return; // Stop further processing
                                              }

                    // Display PrescriptionID and PatientID on the interface
                    jLabel1.setText(prescriptionID);
                    jLabel12.setText(patientID);

                    try {
                        // Connect to the database
                        con = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB", "hospital", "hospital");

                        String sqlDoctor = "SELECT DR_FIRSTNAME, Specialization FROM Doctor WHERE DoctorID = ?";
                        String sqlPatient = "SELECT FULLNAME , DateOfBirth FROM Patient WHERE PatientID = ?";

                        // Fetch Doctor Information
                        pst = con.prepareStatement(sqlDoctor);
                        pst.setInt(1, Integer.parseInt(doctorID));
                        rs = pst.executeQuery();
                        if (rs.next()) {
                            String doctorName = rs.getString("DR_FIRSTNAME");
                            String specialization = rs.getString("Specialization");
                            jLabel9.setText(doctorName + " – " + specialization);
                        }

                        // Fetch Patient Information
                        pst1 = con.prepareStatement(sqlPatient);
                        pst1.setInt(1, Integer.parseInt(patientID));
                        rs1 = pst1.executeQuery();
                        if (rs1.next()) {
                            Date datepat = rs1.getDate("DateOfBirth");
                            Calendar clapat = Calendar.getInstance();
                            clapat.setTime(datepat);
                            Calendar today = Calendar.getInstance();
                            int age = today.get(Calendar.YEAR) - clapat.get(Calendar.YEAR);
                            if (today.get(Calendar.DAY_OF_YEAR) < clapat.get(Calendar.DAY_OF_YEAR)) {
                                age--;
                            }
                            jLabel7.setText(String.valueOf(age));

                            String fullName = rs1.getString("FULLNAME");
                            jLabel16.setText(fullName);
                        }

                        // Add the medication data to the table
                        model.addRow(new Object[]{duration, frequency, dosage, medication});

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        try {
                            if (rs != null) {
                                rs.close();
                            }
                            if (rs1 != null) {
                                rs1.close();
                            }
                            if (pst != null) {
                                pst.close();
                            }
                            if (pst1 != null) {
                                pst1.close();
                            }
                            if (con != null) {
                                con.close();
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }

                // Update the table with the medication information
                jTable1.setModel(model);

            } catch (NoSuchElementException | IllegalStateException e) {
                JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (input != null) {
                    input.close();
                }
            }
        }

        // Close file method
        public void closeFile() {
            if (input != null) {
                input.close();
            }
        }
        //End of Class

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    //Methods for view medical records:
    //load Patient Data method:
    public static void loadPatientData(JLabel idLabel, JLabel nameLabel, JLabel dobLabel, JLabel phoneLabel, JLabel ageLabel, JLabel medHistoryLabel) {
        String query = "SELECT FullName, PatientID, DateOfBirth, ContactInfo, MedicalHistory FROM Patient WHERE PatientID = ?";
        try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, PatientID);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    
                    // Set values from ResultSet
                    String fullName = rs.getString("FullName");
                    int id = rs.getInt("PatientID");
                    Date dobDate = rs.getDate("DateOfBirth");
                    String contact = rs.getString("ContactInfo");
                    String medHistory = rs.getString("MedicalHistory");

                    //Calculate age 
                    Calendar dobCal = Calendar.getInstance();
                    dobCal.setTime(dobDate);//dob of the patient
                    
                    //todays date
                    Calendar today = Calendar.getInstance();
                    int age = today.get(Calendar.YEAR) - dobCal.get(Calendar.YEAR);
                    
                    // Adjust if birthday hasn't occurred yet this year
                    if (today.get(Calendar.DAY_OF_YEAR) < dobCal.get(Calendar.DAY_OF_YEAR)) {
                        age--;
                    }

                    // Display on labels
                    idLabel.setText(String.valueOf(id));
                    nameLabel.setText(fullName);
                    dobLabel.setText(dobDate.toString());
                    phoneLabel.setText(contact);
                    ageLabel.setText(String.valueOf(age));
                    medHistoryLabel.setText(medHistory);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading patient data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    //load Appointment History method:
    public static void loadAppointmentHistory(JTable appTable) {
        String query = "SELECT a.AppointmentID, a.DateTime, a.Status, a.DoctorID, d.Dr_FirstName, d.Dr_LastTName "
                + "FROM Appointment a "
                + "JOIN Doctor d ON a.DoctorID = d.DoctorID "
                + "WHERE a.PatientID = ?";
        
        try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); 
                PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, PatientID);
            try (ResultSet rs = pst.executeQuery()) {
                appTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading appointment history: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    //load Test History method:
    public static void loadTestHistory(JTable testTable) {
        String query = "SELECT mt.TestID, mt.TestDate, mt.TestType, mt.Results, mt.DoctorID, d.Dr_FirstName, d.Dr_LastTName "
                + "FROM MedicalTest mt "
                + "JOIN Doctor d ON mt.DoctorID = d.DoctorID "
                + "WHERE mt.PatientID = ?";
        
        try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); 
                PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, PatientID);
            try (ResultSet rs = pst.executeQuery()) {
                testTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading test history: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

}
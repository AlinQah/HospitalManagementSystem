/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class Doctor {

    public static int nextPrescriptionID = 1;
    public static Formatter output;
    public static int doctorID;
    public static String doctorName;

    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/hospitalDB";
    private static final String USERNAME = "hospital";
    private static final String PASSWORD = "hospital";

    private static Connection con;
    private static PreparedStatement pst;
    private static ResultSet rs;


    // Load doctor's appointments into a JTable
    public static void viewAppointments(JTable appointmentsTable) {
        String query = "SELECT AppointmentID, AppointmentDate, AppointmentTime, DoctorID, PatientID , Status FROM Appointment WHERE DoctorID = ?";

        try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); PreparedStatement pst = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

            pst.setInt(1, doctorID);
            try (ResultSet rs = pst.executeQuery()) {
                appointmentsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading appointments: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void loadTests(JTable testsTable) {
        String query = "SELECT TestID, TestType, PatientID, TestDate, Results, DoctorID FROM MedicalTest WHERE DoctorID = ?";

        try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); PreparedStatement pst = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

            pst.setInt(1, doctorID);
            try (ResultSet rs = pst.executeQuery()) {
                testsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading tests: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void loadPatients(JTable patientListTable) {
    String query = "SELECT p.PatientID, p.FullName, p.DateOfBirth, p.ContactInfo, p.MedicalHistory " +
                   "FROM Patient p JOIN Appointment a ON p.PatientID = a.PatientID " +
                   "WHERE a.DoctorID = ?";

    try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
         PreparedStatement pst = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

        pst.setInt(1, doctorID);

        try (ResultSet rs = pst.executeQuery()) {
            patientListTable.setModel(DbUtils.resultSetToTableModel(rs));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading patients: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    
    //Doctors prescribe prescription methods:
    // Validate the patient ID from the database
    public static boolean isPatientIDValid(int patientID) {
        String query = "SELECT COUNT(*) FROM Patient WHERE PatientID = ?";

        try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); 
            PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, patientID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1); // Get the count of rows matching PatientID
                return count > 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error validating Patient ID: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return false; // If no patient is found, return false
    }

    // Method to validate if an ID is numeric
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+"); // Only digits
    }
    
    // Method to validate Dosage format (mg,drops,IU,puffs)
    public static boolean isValidDosage(String dosage) {
        return dosage != null && dosage.matches("(?i)\\d+(\\.\\d+)?\\s*(mg|IU|drops|puffs)");
    }

    // Method to validate Duration (e.g., 30 days)
    public static boolean isValidDuration(String duration) {
        return duration != null && duration.matches("(?i)\\d+\\s+(day|days)");
    }

    // Method to validate Frequency (e.g., once daily)
    public static boolean isValidFrequency(String frequency) {
        return frequency != null && frequency.matches("(?i)(once|twice|three times|four times|five times|[1-9]\\d* times)\\s+(daily|weekly|monthly)");
    }

    // Method to open the file for writing
    private static void openFile() {
        try {
            output = new Formatter(("C:\\Users\\Fatima\\Downloads\\Prescription.txt"));
        } catch (SecurityException securityEx) {
            System.err.println("Write permission denied.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundEx) {
            System.err.println("Error opening file. ");
            System.exit(1);
        }
    }

    // Method to add a prescription record to the file
    public static void addPrescription(String patientID, int doctorID, String medications, String dosage, String frequency, String duration) {
        try {
            openFile();
            output.format("PrescriptionID: %d%n", nextPrescriptionID);
            output.format("PatientID: %s%n", String.valueOf(patientID));
            output.format("DoctorID: %d%n", doctorID);
            output.format("Medications: %s%n", medications);
            output.format("Dosage: %s%n", dosage);
            output.format("Frequency: %s%n", frequency);
            output.format("Duration: %s%n%n", duration); // Add extra newline between records

            output.flush();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();

        } catch (FormatterClosedException e) {
            System.err.println("Error writing to file: Formatter is closed.");
            e.printStackTrace();

        } catch (NoSuchElementException e) {
            System.err.println("Invalid input encountered: " + e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
  
        } finally {
            closeFile();
        }
    }

    // Method to close the file
    private static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
    
    

    //end doctors priscribtion methods
}
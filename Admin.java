/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import java.sql.Date;

public class Admin {

    public static int AdminID;
    public static String AdminName;

    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/hospitalDB";
    private static final String USERNAME = "hospital";
    private static final String PASSWORD = "hospital";

    private static Connection con;
    private static Statement st;
    private static ResultSet rs;

    //Admins methods for doctors:
    
    //Add doctor to DB method:
    public void addDoctorToDatabase(int doctorID, String firstName, String lastName, String specialization,
            int departmentID, String schedule, String username, String password) {

        String sql = "INSERT INTO Doctor (DoctorID, DR_FIRSTNAME, DR_LASTTNAME, Specialization, DepartmentID, Schedule, Username, Password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD)) {
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, doctorID);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, specialization);
            pst.setInt(5, departmentID);
            pst.setString(6, schedule);
            pst.setString(7, username);
            pst.setString(8, password);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Doctor added successfully!");
            } else {
                System.out.println("Error adding doctor.");
            }

            pst.close(); // optional
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    
    //generate Next DoctorID method:
    public static int generateNextDoctorID() {
        int nextID = 1;

        String query = "SELECT MAX(DoctorID) FROM Doctor";

        try (Connection conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); 
                Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                nextID = rs.getInt(1) + 1;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching Doctor ID: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }

        return nextID;
    }

    
    //get automatic DepartmentID By Specialization method:
    public String getDepartmentIDBySpecialization(String specialization) {
        switch (specialization) {
            case "Dentist":
                return "1";
            case "Ophthalmologist":
                return "2";
            case "General Physician":
                return "3";
            case "Cardiologist":
                return "4";
            case "Orthopedic Surgeon":
                return "5";
            case "Dermatologist":
                return "6";
            case "Pediatrician":
                return "7";
            default:
                return "";
        }
    }

    
    //view Doctors List method:
    public static void viewDoctorsList(JTable docListTable) {
        String query1 = "SELECT DoctorID, DR_FIRSTNAME, DR_LASTTNAME, Specialization, DepartmentID, Schedule, Username, Password FROM Doctor";

        try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); ResultSet rs = st.executeQuery(query1)) {

            docListTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading doctors list: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    
    //Admins methods for patients:
    
    //add Patients to DB mathod:
    public void addPatientToDatabase(int patientID, String username, String password, String fullName, Date dateOfBirth,
            int contactInfo, String medicalHistory) {
        String sql = "INSERT INTO Patient (PatientID, FullName, DateOfBirth, ContactInfo, MedicalHistory, Username, Password) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); 
                PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, patientID);
            pst.setString(2, fullName);
            pst.setDate(3, dateOfBirth);
            pst.setInt(4, contactInfo);
            pst.setString(5, medicalHistory);
            pst.setString(6, username);
            pst.setString(7, password);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Patient added successfully!");
            } else {
                System.out.println("Failed to add patient.");
            }

        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex.getMessage());
        }
    }
    
    
    //generate Next PatientID method:
        public int generateNextPatientID() {
        int nextID = 1;
        String query = "SELECT MAX(PatientID) FROM Patient";

        try (Connection conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                nextID = rs.getInt(1) + 1;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching Patient ID: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }

        return nextID;
    }
        
        
    //view Patient List method:
    public static void viewPatientList(JTable patientListTable) {
        String query2 = "SELECT PatientID, FullName, DateOfBirth, ContactInfo, MedicalHistory, Username, Password FROM Patient";

        try (Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); 
                Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY); ResultSet rs = st.executeQuery(query2)) {

            patientListTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading patient list: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    //optional use close DB method:
    public static void closeDB() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
            System.out.println("Database connection closed.");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }
    
    public static int generateNextAdminID() {
        int nextID = 1;
        String query = "SELECT MAX(AdminID) FROM SystemAdministrator";

        try (Connection conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                nextID = rs.getInt(1) + 1;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching Admin ID: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }

        return nextID;
    }


   //delete Doctor
    public boolean deleteDoctorById(String doctorId) {
        Connection conn = null;
        PreparedStatement pst = null;
        String sqlDeleteAppointments = "DELETE FROM Appointment WHERE DoctorID = ?";
        String sqlDeletePrescriptions = "DELETE FROM Prescription WHERE DoctorID = ?";
        String sqlDeleteMedicalTests = "DELETE FROM MedicalTest WHERE DoctorID = ?";
        String sqlDeleteDoctor = "DELETE FROM Doctor WHERE DoctorID = ?";

        try {
            conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

            // Start transaction to ensure atomicity
            conn.setAutoCommit(false);

            // Delete all records related to the doctor in the related tables
            pst = conn.prepareStatement(sqlDeleteAppointments);
            pst.setString(1, doctorId);
            pst.executeUpdate();

            pst = conn.prepareStatement(sqlDeletePrescriptions);
            pst.setString(1, doctorId);
            pst.executeUpdate();

            pst = conn.prepareStatement(sqlDeleteMedicalTests);
            pst.setString(1, doctorId);
            pst.executeUpdate();

            // Now delete the doctor record
            pst = conn.prepareStatement(sqlDeleteDoctor);
            pst.setString(1, doctorId);
            int rowsAffected = pst.executeUpdate();

            // Commit transaction if everything went well
            if (rowsAffected > 0) {
                conn.commit();
                return true;
            } else {
                conn.rollback();
                return false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.setAutoCommit(true);  // Restore auto-commit behavior
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }    //delete Patient
    public boolean deletePatientById(String patientId) {
        Connection conn = null;
        PreparedStatement pst = null;
        String sqlDeleteAppointments = "DELETE FROM Appointment WHERE PatientID = ?";
        String sqlDeletePrescriptions = "DELETE FROM Prescription WHERE PatientID = ?";
        String sqlDeleteMedicalTests = "DELETE FROM MedicalTest WHERE PatientID = ?";
        String sqlDeleteMedicalRecords = "DELETE FROM MedicalRecord WHERE PatientID = ?";
        String sqlDeletePatient = "DELETE FROM Patient WHERE PatientID = ?";

        try {
            conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

            // Start transaction to ensure atomicity
            conn.setAutoCommit(false);

            // Delete all records related to the patient in the related tables
            pst = conn.prepareStatement(sqlDeleteAppointments);
            pst.setString(1, patientId);
            pst.executeUpdate();

            pst = conn.prepareStatement(sqlDeletePrescriptions);
            pst.setString(1, patientId);
            pst.executeUpdate();

            pst = conn.prepareStatement(sqlDeleteMedicalTests);
            pst.setString(1, patientId);
            pst.executeUpdate();

            pst = conn.prepareStatement(sqlDeleteMedicalRecords);
            pst.setString(1, patientId);
            pst.executeUpdate();

            // Now delete the patient record
            pst = conn.prepareStatement(sqlDeletePatient);
            pst.setString(1, patientId);
            int rowsAffected = pst.executeUpdate();

            // Commit transaction if everything went well
            if (rowsAffected > 0) {
                conn.commit();
                return true;
            } else {
                conn.rollback();
                return false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.setAutoCommit(true);  // Restore auto-commit behavior
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
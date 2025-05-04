-- Drop tables (remove IF EXISTS, Derby doesn't support it)
-- You can comment out any DROP that gives an error on first run
DROP TABLE Appointment;
DROP TABLE MedicalRecord;
DROP TABLE Prescription;
DROP TABLE MedicalTest;
DROP TABLE Doctor;
DROP TABLE Patient;
DROP TABLE Department;
DROP TABLE SystemAdministrator;


-- Create the SystemAdministrator table
CREATE TABLE SystemAdministrator (
    AdminID INT PRIMARY KEY,
    Name VARCHAR(100),
    Username VARCHAR(50),
    Password VARCHAR(50)
);

-- Create the Department table
CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY,
    Name VARCHAR(100),
    HeadDoctorID INT
);

-- Create the Doctor table
CREATE TABLE Doctor (
    DoctorID INT PRIMARY KEY,
    FName VARCHAR(50),
    LName VARCHAR(50),
    Specialization VARCHAR(100),
    DepartmentID INT,
    Schedule VARCHAR(1000),
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID) ON DELETE CASCADE
);

-- Create the Patient table
CREATE TABLE Patient (
    PatientID INT PRIMARY KEY,
    Name VARCHAR(100),
    DateOfBirth DATE,
    ContactInfo VARCHAR(255),
    MedicalHistory VARCHAR(1000)
);

-- Create the Appointment table
CREATE TABLE Appointment (
    AppointmentID INT PRIMARY KEY,
    DateTime TIMESTAMP,
    DoctorID INT,
    PatientID INT,
    Status VARCHAR(20), 
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID) ON DELETE CASCADE,
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID) ON DELETE CASCADE
);

-- Create the MedicalRecord table
CREATE TABLE MedicalRecord (
    RecordID INT PRIMARY KEY,
    PatientID INT UNIQUE, 
    Details VARCHAR(1000),
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID) ON DELETE CASCADE
);

-- Create the Prescription table
CREATE TABLE Prescription (
    PrescriptionID INT PRIMARY KEY,
    PatientID INT,
    DoctorID INT,
    Medications VARCHAR(1000),
    Dosage VARCHAR(50),
    Frequency VARCHAR(50),
    Duration VARCHAR(50),
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID) ON DELETE CASCADE,
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID) ON DELETE CASCADE
);

-- Create the MedicalTest table
CREATE TABLE MedicalTest (
    TestID INT PRIMARY KEY,
    TestType VARCHAR(100),
    PatientID INT,
    TestDate DATE,
    Results VARCHAR(1000),
    DoctorID INT,
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID) ON DELETE CASCADE,
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID) ON DELETE CASCADE
);

-- Insert data into SystemAdministrator table
INSERT INTO SystemAdministrator (AdminID, Name, Username, Password) VALUES
(1, 'Sara Al-Mutairi', 'sara_admin', 'pass123'),
(2, 'Mohammed Al-Qahtani', 'moh_admin', 'secure456'),
(3, 'Huda Al-Faisal', 'huda_admin', 'admin789'),
(4, 'Fahad Al-Ajmi', 'fahad_admin', 'fpass321'),
(5, 'Amal Al-Otaibi', 'amal_admin', 'adminpass'),
(6, 'Rana Al-Sabah', 'rana_admin', 'welcome123'),
(7, 'Salem Al-Rashid', 'salem_admin', 'rashid007');

-- Insert data into Department table
INSERT INTO Department (DepartmentID, Name, HeadDoctorID) VALUES
(1, 'Dental', 101),
(2, 'Eye Care', 102),
(3, 'General Medicine', 103),
(4, 'Cardiology', 104),
(5, 'Orthopedics', 105),
(6, 'Dermatology', 106),
(7, 'Pediatrics', 107);

-- Insert data into Doctor table
INSERT INTO Doctor (DoctorID, FName, LName, Specialization, DepartmentID, Schedule) VALUES
(101, 'Ali', 'Al-Faraj', 'Dentist', 1, 'Sun-Tue 9am-1pm'),
(102, 'Reem', 'Al-Dosari', 'Ophthalmologist', 2, 'Mon-Wed 10am-2pm'),
(103, 'Khalid', 'Al-Salem', 'General Physician', 3, 'Daily 8am-12pm'),
(104, 'Noura', 'Al-Ruwaili', 'Cardiologist', 4, 'Sun-Thu 11am-3pm'),
(105, 'Yousef', 'Al-Qahtani', 'Orthopedic Surgeon', 5, 'Tue-Fri 9am-1pm'),
(106, 'Maha', 'Al-Otaibi', 'Dermatologist', 6, 'Mon-Thu 10am-1pm'),
(107, 'Ibrahim', 'Al-Shahrani', 'Pediatrician', 7, 'Sat-Wed 9am-12pm');

-- Insert data into Patient table
INSERT INTO Patient (PatientID, Name, DateOfBirth, ContactInfo, MedicalHistory) VALUES
(201, 'Laila Al-Mutairi', '1990-05-15', '0551234567', 'Allergic to penicillin'),
(202, 'Faisal Al-Qahtani', '1985-11-22', '0552345678', 'Diabetic'),
(203, 'Nadia Al-Fahad', '2000-01-10', '0553456789', 'Asthma'),
(204, 'Omar Al-Dabbagh', '1975-03-30', '0554567890', 'High blood pressure'),
(205, 'Amira Al-Rashid', '1995-06-18', '0555678901', 'None'),
(206, 'Salman Al-Shamrani', '1989-09-12', '0556789012', 'Chronic back pain'),
(207, 'Hind Al-Sabah', '2002-08-27', '0557890123', 'Peanut allergy');

-- Insert data into Appointment table
INSERT INTO Appointment (AppointmentID, DateTime, DoctorID, PatientID, Status) VALUES
(301, '2025-04-06 09:00:00', 101, 201, 'Confirmed'),
(302, '2025-04-06 10:00:00', 102, 202, 'Pending'),
(303, '2025-04-07 08:30:00', 103, 203, 'Confirmed'),
(304, '2025-04-08 11:00:00', 104, 204, 'Cancelled'),
(305, '2025-04-09 09:30:00', 105, 205, 'Confirmed'),
(306, '2025-04-10 10:15:00', 106, 206, 'Pending'),
(307, '2025-04-11 08:45:00', 107, 207, 'Confirmed');

-- Insert data into MedicalRecord table
INSERT INTO MedicalRecord (RecordID, PatientID, Details) VALUES
(401, 201, 'Dental cleaning and cavity treatment'),
(402, 202, 'Eye test and new glasses prescribed'),
(403, 203, 'Regular check-up, asthma stable'),
(404, 204, 'EKG test, mild arrhythmia noted'),
(405, 205, 'No major issues, general wellness check'),
(406, 206, 'Physical therapy for back pain'),
(407, 207, 'Skin rash treated, allergy confirmed');

-- Insert data into Prescription table
INSERT INTO Prescription (PrescriptionID, PatientID, DoctorID, Medications, Dosage, Frequency, Duration) VALUES
(501, 201, 101, 'Amoxicillin', '500mg', 'Twice daily', '7 days'),
(502, 202, 102, 'Eye Drops', '2 drops', 'Three times daily', '5 days'),
(503, 203, 103, 'Salbutamol', '1 puff', 'As needed', '30 days'),
(504, 204, 104, 'Aspirin', '81mg', 'Once daily', '90 days'),
(505, 205, 103, 'Vitamin D', '1000 IU', 'Once daily', '60 days'),
(506, 206, 105, 'Ibuprofen', '400mg', 'Three times daily', '10 days'),
(507, 207, 106, 'Antihistamine cream', 'Apply to rash', 'Twice daily', '7 days');

-- Insert data into MedicalTest table
INSERT INTO MedicalTest (TestID, TestType, PatientID, TestDate, Results, DoctorID) VALUES
-- DoctorID 101 (Dental X-Ray)
(601, 'Dental X-Ray', 201, '2025-04-01', 'Cavities found', 101),
(602, 'Dental X-Ray', 202, '2025-04-02', 'Completed', 101),
(603, 'Dental X-Ray', 203, '2025-04-03', 'Successful', 101),
(604, 'Dental X-Ray', 204, '2025-04-04', 'Minor issue', 101),

-- DoctorID 102 (Eye Scan)
(605, 'Eye Scan', 205, '2025-04-01', 'Slight astigmatism', 102),
(606, 'Eye Scan', 206, '2025-04-02', '20/20 vision', 102),
(607, 'Eye Scan', 207, '2025-04-03', 'Normal', 102),
(608, 'Eye Scan', 201, '2025-04-04', 'No issues', 102),

-- DoctorID 103 (Blood Test)
(609, 'Blood Test', 202, '2025-04-01', 'Normal levels', 103),
(610, 'Blood Test', 203, '2025-04-02', 'Slightly high', 103),
(611, 'Blood Test', 204, '2025-04-03', 'Borderline', 103),
(612, 'Blood Test', 205, '2025-04-04', 'Normal', 103),

-- DoctorID 104 (ECG)
(613, 'ECG', 206, '2025-04-01', 'Mild irregularity', 104),
(614, 'ECG', 207, '2025-04-02', 'Normal', 104),
(615, 'ECG', 201, '2025-04-03', 'Slight fatigue', 104),
(616, 'ECG', 202, '2025-04-04', 'Slightly elevated', 104),

-- DoctorID 105 (X-Ray)
(617, 'X-Ray', 203, '2025-04-01', 'No issues', 105),
(618, 'X-Ray', 204, '2025-04-02', 'Mild loss', 105),
(619, 'X-Ray', 205, '2025-04-03', 'Disc bulge', 105),
(620, 'X-Ray', 206, '2025-04-04', 'No issues', 105),

-- DoctorID 106 (Allergy Test)
(621, 'Allergy Test', 207, '2025-04-01', 'Peanut allergy confirmed', 106),
(622, 'Allergy Test', 201, '2025-04-02', 'Benign', 106),
(623, 'Allergy Test', 202, '2025-04-03', 'Gluten sensitivity', 106),
(624, 'Allergy Test', 203, '2025-04-04', 'Contact allergy', 106);

ALTER TABLE Doctor ADD Username VARCHAR(50);
ALTER TABLE Doctor ADD Password VARCHAR(50);

ALTER TABLE Patient ADD Username VARCHAR(50);
ALTER TABLE Patient ADD Password VARCHAR(50);

UPDATE Doctor SET Username = 'Ali_doctor', Password = 'Ali123' WHERE DoctorID = 101;
UPDATE Doctor SET Username = 'Reem_doctor', Password = 'Reem123' WHERE DoctorID = 102;
UPDATE Doctor SET Username = 'Khalid_doctor', Password = 'Khalid123' WHERE DoctorID = 103;
UPDATE Doctor SET Username = 'Noura_doctor', Password = 'Noura123' WHERE DoctorID = 104;
UPDATE Doctor SET Username = 'Yousef_doctor', Password = 'Yousef123' WHERE DoctorID = 105;
UPDATE Doctor SET Username = 'Maha_doctor', Password = 'Maha123' WHERE DoctorID = 106;
UPDATE Doctor SET Username = 'Ibrahim_doctor', Password = 'Ibrahim123' WHERE DoctorID = 107;

UPDATE Patient SET Username = 'Laila_patient', Password = 'Laila123' WHERE PatientID = 201;
UPDATE Patient SET Username = 'Faisal_patient', Password = 'Faisal123' WHERE PatientID = 202;
UPDATE Patient SET Username = 'Nadia_patient', Password = 'Nadia123' WHERE PatientID = 203;
UPDATE Patient SET Username = 'Omar_patient', Password = 'Omar123' WHERE PatientID = 204;
UPDATE Patient SET Username = 'Amira_patient', Password = 'Amira123' WHERE PatientID = 205;
UPDATE Patient SET Username = 'Salman_patient', Password = 'Salman123' WHERE PatientID = 206;
UPDATE Patient SET Username = 'Hind_patient', Password = 'Hind123' WHERE PatientID = 207;

RENAME COLUMN HOSPITAL.PATIENT.NAME TO FULLNAME;
RENAME COLUMN HOSPITAL.DOCTOR.FNAME TO DR_FIRSTNAME;
RENAME COLUMN HOSPITAL.DOCTOR.LNAME TO DR_LASTTNAME;
RENAME COLUMN HOSPITAL.DOCTOR.DR_LASTTNAME TO DR_LASTNAME;
RENAME COLUMN HOSPITAL.DOCTOR.DR_LASTNAME TO DR_LASTTNAME;

INSERT INTO Doctor (DoctorID, DR_FIRSTNAME, DR_LASTTNAME, Specialization, DepartmentID, Schedule, Username, Password) VALUES
(108, 'Hassan', 'Al-Najjar', 'Dentist', 1, 'Wed-Fri 2pm-6pm', 'Hassan_doctor', 'Hassan123'),
(109, 'Lina', 'Al-Harbi', 'Ophthalmologist', 2, 'Thu-Sat 8am-12pm', 'Lina_doctor', 'Lina123'),
(110, 'Fahad', 'Al-Tamimi', 'General Physician', 3, 'Mon-Wed 1pm-5pm', 'Fahad_doctor', 'Fahad123'),
(111, 'Aisha', 'Al-Bader', 'Cardiologist', 4, 'Tue-Thu 3pm-7pm', 'Aisha_doctor', 'Aisha123'),
(112, 'Salem', 'Al-Dossari', 'Orthopedic Surgeon', 5, 'Sun-Tue 10am-2pm', 'Salem_doctor', 'Salem123'),
(113, 'Rania', 'Al-Mutlaq', 'Dermatologist', 6, 'Wed-Fri 1pm-4pm', 'Rania_doctor', 'Rania123'),
(114, 'Abdullah', 'Al-Johani', 'Pediatrician', 7, 'Mon-Wed 2pm-5pm', 'Abdullah_doctor', 'Abdullah123');

DROP TABLE Appointment;

CREATE TABLE Appointment (
    AppointmentID INT PRIMARY KEY,
    AppointmentDate DATE,
    AppointmentTime TIME,
    DoctorID INT,
    PatientID INT,
    Status VARCHAR(20),
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID),
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID)
);

INSERT INTO Appointment (AppointmentID, AppointmentDate, AppointmentTime, DoctorID, PatientID, Status) VALUES
(1001, '2025-05-06', '09:00:00', 101, NULL, 'Available'),
(1002, '2025-05-07', '09:00:00', 101, NULL, 'Available'),
(1003, '2025-05-12', '09:00:00', 101, NULL, 'Available'),
(1004, '2025-05-13', '10:00:00', 101, NULL, 'Available'),
(1005, '2025-05-14', '11:00:00', 101, NULL, 'Available'),

(1006, '2025-05-06', '10:00:00', 102, NULL, 'Available'),
(1007, '2025-05-07', '11:00:00', 102, NULL, 'Available'),
(1008, '2025-05-12', '12:00:00', 102, NULL, 'Available'),
(1009, '2025-05-13', '10:00:00', 102, NULL, 'Available'),
(1010, '2025-05-14', '11:00:00', 102, NULL, 'Available'),

(1011, '2025-05-06', '08:00:00', 103, NULL, 'Available'),
(1012, '2025-05-07', '09:00:00', 103, NULL, 'Available'),
(1013, '2025-05-08', '10:00:00', 103, NULL, 'Available'),
(1014, '2025-05-09', '11:00:00', 103, NULL, 'Available'),
(1015, '2025-05-10', '12:00:00', 103, NULL, 'Available'),

(1016, '2025-05-06', '11:00:00', 104, NULL, 'Available'),
(1017, '2025-05-07', '12:00:00', 104, NULL, 'Available'),
(1018, '2025-05-08', '13:00:00', 104, NULL, 'Available'),
(1019, '2025-05-09', '14:00:00', 104, NULL, 'Available'),
(1020, '2025-05-10', '15:00:00', 104, NULL, 'Available'),

(1021, '2025-05-07', '09:00:00', 105, NULL, 'Available'),
(1022, '2025-05-08', '10:00:00', 105, NULL, 'Available'),
(1023, '2025-05-09', '11:00:00', 105, NULL, 'Available'),
(1024, '2025-05-10', '12:00:00', 105, NULL, 'Available'),
(1025, '2025-05-13', '13:00:00', 105, NULL, 'Available'),

(1026, '2025-05-06', '10:00:00', 106, NULL, 'Available'),
(1027, '2025-05-07', '11:00:00', 106, NULL, 'Available'),
(1028, '2025-05-08', '12:00:00', 106, NULL, 'Available'),
(1029, '2025-05-12', '13:00:00', 106, NULL, 'Available'),
(1030, '2025-05-13', '10:00:00', 106, NULL, 'Available'),

(1031, '2025-05-07', '09:00:00', 107, NULL, 'Available'),
(1032, '2025-05-08', '10:00:00', 107, NULL, 'Available'),
(1033, '2025-05-10', '11:00:00', 107, NULL, 'Available'),
(1034, '2025-05-13', '12:00:00', 107, NULL, 'Available'),
(1035, '2025-05-14', '09:00:00', 107, NULL, 'Available'),

(1036, '2025-05-07', '14:00:00', 108, NULL, 'Available'),
(1037, '2025-05-08', '15:00:00', 108, NULL, 'Available'),
(1038, '2025-05-09', '16:00:00', 108, NULL, 'Available'),

(1039, '2025-05-08', '08:00:00', 109, NULL, 'Available'),
(1040, '2025-05-09', '09:00:00', 109, NULL, 'Available'),
(1041, '2025-05-10', '10:00:00', 109, NULL, 'Available'),

(1042, '2025-05-05', '13:00:00', 110, NULL, 'Available'),
(1043, '2025-05-06', '14:00:00', 110, NULL, 'Available'),
(1044, '2025-05-07', '15:00:00', 110, NULL, 'Available'),

(1045, '2025-05-06', '15:00:00', 111, NULL, 'Available'),
(1046, '2025-05-07', '16:00:00', 111, NULL, 'Available'),
(1047, '2025-05-08', '17:00:00', 111, NULL, 'Available'),

(1048, '2025-05-04', '10:00:00', 112, NULL, 'Available'),
(1049, '2025-05-05', '11:00:00', 112, NULL, 'Available'),
(1050, '2025-05-06', '12:00:00', 112, NULL, 'Available'),

(1051, '2025-05-07', '13:00:00', 113, NULL, 'Available'),
(1052, '2025-05-08', '14:00:00', 113, NULL, 'Available'),
(1053, '2025-05-09', '15:00:00', 113, NULL, 'Available'),

(1054, '2025-05-05', '14:00:00', 114, NULL, 'Available'),
(1055, '2025-05-06', '15:00:00', 114, NULL, 'Available'),
(1056, '2025-05-07', '16:00:00', 114, NULL, 'Available'),

(322, '2025-04-20','09:00:00', 101, 201, 'Confirmed'),
(323, '2025-04-21','10:00:00', 101, 202, 'Pending'),

(324, '2025-04-20','10:00:00', 102, 203, 'Cancelled'),
(325, '2025-04-21','11:00:00', 102, 204, 'Confirmed'),

(326, '2025-04-22','08:30:00', 103, 205, 'Pending'),
(327, '2025-04-23','09:00:00', 103, 206, 'Confirmed'),

(328, '2025-04-24','11:00:00', 104, 207, 'Cancelled'),
(329, '2025-04-25','12:00:00', 104, 201, 'Confirmed'),

(330, '2025-04-26','09:30:00', 105, 202, 'Pending'),
(331, '2025-04-27','10:30:00', 105, 203, 'Confirmed'),

(332, '2025-04-28','10:15:00', 106, 204, 'Confirmed'),
(333, '2025-04-29','11:15:00', 106, 205, 'Cancelled'),

(334, '2025-04-30','08:45:00', 107, 206, 'Pending'),
(335, '2025-05-01','09:45:00', 107, 207, 'Confirmed'),

(308, '2025-04-06','14:00:00', 108, 201, 'Confirmed'),
(309, '2025-04-07','08:00:00', 109, 202, 'Pending'),
(310, '2025-04-08','13:00:00', 110, 203, 'Confirmed'),
(311, '2025-04-09','15:00:00', 111, 204, 'Cancelled'),
(312, '2025-04-10','10:00:00', 112, 205, 'Confirmed'),
(313, '2025-04-11','13:00:00', 113, 206, 'Pending'),
(314, '2025-04-12','14:00:00', 114, 207, 'Confirmed');
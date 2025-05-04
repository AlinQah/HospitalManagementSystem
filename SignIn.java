/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SignIn extends javax.swing.JFrame {
      private final ButtonGroup userGroup;
    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        hideAllFields();
        userGroup = new ButtonGroup();

        userGroup.add(AdminRButton);
        userGroup.add(DoctorRButton);
        userGroup.add(PatientRButton);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        scLabel = new javax.swing.JLabel();
        doclastNameLabel = new javax.swing.JLabel();
        DocLnameField = new javax.swing.JTextField();
        SpLabel = new javax.swing.JLabel();
        ScheduleField = new javax.swing.JTextField();
        fullNameLabel = new javax.swing.JLabel();
        FullNameField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        docconfirmlabel = new javax.swing.JLabel();
        MedHistoryField = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        AdminRButton = new javax.swing.JRadioButton();
        DoctorRButton = new javax.swing.JRadioButton();
        PatientRButton = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        medHisLabel = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        DocConfirmPassField = new javax.swing.JPasswordField();
        BirthDateLabel = new javax.swing.JLabel();
        PatientIDField1 = new javax.swing.JTextField();
        BirthDateField = new javax.swing.JTextField();
        patientIDLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        AdminIDField2 = new javax.swing.JTextField();
        DocIDlable = new javax.swing.JLabel();
        DocIDField2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        AdminFnameField1 = new javax.swing.JTextField();
        docfnameLabel = new javax.swing.JLabel();
        DocFnameField1 = new javax.swing.JTextField();
        DeptLabel1 = new javax.swing.JLabel();
        adminuserlabel = new javax.swing.JLabel();
        AdminUserNameField1 = new javax.swing.JTextField();
        adminpasslabel = new javax.swing.JLabel();
        AdminPasswordField1 = new javax.swing.JPasswordField();
        adminconfrimlabel = new javax.swing.JLabel();
        AdminConfirmPassField1 = new javax.swing.JPasswordField();
        phoneNumLabel = new javax.swing.JLabel();
        PhoneField1 = new javax.swing.JTextField();
        docusernamelabel = new javax.swing.JLabel();
        DocUserNameField1 = new javax.swing.JTextField();
        docpasslabel = new javax.swing.JLabel();
        DocPasswordField1 = new javax.swing.JPasswordField();
        specializationComboBox = new javax.swing.JComboBox<>();
        departmentIDTextField = new javax.swing.JTextField();
        FormatLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(1300, 650));
        jPanel7.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel7.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 153));
        jLabel19.setText("Create New Account");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        scLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        scLabel.setForeground(new java.awt.Color(0, 102, 153));
        scLabel.setText("Schedule");
        jPanel7.add(scLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        doclastNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        doclastNameLabel.setForeground(new java.awt.Color(0, 102, 153));
        doclastNameLabel.setText(" Last Name");
        jPanel7.add(doclastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        DocLnameField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DocLnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel7.add(DocLnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 160, 40));

        SpLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SpLabel.setForeground(new java.awt.Color(0, 102, 153));
        SpLabel.setText(" Specialization");
        jPanel7.add(SpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        ScheduleField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ScheduleField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        ScheduleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleFieldActionPerformed(evt);
            }
        });
        jPanel7.add(ScheduleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 220, 40));

        fullNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(0, 102, 153));
        fullNameLabel.setText("Full Name");
        jPanel7.add(fullNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, -1, -1));

        FullNameField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FullNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        FullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameFieldActionPerformed(evt);
            }
        });
        jPanel7.add(FullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 190, 190, 40));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 153));
        jLabel27.setText("User Type: ");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        docconfirmlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        docconfirmlabel.setForeground(new java.awt.Color(0, 102, 153));
        docconfirmlabel.setText("Confirm password");
        jPanel7.add(docconfirmlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 430, -1, -1));

        MedHistoryField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MedHistoryField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        MedHistoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedHistoryFieldActionPerformed(evt);
            }
        });
        jPanel7.add(MedHistoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 360, 210, 40));

        CreateButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CreateButton.setForeground(new java.awt.Color(0, 102, 153));
        CreateButton.setText("Create");
        CreateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        jPanel7.add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 130, 50));

        CancelButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(0, 102, 153));
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel7.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 120, 50));

        AdminRButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AdminRButton.setForeground(new java.awt.Color(0, 102, 153));
        AdminRButton.setText("Admin");
        AdminRButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        AdminRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRButtonActionPerformed(evt);
            }
        });
        jPanel7.add(AdminRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        DoctorRButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DoctorRButton.setForeground(new java.awt.Color(0, 102, 153));
        DoctorRButton.setText("Doctor");
        DoctorRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorRButtonActionPerformed(evt);
            }
        });
        jPanel7.add(DoctorRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        PatientRButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PatientRButton.setForeground(new java.awt.Color(0, 102, 153));
        PatientRButton.setText("Patient");
        PatientRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientRButtonActionPerformed(evt);
            }
        });
        jPanel7.add(PatientRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 70, -1, -1));
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        medHisLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        medHisLabel.setForeground(new java.awt.Color(0, 102, 153));
        medHisLabel.setText("Medical History");
        jPanel7.add(medHisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, -1, 20));
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, -1, -1));

        DocConfirmPassField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DocConfirmPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocConfirmPassFieldActionPerformed(evt);
            }
        });
        jPanel7.add(DocConfirmPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 430, 170, 40));

        BirthDateLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BirthDateLabel.setForeground(new java.awt.Color(0, 102, 153));
        BirthDateLabel.setText("Date of birth");
        jPanel7.add(BirthDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, -1, -1));

        PatientIDField1.setEditable(false);
        PatientIDField1.setBackground(new java.awt.Color(255, 255, 255));
        PatientIDField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PatientIDField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        PatientIDField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIDField1ActionPerformed(evt);
            }
        });
        jPanel7.add(PatientIDField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, 160, 40));

        BirthDateField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BirthDateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        BirthDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthDateFieldActionPerformed(evt);
            }
        });
        jPanel7.add(BirthDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 250, 190, 40));

        patientIDLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        patientIDLabel.setForeground(new java.awt.Color(0, 102, 153));
        patientIDLabel.setText("Patient ID");
        jPanel7.add(patientIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 153));
        jLabel23.setText("Admin ID");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        AdminIDField2.setEditable(false);
        AdminIDField2.setBackground(new java.awt.Color(255, 255, 255));
        AdminIDField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AdminIDField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        AdminIDField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminIDField2ActionPerformed(evt);
            }
        });
        jPanel7.add(AdminIDField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 160, 40));

        DocIDlable.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DocIDlable.setForeground(new java.awt.Color(0, 102, 153));
        DocIDlable.setText("Doctor ID");
        jPanel7.add(DocIDlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        DocIDField2.setEditable(false);
        DocIDField2.setBackground(new java.awt.Color(255, 255, 255));
        DocIDField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DocIDField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        DocIDField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocIDField2ActionPerformed(evt);
            }
        });
        jPanel7.add(DocIDField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 160, 40));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 153));
        jLabel30.setText(" Name");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, -1));

        AdminFnameField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AdminFnameField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel7.add(AdminFnameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 160, 40));

        docfnameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        docfnameLabel.setForeground(new java.awt.Color(0, 102, 153));
        docfnameLabel.setText("First Name");
        jPanel7.add(docfnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        DocFnameField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DocFnameField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel7.add(DocFnameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 160, 40));

        DeptLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DeptLabel1.setForeground(new java.awt.Color(0, 102, 153));
        DeptLabel1.setText("Department ID");
        jPanel7.add(DeptLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        adminuserlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        adminuserlabel.setForeground(new java.awt.Color(0, 102, 153));
        adminuserlabel.setText("Username");
        jPanel7.add(adminuserlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        AdminUserNameField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AdminUserNameField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel7.add(AdminUserNameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 180, 40));

        adminpasslabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        adminpasslabel.setForeground(new java.awt.Color(0, 102, 153));
        adminpasslabel.setText("Password");
        jPanel7.add(adminpasslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        AdminPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AdminPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPasswordField1ActionPerformed(evt);
            }
        });
        jPanel7.add(AdminPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 160, 40));

        adminconfrimlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        adminconfrimlabel.setForeground(new java.awt.Color(0, 102, 153));
        adminconfrimlabel.setText("Confirm Password");
        jPanel7.add(adminconfrimlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        AdminConfirmPassField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AdminConfirmPassField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminConfirmPassField1ActionPerformed(evt);
            }
        });
        jPanel7.add(AdminConfirmPassField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 170, 40));

        phoneNumLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        phoneNumLabel.setForeground(new java.awt.Color(0, 102, 153));
        phoneNumLabel.setText("Phone Number");
        jPanel7.add(phoneNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, -1, 20));

        PhoneField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PhoneField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        PhoneField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneField1ActionPerformed(evt);
            }
        });
        jPanel7.add(PhoneField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, 200, 40));

        docusernamelabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        docusernamelabel.setForeground(new java.awt.Color(0, 102, 153));
        docusernamelabel.setText("Username");
        jPanel7.add(docusernamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        DocUserNameField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DocUserNameField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel7.add(DocUserNameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 160, 40));

        docpasslabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        docpasslabel.setForeground(new java.awt.Color(0, 102, 153));
        docpasslabel.setText("Password");
        jPanel7.add(docpasslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, -1, -1));

        DocPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DocPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocPasswordField1ActionPerformed(evt);
            }
        });
        jPanel7.add(DocPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 160, 40));

        specializationComboBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        specializationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentist", "Ophthalmologist", "General Physician", "Cardiologist", "Orthopedic Surgeon", "Dermatologist", "Pediatrician" }));
        specializationComboBox.setSelectedIndex(-1);
        specializationComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        specializationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationComboBoxActionPerformed(evt);
            }
        });
        jPanel7.add(specializationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 237, -1));

        departmentIDTextField.setEditable(false);
        departmentIDTextField.setBackground(new java.awt.Color(255, 255, 255));
        departmentIDTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        departmentIDTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel7.add(departmentIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 160, 40));

        FormatLabel.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        FormatLabel.setForeground(new java.awt.Color(102, 102, 102));
        FormatLabel.setText("Format YYYY-MM-DD");
        jPanel7.add(FormatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 230, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\Logo.png")); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatima\\Pictures\\1500x800.jpg")); // NOI18N
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str); // or Integer.parseInt(str) if you only want whole numbers
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isAlpha(String str) {
        return str != null && str.matches("[a-zA-Z ]+");
    }

    private boolean isValidDate(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("DD-MM-YYYY");
            sdf.setLenient(false); // strict parsing
            sdf.parse(str);
            return true;
        } catch (java.text.ParseException e) {
            return false;
        }
    }
    private void ScheduleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScheduleFieldActionPerformed

    private void FullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameFieldActionPerformed

    private void MedHistoryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedHistoryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedHistoryFieldActionPerformed


    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        String dob = BirthDateField.getText().trim();

        // Role selection check
        if (!AdminRButton.isSelected() && !PatientRButton.isSelected() && !DoctorRButton.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please choose a user type", "Message", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        // ========================== ADMIN VALIDATION ==========================
        if (AdminRButton.isSelected()) {
            if (AdminIDField2.getText().isEmpty() || AdminFnameField1.getText().isEmpty()
                || AdminUserNameField1.getText().isEmpty() || new String(AdminPasswordField1.getPassword()).trim().isEmpty()
                || new String(AdminConfirmPassField1.getPassword()).trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields for Admin", "Message", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            if (!new String(AdminPasswordField1.getPassword()).equals(new String(AdminConfirmPassField1.getPassword()))) {
                JOptionPane.showMessageDialog(null, "Passwords do not match", "Message", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            if (!new String(AdminPasswordField1.getPassword()).matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!^&+=]).{8,}$")) {
                JOptionPane.showMessageDialog(this,
                    "Password must be at least 8 characters long and include uppercase, lowercase, number, and special character.",
                    "Password Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!AdminUserNameField1.getText().matches("^[a-zA-Z0-9@._-]{5,15}$")) {
                JOptionPane.showMessageDialog(this, "Username must be 5-15 characters long and can include letters, numbers, and @ . _ -.", "Username Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (AdminUserNameField1.getText().contains(" ")) {
                JOptionPane.showMessageDialog(null, "Username should not contain spaces", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!isAlpha(AdminFnameField1.getText())) {
                JOptionPane.showMessageDialog(null, "Name must contain only letters", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        // ========================== DOCTOR VALIDATION ==========================
        if (DoctorRButton.isSelected()) {
            if ( DocFnameField1.getText().isEmpty()
                || DocLnameField.getText().isEmpty() || specializationComboBox.getSelectedItem() == null
                || departmentIDTextField.getText().isEmpty() || DocUserNameField1.getText().isEmpty()
                || new String(DocPasswordField1.getPassword()).trim().isEmpty()
                || new String(DocConfirmPassField.getPassword()).trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields for Doctor", "Message", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            if (!isAlpha(DocFnameField1.getText()) || !isAlpha(DocLnameField.getText())) {
                JOptionPane.showMessageDialog(null, "Name fields must contain only letters", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String schedule = ScheduleField.getText().trim();
            String regex = "^(Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday) to "
            + "(Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday) "
            + "\\d{1,2}(am|pm)-\\d{1,2}(am|pm)$";

            if (!schedule.matches(regex)) {
                JOptionPane.showMessageDialog(this,
                    "Invalid schedule format.\nPlease use: Sunday to Thursday 8am-3pm\nCase Sensitive!",
                    "Schedule Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!DocUserNameField1.getText().matches("^[a-zA-Z0-9@._-]{5,15}$")) {
                JOptionPane.showMessageDialog(this, "Username must be 5-15 characters long and can include letters, numbers, and @ . _ -.", "Username Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!new String(DocPasswordField1.getPassword()).equals(new String(DocConfirmPassField.getPassword()))) {
                JOptionPane.showMessageDialog(null, "Passwords do not match", "Message", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            if (!new String(DocPasswordField1.getPassword()).matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!^&+=]).{8,}$")) {
                JOptionPane.showMessageDialog(this,
                    "Password must be at least 8 characters long and include uppercase, lowercase, number, and special character.",
                    "Password Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }

        // ========================== PATIENT VALIDATION ==========================
        if (PatientRButton.isSelected()) {
            if ( FullNameField.getText().isEmpty()
                || BirthDateField.getText().isEmpty() || PhoneField1.getText().isEmpty()
                || MedHistoryField.getText().isEmpty() || DocUserNameField1.getText().isEmpty()
                || new String(DocPasswordField1.getPassword()).trim().isEmpty()
                || new String(DocConfirmPassField.getPassword()).trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields for Patient", "Message", JOptionPane.PLAIN_MESSAGE);
                return;
            }

            if (!isAlpha(FullNameField.getText())) {
                JOptionPane.showMessageDialog(null, "Full name must contain only letters", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Validate Date format
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);

            java.sql.Date sqlDateOfBirth = null;

            try {
                java.util.Date utilDate = sdf.parse(dob);
                sqlDateOfBirth = new java.sql.Date(utilDate.getTime());

                java.util.Date today = new java.util.Date();
                if (sqlDateOfBirth.after(today)) {
                    JOptionPane.showMessageDialog(this, "Date of Birth cannot be in the future!", "Date Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Date of Birth must be in format YYYY-MM-DD!", "Date Format Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!PhoneField1.getText().matches("^05\\d{8}$")) {
                JOptionPane.showMessageDialog(this, "Contact number must start with 05 and be 10 digits long!");
                return;

            }

            if (!MedHistoryField.getText().matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(null, "Incorrect Medical History!\nPlease enter only letters.\n Numbers and symbols are not allowed!.");
                return;
            }

            if (!DocUserNameField1.getText().matches("^[a-zA-Z0-9@._-]{5,15}$")) {
                JOptionPane.showMessageDialog(this, "Username must be 5-15 characters long and can include letters, numbers, and @ . _ -.", "Username Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!new String(DocPasswordField1.getPassword()).matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!^&+=]).{8,}$")) {
                JOptionPane.showMessageDialog(this,
                    "Password must be at least 8 characters long and include uppercase, lowercase, number, and special character.",
                    "Password Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!new String(DocPasswordField1.getPassword()).equals(new String(DocConfirmPassField.getPassword()))) {
                JOptionPane.showMessageDialog(null, "Passwords do not match", "Message", JOptionPane.PLAIN_MESSAGE);
                return;
            }

        }

        // INSERT INTO DATABASE
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/hospitalDB", "hospital", "hospital");

            String sql = "";

            if (AdminRButton.isSelected()) {
                sql = "INSERT INTO SystemAdministrator (AdminId, Name, Username, Password) VALUES (?, ?, ?, ?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, AdminIDField2.getText());
                pstmt.setString(2, AdminFnameField1.getText());
                pstmt.setString(3, AdminUserNameField1.getText());
                pstmt.setString(4, new String(AdminPasswordField1.getPassword()));

            } else if (PatientRButton.isSelected()) {
                sql = "INSERT INTO Patient (PatientID, FullName, DateOfBirth, ContactInfo, MedicalHistory, Username, Password) VALUES (?, ?, ?, ?, ?, ?, ?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, PatientIDField1.getText());
                pstmt.setString(2, FullNameField.getText());
                pstmt.setString(3, dob);
                pstmt.setString(4, PhoneField1.getText());
                pstmt.setString(5, MedHistoryField.getText());
                pstmt.setString(6, DocUserNameField1.getText());
                pstmt.setString(7, new String(DocPasswordField1.getPassword()));

            } else if (DoctorRButton.isSelected()) {
                sql = "INSERT INTO Doctor (DoctorID, FName, Lname, Specialization, DepartmentID, Username, Password) VALUES (?, ?, ?, ?, ?, ?, ?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, DocIDField2.getText());
                pstmt.setString(2, DocFnameField1.getText());
                pstmt.setString(3, DocLnameField.getText());
                pstmt.setString(4, specializationComboBox.getSelectedItem().toString());
                pstmt.setString(5, departmentIDTextField.getText());
                pstmt.setString(6, DocUserNameField1.getText());
                pstmt.setString(7, new String(DocPasswordField1.getPassword()));
            }

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Account created successfully!", "Success", JOptionPane.PLAIN_MESSAGE);
                LoginPage loginPage = new LoginPage(); // or new LoginPage(this) if you need to pass reference
                loginPage.setVisible(true);
                this.dispose();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Warning: Error while closing DB resources.\nDetails: " + e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        LoginPage loginPage = new LoginPage(); // or new LoginPage(this) if you need to pass reference
        loginPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AdminRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRButtonActionPerformed

        hideAllFields();
        // Show Admin fields
        int nextID = Admin.generateNextAdminID();

        jLabel23.setVisible(true);
        AdminIDField2.setVisible(true);
        AdminIDField2.setText(String.valueOf(nextID));

        jLabel30.setVisible(true);
        AdminFnameField1.setVisible(true);

        adminuserlabel.setVisible(true);
        AdminUserNameField1.setVisible(true);

        adminpasslabel.setVisible(true);
        AdminPasswordField1.setVisible(true);

        adminconfrimlabel.setVisible(true);
        AdminConfirmPassField1.setVisible(true);
    }//GEN-LAST:event_AdminRButtonActionPerformed

    private void DoctorRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorRButtonActionPerformed

        hideAllFields();
        int nextID = Admin.generateNextDoctorID();
        // Show Doctor fields
        DocIDlable.setVisible(true);
        DocIDField2.setVisible(true);
        DocIDField2.setText(String.valueOf(nextID));

        docfnameLabel.setVisible(true);
        DocFnameField1.setVisible(true);

        doclastNameLabel.setVisible(true);
        DocLnameField.setVisible(true);

        DeptLabel1.setVisible(true);
        departmentIDTextField.setVisible(true);

        ScheduleField.setVisible(true);
        scLabel.setVisible(true);

        specializationComboBox.setVisible(true);
        SpLabel.setVisible(true);

        docusernamelabel.setVisible(true);
        DocUserNameField1.setVisible(true);

        docpasslabel.setVisible(true);
        DocPasswordField1.setVisible(true);

        docconfirmlabel.setVisible(true);
        DocConfirmPassField.setVisible(true);
    }//GEN-LAST:event_DoctorRButtonActionPerformed

    private void PatientRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientRButtonActionPerformed

        hideAllFields();
        Admin admin = new Admin();
        int nextID = admin.generateNextPatientID();

        // Show Patient fields
        patientIDLabel.setVisible(true);
        PatientIDField1.setVisible(true);
        PatientIDField1.setText(String.valueOf(nextID));

        fullNameLabel.setVisible(true);
        FullNameField.setVisible(true);

        FormatLabel.setVisible(true);
        BirthDateLabel.setVisible(true);
        BirthDateField.setVisible(true);

        MedHistoryField.setVisible(true);
        medHisLabel.setVisible(true);

        PhoneField1.setVisible(true);
        phoneNumLabel.setVisible(true);

        docusernamelabel.setVisible(true);
        DocUserNameField1.setVisible(true);

        docpasslabel.setVisible(true);
        DocPasswordField1.setVisible(true);

        docconfirmlabel.setVisible(true);
        DocConfirmPassField.setVisible(true);
    }//GEN-LAST:event_PatientRButtonActionPerformed
private void hideAllFields() {
        // Admin fields
        jLabel23.setVisible(false);
        AdminIDField2.setVisible(false);
        jLabel30.setVisible(false);
        AdminFnameField1.setVisible(false);
        adminuserlabel.setVisible(false);
        AdminUserNameField1.setVisible(false);
        adminpasslabel.setVisible(false);
        AdminPasswordField1.setVisible(false);
        adminconfrimlabel.setVisible(false);
        AdminConfirmPassField1.setVisible(false);

        // Doctor fields
        DocIDlable.setVisible(false);
        DocIDField2.setVisible(false);
        docfnameLabel.setVisible(false);
        DocFnameField1.setVisible(false);
        doclastNameLabel.setVisible(false);
        DocLnameField.setVisible(false);
        departmentIDTextField.setVisible(false);
        ScheduleField.setVisible(false);
        scLabel.setVisible(false);
        DeptLabel1.setVisible(false);
        specializationComboBox.setVisible(false);
        SpLabel.setVisible(false);
        docusernamelabel.setVisible(false);
        DocUserNameField1.setVisible(false);
        docpasslabel.setVisible(false);
        DocPasswordField1.setVisible(false);
        docconfirmlabel.setVisible(false);
        DocConfirmPassField.setVisible(false);

        // Patient fields
        patientIDLabel.setVisible(false);
        PatientIDField1.setVisible(false);
        fullNameLabel.setVisible(false);
        FullNameField.setVisible(false);
        BirthDateLabel.setVisible(false);
        BirthDateField.setVisible(false);
        MedHistoryField.setVisible(false);
        medHisLabel.setVisible(false);
        PhoneField1.setVisible(false);
        phoneNumLabel.setVisible(false);
        FormatLabel.setVisible(false);
    }
    private void DocConfirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocConfirmPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocConfirmPassFieldActionPerformed

    private void PatientIDField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientIDField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientIDField1ActionPerformed

    private void BirthDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthDateFieldActionPerformed

    private void AdminIDField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminIDField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminIDField2ActionPerformed

    private void DocIDField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocIDField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocIDField2ActionPerformed

    private void AdminPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPasswordField1ActionPerformed

    private void AdminConfirmPassField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminConfirmPassField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminConfirmPassField1ActionPerformed

    private void PhoneField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneField1ActionPerformed

    private void DocPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocPasswordField1ActionPerformed

    private void specializationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationComboBoxActionPerformed
        Admin admin = new Admin();
        String selectedSpecialization = (String) specializationComboBox.getSelectedItem();
        String departmentID = admin.getDepartmentIDBySpecialization(selectedSpecialization);
        departmentIDTextField.setText(departmentID);
    }//GEN-LAST:event_specializationComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField AdminConfirmPassField1;
    private javax.swing.JTextField AdminFnameField1;
    private javax.swing.JTextField AdminIDField2;
    private javax.swing.JPasswordField AdminPasswordField1;
    private javax.swing.JRadioButton AdminRButton;
    private javax.swing.JTextField AdminUserNameField1;
    private javax.swing.JTextField BirthDateField;
    private javax.swing.JLabel BirthDateLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CreateButton;
    private javax.swing.JLabel DeptLabel1;
    private javax.swing.JPasswordField DocConfirmPassField;
    private javax.swing.JTextField DocFnameField1;
    private javax.swing.JTextField DocIDField2;
    private javax.swing.JLabel DocIDlable;
    private javax.swing.JTextField DocLnameField;
    private javax.swing.JPasswordField DocPasswordField1;
    private javax.swing.JTextField DocUserNameField1;
    private javax.swing.JRadioButton DoctorRButton;
    private javax.swing.JLabel FormatLabel;
    private javax.swing.JTextField FullNameField;
    private javax.swing.JTextField MedHistoryField;
    private javax.swing.JTextField PatientIDField1;
    private javax.swing.JRadioButton PatientRButton;
    private javax.swing.JTextField PhoneField1;
    private javax.swing.JTextField ScheduleField;
    private javax.swing.JLabel SpLabel;
    private javax.swing.JLabel adminconfrimlabel;
    private javax.swing.JLabel adminpasslabel;
    private javax.swing.JLabel adminuserlabel;
    private javax.swing.JTextField departmentIDTextField;
    private javax.swing.JLabel docconfirmlabel;
    private javax.swing.JLabel docfnameLabel;
    private javax.swing.JLabel doclastNameLabel;
    private javax.swing.JLabel docpasslabel;
    private javax.swing.JLabel docusernamelabel;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel medHisLabel;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JLabel phoneNumLabel;
    private javax.swing.JLabel scLabel;
    private javax.swing.JComboBox<String> specializationComboBox;
    // End of variables declaration//GEN-END:variables
}

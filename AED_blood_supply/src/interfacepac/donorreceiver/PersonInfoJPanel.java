/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.donorreceiver;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class PersonInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonInfoJPanel
     */
    TableJPanel allTable;
    TableJPanel donationTable;
    TableJPanel consumptionTable;
    
    public PersonInfoJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayTabbedPane1 = new javax.swing.JTabbedPane();
        displayTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTField = new javax.swing.JTextField();
        lastNameTField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        genderLaber = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        dobTField = new javax.swing.JTextField();
        homePhoneTField = new javax.swing.JTextField();
        homePhoneLabel = new javax.swing.JLabel();
        workPhoneTField = new javax.swing.JTextField();
        workPhoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        emailTField = new javax.swing.JTextField();
        dobTField1 = new javax.swing.JTextField();
        viewDetailsBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        firstNameLabel1 = new javax.swing.JLabel();
        firstNameTField1 = new javax.swing.JTextField();
        lastNameLabel1 = new javax.swing.JLabel();
        lastNameTField1 = new javax.swing.JTextField();
        dobTField2 = new javax.swing.JTextField();
        genderLaber1 = new javax.swing.JLabel();
        dobLabel1 = new javax.swing.JLabel();
        dobTField3 = new javax.swing.JTextField();
        homePhoneLabel1 = new javax.swing.JLabel();
        homePhoneTField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        firstNameLabel2 = new javax.swing.JLabel();
        firstNameTField2 = new javax.swing.JTextField();
        lastNameLabel2 = new javax.swing.JLabel();
        lastNameTField2 = new javax.swing.JTextField();
        firstNameLabel3 = new javax.swing.JLabel();
        firstNameTField3 = new javax.swing.JTextField();
        lastNameLabel3 = new javax.swing.JLabel();
        lastNameTField3 = new javax.swing.JTextField();
        firstNameLabel4 = new javax.swing.JLabel();
        firstNameTField4 = new javax.swing.JTextField();
        firstNameLabel5 = new javax.swing.JLabel();
        firstNameTField5 = new javax.swing.JTextField();

        displayTabbedPane1.addTab("all record", null, allTable);
        displayTabbedPane1.addTab("donation", null, donationTable);
        displayTabbedPane1.addTab("consumption", null, consumptionTable);
        displayTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));
        displayTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI Light", 1, 24))); // NOI18N

        displayTabbedPane1.addTab("all record", null, allTable);
        displayTabbedPane1.addTab("donation", null, donationTable);
        displayTabbedPane1.addTab("consumption", null, consumptionTable);
        displayTabbedPane2.setBackground(new java.awt.Color(250, 250, 250));
        displayTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VItal sign records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI Light", 1, 24))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 0, 24))); // NOI18N

        firstNameLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel.setText("Firstname");
        firstNameLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        firstNameTField.setEnabled(false);

        lastNameTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lastNameTField.setEnabled(false);

        lastNameLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lastNameLabel.setText("Lastname");
        lastNameLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        genderLaber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        genderLaber.setText("Gender");
        genderLaber.setPreferredSize(new java.awt.Dimension(150, 24));

        dobLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        dobLabel.setText("Date of birth");
        dobLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        dobLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        dobLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        dobTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        dobTField.setEnabled(false);

        homePhoneTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        homePhoneLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        homePhoneLabel.setText("Home Phone");
        homePhoneLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        homePhoneLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        homePhoneLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        workPhoneTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        workPhoneLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        workPhoneLabel.setText("Work Phone");
        workPhoneLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        workPhoneLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        workPhoneLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        EmailLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        EmailLabel.setText("Email");
        EmailLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        EmailLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        EmailLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        emailTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        dobTField1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        dobTField1.setEnabled(false);

        viewDetailsBtn.setBackground(new java.awt.Color(250, 250, 250));
        viewDetailsBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        viewDetailsBtn.setText("Update");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(250, 250, 250));
        deleteBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        deleteBtn.setText("Cancel");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(workPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workPhoneTField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(homePhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homePhoneTField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dobTField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(genderLaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dobTField1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(viewDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homePhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePhoneTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workPhoneTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 0, 24))); // NOI18N

        firstNameLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel1.setText("Blood type");
        firstNameLabel1.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameTField1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        firstNameTField1.setEnabled(false);

        lastNameLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lastNameLabel1.setText("quantity");
        lastNameLabel1.setPreferredSize(new java.awt.Dimension(150, 24));

        lastNameTField1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lastNameTField1.setEnabled(false);

        dobTField2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        dobTField2.setEnabled(false);

        genderLaber1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        genderLaber1.setText("Date");
        genderLaber1.setPreferredSize(new java.awt.Dimension(150, 24));

        dobLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        dobLabel1.setText("Source");
        dobLabel1.setMaximumSize(new java.awt.Dimension(150, 24));
        dobLabel1.setMinimumSize(new java.awt.Dimension(150, 24));
        dobLabel1.setPreferredSize(new java.awt.Dimension(150, 24));

        dobTField3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        dobTField3.setEnabled(false);

        homePhoneLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        homePhoneLabel1.setText("Donor");
        homePhoneLabel1.setMaximumSize(new java.awt.Dimension(150, 24));
        homePhoneLabel1.setMinimumSize(new java.awt.Dimension(150, 24));
        homePhoneLabel1.setPreferredSize(new java.awt.Dimension(150, 24));

        homePhoneTField1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        homePhoneTField1.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(homePhoneLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homePhoneTField1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(dobLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dobTField3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(firstNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTField1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(genderLaber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dobTField2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLaber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTField3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homePhoneLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePhoneTField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vital sign", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 0, 24))); // NOI18N

        firstNameLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel2.setText("Blood type");
        firstNameLabel2.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameTField2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        firstNameTField2.setEnabled(false);

        lastNameLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lastNameLabel2.setText("hemoglobin");
        lastNameLabel2.setPreferredSize(new java.awt.Dimension(150, 24));

        lastNameTField2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lastNameTField2.setEnabled(false);

        firstNameLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel3.setText("Infection");
        firstNameLabel3.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameTField3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        firstNameTField3.setEnabled(false);

        lastNameLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lastNameLabel3.setText("diabetes");
        lastNameLabel3.setPreferredSize(new java.awt.Dimension(150, 24));

        lastNameTField3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lastNameTField3.setEnabled(false);

        firstNameLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel4.setText("Other temporary condition");
        firstNameLabel4.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameTField4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        firstNameTField4.setEnabled(false);

        firstNameLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel5.setText("Other permanent condition");
        firstNameLabel5.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameTField5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        firstNameTField5.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(firstNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameTField2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(firstNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameTField3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(firstNameLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(firstNameLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstNameTField4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(firstNameTField5)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTField3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTField3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTField4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTField5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(displayTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayTabbedPane2)
                    .addComponent(displayTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTabbedPane displayTabbedPane1;
    private javax.swing.JTabbedPane displayTabbedPane2;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel dobLabel1;
    private javax.swing.JTextField dobTField;
    private javax.swing.JTextField dobTField1;
    private javax.swing.JTextField dobTField2;
    private javax.swing.JTextField dobTField3;
    private javax.swing.JTextField emailTField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JLabel firstNameLabel2;
    private javax.swing.JLabel firstNameLabel3;
    private javax.swing.JLabel firstNameLabel4;
    private javax.swing.JLabel firstNameLabel5;
    private javax.swing.JTextField firstNameTField;
    private javax.swing.JTextField firstNameTField1;
    private javax.swing.JTextField firstNameTField2;
    private javax.swing.JTextField firstNameTField3;
    private javax.swing.JTextField firstNameTField4;
    private javax.swing.JTextField firstNameTField5;
    private javax.swing.JLabel genderLaber;
    private javax.swing.JLabel genderLaber1;
    private javax.swing.JLabel homePhoneLabel;
    private javax.swing.JLabel homePhoneLabel1;
    private javax.swing.JTextField homePhoneTField;
    private javax.swing.JTextField homePhoneTField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lastNameLabel1;
    private javax.swing.JLabel lastNameLabel2;
    private javax.swing.JLabel lastNameLabel3;
    private javax.swing.JTextField lastNameTField;
    private javax.swing.JTextField lastNameTField1;
    private javax.swing.JTextField lastNameTField2;
    private javax.swing.JTextField lastNameTField3;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JLabel workPhoneLabel;
    private javax.swing.JTextField workPhoneTField;
    // End of variables declaration//GEN-END:variables
}
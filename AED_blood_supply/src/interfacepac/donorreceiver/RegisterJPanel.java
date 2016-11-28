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
public class RegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterJPanel
     */
    public RegisterJPanel() {
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

        firstNameLabel1 = new javax.swing.JLabel();
        firstNameLabel2 = new javax.swing.JLabel();
        firstNameLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTField = new javax.swing.JTextField();
        genderCBox = new javax.swing.JComboBox<>();
        genderLaber = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        dobTField = new javax.swing.JTextField();
        homePhoneTField = new javax.swing.JTextField();
        homePhoneLabel = new javax.swing.JLabel();
        workPhoneLabel = new javax.swing.JLabel();
        workPhoneTField = new javax.swing.JTextField();
        emailTField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        viewDetailsBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();

        firstNameLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel1.setText("Password");
        firstNameLabel1.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel2.setText("Password");
        firstNameLabel2.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel3.setText("Username");
        firstNameLabel3.setPreferredSize(new java.awt.Dimension(150, 24));

        jPasswordField1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        jPasswordField2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        firstNameLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel.setText("Firstname");
        firstNameLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        firstNameTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lastNameLabel.setText("Lastname");
        lastNameLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        lastNameTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        genderCBox.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        genderCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hide", "male", "female", "other" }));
        genderCBox.setVisible(false);

        genderLaber.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        genderLaber.setText("Gender");
        genderLaber.setPreferredSize(new java.awt.Dimension(150, 24));

        dobLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        dobLabel.setText("Date of birth");
        dobLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        dobLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        dobLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        dobTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        homePhoneTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        homePhoneLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        homePhoneLabel.setText("Home Phone");
        homePhoneLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        homePhoneLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        homePhoneLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        workPhoneLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        workPhoneLabel.setText("Work Phone");
        workPhoneLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        workPhoneLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        workPhoneLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        workPhoneTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        emailTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        EmailLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        EmailLabel.setText("Email");
        EmailLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        EmailLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        EmailLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        viewDetailsBtn.setBackground(new java.awt.Color(250, 250, 250));
        viewDetailsBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        viewDetailsBtn.setText("Confirm");
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

        welcomeLabel.setBackground(new java.awt.Color(250, 250, 250));
        welcomeLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Register");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(workPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workPhoneTField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(homePhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homePhoneTField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dobTField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genderLaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genderCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(416, 416, 416))
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(510, 510, 510))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(welcomeLabel)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homePhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePhoneTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workPhoneTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(175, Short.MAX_VALUE))
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
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField dobTField;
    private javax.swing.JTextField emailTField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JLabel firstNameLabel2;
    private javax.swing.JLabel firstNameLabel3;
    private javax.swing.JTextField firstNameTField;
    private javax.swing.JComboBox<String> genderCBox;
    private javax.swing.JLabel genderLaber;
    private javax.swing.JLabel homePhoneLabel;
    private javax.swing.JTextField homePhoneTField;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTField;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel workPhoneLabel;
    private javax.swing.JTextField workPhoneTField;
    // End of variables declaration//GEN-END:variables
}
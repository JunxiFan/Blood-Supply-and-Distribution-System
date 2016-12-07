/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.sysadmin;

import business.EcoSystem;
import business.clinic.Laboratory;
import business.clinic.NurseCenter;
import business.clinic.ReceptionistService;
import business.organization.BloodBank;
import business.organization.BloodManageCenter;
import business.organization.Clinic;
import business.organization.DistributionCenter;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class ConfigureJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodManageCenterJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem system;

    public ConfigureJPanel(JPanel displayPanel, UserAccount userAccount, Organization organization) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        system = EcoSystem.getInstance();
        initAdjust();
        populateTable();
    }

    private void initAdjust() {
        typeCBox.setVisible(false);
        if (organization.getType() == Organization.OrganizationType.Clinic.getValue()) {
            firstNameLabel.setVisible(false);
            createManagerBtn.setVisible(false);
            deleteManagerBtn.setVisible(false);
            typeCBox.setVisible(true);
            populateComboBox();
        } else if (organization.getType() == Organization.OrganizationType.Distribution.getValue() || organization.getType() == Organization.OrganizationType.Lab.getValue() || organization.getType() == Organization.OrganizationType.NurseCenter.getValue() || organization.getType() == Organization.OrganizationType.ReceptionistService.getValue()) {
            nameTField.setVisible(false);
            addBtn.setVisible(false);
            deleteBtn.setVisible(false);
        }

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) resumeTbl.getModel();
        model.setRowCount(0);
        if (organization.getType() == Organization.OrganizationType.BloodMngCenter.getValue()) {
            BloodManageCenter bMC = (BloodManageCenter)organization;
            for (Organization organ : bMC.getNextLvBloodManageCenterList()) {
                Object[] row = new Object[3];
                row[0] = organ.getOrganizationID();
                row[1] = organ;
                row[2] = organ.getType();
                model.addRow(row);
            }
            for (Organization organ : bMC.getBloodBankList()) {
                Object[] row = new Object[3];
                row[0] = organ.getOrganizationID();
                row[1] = organ;
                row[2] = organ.getType();
                model.addRow(row);
            }
            if (bMC.getDistributionCenter() != null) {
                Object[] row = new Object[3];
                row[0] = system.getDistributionCenter().getOrganizationID();
                row[1] = system.getDistributionCenter();
                row[2] = system.getDistributionCenter().getType();
                model.addRow(row);
            }
        }else if(organization.getType() == Organization.OrganizationType.BloodBank.getValue()){
            BloodBank bloodBank = (BloodBank)organization;
            for (Organization organ : bloodBank.getClinicList()) {
                Object[] row = new Object[3];
                row[0] = organ.getOrganizationID();
                row[1] = organ;
                row[2] = organ.getType();
                model.addRow(row);
            }
            if (bloodBank.getDistributionCenter() != null) {
                Object[] row = new Object[3];
                row[0] = system.getDistributionCenter().getOrganizationID();
                row[1] = system.getDistributionCenter();
                row[2] = system.getDistributionCenter().getType();
                model.addRow(row);
            }
        }else if(organization.getType() == Organization.OrganizationType.Clinic.getValue()){
            Clinic clinic = (Clinic)organization;
            for (Organization organ : clinic.getOrganizationList()) {
                Object[] row = new Object[3];
                row[0] = organ.getOrganizationID();
                row[1] = organ;
                row[2] = organ.getType();
                model.addRow(row);
            }
        }else if(organization.getType() == Organization.OrganizationType.Distribution.getValue()){
            DistributionCenter distributionC = (DistributionCenter)organization;
            for (UserAccount user : distributionC.getUserAccountList().getUserAccountList()) {
                Object[] row = new Object[3];
                row[0] = user;
                row[1] = user.getfullName();
                row[2] = user.getRole();
                model.addRow(row);
            }
        }else if(organization.getType() == Organization.OrganizationType.Lab.getValue()){
            Laboratory lab = (Laboratory)organization;
            for (UserAccount user : lab.getUserAccountList().getUserAccountList()) {
                Object[] row = new Object[3];
                row[0] = user;
                row[1] = user.getfullName();
                row[2] = user.getRole();
                model.addRow(row);
            }            
        }else if(organization.getType() == Organization.OrganizationType.NurseCenter.getValue()){
            NurseCenter nurseC = (NurseCenter)organization;
            for (UserAccount user : nurseC.getUserAccountList().getUserAccountList()) {
                Object[] row = new Object[3];
                row[0] = user;
                row[1] = user.getfullName();
                row[2] = user.getRole();
                model.addRow(row);
            }            
        }else if(organization.getType() == Organization.OrganizationType.ReceptionistService.getValue()){
            ReceptionistService rs = (ReceptionistService)organization;
            for (UserAccount user : rs.getUserAccountList().getUserAccountList()) {
                Object[] row = new Object[3];
                row[0] = user;
                row[1] = user.getfullName();
                row[2] = user.getRole();
                model.addRow(row);
            } 
        } else {
            for (Organization organ : system.getBloodManageCenterList()) {
                Object[] row = new Object[3];
                row[0] = organ.getOrganizationID();
                row[1] = organ.getName();
                row[2] = organ.getType();
                model.addRow(row);
            }
            if (system.getDistributionCenter() != null) {
                Object[] row = new Object[3];
                row[0] = system.getDistributionCenter().getOrganizationID();
                row[1] = system.getDistributionCenter().getName();
                row[2] = system.getDistributionCenter().getType();
                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        typeCBox.removeAllItems();
        typeCBox.addItem(Organization.OrganizationType.Lab.getValue());
        typeCBox.addItem(Organization.OrganizationType.NurseCenter.getValue());
        typeCBox.addItem(Organization.OrganizationType.ReceptionistService.getValue());
    }
    
    private void addOrganization(){
        if (organization.getType() == Organization.OrganizationType.BloodMngCenter.getValue()) {
            
        }else if(organization.getType() == Organization.OrganizationType.BloodBank.getValue()){
            
        }else if(organization.getType() == Organization.OrganizationType.Clinic.getValue()){
            
        }else if(organization.getType() == Organization.OrganizationType.Distribution.getValue()){
            
        }else if(organization.getType() == Organization.OrganizationType.Lab.getValue()){
                       
        }else if(organization.getType() == Organization.OrganizationType.NurseCenter.getValue()){
                      
        }else if(organization.getType() == Organization.OrganizationType.ReceptionistService.getValue()){
        
        } else {
            system.createBloodManageCenter(nameTField.getText());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        resumeTbl = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        nameTField = new javax.swing.JTextField();
        createManagerBtn = new javax.swing.JButton();
        deleteManagerBtn = new javax.swing.JButton();
        firstNameLabel = new javax.swing.JLabel();
        typeCBox = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();

        jScrollPane5.setBackground(new java.awt.Color(250, 250, 250));

        resumeTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        resumeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resumeTbl.setGridColor(new java.awt.Color(250, 250, 250));
        jScrollPane5.setViewportView(resumeTbl);

        addBtn.setBackground(new java.awt.Color(250, 250, 250));
        addBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(250, 250, 250));
        deleteBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        nameTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        nameTField.setEnabled(false);

        createManagerBtn.setBackground(new java.awt.Color(250, 250, 250));
        createManagerBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        createManagerBtn.setText("Create");
        createManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createManagerBtnActionPerformed(evt);
            }
        });

        deleteManagerBtn.setBackground(new java.awt.Color(250, 250, 250));
        deleteManagerBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        deleteManagerBtn.setText("Delete");
        deleteManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManagerBtnActionPerformed(evt);
            }
        });

        firstNameLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel.setText("Manager");
        firstNameLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        typeCBox.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        typeCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(createManagerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteManagerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(nameTField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addContainerGap(404, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(typeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(deleteBtn)
                    .addComponent(nameTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createManagerBtn)
                    .addComponent(deleteManagerBtn)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(backBtn)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createManagerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createManagerBtnActionPerformed

    private void deleteManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManagerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteManagerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createManagerBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteManagerBtn;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField nameTField;
    private javax.swing.JTable resumeTbl;
    private javax.swing.JComboBox<String> typeCBox;
    // End of variables declaration//GEN-END:variables
}

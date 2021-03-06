/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.medicalstaff;

import business.EcoSystem;
import business.VitalSign.VitalSign;
import business.blood.Blood;
import business.organization.BloodBank;
import business.organization.Clinic;
import business.organization.Organization;
import business.tools.RandomGenerateTool;
import business.useraccount.UserAccount;
import business.workqueue.DonorRequest;
import business.workqueue.WorkRequest;
import interfacepac.receptionist.*;
import interfacepac.sysadmin.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class MedicalStaffWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodManageCenterJPanel
     */
    JPanel displayPanel;
    UserAccount userAccount;
    Organization organization;
    private EcoSystem system;

    public MedicalStaffWorkAreaJPanel(JPanel displayPanel, UserAccount userAccount, Organization organization, EcoSystem system) {
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
        initComponents();
        populateOngoingTbl();
        populateProcessTbl();
    }

    public void populateOngoingTbl() {
        DefaultTableModel model = (DefaultTableModel) ongoingTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("To nurse") ||request.getStatus().equals("Help")||(request.getStatus().equals("Call for blood") && request.getReceiver().getUsername().equals(userAccount.getUsername()))||(request.getStatus().equals("Wait for test") && request.getReceiver().getUsername().equals(userAccount.getUsername()))|| (request.getStatus().equals("Nurse Pending") && request.getReceiver().getUsername().equals(userAccount.getUsername())) || (request.getStatus().equals("Drawn") && request.getReceiver().getUsername().equals(userAccount.getUsername()))) {
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver();
                int donation = request.getQuantity();
                row[3] = donation;

                model.addRow(row);
            }
        }
    }
    
    private String testBloodType(WorkRequest req){
        UserAccount donor = req.getSender();
        VitalSign vs = new VitalSign();
        RandomGenerateTool rgt = new RandomGenerateTool();
        if (donor.getVitalSignHistory().getVitalSignHistory().isEmpty()) {
            vs.setBloodtype(rgt.randBloodType());
            if (rgt.randHemo()) {
                vs.setHemoglobin("Normal");
            } else {
                vs.setHemoglobin("Abnormal");
            }
            if (rgt.randill()) {
                vs.setInfection("No");
            } else {
                vs.setInfection("Yes");
            }
            if (rgt.randill()) {
                vs.setDiabetes("No");
            } else {
                vs.setDiabetes("Yes");
            }
            if (rgt.randill()) {
                vs.setTempCondition("No");
            } else {
                vs.setTempCondition("Yes");
            }
            if (rgt.randill()) {
                vs.setPermCondition("No");
            } else {
                vs.setPermCondition("Yes");
            }
            donor.getVitalSignHistory().getVitalSignHistory().add(vs);
            return vs.getBloodtype();
        } else {
            vs = donor.getVitalSignHistory().getVitalSignHistory().get(donor.getVitalSignHistory().getVitalSignHistory().size() - 1);
            return vs.getBloodtype();
        }
    }

    public void populateProcessTbl() {
        DefaultTableModel model = (DefaultTableModel) processTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("Nurse Pending") || request.getStatus().equals("Drawn")||request.getStatus().equals("Call for blood")) {
            } else {
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver();
                int donation = request.getQuantity();
                row[3] = donation;

                model.addRow(row);
            }
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

        assignBtn = new javax.swing.JButton();
        bloodDrawBtn = new javax.swing.JButton();
        sendtoTestBtn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        ongoingTbl = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        processTbl = new javax.swing.JTable();
        bloodReqBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));

        assignBtn.setBackground(new java.awt.Color(250, 250, 250));
        assignBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        assignBtn.setText("assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        bloodDrawBtn.setBackground(new java.awt.Color(250, 250, 250));
        bloodDrawBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        bloodDrawBtn.setText("blood draw");
        bloodDrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodDrawBtnActionPerformed(evt);
            }
        });

        sendtoTestBtn.setBackground(new java.awt.Color(250, 250, 250));
        sendtoTestBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        sendtoTestBtn.setText("send to test");
        sendtoTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendtoTestBtnActionPerformed(evt);
            }
        });

        jScrollPane7.setBackground(new java.awt.Color(250, 250, 250));

        ongoingTbl.setBackground(new java.awt.Color(250, 250, 250));
        ongoingTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ongoingTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Sender", "Operator", "Donation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ongoingTbl.setGridColor(new java.awt.Color(250, 250, 250));
        ongoingTbl.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                ongoingTblHierarchyChanged(evt);
            }
        });
        ongoingTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ongoingTblMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ongoingTbl);

        jScrollPane6.setBackground(new java.awt.Color(250, 250, 250));

        processTbl.setBackground(new java.awt.Color(250, 250, 250));
        processTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        processTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Sender", "Operator", "Donation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        processTbl.setGridColor(new java.awt.Color(250, 250, 250));
        processTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                processTblMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(processTbl);

        bloodReqBtn1.setBackground(new java.awt.Color(250, 250, 250));
        bloodReqBtn1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        bloodReqBtn1.setText("blood require");
        bloodReqBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodReqBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(409, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloodDrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendtoTestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloodReqBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(397, 397, 397))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignBtn)
                    .addComponent(bloodDrawBtn)
                    .addComponent(sendtoTestBtn)
                    .addComponent(bloodReqBtn1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }

        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        if(request.getStatus().equals("To nurse"))
            request.setStatus("Nurse Pending");
        else if(request.getStatus().equals("Help"))
            request.setStatus("Call for blood");
        userAccount.getWorkQueue().getWorkReqestList().add(request);
        JOptionPane.showMessageDialog(null, "Assigned succeed.");

        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void bloodDrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodDrawBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        request.setStatus("Drawn");

        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_bloodDrawBtnActionPerformed

    private void sendtoTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtoTestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        request.setStatus("Untested");
        Clinic clinic = (Clinic) organization.getUpOrgan();
        clinic.getOrganizationList().get(0).getWorkQueue().getWorkReqestList().add(request);

        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_sendtoTestBtnActionPerformed

    private void ongoingTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ongoingTblMouseClicked
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow > 0) {
            WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
            if (request.getReceiver().getUsername().equals(userAccount.getUsername())) {
                if (request.getStatus().equals("Nurse Pending")) {
                    bloodDrawBtn.setEnabled(true);
                    sendtoTestBtn.setEnabled(false);
                } else if (request.getStatus().equals("Drawn")) {
                    bloodDrawBtn.setEnabled(false);
                    sendtoTestBtn.setEnabled(true);
                }
                assignBtn.setEnabled(false);
            } else {
                assignBtn.setEnabled(true);
                bloodDrawBtn.setEnabled(false);
                sendtoTestBtn.setEnabled(false);
            }
        }
    }//GEN-LAST:event_ongoingTblMouseClicked

    private void processTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processTblMouseClicked
        // TODO add your handling code here:
        assignBtn.setEnabled(false);
        bloodDrawBtn.setEnabled(false);
        sendtoTestBtn.setEnabled(false);
        bloodReqBtn1.setEnabled(false);
    }//GEN-LAST:event_processTblMouseClicked

    private void ongoingTblHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_ongoingTblHierarchyChanged
        // TODO add your handling code here:
        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_ongoingTblHierarchyChanged

    private void bloodReqBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodReqBtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        
        BloodBank bb = (BloodBank) organization.getUpOrgan().getUpOrgan();
        if(bb.calculateRepertory(testBloodType(request)) >= 5000){
            Blood blood = new Blood();
            blood.setBloodType(testBloodType(request));
            request.setBlood(blood);
            request.setStatus("Waiting");
            //request.setDestination(organization);
            system.getDistributionCenter().getWorkQueue().getWorkReqestList().add(request);
        }
        else{
            request.setStatus("Lack blood");
            Blood blood = new Blood();
            blood.setBloodType(testBloodType(request));
            request.setBlood(blood);
            //request.setDestination(organization);
            organization.getUpOrgan().getUpOrgan().getWorkQueue().getWorkReqestList().add(request);
        }

        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_bloodReqBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton bloodDrawBtn;
    private javax.swing.JButton bloodReqBtn1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable ongoingTbl;
    private javax.swing.JTable processTbl;
    private javax.swing.JButton sendtoTestBtn;
    // End of variables declaration//GEN-END:variables
}

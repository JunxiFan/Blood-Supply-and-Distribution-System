/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.Labasistant;

import business.EcoSystem;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.DonorRequest;
import business.workqueue.WorkRequest;
import interfacepac.donorreceiver.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fjx19
 */
public class LabWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkArea
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem system;
            
    public LabWorkArea(JPanel displayPanel, UserAccount userAccount, Organization organization, EcoSystem system) {
        initComponents();
        this.displayPanel=displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
    }
    
    public void populateOngoingTbl() {
        DefaultTableModel model = (DefaultTableModel) ongoingTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("Untested")) {
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getSender().getfullName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getfullName();
                int donation = ((DonorRequest) request).getDonation();
                row[3] = donation;

                model.addRow(row);
            }
        }
    }

    public void populateProcessTbl() {
        DefaultTableModel model = (DefaultTableModel) processTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("Lab Pending")) {
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getSender().getfullName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getfullName();
                int donation = ((DonorRequest) request).getDonation();
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

        testBtn = new javax.swing.JButton();
        assignBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        firstNameLabel2 = new javax.swing.JLabel();
        vSBloodTypeTField = new javax.swing.JTextField();
        lastNameLabel2 = new javax.swing.JLabel();
        hemoblobinTField = new javax.swing.JTextField();
        firstNameLabel3 = new javax.swing.JLabel();
        infectionTField = new javax.swing.JTextField();
        lastNameLabel3 = new javax.swing.JLabel();
        diabetesTField = new javax.swing.JTextField();
        firstNameLabel4 = new javax.swing.JLabel();
        tempConditonTField = new javax.swing.JTextField();
        firstNameLabel5 = new javax.swing.JLabel();
        permConditionTField = new javax.swing.JTextField();
        sendtoDistBtn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        ongoingTbl = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        processTbl = new javax.swing.JTable();

        testBtn.setBackground(new java.awt.Color(250, 250, 250));
        testBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        testBtn.setText("Test");
        testBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testBtnActionPerformed(evt);
            }
        });

        assignBtn.setBackground(new java.awt.Color(250, 250, 250));
        assignBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        assignBtn.setText("assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vital sign", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 0, 24))); // NOI18N

        firstNameLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel2.setText("Blood type");
        firstNameLabel2.setPreferredSize(new java.awt.Dimension(150, 24));

        vSBloodTypeTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        vSBloodTypeTField.setEnabled(false);

        lastNameLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lastNameLabel2.setText("hemoglobin");
        lastNameLabel2.setPreferredSize(new java.awt.Dimension(150, 24));

        hemoblobinTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        hemoblobinTField.setEnabled(false);

        firstNameLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel3.setText("Infection");
        firstNameLabel3.setPreferredSize(new java.awt.Dimension(150, 24));

        infectionTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        infectionTField.setEnabled(false);

        lastNameLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lastNameLabel3.setText("diabetes");
        lastNameLabel3.setPreferredSize(new java.awt.Dimension(150, 24));

        diabetesTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        diabetesTField.setEnabled(false);

        firstNameLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel4.setText("Other temporary condition");
        firstNameLabel4.setPreferredSize(new java.awt.Dimension(150, 24));

        tempConditonTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        tempConditonTField.setEnabled(false);

        firstNameLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        firstNameLabel5.setText("Other permanent condition");
        firstNameLabel5.setPreferredSize(new java.awt.Dimension(150, 24));

        permConditionTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        permConditionTField.setEnabled(false);

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
                        .addComponent(vSBloodTypeTField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hemoblobinTField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(firstNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infectionTField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diabetesTField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(firstNameLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(firstNameLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(permConditionTField)
                            .addComponent(tempConditonTField))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vSBloodTypeTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hemoblobinTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infectionTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diabetesTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempConditonTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(permConditionTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sendtoDistBtn.setBackground(new java.awt.Color(250, 250, 250));
        sendtoDistBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        sendtoDistBtn.setText("Send to Distribution");
        sendtoDistBtn.setEnabled(false);
        sendtoDistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendtoDistBtnActionPerformed(evt);
            }
        });

        jScrollPane7.setBackground(new java.awt.Color(250, 250, 250));

        ongoingTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ongoingTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Sender", "Reciever", "Donation"
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
        ongoingTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ongoingTblMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ongoingTbl);

        jScrollPane6.setBackground(new java.awt.Color(250, 250, 250));

        processTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        processTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Sender", "Reciever", "Donation"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(testBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sendtoDistBtn))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignBtn)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(testBtn)
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendtoDistBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void testBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = processTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) processTbl.getValueAt(selectedRow, 0);
        request.setStatus("Testing");

        populateOngoingTbl();
        populateProcessTbl();
        
        sendtoDistBtn.setEnabled(true);
    }//GEN-LAST:event_testBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }

        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Lab Pending");
        userAccount.getWorkQueue().getWorkReqestList().add(request);
        JOptionPane.showMessageDialog(null, "Assigned succeed.");

        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void sendtoDistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtoDistBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendtoDistBtnActionPerformed

    private void ongoingTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ongoingTblMouseClicked
        // TODO add your handling code here:

        testBtn.setEnabled(false);

    }//GEN-LAST:event_ongoingTblMouseClicked

    private void processTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processTblMouseClicked
        // TODO add your handling code here:
        assignBtn.setEnabled(false);

    }//GEN-LAST:event_processTblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JTextField diabetesTField;
    private javax.swing.JLabel firstNameLabel2;
    private javax.swing.JLabel firstNameLabel3;
    private javax.swing.JLabel firstNameLabel4;
    private javax.swing.JLabel firstNameLabel5;
    private javax.swing.JTextField hemoblobinTField;
    private javax.swing.JTextField infectionTField;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lastNameLabel2;
    private javax.swing.JLabel lastNameLabel3;
    private javax.swing.JTable ongoingTbl;
    private javax.swing.JTextField permConditionTField;
    private javax.swing.JTable processTbl;
    private javax.swing.JButton sendtoDistBtn;
    private javax.swing.JTextField tempConditonTField;
    private javax.swing.JButton testBtn;
    private javax.swing.JTextField vSBloodTypeTField;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.receptionist;

import business.EcoSystem;
import business.clinic.ReceptionistService;
import business.organization.Clinic;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.DonorRequest;
import business.workqueue.*;
import interfacepac.donorreceiver.PersonInfoJPanel;
import interfacepac.sysadmin.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class ReceptionistJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodManageCenterJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
//    private Organization organization;
    private Organization organization;
    private EcoSystem system;
    private WorkRequest workRequest;

    public ReceptionistJPanel(JPanel displayPanel, UserAccount userAccount, Organization organization, EcoSystem system) {
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
        initComponents();
        populateProcessTbl();
        populateOngoingTbl();
    }

    public void populateOngoingTbl() {
        DefaultTableModel model = (DefaultTableModel) ongoingTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("Sent") || (request.getStatus().equals("Recep Pending") && request.getReceiver().getUsername().equals(userAccount.getUsername()))) {
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

    public void populateProcessTbl() {
        DefaultTableModel model = (DefaultTableModel) processTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("Sent") || request.getStatus().equals("Recep Pending")) {
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

        jScrollPane5 = new javax.swing.JScrollPane();
        ongoingTbl = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        sendtoNurseBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        processTbl = new javax.swing.JTable();

        jScrollPane5.setBackground(new java.awt.Color(250, 250, 250));

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
        jScrollPane5.setViewportView(ongoingTbl);

        assignBtn.setBackground(new java.awt.Color(250, 250, 250));
        assignBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        assignBtn.setText("assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        sendtoNurseBtn.setBackground(new java.awt.Color(250, 250, 250));
        sendtoNurseBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        sendtoNurseBtn.setText("send to nurse");
        sendtoNurseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendtoNurseBtnActionPerformed(evt);
            }
        });

        viewBtn.setBackground(new java.awt.Color(250, 250, 250));
        viewBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        viewBtn.setText("view details");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        rejectBtn.setBackground(new java.awt.Color(250, 250, 250));
        rejectBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        rejectBtn.setText("reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        jScrollPane6.setBackground(new java.awt.Color(250, 250, 250));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(sendtoNurseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(assignBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectBtn)
                    .addComponent(sendtoNurseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
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
        request.setStatus("Recep Pending");
        userAccount.getWorkQueue().getWorkReqestList().add(request);
        JOptionPane.showMessageDialog(null, "Assigned succeed.");

        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void sendtoNurseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtoNurseBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }

        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        if (request.getReceiver().getUsername().equals(userAccount.getUsername())) {
            request.setStatus("To nurse");
            Clinic clinic = (Clinic) organization.getUpOrgan();
            clinic.getOrganizationList().get(1).getWorkQueue().getWorkReqestList().add(request);
        }
        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_sendtoNurseBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = ongoingTbl.getSelectedRow();
        //int selectedRow2 = processTbl.getSelectedRow();

        WorkRequest request = null;
        UserAccount donor;
        if (selectedRow1 < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        } else if (selectedRow1 >= 0) {
            request = (WorkRequest) ongoingTbl.getValueAt(selectedRow1, 0);
        }

        if (request != null) {
            donor = request.getSender();
            PersonInfoJPanel panel = new PersonInfoJPanel(displayPanel, donor, organization, system);
            displayPanel.add("PerosonInfoJPanel", panel);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            layout.next(displayPanel);
        } else {
            JOptionPane.showMessageDialog(null, "The donor is not available");
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        if (request.getReceiver().getUsername().equals(userAccount.getUsername())) {
            request.setStatus("Rejected");
        }

        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void ongoingTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ongoingTblMouseClicked
        // TODO add your handling code here:
//        int selectedRow=ongoingTbl.getSelectedRow();
//        if (selectedRow < 0) {
//            return;
//        }
//        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
//        String status = request.getStatus();
//        if(status.equals(""))
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow > 0) {
            WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
            if (request.getReceiver().getUsername().equals(userAccount.getUsername())) {
                rejectBtn.setEnabled(true);
                sendtoNurseBtn.setEnabled(true);
                assignBtn.setEnabled(false);
            }else{
                assignBtn.setEnabled(true);
                rejectBtn.setEnabled(false);
                sendtoNurseBtn.setEnabled(false);
            }
        }
    }//GEN-LAST:event_ongoingTblMouseClicked

    private void processTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processTblMouseClicked
        // TODO add your handling code here:
        assignBtn.setEnabled(false);
        rejectBtn.setEnabled(false);
        sendtoNurseBtn.setEnabled(false);
    }//GEN-LAST:event_processTblMouseClicked

    private void ongoingTblHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_ongoingTblHierarchyChanged
        // TODO add your handling code here:
        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_ongoingTblHierarchyChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable ongoingTbl;
    private javax.swing.JTable processTbl;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JButton sendtoNurseBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}

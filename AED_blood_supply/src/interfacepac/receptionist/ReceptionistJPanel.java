/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.receptionist;

import interfacepac.donorreceiver.PersonInfoJPanel;
import interfacepac.sysadmin.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class ReceptionistJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodManageCenterJPanel
     */
    JPanel displayPanel;

    public ReceptionistJPanel(JPanel displayPanel) {
        initComponents();
        this.displayPanel = displayPanel;
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
        sendtoTestBtn = new javax.swing.JButton();
        sendtoNurseBtn = new javax.swing.JButton();
        deleteBtn2 = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        finishedTbl = new javax.swing.JTable();

        jScrollPane5.setBackground(new java.awt.Color(250, 250, 250));

        ongoingTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ongoingTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Date of birth"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ongoingTbl.setGridColor(new java.awt.Color(250, 250, 250));
        jScrollPane5.setViewportView(ongoingTbl);

        assignBtn.setBackground(new java.awt.Color(250, 250, 250));
        assignBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        assignBtn.setText("assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
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

        sendtoNurseBtn.setBackground(new java.awt.Color(250, 250, 250));
        sendtoNurseBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        sendtoNurseBtn.setText("send to nurse");
        sendtoNurseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendtoNurseBtnActionPerformed(evt);
            }
        });

        deleteBtn2.setBackground(new java.awt.Color(250, 250, 250));
        deleteBtn2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        deleteBtn2.setText("view details");
        deleteBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn2ActionPerformed(evt);
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

        finishedTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        finishedTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Date of birth"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        finishedTbl.setGridColor(new java.awt.Color(250, 250, 250));
        jScrollPane6.setViewportView(finishedTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendtoTestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(sendtoNurseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn2)
                    .addComponent(rejectBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignBtn)
                    .addComponent(sendtoTestBtn)
                    .addComponent(sendtoNurseBtn))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignBtnActionPerformed

    private void sendtoTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtoTestBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendtoTestBtnActionPerformed

    private void sendtoNurseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtoNurseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendtoNurseBtnActionPerformed

    private void deleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn2ActionPerformed
        // TODO add your handling code here:
        PersonInfoJPanel panel = new PersonInfoJPanel(displayPanel);
        displayPanel.add("PerosonInfoJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_deleteBtn2ActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rejectBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton deleteBtn2;
    private javax.swing.JTable finishedTbl;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable ongoingTbl;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JButton sendtoNurseBtn;
    private javax.swing.JButton sendtoTestBtn;
    // End of variables declaration//GEN-END:variables
}

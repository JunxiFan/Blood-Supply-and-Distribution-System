/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.manager;

import business.EcoSystem;
import business.organization.Organization;
import business.useraccount.UserAccount;
import interfacepac.donorreceiver.*;
import interfacepac.receptionist.*;
import interfacepac.sysadmin.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class ManageWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodManageCenterJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Organization organization;

    public ManageWorkAreaJPanel(JPanel displayPanel, UserAccount userAccount, Organization organization) {
        initComponents();
        this.displayPanel = displayPanel;
        this.displayPanel=displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
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
        viewDetailsBtn = new javax.swing.JButton();
        requreBtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        ongoingTbl = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewJTree = new javax.swing.JTree();
        bloodTypeCBox = new javax.swing.JComboBox<>();
        quantityTField = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        viewTbl = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        delieverBtn = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        finishedTbl = new javax.swing.JTable();

        assignBtn.setBackground(new java.awt.Color(250, 250, 250));
        assignBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        assignBtn.setText("assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        viewDetailsBtn.setBackground(new java.awt.Color(250, 250, 250));
        viewDetailsBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        viewDetailsBtn.setText("view details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        requreBtn.setBackground(new java.awt.Color(250, 250, 250));
        requreBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        requreBtn.setText("require");
        requreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requreBtnActionPerformed(evt);
            }
        });

        jScrollPane6.setBackground(new java.awt.Color(250, 250, 250));

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
        jScrollPane6.setViewportView(ongoingTbl);

        jScrollPane1.setViewportView(viewJTree);

        bloodTypeCBox.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        bloodTypeCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        quantityTField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        quantityTField.setEnabled(false);

        jScrollPane7.setBackground(new java.awt.Color(250, 250, 250));

        viewTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        viewTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        viewTbl.setGridColor(new java.awt.Color(250, 250, 250));
        jScrollPane7.setViewportView(viewTbl);

        deleteBtn.setBackground(new java.awt.Color(250, 250, 250));
        deleteBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        deleteBtn.setText("delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        delieverBtn.setBackground(new java.awt.Color(250, 250, 250));
        delieverBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        delieverBtn.setText("deliver");
        delieverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delieverBtnActionPerformed(evt);
            }
        });

        jScrollPane8.setBackground(new java.awt.Color(250, 250, 250));

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
        jScrollPane8.setViewportView(finishedTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewDetailsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bloodTypeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(quantityTField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(requreBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deleteBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delieverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bloodTypeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requreBtn)
                            .addComponent(deleteBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsBtn)
                    .addComponent(delieverBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        PersonInfoJPanel panel = new PersonInfoJPanel(displayPanel, userAccount, organization);
        displayPanel.add("PerosonInfoJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void requreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requreBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requreBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void delieverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delieverBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delieverBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JComboBox<String> bloodTypeCBox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton delieverBtn;
    private javax.swing.JTable finishedTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable ongoingTbl;
    private javax.swing.JTextField quantityTField;
    private javax.swing.JButton requreBtn;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JTree viewJTree;
    private javax.swing.JTable viewTbl;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.manager;

import business.EcoSystem;
import business.blood.Blood;
import business.organization.BloodBank;
import business.organization.BloodManageCenter;
import business.organization.Clinic;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import interfacepac.donorreceiver.*;
import interfacepac.receptionist.*;
import interfacepac.sysadmin.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

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
    private EcoSystem system;
    private Organization organ;

    public ManageWorkAreaJPanel(JPanel displayPanel, UserAccount userAccount, Organization organization, EcoSystem system) {
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
        organ = null;
        initComponents();
        populatePanel();
    }

    public void populatePanel() {
        BloodManageCenter bmc = (BloodManageCenter) organization;
        if (bmc.getUpOrgan().getType().equals(system.getType())) {
            populateLvFTree();
            populateOngoingTbl();
            populateProcessTbl();
        } else {
            populateLvSTree();
            populateOngoingTbl();
            populateProcessTbl();
        }
    }

    public void populateSystemTree() {
        DefaultTreeModel model = (DefaultTreeModel) viewJTree.getModel();
        ArrayList<BloodManageCenter> firstBMCList = system.getBloodManageCenterList();

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();

        int i = 0;
        for (BloodManageCenter lv1BMC : firstBMCList) {
            DefaultMutableTreeNode firstBMCNode = new DefaultMutableTreeNode(lv1BMC);
            root.insert(firstBMCNode, i++);
            int j = 0;
            for (BloodManageCenter lv2BMC : lv1BMC.getNextLvBloodManageCenterList()) {
                DefaultMutableTreeNode secondBMCNode = new DefaultMutableTreeNode(lv2BMC);
                firstBMCNode.insert(secondBMCNode, j++);
                int k = 0;
                for (BloodBank bloodBank : lv2BMC.getBloodBankList()) {
                    DefaultMutableTreeNode bloodBankNode = new DefaultMutableTreeNode(bloodBank);
                    secondBMCNode.insert(bloodBankNode, k++);
                }
                //DefaultMutableTreeNode thirdDistributionNode = new DefaultMutableTreeNode(lv2BMC.getDistributionCenter());
                //secondBMCNode.insert(thirdDistributionNode, k++);
            }
            //DefaultMutableTreeNode secondDistributionNode = new DefaultMutableTreeNode(lv1BMC.getDistributionCenter());
            //firstBMCNode.insert(secondDistributionNode, j++);
        }
        DefaultMutableTreeNode firstDistributionNode = new DefaultMutableTreeNode(system.getDistributionCenter());
        root.insert(firstDistributionNode, i++);
        model.reload();
    }

    public void populateLvFTree() {
        DefaultTreeModel model = (DefaultTreeModel) viewJTree.getModel();
        BloodManageCenter bMC = (BloodManageCenter) organization;
        ArrayList<BloodManageCenter> secondBMCList = bMC.getNextLvBloodManageCenterList();

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();

        int j = 0;
        for (BloodManageCenter lv2BMC : secondBMCList) {
            DefaultMutableTreeNode secondBMCNode = new DefaultMutableTreeNode(lv2BMC);
            root.insert(secondBMCNode, j++);
            int k = 0;
            for (BloodBank bloodBank : lv2BMC.getBloodBankList()) {
                DefaultMutableTreeNode bloodBankNode = new DefaultMutableTreeNode(bloodBank);
                secondBMCNode.insert(bloodBankNode, k++);
                //DefaultMutableTreeNode fourthDistributionNode = new DefaultMutableTreeNode(bloodBank.getDistributionCenter());
                //bloodBankNode.insert(fourthDistributionNode, l++);
            }
            //DefaultMutableTreeNode thirdDistributionNode = new DefaultMutableTreeNode(lv2BMC.getDistributionCenter());
            //secondBMCNode.insert(thirdDistributionNode, k++);
        }

        model.reload();
    }

    public void populateLvSTree() {
        DefaultTreeModel model = (DefaultTreeModel) viewJTree.getModel();
        BloodManageCenter bMC = (BloodManageCenter) organization;

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();

        int k = 0;
        for (BloodBank bloodBank : bMC.getBloodBankList()) {
            DefaultMutableTreeNode bloodBankNode = new DefaultMutableTreeNode(bloodBank);
            root.insert(bloodBankNode, k++);
        }

        model.reload();
    }

    public void populateBankTree() {
        DefaultTreeModel model = (DefaultTreeModel) viewJTree.getModel();
        BloodBank bb = (BloodBank) organization;

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        int l = 0;
        for (Clinic clinic : bb.getClinicList()) {
            DefaultMutableTreeNode clinicNode = new DefaultMutableTreeNode(clinic);
            root.insert(clinicNode, l++);
            int m = 0;
            for (Organization organ : clinic.getOrganizationList()) {
                DefaultMutableTreeNode organNode = new DefaultMutableTreeNode(organ);
                clinicNode.insert(organNode, m++);
            }
        }

        model.reload();
    }

    public void populateOngoingTbl() {
        DefaultTableModel model = (DefaultTableModel) ongoingTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("Holding")) {
                request.setReceiver(userAccount);
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver();
                row[3] = request.getBlood().getBloodType();
                int donation = request.getQuantity();
                row[4] = donation;

                model.addRow(row);
            }
        }
    }

    public void populateProcessTbl() {
        DefaultTableModel model = (DefaultTableModel) finishedTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("Holding")) {
            } else {
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver();
                row[3] = request.getBlood().getBloodType();
                int donation = request.getQuantity();
                row[4] = donation;

                model.addRow(row);
            }
        }
        populateReport();
    }

    private void reqBlood(WorkRequest req) {
        BloodBank bb = (BloodBank) organ;
        int n = 0;
        int amount = 0;
        ArrayList<Blood> tempList = new ArrayList<Blood>();
        for (int i = 1; i < bb.getBloodRepertory().size(); i++) {
            for (int j = 0; j < i; j++) {
                if (req.getSender().getVitalSignHistory().getVitalSignHistory().get(0).getBloodtype().equals(bb.getBloodRepertory().get(j).getBloodType())) {
                    amount += bb.getBloodRepertory().get(j).getVolum();
                }
            }
            if (amount >= req.getQuantity()) {
                n = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (req.getSender().getVitalSignHistory().getVitalSignHistory().get(0).getBloodtype().equals(bb.getBloodRepertory().get(i).getBloodType())) {
                tempList.add(bb.getBloodRepertory().get(i));
            }
        }
        for (Blood blood : tempList) {
            req.getUseBloodList().add(blood);
            bb.getBloodRepertory().remove(blood);
        }
    }
    
    public void populateReport() {
//            BloodManageCenter bmc = (BloodManageCenter) organization;
//            if(bmc.getUpOrgan().getType().equals("system")){
//                
//            }
        BloodBank bb = (BloodBank) organization;
        int tya = bb.calculateARepertory();
        int tyb = bb.calculateBRepertory();
        int tyab = bb.calculateABRepertory();
        int tyo = bb.calculateORepertory();
        int tyrha = bb.calculateRHARepertory();
        int tyrhb = bb.calculateRHBRepertory();
        int tyrhab = bb.calculateRHABRepertory();
        int tyrho = bb.calculateRHORepertory();
        tpa.setText(String.valueOf(tya + " ml"));
        tpb.setText(String.valueOf(tyb + " ml"));
        tpab.setText(String.valueOf(tyab + " ml"));
        tpo.setText(String.valueOf(tyo + " ml"));
        tprha.setText(String.valueOf(tyrha + " ml"));
        tprhb.setText(String.valueOf(tyrhb + " ml"));
        tprhab.setText(String.valueOf(tyrhab + " ml"));
        tprho.setText(String.valueOf(tyrho + " ml"));
        int allamount = tya + tyb + tyo + tyab + tyrha + tyrhb + tyrhab + tyrho;
        if (allamount <= 0) {
            tpa1.setText(0 + "%");
            tpb1.setText(0 + "%");
            tpab1.setText(0 + "%");
            tpo1.setText(0 + "%");
            tprha1.setText(0 + "%");
            tprhb1.setText(0 + "%");
            tprhab1.setText(0 + "%");
            tprho1.setText(0 + "%");
        }else{
            tpa1.setText(tya/allamount + "%");
            tpb1.setText(tyb/allamount + "%");
            tpab1.setText(tyab/allamount + "%");
            tpo1.setText(tyo/allamount + "%");
            tprha1.setText(tyrha/allamount + "%");
            tprhb1.setText(tyrhb/allamount + "%");
            tprhab1.setText(tyrhab/allamount + "%");
            tprho1.setText(tyrho/allamount + "%");
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

        viewDetailsBtn = new javax.swing.JButton();
        requreBtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        finishedTbl = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewJTree = new javax.swing.JTree();
        jScrollPane7 = new javax.swing.JScrollPane();
        ongoingTbl = new javax.swing.JTable();
        rejectBtn = new javax.swing.JButton();
        transferBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));

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

        finishedTbl.setBackground(new java.awt.Color(250, 250, 250));
        finishedTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        finishedTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Sender", "Operator", "Blood type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        finishedTbl.setGridColor(new java.awt.Color(250, 250, 250));
        jScrollPane6.setViewportView(finishedTbl);

        viewJTree.setBackground(new java.awt.Color(250, 250, 250));
        viewJTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewJTreeMouseClicked(evt);
            }
        });
        viewJTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                viewJTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(viewJTree);

        jScrollPane7.setBackground(new java.awt.Color(250, 250, 250));

        ongoingTbl.setBackground(new java.awt.Color(250, 250, 250));
        ongoingTbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ongoingTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Sender", "Operator", "Blood type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ongoingTbl.setGridColor(new java.awt.Color(250, 250, 250));
        jScrollPane7.setViewportView(ongoingTbl);

        rejectBtn.setBackground(new java.awt.Color(250, 250, 250));
        rejectBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        rejectBtn.setText("reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        transferBtn.setBackground(new java.awt.Color(250, 250, 250));
        transferBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        transferBtn.setText("transfer");
        transferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(requreBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(transferBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewDetailsBtn)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(415, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requreBtn)
                            .addComponent(rejectBtn)
                            .addComponent(transferBtn)
                            .addComponent(viewDetailsBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        PersonInfoJPanel panel = new PersonInfoJPanel(displayPanel, userAccount, organization, system);
        displayPanel.add("PerosonInfoJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void requreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requreBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        organization.getUpOrgan().getWorkQueue().getWorkReqestList().add(request);
        request.setStatus("Holding");
        populatePanel();
    }//GEN-LAST:event_requreBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        request.setStatus("Reject");
        populatePanel();
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        this.reqBlood(request);

        system.getDistributionCenter().getWorkQueue().getWorkReqestList().add(request);
        request.setStatus("Transfer");
        populatePanel();
    }//GEN-LAST:event_transferBtnActionPerformed

    private void viewJTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewJTreeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_viewJTreeMouseClicked

    private void viewJTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_viewJTreeValueChanged
        // TODO add your handling code here:
        try {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) viewJTree.getLastSelectedPathComponent();
            organ = (Organization) selectedNode.getUserObject();
        } catch (Exception e) {
            organ = organization;
        }
        
        if (organ.getType().equals(Organization.OrganizationType.BloodBank)) {
            transferBtn.setEnabled(true);
        } else {
            transferBtn.setEnabled(false);
        }

    }//GEN-LAST:event_viewJTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable finishedTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable ongoingTbl;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JButton requreBtn;
    private javax.swing.JButton transferBtn;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JTree viewJTree;
    // End of variables declaration//GEN-END:variables
}

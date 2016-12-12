/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.donorreceiver;

import business.EcoSystem;
import business.organization.BloodBank;
import business.organization.BloodManageCenter;
import business.organization.Clinic;
import business.organization.DistributionCenter;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import business.workqueue.DonorRequest;
import business.workqueue.ReceiverRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class BloodUseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonateJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem system;
    private Organization organ;

    public BloodUseJPanel(JPanel displayPanel, UserAccount userAccount, Organization organization, EcoSystem system) {

        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
        initComponents();
        populateTree();
    }

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) clinicJTree.getModel();
        ArrayList<BloodManageCenter> firstBMCList = system.getBloodManageCenterList();
        ArrayList<BloodManageCenter> secondBMCList;
        ArrayList<BloodBank> bloodBankList;
        ArrayList<DistributionCenter> firstDistributionList;
        ArrayList<DistributionCenter> secondDistributionList;
        ArrayList<DistributionCenter> thirdDistributionList;

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
                    int l = 0;
                    for (Clinic clinic : bloodBank.getClinicList()) {
                        DefaultMutableTreeNode clinicNode = new DefaultMutableTreeNode(clinic);
                        bloodBankNode.insert(clinicNode, l++);
                        int m = 0;
                        for (Organization organ : clinic.getOrganizationList()) {
                            DefaultMutableTreeNode organNode = new DefaultMutableTreeNode(organ);
                            clinicNode.insert(organNode, m++);
                        }
                    }
//                    DefaultMutableTreeNode fourthDistributionNode = new DefaultMutableTreeNode(bloodBank.getDistributionCenter());
//                    bloodBankNode.insert(fourthDistributionNode, l++);
                }
//                DefaultMutableTreeNode thirdDistributionNode = new DefaultMutableTreeNode(lv2BMC.getDistributionCenter());
//                secondBMCNode.insert(thirdDistributionNode, k++);
            }
//            DefaultMutableTreeNode secondDistributionNode = new DefaultMutableTreeNode(lv1BMC.getDistributionCenter());
//            firstBMCNode.insert(secondDistributionNode, j++);
        }
//        DefaultMutableTreeNode firstDistributionNode = new DefaultMutableTreeNode(system.getDistributionCenter());
//        root.insert(firstDistributionNode, i++);
        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        clinicJTree = new javax.swing.JTree();
        dobLabel = new javax.swing.JLabel();
        dobLabel2 = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        consumptionCBox = new javax.swing.JComboBox<>();
        dobLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));

        clinicJTree.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        clinicJTree.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                clinicJTreeHierarchyChanged(evt);
            }
        });
        clinicJTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                clinicJTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(clinicJTree);

        dobLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        dobLabel.setText("Choose one clinic");
        dobLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        dobLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        dobLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        dobLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        dobLabel2.setText("consumption");
        dobLabel2.setMaximumSize(new java.awt.Dimension(150, 24));
        dobLabel2.setMinimumSize(new java.awt.Dimension(150, 24));
        dobLabel2.setPreferredSize(new java.awt.Dimension(150, 24));

        confirmBtn.setBackground(new java.awt.Color(250, 250, 250));
        confirmBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(250, 250, 250));
        cancelBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        consumptionCBox.setBackground(new java.awt.Color(250, 250, 250));
        consumptionCBox.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        consumptionCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1000", "1500", "2000" }));

        dobLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        dobLabel3.setText("ml");
        dobLabel3.setMaximumSize(new java.awt.Dimension(150, 24));
        dobLabel3.setMinimumSize(new java.awt.Dimension(150, 24));
        dobLabel3.setPreferredSize(new java.awt.Dimension(150, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(353, 353, 353))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dobLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consumptionCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dobLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(283, 283, 283))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(consumptionCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dobLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dobLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmBtn)
                            .addComponent(cancelBtn))))
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        String consumption = (String) consumptionCBox.getSelectedItem();
        int consumptionVolum = Integer.parseInt(consumption);
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) clinicJTree.getLastSelectedPathComponent();

        Clinic org = (Clinic) selectedNode.getUserObject();

        WorkRequest recieverRequest = new WorkRequest(org.getUpOrgan());
        recieverRequest.setSender(userAccount);
        recieverRequest.setStatus("Help");
        recieverRequest.setQuantity(consumptionVolum);

        org.getOrganizationList().get(1).getWorkQueue().getWorkReqestList().add(recieverRequest);
        userAccount.getWorkQueue().getWorkReqestList().add(recieverRequest);
        JOptionPane.showMessageDialog(null, "Request succeed.");

        DROptionJPanel panel = new DROptionJPanel(displayPanel, userAccount, organization, system);
        displayPanel.add("DROptionJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void clinicJTreeHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_clinicJTreeHierarchyChanged
        // TODO add your handling code here:
        populateTree();

    }//GEN-LAST:event_clinicJTreeHierarchyChanged

    private void clinicJTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_clinicJTreeValueChanged
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) clinicJTree.getLastSelectedPathComponent();

        try {
            organ = (Organization) selectedNode.getUserObject();
            dobLabel.setText(organ.toString());
            if (organ.getType().equals(Organization.OrganizationType.Clinic.getValue())) {
                confirmBtn.setEnabled(true);
            } else {
                confirmBtn.setEnabled(false);
            }
        } catch (Exception e) {
            if (selectedNode != null) {
                organ = system;
                dobLabel.setText("system");
                confirmBtn.setEnabled(true);
            } else {
                confirmBtn.setEnabled(false);
            }
        }
    }//GEN-LAST:event_clinicJTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTree clinicJTree;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JComboBox<String> consumptionCBox;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel dobLabel2;
    private javax.swing.JLabel dobLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

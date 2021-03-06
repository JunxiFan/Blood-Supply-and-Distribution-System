/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.sysadmin;

import business.EcoSystem;
import business.organization.BloodManageCenter;
import business.organization.Organization;
import business.organization.BloodBank;
import business.organization.Clinic;
import business.organization.DistributionCenter;
import business.useraccount.UserAccount;
import interfacepac.donorreceiver.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class SAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonateJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem system;
    private Organization organ;

    public SAdminWorkAreaJPanel(JPanel displayPanel, UserAccount userAccount, Organization organization, EcoSystem system) {
        
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
        initComponents();
        populateTree();
    }

    public void populateTree() {
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
                    //DefaultMutableTreeNode fourthDistributionNode = new DefaultMutableTreeNode(bloodBank.getDistributionCenter());
                    //bloodBankNode.insert(fourthDistributionNode, l++);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewJTree = new javax.swing.JTree();
        dobLabel = new javax.swing.JLabel();
        configurateBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));

        viewJTree.setBackground(new java.awt.Color(250, 250, 250));
        viewJTree.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("colors");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("yellow");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("sports");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("soccer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("football");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hockey");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hot dogs");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("pizza");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ravioli");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("bananas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        viewJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        viewJTree.setRowHeight(24);
        viewJTree.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                viewJTreeHierarchyChanged(evt);
            }
        });
        viewJTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                viewJTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(viewJTree);

        dobLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        dobLabel.setText("Choose one node");
        dobLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        dobLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        dobLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        configurateBtn.setBackground(new java.awt.Color(250, 250, 250));
        configurateBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        configurateBtn.setText("Configurate");
        configurateBtn.setEnabled(false);
        configurateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configurateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(configurateBtn)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void configurateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurateBtnActionPerformed
        // TODO add your handling code here:
        ConfigureJPanel panel = new ConfigureJPanel(displayPanel, userAccount, organ, system);
        displayPanel.add("ConfigureJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_configurateBtnActionPerformed

    private void viewJTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_viewJTreeValueChanged
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) viewJTree.getLastSelectedPathComponent();

        try {
            organ = (Organization) selectedNode.getUserObject();
            dobLabel.setText(organ.toString());
            if(organ.getType().equals(Organization.OrganizationType.Clinic.getValue()))
                configurateBtn.setEnabled(false);
            else
            configurateBtn.setEnabled(true);
        } catch (Exception e) {
            if (selectedNode != null) {
                System.out.println(e);
                organ = system;
                dobLabel.setText("system");
                configurateBtn.setEnabled(true);
            } else {
                configurateBtn.setEnabled(false);
            }
        }

    }//GEN-LAST:event_viewJTreeValueChanged

    private void viewJTreeHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_viewJTreeHierarchyChanged
        // TODO add your handling code here:
        populateTree();
    }//GEN-LAST:event_viewJTreeHierarchyChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configurateBtn;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree viewJTree;
    // End of variables declaration//GEN-END:variables
}

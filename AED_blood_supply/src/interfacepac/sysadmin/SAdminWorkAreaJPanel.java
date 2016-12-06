/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.sysadmin;

import business.organization.Organization;
import business.useraccount.UserAccount;
import interfacepac.donorreceiver.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

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
            
    public SAdminWorkAreaJPanel(JPanel displayPanel, UserAccount userAccount, Organization organizations) {
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        viewJTree = new javax.swing.JTree();
        dobLabel = new javax.swing.JLabel();
        configurateBtn = new javax.swing.JButton();
        manageAccountBtn = new javax.swing.JButton();

        jScrollPane1.setViewportView(viewJTree);

        dobLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        dobLabel.setText("Choose one node");
        dobLabel.setMaximumSize(new java.awt.Dimension(150, 24));
        dobLabel.setMinimumSize(new java.awt.Dimension(150, 24));
        dobLabel.setPreferredSize(new java.awt.Dimension(150, 24));

        configurateBtn.setBackground(new java.awt.Color(250, 250, 250));
        configurateBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        configurateBtn.setText("Configurate");
        configurateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurateBtnActionPerformed(evt);
            }
        });

        manageAccountBtn.setBackground(new java.awt.Color(250, 250, 250));
        manageAccountBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        manageAccountBtn.setText("Manage account");
        manageAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountBtnActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageAccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(configurateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(389, Short.MAX_VALUE))
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
                        .addGap(29, 29, 29)
                        .addComponent(configurateBtn)
                        .addGap(56, 56, 56)
                        .addComponent(manageAccountBtn)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void configurateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurateBtnActionPerformed
        // TODO add your handling code here:
        ConfigureJPanel panel = new ConfigureJPanel(displayPanel, userAccount, organization);
        displayPanel.add("ConfigureJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_configurateBtnActionPerformed

    private void manageAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccountBtnActionPerformed
        // TODO add your handling code here:
        ConfigureAccountJPanel panel = new ConfigureAccountJPanel(displayPanel, userAccount, organization);
        displayPanel.add("ConfigureAccountJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_manageAccountBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configurateBtn;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageAccountBtn;
    private javax.swing.JTree viewJTree;
    // End of variables declaration//GEN-END:variables
}

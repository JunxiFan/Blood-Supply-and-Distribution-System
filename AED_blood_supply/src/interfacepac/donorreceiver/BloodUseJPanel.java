/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.donorreceiver;

import interfacepac.MainJFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class BloodUseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonateJPanel
     */
    JPanel displayPanel;

    public BloodUseJPanel(JPanel displayPanel) {
        initComponents();
        this.displayPanel=displayPanel;
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
        consumptionCBox = new javax.swing.JComboBox<>();
        confirmTbl = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

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

        consumptionCBox.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        consumptionCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        confirmTbl.setBackground(new java.awt.Color(250, 250, 250));
        confirmTbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        confirmTbl.setText("Confirm");
        confirmTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTblActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dobLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consumptionCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(confirmTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(300, 300, 300))
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
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consumptionCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmTbl)
                            .addComponent(cancelBtn))))
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTblActionPerformed
        // TODO add your handling code here:
        MainJFrame panel = new MainJFrame();
        remove(this);
        add(panel);
    }//GEN-LAST:event_confirmTblActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        DROptionJPanel panel = new DROptionJPanel(displayPanel);
        displayPanel.add("DROptionJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTree clinicJTree;
    private javax.swing.JButton confirmTbl;
    private javax.swing.JComboBox<String> consumptionCBox;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel dobLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

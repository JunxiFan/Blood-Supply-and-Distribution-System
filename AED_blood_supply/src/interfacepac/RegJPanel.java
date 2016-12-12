/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac;

import business.EcoSystem;
import interfacepac.donorreceiver.RegisterJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author fjx19
 */
public class RegJPanel extends javax.swing.JPanel {

    /**
     * Creates new form regJPanel
     */
    private JPanel displayPanel;
    private EcoSystem ecoSystem;
    private CertificationJPanel cPanel;
            
    public RegJPanel(JPanel displayPanel, EcoSystem system) {
        initComponents();
        this.displayPanel=displayPanel;
        this.ecoSystem  = system;
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dORBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("welcome");

        dORBtn.setBackground(new java.awt.Color(250, 250, 250));
        dORBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        dORBtn.setText("I'm a donor or receiver");
        dORBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dORBtnActionPerformed(evt);
            }
        });

        staffBtn.setBackground(new java.awt.Color(250, 250, 250));
        staffBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        staffBtn.setText("I'm a staff");
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });

        adminBtn.setBackground(new java.awt.Color(250, 250, 250));
        adminBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        adminBtn.setText("I'm system admin");
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(531, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dORBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(staffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jLabel1))))
                .addGap(526, 526, 526))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(dORBtn)
                .addGap(162, 162, 162)
                .addComponent(staffBtn)
                .addGap(160, 160, 160)
                .addComponent(adminBtn)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dORBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dORBtnActionPerformed
        cPanel = new CertificationJPanel(displayPanel, true, ecoSystem);
        displayPanel.add("certification", cPanel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
// TODO add your handling code here:
    }//GEN-LAST:event_dORBtnActionPerformed

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
       cPanel = new CertificationJPanel(displayPanel, false, ecoSystem);
        displayPanel.add("certification", cPanel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
        // TODO add your handling code here:
    }//GEN-LAST:event_staffBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        cPanel = new CertificationJPanel(displayPanel, false, ecoSystem);
        displayPanel.add("certification", cPanel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
        // TODO add your handling code here:
    }//GEN-LAST:event_adminBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton dORBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton staffBtn;
    // End of variables declaration//GEN-END:variables
}

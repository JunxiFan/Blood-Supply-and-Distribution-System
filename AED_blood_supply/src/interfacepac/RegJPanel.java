/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac;

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
    JPanel displayPanel;
            
    public RegJPanel(JPanel displayPanel) {
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

        welcomeLabel = new javax.swing.JLabel();
        welcomeLabel3 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();

        welcomeLabel.setBackground(new java.awt.Color(250, 250, 250));
        welcomeLabel.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        welcomeLabel.setText("Please login first");

        welcomeLabel3.setBackground(new java.awt.Color(250, 250, 250));
        welcomeLabel3.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        welcomeLabel3.setText("If you don't have account");

        registerBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        registerBtn.setText("register now");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(welcomeLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(welcomeLabel)
                .addGap(125, 125, 125)
                .addComponent(welcomeLabel3)
                .addGap(143, 143, 143)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        RegisterJPanel panel = new RegisterJPanel(displayPanel);
        displayPanel.add("RegisterJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_registerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeLabel3;
    // End of variables declaration//GEN-END:variables
}
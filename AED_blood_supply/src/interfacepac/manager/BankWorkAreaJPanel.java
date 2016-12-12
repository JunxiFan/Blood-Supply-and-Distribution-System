/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepac.manager;

import business.EcoSystem;
import business.organization.BloodBank;
import business.organization.BloodManageCenter;
import business.organization.Clinic;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import interfacepac.donorreceiver.*;
import interfacepac.receptionist.*;
import interfacepac.sysadmin.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Jiamin.S <shang.j@husky.neu.edu>
 */
public class BankWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodManageCenterJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem system;

    public BankWorkAreaJPanel(JPanel displayPanel, UserAccount userAccount, Organization organization, EcoSystem system) {
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.system = system;
        initComponents();
        populateOngoingTbl();
        populateProcessTbl();
    }

    public void populateOngoingTbl() {
        DefaultTableModel model = (DefaultTableModel) ongoingTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkReqestList()) {
            if (request.getStatus().equals("Lack blood") || request.getStatus().equals("Holding")) {
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
            if (request.getStatus().equals("Lack blood") || request.getStatus().equals("Holding")) {
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

    public void populateReport() {
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

        requreBtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        finishedTbl = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        ongoingTbl = new javax.swing.JTable();
        rejectBtn = new javax.swing.JButton();
        transferBtn = new javax.swing.JButton();
        cPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tpa = new javax.swing.JLabel();
        tpb = new javax.swing.JLabel();
        tpo = new javax.swing.JLabel();
        tpab = new javax.swing.JLabel();
        tprha = new javax.swing.JLabel();
        tprhb = new javax.swing.JLabel();
        tprho = new javax.swing.JLabel();
        tprhab = new javax.swing.JLabel();
        tprhab1 = new javax.swing.JLabel();
        tprho1 = new javax.swing.JLabel();
        tprhb1 = new javax.swing.JLabel();
        tpab1 = new javax.swing.JLabel();
        tprha1 = new javax.swing.JLabel();
        tpo1 = new javax.swing.JLabel();
        tpb1 = new javax.swing.JLabel();
        tpa1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));

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

        cPanel.setBackground(new java.awt.Color(250, 250, 250));
        cPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data view", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Type A");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Type B");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Type O");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Type AB");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("Type RHA");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Type RHB");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Type RHO");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Type RHAB");

        tpa.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tpa.setText("Type A");

        tpb.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tpb.setText("Type A");

        tpo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tpo.setText("Type A");

        tpab.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tpab.setText("Type A");

        tprha.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tprha.setText("Type A");

        tprhb.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tprhb.setText("Type A");

        tprho.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tprho.setText("Type A");

        tprhab.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tprhab.setText("Type A");

        tprhab1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tprhab1.setText("Type A");

        tprho1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tprho1.setText("Type A");

        tprhb1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tprhb1.setText("Type A");

        tpab1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tpab1.setText("Type A");

        tprha1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tprha1.setText("Type A");

        tpo1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tpo1.setText("Type A");

        tpb1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tpb1.setText("Type A");

        tpa1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tpa1.setText("Type A");

        javax.swing.GroupLayout cPanelLayout = new javax.swing.GroupLayout(cPanel);
        cPanel.setLayout(cPanelLayout);
        cPanelLayout.setHorizontalGroup(
            cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tprhab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tprho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tprhb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tprha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tpab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tpb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tpa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tprhab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tprho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tprhb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tprha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        cPanelLayout.setVerticalGroup(
            cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(tpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tpb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tpo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tpab1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tprha1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tprhb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tprho1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tprhab1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpab, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tprha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tprhb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tprho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tprhab, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addComponent(requreBtn)
                            .addGap(18, 18, 18)
                            .addComponent(transferBtn)
                            .addGap(24, 24, 24)
                            .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requreBtn)
                            .addComponent(rejectBtn)
                            .addComponent(transferBtn))
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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
        populateOngoingTbl();
        populateProcessTbl();
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
        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ongoingTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest) ongoingTbl.getValueAt(selectedRow, 0);
        system.getDistributionCenter().getWorkQueue().getWorkReqestList().add(request);
        request.setStatus("Waiting");
        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_transferBtnActionPerformed

    private void ongoingTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ongoingTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ongoingTblMouseClicked

    private void ongoingTblHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_ongoingTblHierarchyChanged
        // TODO add your handling code here:
        populateOngoingTbl();
        populateProcessTbl();
    }//GEN-LAST:event_ongoingTblHierarchyChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cPanel;
    private javax.swing.JTable finishedTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable ongoingTbl;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JButton requreBtn;
    private javax.swing.JLabel tpa;
    private javax.swing.JLabel tpa1;
    private javax.swing.JLabel tpab;
    private javax.swing.JLabel tpab1;
    private javax.swing.JLabel tpb;
    private javax.swing.JLabel tpb1;
    private javax.swing.JLabel tpo;
    private javax.swing.JLabel tpo1;
    private javax.swing.JLabel tprha;
    private javax.swing.JLabel tprha1;
    private javax.swing.JLabel tprhab;
    private javax.swing.JLabel tprhab1;
    private javax.swing.JLabel tprhb;
    private javax.swing.JLabel tprhb1;
    private javax.swing.JLabel tprho;
    private javax.swing.JLabel tprho1;
    private javax.swing.JButton transferBtn;
    // End of variables declaration//GEN-END:variables
}

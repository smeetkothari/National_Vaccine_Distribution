/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.warehouseRole;

import business.InventoryItem;
import business.OrderItem;
import business.organization.ClinicOrganization;
import business.organization.HospitalOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import business.workQueue.OrderRequest;
import business.workQueue.VaccineRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Smeet
 */
public class ProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount ua;
    private Organization organization;
    private OrderRequest or;

    public ProcessJPanel(JPanel upc, UserAccount ua, Organization o, OrderRequest or) {
        initComponents();
        this.userProcessContainer = upc;
        this.ua = ua;
        this.organization = o;
        this.or = or;

        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderJTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof VaccineRequest) {
                VaccineRequest vr = (VaccineRequest) wr;
                for (OrderItem oi : vr.getOrder().getOrderItemList()) {
                    Object row[] = new Object[5];
                    row[0] = vr;
                    row[1] = oi.getVaccine().getVacId();
                    row[2] = oi.getQuantity();
                    row[3] = vr.getStatus();
                    row[4] = vr;
                    dtm.addRow(row);
                }
            }
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
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        shipJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vaccine Name", "Vaccine Id", "Quantity", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderJTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 612;
        gridBagConstraints.ipady = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(63, 101, 0, 139);
        add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel1.setText("   Order Process");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 142, 0, 0);
        add(jLabel1, gridBagConstraints);

        shipJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        shipJButton.setText("Ship ");
        shipJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(72, 125, 0, 0);
        add(shipJButton, gridBagConstraints);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(110, 101, 308, 0);
        add(jButton1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void shipJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipJButtonActionPerformed
        // TODO add your handling code here:

        VaccineRequest vacReq;

        int selectedRow = orderJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        vacReq = (VaccineRequest) orderJTable.getValueAt(selectedRow, 4);

        if (vacReq.getcOrg() != null) {
            //System.out.println("clinic");
            ClinicOrganization co = (ClinicOrganization) vacReq.getcOrg();

            for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof OrderRequest && wr.getStatus() != "Manufacturer") {
                    OrderRequest or = (OrderRequest) wr;
                    for (OrderItem oi : or.getOrder().getOrderItemList()) {

                        for (InventoryItem ii : organization.getCatalog().getInventoryList()) {
                            if (oi.getVaccine().getVacId() == ii.getV().getVacId()) {
                                int newQuantity = ii.getQuantity() - oi.getQuantity();
                                ii.setQuantity(newQuantity);

                                vacReq.setStatus("Shipped to Clinic");
                                populateTable();
                            }

                        }

                        // vacReq = (VaccineRequest) orderProcessJTable.getValueAt(selectedRow, 4);
                    }
                }
            }

            for (OrderItem oi : or.getOrder().getOrderItemList()) {
                if (vacReq.getcOrg().getCatalog().getInventoryList().isEmpty()) {

                    InventoryItem i = new InventoryItem();
                    i.setV(oi.getVaccine());
                    i.setQuantity(oi.getQuantity());
                    vacReq.getcOrg().getCatalog().getInventoryList().add(i);
                } else {
                    boolean flag = false;
                    for (InventoryItem ii : vacReq.getcOrg().getCatalog().getInventoryList()) {

                        if (ii.getV().getVacName().equals(oi.getVaccine().getVacName())) {
                            int quant = oi.getQuantity();
                            int newQuan = ii.getQuantity() + quant;
                            ii.setQuantity(newQuan);
                            flag = true;
                            break;
                        }

                    }
                    if (!flag) {
                        InventoryItem i = new InventoryItem();
                        i.setV(oi.getVaccine());
                        i.setQuantity(oi.getQuantity());
                        vacReq.getcOrg().getCatalog().getInventoryList().add(i);

                    }
                }
            }

        }

        if (vacReq.getcOrg() == null) {
            HospitalOrganization ho = (HospitalOrganization) vacReq.gethOrg();
            for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof OrderRequest) {
                    OrderRequest or = (OrderRequest) wr;
                    for (OrderItem oi : or.getOrder().getOrderItemList()) {

                        for (InventoryItem ii : organization.getCatalog().getInventoryList()) {
                            if (oi.getVaccine().getVacId() == ii.getV().getVacId()) {
                                int newQuantity = ii.getQuantity() - oi.getQuantity();
                                ii.setQuantity(newQuantity);

                                vacReq.setStatus("Shipped to Hospital");
                                populateTable();
                            }

                        }

                        // vacReq = (VaccineRequest) orderProcessJTable.getValueAt(selectedRow, 4);
                    }
                }
            }

            for (OrderItem oi : or.getOrder().getOrderItemList()) {
                if (vacReq.gethOrg().getCatalog().getInventoryList().isEmpty()) {

                    InventoryItem i = new InventoryItem();
                    i.setV(oi.getVaccine());
                    i.setQuantity(oi.getQuantity());
                    vacReq.gethOrg().getCatalog().getInventoryList().add(i);
                } else {
                    boolean flag = false;
                    for (InventoryItem ii : vacReq.gethOrg().getCatalog().getInventoryList()) {

                        if (ii.getV().getVacName().equals(oi.getVaccine().getVacName())) {
                            int quant = oi.getQuantity();
                            int newQuan = ii.getQuantity() + quant;
                            ii.setQuantity(newQuan);
                            flag = true;
                            break;
                        }

                    }
                    if (!flag) {
                        InventoryItem i = new InventoryItem();
                        i.setV(oi.getVaccine());
                        i.setQuantity(oi.getQuantity());
                        vacReq.gethOrg().getCatalog().getInventoryList().add(i);
                    }
                }
            }
        }

    }//GEN-LAST:event_shipJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderJTable;
    private javax.swing.JButton shipJButton;
    // End of variables declaration//GEN-END:variables
}

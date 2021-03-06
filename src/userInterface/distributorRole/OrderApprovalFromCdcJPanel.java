/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.distributorRole;

import business.InventoryItem;
import business.Order;
import business.OrderItem;
import business.enterprise.Enterprise;
import business.organization.DistributorOrganization;
import business.organization.Organization;
import business.organization.WarehouseOrganization;
import business.userAccount.UserAccount;
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
public class OrderApprovalFromCdcJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderApprovalFromCdcJPanel
     */
    JPanel userProcessContainer;
    DistributorOrganization organization;
    Enterprise enterprise;
    UserAccount ua;
    Order order;
    VaccineRequest vaccineRequest;

    public OrderApprovalFromCdcJPanel(JPanel upc, DistributorOrganization o, Enterprise e, UserAccount ua) {
        initComponents();
        this.userProcessContainer = upc;
        this.enterprise = e;
        this.organization = o;
        this.ua = ua;
       // progressJProgressBar.setValue(100);
        populateTable();
        populatecomboBox();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) vaccineApproveJTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof VaccineRequest) {
                vaccineRequest = (VaccineRequest) wr;
                for (OrderItem oi : vaccineRequest.getOrder().getOrderItemList()) {

                    Object row[] = new Object[5];
                    row[0] = vaccineRequest;
                    row[1] = vaccineRequest.getSender();
                    row[2] = vaccineRequest.getStatus();
                    row[3] = oi.getQuantity();
                    row[4] = oi.getVaccine().getVacName();
                    dtm.addRow(row);
                }
            }
        }
    }

    private void populatecomboBox() {
        warehouseComboBoxJComboBox.removeAllItems();
        for (Organization o : organization.getOrganizationDirectory().getOrganizationList()) {

            warehouseComboBoxJComboBox.addItem(o);

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

        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineApproveJTable = new javax.swing.JTable();
        forwardToWarehouseJButton = new javax.swing.JButton();
        warehouseComboBoxJComboBox = new javax.swing.JComboBox();
        progressJProgressBar = new javax.swing.JProgressBar();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("     Order Approval");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 0, 0);
        add(jLabel1, gridBagConstraints);

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(233, 191, 264, 0);
        add(backJButton, gridBagConstraints);

        vaccineApproveJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Sender", "Status", "Quantity", "Vaccine Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccineApproveJTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 533;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(42, 129, 0, 0);
        add(jScrollPane1, gridBagConstraints);

        forwardToWarehouseJButton.setText("Forward to Warehouse");
        forwardToWarehouseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardToWarehouseJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 243, 0, 0);
        add(forwardToWarehouseJButton, gridBagConstraints);

        warehouseComboBoxJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        warehouseComboBoxJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseComboBoxJComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 12, 0, 0);
        add(warehouseComboBoxJComboBox, gridBagConstraints);

        progressJProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 188;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 104, 0, 82);
        add(progressJProgressBar, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void forwardToWarehouseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardToWarehouseJButtonActionPerformed
        // TODO add your handling code here:

        WarehouseOrganization o = (WarehouseOrganization) warehouseComboBoxJComboBox.getSelectedItem();
        //o.getName();

        if (o.getCatalog().getInventoryList().size() != 0) {
            for (OrderItem oi : vaccineRequest.getOrder().getOrderItemList()) {
                for (InventoryItem ii : o.getCatalog().getInventoryList()) {

                    if ((oi.getVaccine().getVacName().equals(ii.getV()))
                            && (vaccineRequest.getQuantity() > ii.getQuantity())) {
                        //progressJProgressBar.setValue(80);
                        JOptionPane.showMessageDialog(null, "Not sufficient quantity or not found in Warehouse");

                        return;
                    }
                }

                      //  vacReq = (VaccineRequest) vaccineApproveJTable.getValueAt(selectedRow, 0);
                //vacReq.setReceiver(ua);
                vaccineRequest.setStatus("Processed");

                        //vacReq.setSender(ua);
                // Organization foundOrg = null;
                o.getWorkQueue().getWorkRequestList().add(vaccineRequest);
                progressJProgressBar.setValue(100);
                populateTable();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Vaccine not found in Warehouse Inventory");
        }


    }//GEN-LAST:event_forwardToWarehouseJButtonActionPerformed

    private void warehouseComboBoxJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseComboBoxJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warehouseComboBoxJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton forwardToWarehouseJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar progressJProgressBar;
    private javax.swing.JTable vaccineApproveJTable;
    private javax.swing.JComboBox warehouseComboBoxJComboBox;
    // End of variables declaration//GEN-END:variables
}

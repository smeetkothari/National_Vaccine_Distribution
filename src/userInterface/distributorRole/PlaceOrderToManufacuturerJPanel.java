/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.distributorRole;

import business.Order;
import business.OrderItem;
import business.enterprise.Enterprise;
import business.enterprise.Vaccine;
import business.organization.DistributorOrganization;
import business.organization.ManufacturerOrganization;
import business.organization.Organization;
import business.organization.WarehouseOrganization;
import business.userAccount.UserAccount;
import business.workQueue.OrderRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.clinicRole.ViewInjectionDetailsJPanel;

/**
 *
 * @author Smeet
 */
public class PlaceOrderToManufacuturerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaceOrderToManufacuturerJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    DistributorOrganization organization;
    Order order;
    boolean flag;
    //VaccineRequest vaccineRequest;

    public PlaceOrderToManufacuturerJPanel(JPanel upc, UserAccount ua,
            Enterprise e, DistributorOrganization o) {
        initComponents();
        this.userProcessContainer = upc;
        this.userAccount = ua;
        this.enterprise = e;
        this.organization = o;
        // this.vaccineRequest  = vr;
        populateTable();
        populateComboBox();
        // populateOrderTable(order);

    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderJTable.getModel();
        dtm.setRowCount(0);

        ManufacturerOrganization mo = null;
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof ManufacturerOrganization) {
                mo = (ManufacturerOrganization) o;

                for (Vaccine v : mo.getVaccineCatalog().getVaccineList()) {
                    Object row[] = new Object[5];
                    row[0] = v;
                    row[1] = v.getVacId();
                    row[2] = v.getDate();
                    row[3] = v.getPrice();
                    row[4] = v.getQuantity();
                    dtm.addRow(row);
                }
            }
        }

    }

    private void populateOrderTable(Order order) {
        DefaultTableModel dtm = (DefaultTableModel) orderItemJTable.getModel();
        dtm.setRowCount(0);

        for (OrderItem oi : order.getOrderItemList()) {
            Object[] obj = new Object[4];
            obj[0] = oi;
            obj[1] = oi.getVaccine().getPrice();
            obj[2] = oi.getQuantity();
            obj[3] = oi.getQuantity() * oi.getVaccine().getPrice();
            dtm.addRow(obj);
        }
    }

    private void populateComboBox() {
        warehouseJComboBox.removeAllItems();
        for (Organization o : organization.getOrganizationDirectory().getOrganizationList()) {
            warehouseJComboBox.addItem(o);
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

        jLabel1 = new javax.swing.JLabel();
        placeOrderJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        quantityJLabel = new javax.swing.JLabel();
        quantityJSpinner = new javax.swing.JSpinner();
        AddToCartJButton = new javax.swing.JButton();
        RemoveItemButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemJTable = new javax.swing.JTable();
        viewOrderItemDetailsJButton = new javax.swing.JButton();
        modifyQuantityJTextField = new javax.swing.JTextField();
        modifyQuantityJButton = new javax.swing.JButton();
        warehouseJComboBox = new javax.swing.JComboBox();

        jLabel1.setText("  Place Order");

        placeOrderJButton.setText("Place Order");
        placeOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderJButtonActionPerformed(evt);
            }
        });

        jButton2.setText("<<Back");

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Vaccine Id", "Order Date", "Price", "Quantity"
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

        quantityJLabel.setText("   Quantity");

        AddToCartJButton.setText("ADD TO CART");
        AddToCartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartJButtonActionPerformed(evt);
            }
        });

        RemoveItemButton.setText("Remove Item");
        RemoveItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveItemButtonActionPerformed(evt);
            }
        });

        orderItemJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Price", "Quantity", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderItemJTable);

        viewOrderItemDetailsJButton.setText("View Order Item Details");
        viewOrderItemDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderItemDetailsJButtonActionPerformed(evt);
            }
        });

        modifyQuantityJButton.setText("Modify Quantity");
        modifyQuantityJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyQuantityJButtonActionPerformed(evt);
            }
        });

        warehouseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RemoveItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewOrderItemDetailsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifyQuantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(modifyQuantityJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(placeOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(warehouseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(quantityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(AddToCartJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddToCartJButton))
                .addGap(81, 81, 81)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modifyQuantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewOrderItemDetailsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modifyQuantityJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RemoveItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warehouseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderJButtonActionPerformed
        // TODO add your handling code here:

        Organization org = (Organization) warehouseJComboBox.getSelectedItem();

        for (OrderItem oi : order.getOrderItemList()) {
            oi.getVaccine().setSold(oi.getQuantity());
        }
        int total = 0;

        for (OrderItem oii : order.getOrderItemList()) {
            Boolean flag = false;
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof ManufacturerOrganization) {
                    ManufacturerOrganization moo = (ManufacturerOrganization) o;
                    Order temp = null;
                    for (Vaccine vv : moo.getVaccineCatalog().getVaccineList()) {
                        if (oii.getVaccine().getVacId() == vv.getVacId()) {
                            temp = new Order();
                            temp.getOrderItemList().add(oii);
                            flag = true;
                            OrderRequest or = new OrderRequest();

                            //  OrderItem oii = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);
                            or.setSender(userAccount);
                            or.setStatus("Pending");
                            or.setPaymentStatus("Pending");
                            or.setStatus("Manufacturer");
                            or.setOrder(temp);
                            or.setOrganization((WarehouseOrganization) org);
                            moo.getWorkQueue().getWorkRequestList().add(or);
                            break;
                        }
                    }
                }
                if (flag) {
                    break;
                }
            }
        }

        if (order != null) {
            order = new Order();
            JOptionPane.showMessageDialog(null, "The order is been checked out: Thanks!!");
        } else {
            JOptionPane.showMessageDialog(null, "The cart is empty");
            return;
        }
        flag = false;
        populateTable();
        populateOrderTable(order);
    }//GEN-LAST:event_placeOrderJButtonActionPerformed

    private void AddToCartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartJButtonActionPerformed
        // TODO add your handling code here:
        int selectRow = orderJTable.getSelectedRow();
        boolean flag = true;
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        Vaccine v = (Vaccine) orderJTable.getValueAt(selectRow, 0);

        int quantity = (Integer) quantityJSpinner.getValue();
        if (quantity < 0) {
            JOptionPane.showMessageDialog(null, "Please enter correct quantity");
            return;
        }
        if (order == null) {
            order = new Order();
        } else {

            ArrayList<OrderItem> oi = order.getOrderItemList();
            for (OrderItem orderItem : oi) {

                if (orderItem.getVaccine().equals(v)) {
                    orderItem.setVaccine(v);
                    int oldQuantity = orderItem.getQuantity();
                    int newQuantity = oldQuantity + quantity;
                    orderItem.setQuantity(newQuantity);
                    flag = false;
                }

            }
        }

        if (flag == true) {
            OrderItem oi = order.addOrderItem(v, quantity);
        }

        if (quantity == 0) {
            JOptionPane.showMessageDialog(null, "There's something wrong with the quantity");
            return;
        }

        v.setQuantity(v.getQuantity() - quantity);
        JOptionPane.showMessageDialog(null, v.getVacName() + " "
                + "Quantity" + quantity + "is added to cart");
        populateTable();
        populateOrderTable(order);
    }//GEN-LAST:event_AddToCartJButtonActionPerformed

    private void RemoveItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveItemButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderItemJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }

        OrderItem oi = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);
        order.deleteOrderItem(oi);

        int newAvailability = oi.getQuantity() + oi.getVaccine().getQuantity();

        oi.getVaccine().setAvailability(newAvailability);
        populateTable();
        populateOrderTable(order);
    }//GEN-LAST:event_RemoveItemButtonActionPerformed

    private void viewOrderItemDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderItemDetailsJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = orderItemJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        OrderItem oi = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);

        ViewOrderItemJPanel voijp = new ViewOrderItemJPanel(userProcessContainer, oi);
        userProcessContainer.add("ViewOrderItemDetailsJPanel", voijp);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_viewOrderItemDetailsJButtonActionPerformed

    private void modifyQuantityJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyQuantityJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderItemJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row");
            return;

        }

        OrderItem oi = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);

        int modifyQuantity = Integer.parseInt(modifyQuantityJTextField.getText());

        if (modifyQuantity > (oi.getQuantity())) {
            JOptionPane.showMessageDialog(null, "Quantity is wrong");
            return;
        }

        if (modifyQuantity <= 0) {
            JOptionPane.showMessageDialog(null, "Quanitity is not appropriate");
            return;
        }

        int oldQuantity = oi.getQuantity();
        int oldAvailability = oi.getVaccine().getQuantity();
        oi.getVaccine().setQuantity(oldQuantity + oldAvailability - modifyQuantity);
        oi.setQuantity(modifyQuantity);

        populateTable();
        populateOrderTable(order);
    }//GEN-LAST:event_modifyQuantityJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCartJButton;
    private javax.swing.JButton RemoveItemButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyQuantityJButton;
    private javax.swing.JTextField modifyQuantityJTextField;
    private javax.swing.JTable orderItemJTable;
    private javax.swing.JTable orderJTable;
    private javax.swing.JButton placeOrderJButton;
    private javax.swing.JLabel quantityJLabel;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JButton viewOrderItemDetailsJButton;
    private javax.swing.JComboBox warehouseJComboBox;
    // End of variables declaration//GEN-END:variables
}

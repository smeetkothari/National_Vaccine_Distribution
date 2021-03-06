/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.manufacturerRole;

import business.enterprise.Enterprise;
import business.organization.ManufacturerOrganization;
import business.userAccount.UserAccount;
import business.workQueue.OrderRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Smeet
 */
public class ManufacturerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    ManufacturerOrganization organization;
    Enterprise enterprise;
    OrderRequest or;
    public ManufacturerWorkAreaJPanel(JPanel upc, ManufacturerOrganization o,UserAccount ua,Enterprise e ) {
        initComponents();
        this.userProcessContainer = upc;
        this.organization =  o;
        this.userAccount = ua;
        this.enterprise = e;
        
        //System.out.println(o);
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

        manageProductCatalogJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewOrdersJButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        manageProductCatalogJButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        manageProductCatalogJButton.setText("Manage Product Catalog>>");
        manageProductCatalogJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductCatalogJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 280, 0, 0);
        add(manageProductCatalogJButton, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("       Manufacturer Work Area");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 280, 0, 319);
        add(jLabel1, gridBagConstraints);

        viewOrdersJButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        viewOrdersJButton.setText("View Orders");
        viewOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 280, 479, 0);
        add(viewOrdersJButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void manageProductCatalogJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductCatalogJButtonActionPerformed
        // TODO add your handling code here:
        ManageVaccineCatalogJPanel mpcjp = new ManageVaccineCatalogJPanel(userProcessContainer,organization );
        userProcessContainer.add("ManageProductCatalog", mpcjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProductCatalogJButtonActionPerformed

    private void viewOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersJButtonActionPerformed
        // TODO add your handling code here:
        ViewManfacturerOrdersJPanel vojp = new ViewManfacturerOrdersJPanel(userProcessContainer,organization,userAccount,enterprise);
        userProcessContainer.add("ViewOrderJP", vojp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewOrdersJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageProductCatalogJButton;
    private javax.swing.JButton viewOrdersJButton;
    // End of variables declaration//GEN-END:variables
}

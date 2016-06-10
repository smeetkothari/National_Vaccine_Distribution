/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.clinicRole;

import business.enterprise.CdcEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.ClinicOrganization;
import business.organization.Organization;
import business.patient.Patient;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Smeet
 */
public class ClinicWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClinicWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    ClinicOrganization organization;
    CdcEnterprise enterprise;
    Organization parentorg;
    Patient patient;
    Enterprise parentEnt;
    public ClinicWorkAreaJPanel(JPanel upc, UserAccount ua, ClinicOrganization o, CdcEnterprise enterprise, Organization ParentOrg,Network n,Enterprise parentEnt) {
        initComponents();
        this.userProcessContainer = upc;
        this.userAccount = ua;
        this.organization = o;
        this.parentorg = ParentOrg;
        this.enterprise = enterprise;
        this.parentEnt = parentEnt;
        patient = new Patient();
      // System.out.println(enterprise.getName());
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
        placeOrderJButton = new javax.swing.JButton();
        manageInventoryJButton = new javax.swing.JButton();
        pateintDetailsJButton = new javax.swing.JButton();
        paymentsJButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("         Clinic Work Area");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 4, 0, 0);
        add(jLabel1, gridBagConstraints);

        placeOrderJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        placeOrderJButton.setText("Place Order");
        placeOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 120, 0, 0);
        add(placeOrderJButton, gridBagConstraints);

        manageInventoryJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        manageInventoryJButton.setText("Manage Inventory");
        manageInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 218, 0, 157);
        add(manageInventoryJButton, gridBagConstraints);

        pateintDetailsJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        pateintDetailsJButton.setText("Patient Details ");
        pateintDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pateintDetailsJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 120, 0, 0);
        add(pateintDetailsJButton, gridBagConstraints);

        paymentsJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        paymentsJButton.setText("Payments");
        paymentsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentsJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 218, 501, 157);
        add(paymentsJButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderJButtonActionPerformed
        // TODO add your handling code here:
        PlaceOrderJPanel pojp = new PlaceOrderJPanel(userProcessContainer, userAccount, organization, enterprise, parentorg);
        userProcessContainer.add("PlaceOrderJPanel", pojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_placeOrderJButtonActionPerformed

    private void manageInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryJButtonActionPerformed
        // TODO add your handling code here:
        ClinicInventoryJPanel cijp = new ClinicInventoryJPanel(userProcessContainer, organization);
        userProcessContainer.add("ClinicInventory", cijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageInventoryJButtonActionPerformed

    private void pateintDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pateintDetailsJButtonActionPerformed
        // TODO add your handling code here:
        ManagePatientDetailsJPanel pdjp = new ManagePatientDetailsJPanel(userProcessContainer, enterprise, organization,parentEnt,patient,userAccount);
        userProcessContainer.add("PateintDetails", pdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_pateintDetailsJButtonActionPerformed

    private void paymentsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentsJButtonActionPerformed
        // TODO add your handling code here:
        InsurancePaymentsJPanel ipjp = new InsurancePaymentsJPanel(userProcessContainer,userAccount,organization,enterprise);
        userProcessContainer.add("InsurancePaymnet", ipjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_paymentsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageInventoryJButton;
    private javax.swing.JButton pateintDetailsJButton;
    private javax.swing.JButton paymentsJButton;
    private javax.swing.JButton placeOrderJButton;
    // End of variables declaration//GEN-END:variables
}

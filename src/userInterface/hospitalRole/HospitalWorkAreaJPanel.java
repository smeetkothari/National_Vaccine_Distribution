/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.hospitalRole;

import business.EcoSystem;
import business.enterprise.CdcEnterprise;
import business.enterprise.PhdEnterprise;
import business.network.Network;
import business.organization.HospitalOrganization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Smeet
 */
public class HospitalWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalWorkAreaJPanel
     */
    JPanel userProcessContainer;
    HospitalOrganization organization;
    UserAccount userAccount;
    PhdEnterprise enterprise;
    EcoSystem system;
    Network network;

    public HospitalWorkAreaJPanel(JPanel upc, HospitalOrganization o, UserAccount ua, PhdEnterprise e, EcoSystem system, Network n) {
        initComponents();
        this.userProcessContainer = upc;
        this.organization = o;
        this.userAccount = ua;
        this.enterprise = e;
        this.system = system;
        this.network = n;

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
        manageUserAccountJButton = new javax.swing.JButton();
        manageClinicOrganizationJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        vaccineApprovalJButton = new javax.swing.JButton();
        approveLicenceJButton = new javax.swing.JButton();
        inventoryJButton = new javax.swing.JButton();
        viewPaymentsJButton = new javax.swing.JButton();
        placeOrderJButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("       Hospital Work Area ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 300, 0, 0);
        add(jLabel1, gridBagConstraints);

        manageUserAccountJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        manageUserAccountJButton.setText("Manage UserAccount");
        manageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 136;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 55, 0, 0);
        add(manageUserAccountJButton, gridBagConstraints);

        manageClinicOrganizationJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        manageClinicOrganizationJButton.setText("Manage Clinic Organization");
        manageClinicOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClinicOrganizationJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 55, 0, 0);
        add(manageClinicOrganizationJButton, gridBagConstraints);

        manageEmployeeJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 55, 0, 0);
        add(manageEmployeeJButton, gridBagConstraints);

        vaccineApprovalJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        vaccineApprovalJButton.setText("Vaccine Approval");
        vaccineApprovalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineApprovalJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 162;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 55, 0, 0);
        add(vaccineApprovalJButton, gridBagConstraints);

        approveLicenceJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        approveLicenceJButton.setText("Approve Licencing");
        approveLicenceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveLicenceJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 160, 0, 77);
        add(approveLicenceJButton, gridBagConstraints);

        inventoryJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        inventoryJButton.setText("Manage Inventory");
        inventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 160, 0, 77);
        add(inventoryJButton, gridBagConstraints);

        viewPaymentsJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        viewPaymentsJButton.setText("View Payments");
        viewPaymentsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPaymentsJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 160, 354, 77);
        add(viewPaymentsJButton, gridBagConstraints);

        placeOrderJButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        placeOrderJButton.setText("Place Order");
        placeOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 160, 0, 77);
        add(placeOrderJButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, organization);
        userProcessContainer.add("ManageUserAccount", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountJButtonActionPerformed

    private void manageClinicOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClinicOrganizationJButtonActionPerformed
        // TODO add your handling code here:
        ManageClinicOrganizationJPanel mcjp = new ManageClinicOrganizationJPanel(userProcessContainer,
                organization);
        userProcessContainer.add("ManageHospitalOrgJP", mcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageClinicOrganizationJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        // TODO add your handling code here:
        ManageEmployeeJPanel mejp = new ManageEmployeeJPanel(userProcessContainer,
                organization);
        userProcessContainer.add("ManageEmployeeJP", mejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void vaccineApprovalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineApprovalJButtonActionPerformed
        // TODO add your handling code here:
        VaccineApprovalJPanel vajp = new VaccineApprovalJPanel(userProcessContainer, organization, userAccount, enterprise);
        userProcessContainer.add("VaccineApprovalJPanel", vajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_vaccineApprovalJButtonActionPerformed

    private void approveLicenceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveLicenceJButtonActionPerformed
        // TODO add your handling code here:
        LicenceForClinicJPanel lfcjp = new LicenceForClinicJPanel(userProcessContainer, userAccount, system, network);
        userProcessContainer.add("LicenceForClinicJP", lfcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_approveLicenceJButtonActionPerformed

    private void inventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryJButtonActionPerformed
        // TODO add your handling code here:
        HospitalInventoryJPanel hijp = new HospitalInventoryJPanel(userProcessContainer, organization);
        userProcessContainer.add("HospitalInventoryJP", hijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_inventoryJButtonActionPerformed

    private void viewPaymentsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPaymentsJButtonActionPerformed
        // TODO add your handling code here:
        ViewPaymentsJPanel vpjp = new ViewPaymentsJPanel(userProcessContainer, userAccount, organization);
        userProcessContainer.add("ViewPaymentsJP", vpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPaymentsJButtonActionPerformed

    private void placeOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderJButtonActionPerformed
        // TODO add your handling code here:
        PlaceOrderJPanel pojp = new PlaceOrderJPanel(userProcessContainer, organization, enterprise, userAccount,network);
        userProcessContainer.add("placeOrderJP", pojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_placeOrderJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveLicenceJButton;
    private javax.swing.JButton inventoryJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageClinicOrganizationJButton;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageUserAccountJButton;
    private javax.swing.JButton placeOrderJButton;
    private javax.swing.JButton vaccineApprovalJButton;
    private javax.swing.JButton viewPaymentsJButton;
    // End of variables declaration//GEN-END:variables
}

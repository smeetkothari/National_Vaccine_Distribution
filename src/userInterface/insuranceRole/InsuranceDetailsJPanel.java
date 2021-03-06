/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.insuranceRole;

import business.enterprise.CdcEnterprise;
import business.enterprise.Enterprise;
import business.organization.InsuranceOrganization;
import business.patient.Insurance;
import business.patient.Patient;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Smeet
 */
public class InsuranceDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceDetailsJPanel
     */
    JPanel userProcessContainer;
    InsuranceOrganization organization;
    CdcEnterprise enterprise;
    Patient patient;
    Insurance insurance;
    public InsuranceDetailsJPanel(JPanel upc, InsuranceOrganization organization,CdcEnterprise e,Patient p) {
        initComponents();
        this.userProcessContainer = upc;
        this.organization = organization;
        this.enterprise = e;
        this.patient = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expiryDateJTextField = new javax.swing.JTextField();
        companyNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        acquireJButton = new javax.swing.JButton();
        insuranceTypeJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientNameJTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(expiryDateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 160, -1));

        companyNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameJTextFieldActionPerformed(evt);
            }
        });
        add(companyNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 160, -1));

        jLabel2.setText("Insurance Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 104, 33));

        jLabel4.setText("Expiry Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 100, 33));

        jLabel5.setText("Company Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 100, 25));

        acquireJButton.setText("Acquire Details");
        acquireJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acquireJButtonActionPerformed(evt);
            }
        });
        add(acquireJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 443, 176, 58));
        add(insuranceTypeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 160, -1));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("   Insurance Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 72, 170, 39));

        jLabel6.setText("Patient Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));
        add(patientNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 160, -1));

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 497, 105, 45));
    }// </editor-fold>//GEN-END:initComponents

    private void acquireJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acquireJButtonActionPerformed
        // TODO add your handling code here:
        String insuranceType = insuranceTypeJTextField.getText();
        //int coverage = Integer.parseInt(coverageJTextField.getText());
        String expiryDate = expiryDateJTextField.getText();
        String companyName = companyNameJTextField.getText();
        String patientName = patientNameJTextField.getText();

        Insurance in = new Insurance();
      //  in.setCoverage(coverage);
        in.setCompanyName(companyName);
        in.setExpiryDate(expiryDate);
        in.setInsuranceType(insuranceType);
        patient.setPatientName(patientName);
        
        JOptionPane.showMessageDialog(null, "Created Successfully");
       

    }//GEN-LAST:event_acquireJButtonActionPerformed

    private void companyNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyNameJTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acquireJButton;
    private javax.swing.JTextField companyNameJTextField;
    private javax.swing.JTextField expiryDateJTextField;
    private javax.swing.JTextField insuranceTypeJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField patientNameJTextField;
    // End of variables declaration//GEN-END:variables
}

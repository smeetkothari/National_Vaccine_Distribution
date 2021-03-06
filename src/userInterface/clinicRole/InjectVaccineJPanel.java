/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.clinicRole;

import business.InventoryItem;
import business.enterprise.CdcEnterprise;
import business.enterprise.Vaccine;
import business.organization.InsuranceOrganization;
import business.organization.ManufacturerOrganization;
import business.organization.Organization;
import business.patient.Insurance;
import business.patient.Patient;
import business.patient.PatientHistory;
import business.userAccount.UserAccount;
import business.workQueue.PaymentRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Smeet
 */
public class InjectVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InjectVaccineJPanel
     */
    JPanel userProcessContainer;
    Organization organization;
    Patient p;
    CdcEnterprise enterprise;
    UserAccount account;

    public InjectVaccineJPanel(JPanel upc, Organization org, Patient p, CdcEnterprise e, UserAccount account) {
        initComponents();
        this.userProcessContainer = upc;
        this.organization = org;
        System.out.println(org.getName());
        this.p = p;
        this.enterprise = e;
        this.account = account;
        populateVaccineComboBox();
    }

    private void populateVaccineComboBox() {
        vaccineNameJComboBox.removeAllItems();
        for (InventoryItem ii : organization.getCatalog().getInventoryList()) {
            vaccineNameJComboBox.addItem(ii.getV());
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

        jLabel2 = new javax.swing.JLabel();
        vaccineNameJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        insuranceCoveredJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        givenByJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        safetyPrecautionJTextArea = new javax.swing.JTextArea();
        wherewasitgivenJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        injectJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Vaccine Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(113, 12, 0, 0);
        add(jLabel2, gridBagConstraints);

        vaccineNameJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vaccineNameJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineNameJComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(114, 35, 0, 0);
        add(vaccineNameJComboBox, gridBagConstraints);

        jLabel3.setText("Insurance Covered");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 12, 0, 0);
        add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 223;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 35, 0, 0);
        add(insuranceCoveredJTextField, gridBagConstraints);

        jLabel4.setText("Given by");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 12, 0, 0);
        add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 223;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 35, 0, 0);
        add(givenByJTextField, gridBagConstraints);

        safetyPrecautionJTextArea.setColumns(20);
        safetyPrecautionJTextArea.setRows(5);
        jScrollPane1.setViewportView(safetyPrecautionJTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 94;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(45, 35, 0, 0);
        add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 223;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 35, 0, 0);
        add(wherewasitgivenJTextField, gridBagConstraints);

        jLabel5.setText("Where was it given");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 12, 0, 0);
        add(jLabel5, gridBagConstraints);

        jLabel6.setText("Safety precautions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 12, 0, 0);
        add(jLabel6, gridBagConstraints);

        injectJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        injectJButton.setText("Inject");
        injectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injectJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 103, 131, 0);
        add(injectJButton, gridBagConstraints);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 136, 0, 0);
        add(jButton1, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel7.setText("  Injection Details");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 13, 0, 0);
        add(jLabel7, gridBagConstraints);

        jButton2.setText("View Injection Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(62, 10, 0, 204);
        add(jButton2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void vaccineNameJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineNameJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccineNameJComboBoxActionPerformed

    private void injectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injectJButtonActionPerformed
        // TODO add your handling code here:
        Vaccine v = (Vaccine) vaccineNameJComboBox.getSelectedItem();

        // String patientName = patientNameJTextField.getText();
        int insuranceCovered = Integer.parseInt(insuranceCoveredJTextField.getText());
        String givenBy = givenByJTextField.getText();
        String place = wherewasitgivenJTextField.getText();
        String safety = safetyPrecautionJTextArea.getText();

        PatientHistory ph = p.addPatientHistory();
        //v.setPrice(100);
        // System.out.println(v.getPrice());
        ph.setPlace(place);
        ph.setSafety(safety);
        ph.setGivenBy(givenBy);
        ph.setInsuranceCovered(insuranceCovered);
        ph.setVaccine(v);
        ph.setStatus("Success");
        JOptionPane.showMessageDialog(null, "Vaccine Injected Succesfully");

        //ManufacturerOrganization mo;
        
            if (v.getFundingStatus().equals("Federally Funded")) {

                PaymentRequest pr = new PaymentRequest();
                pr.setResult("Waiting");
                pr.setStatus("Sent to CDC");
                pr.setSender(account);
                pr.setVaccine(v);
               // v.getPrice();

                enterprise.getWorkQueue().getWorkRequestList().add(pr);
                account.getWorkQueue().getWorkRequestList().add(pr);

            } else if (v.getFundingStatus().equals("Not Funded")) {
                v.getPrice();

                ph.getInsuranceCovered();

                if (ph.getInsuranceCovered() > v.getPrice()) {
                    PaymentRequest pr1 = new PaymentRequest();
                    pr1.setSender(account);
                    pr1.setStatus("Sent To Insurance");
                    pr1.setResult("Wating");
                    pr1.setVaccine(v);
                    System.out.println("funding here");
                    Organization foundOrg = null;
                    for (Organization o1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (o1 instanceof InsuranceOrganization) {
                            foundOrg = o1;
                            break;
                        }
                    }
                    if (foundOrg != null) {
                        foundOrg.getWorkQueue().getWorkRequestList().add(pr1);
                        account.getWorkQueue().getWorkRequestList().add(pr1);
                    }
                }

            }
        
    }//GEN-LAST:event_injectJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ViewInjectionDetailsJPanel vvdjp = new ViewInjectionDetailsJPanel(userProcessContainer, p, enterprise);
        userProcessContainer.add("ViewVaccineDetailsJP", vvdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField givenByJTextField;
    private javax.swing.JButton injectJButton;
    private javax.swing.JTextField insuranceCoveredJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea safetyPrecautionJTextArea;
    private javax.swing.JComboBox vaccineNameJComboBox;
    private javax.swing.JTextField wherewasitgivenJTextField;
    // End of variables declaration//GEN-END:variables
}

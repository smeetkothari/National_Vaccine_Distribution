/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.StateRole;

import business.EcoSystem;
import business.enterprise.CdcEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import business.workQueue.LicenceRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Smeet
 */
public class RequestLicenceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestLicenceJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    Network network;
    EcoSystem system;

    public RequestLicenceJPanel(JPanel upc, Enterprise e, UserAccount ua, Network n, EcoSystem system) {
        initComponents();
        this.userProcessContainer = upc;
        this.enterprise = e;
        this.userAccount = ua;
        this.network = n;
        this.system = system;
        populateLicenceTable();
    }

    private void populateLicenceTable() {
        DefaultTableModel dtm = (DefaultTableModel) licencingRequestJTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {

            Object row[] = new Object[5];
            row[0] = wr;
            row[1] = wr.getReceiver();
            row[2] = wr.getStatus();
            LicenceRequest lr = (LicenceRequest) wr;
            String result = lr.getLicenceRequest();
            row[3] = (result == null) ? ("N/A") : (result);
            row[4] = lr.getLicenceId();
            dtm.addRow(row);
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
        licencingRequestJTable = new javax.swing.JTable();
        requestJButton = new javax.swing.JButton();
        requestJTextField = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("    Request Licence ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 45, 0, 0);
        add(jLabel1, gridBagConstraints);

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(104, 216, 365, 0);
        add(backJButton, gridBagConstraints);

        licencingRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "Licence No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(licencingRequestJTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 568;
        gridBagConstraints.ipady = 66;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(45, 146, 0, 120);
        add(jScrollPane1, gridBagConstraints);

        requestJButton.setText("Request");
        requestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 285, 0, 0);
        add(requestJButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 47, 0, 0);
        add(requestJTextField, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestJButtonActionPerformed
        // TODO add your handling code here:
        String message = requestJTextField.getText();

        LicenceRequest lr = new LicenceRequest();
        lr.setMessage(message);
        lr.setSender(userAccount);
        lr.setStatus("Sent for Approval");
        lr.setLicenceRequest("Waiting");
        //lr.setLicenceId(100);
       // lr.setOrganization

        Enterprise foundEnt = null;
        for (Network n : system.getCountryList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                if (e instanceof CdcEnterprise) {
                    if (e.getName().equals("USA CDC")) {
                        //System.out.println(e.getName());
                        foundEnt = e;
                        break;
                    }
                    else if(e.getName().equals("INDIA CDC")){
                        foundEnt = e;
                        break;
                        
                    }
                }
            }

        }

        if (foundEnt != null) {
            foundEnt.getWorkQueue().getWorkRequestList().add(lr);
            userAccount.getWorkQueue().getWorkRequestList().add(lr);
            populateLicenceTable();
        }
    }//GEN-LAST:event_requestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable licencingRequestJTable;
    private javax.swing.JButton requestJButton;
    private javax.swing.JTextField requestJTextField;
    // End of variables declaration//GEN-END:variables
}
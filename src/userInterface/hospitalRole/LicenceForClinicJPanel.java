/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.hospitalRole;

import business.EcoSystem;
import business.enterprise.CdcEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import business.workQueue.LicenceRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Smeet
 */
public class LicenceForClinicJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LicenceForClinicJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    Network n;

    public LicenceForClinicJPanel(JPanel upc, UserAccount ua, EcoSystem system, Network n) {
        initComponents();
        this.userProcessContainer = upc;
        this.account = ua;
        this.system = system;
        this.n = n;
        populateLicenceTable();
    }

    private void populateLicenceTable() {
        DefaultTableModel dtm = (DefaultTableModel) licencingRequestJTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof LicenceRequest) {
                Object row[] = new Object[5];
                row[0] = wr;
                row[1] = wr.getStatus();
                LicenceRequest lr = (LicenceRequest) wr;
                String result = lr.getLicenceRequest();
                row[2] = (result == null) ? ("N/A") : (result);
                row[3] = lr.getLicenceId();
                row[4] = lr.getReceiver();
                dtm.addRow(row);
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

        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        licencingRequestJTable = new javax.swing.JTable();
        requestJButton = new javax.swing.JButton();
        requestJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        licencingRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Status", "Result", "Licence No", "Receiver"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

        requestJButton.setText("Request");
        requestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(" Licencing Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(requestJButton)
                        .addGap(47, 47, 47)
                        .addComponent(requestJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestJButton)
                    .addComponent(requestJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addComponent(backJButton)
                .addContainerGap(316, Short.MAX_VALUE))
        );
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
        lr.setSender(account);
        lr.setStatus("Sent for Approval");
        lr.setLicenceRequest("Waiting");
        lr.setReceiver(account);
        //lr.setLicenceId(100);
        // lr.setOrganization

        Enterprise foundEnt = null;
        for (Network n : system.getCountryList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                
                if (e instanceof CdcEnterprise) {
                    if (e.getName().equals("USA CDC")) {
                        System.out.println(e.getName());
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
            account.getWorkQueue().getWorkRequestList().add(lr);
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
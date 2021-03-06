/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.CdcAdminRole;

import business.enterprise.Enterprise;
import business.userAccount.UserAccount;
import business.workQueue.LicenceRequest;
import business.workQueue.WorkRequest;
import com.db4o.cs.internal.messages.Message;
import java.awt.CardLayout;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import sun.rmi.transport.Transport;

/**
 *
 * @author Smeet
 */
public class approveLicenceforHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form approveLicenceforHospitalJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    public approveLicenceforHospitalJPanel(JPanel upc, Enterprise e, UserAccount ua) {
        initComponents();
        this.userProcessContainer = upc;
        this.enterprise = e;
        this.account = ua;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) approveLicenceJTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof LicenceRequest) {
                LicenceRequest lr = (LicenceRequest) wr;

                Object row[] = new Object[5];
                row[0] = lr;
                row[1] = (lr.getReceiver() == null) ? ("N/A") : (lr.getReceiver().getEmployee().getName());
                row[2] = lr.getStatus();
                row[3] = lr.getLicenceId();
                row[4] = lr.getName();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        approveLicenceJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        approveJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approveLicenceJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "licenceId"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(approveLicenceJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 132, 520, 100));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("      Approve Hospital Licence");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 280, 28));

        approveJButton.setText("Approve");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });
        add(approveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 284, -1, -1));

        rejectJButton.setText("Reject");
        add(rejectJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 284, 85, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 428, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        // TODO add your handling code here:
        //email of sender

//        final String user = "kotharismeet@gmail.com";
//
//        final String pass = "abc";
//
//        // username & password for receipent
//
//      //  String username = jTextField1.getText();
//
//        //String password = jTextField2.getText();
//
////SMTP code
//
//        Properties properties = new Properties();
//
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//
//        properties.put("mail.smtp.starttls.enable", "true");
//
//        properties.put("mail.smtp.auth", "true");
//
//        properties.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(properties,
//
//                new javax.mail.Authenticator() {
//
//                    protected PasswordAuthentication getPasswordAuthentication() {
//
//                        return new PasswordAuthentication(user, pass);
//
//                    }
//
//                }
//
//        );
//
//        try {
//
//            //sending email with message
//
//            Message message = new MimeMessage(session);
//
//            message.setFrom(new InternetAddress("aeddrug@gmail.com"));
//
//            int selectedRow1 = approveLicenceJTable.getSelectedRow();
//
//           // ssn = licenseJTable.getValueAt(selectedRow1, 2).toString();
//
//            message.setRecipients(Message.RecipientType.TO,
//
//                   // InternetAddress.parse(ssn));
//
//            message.setSubject("LICENSE CONFIRMATION");
//
//            message.setText("Congratulations license has been approved." + " "
//
//                    + "Username :" + username + " " + "Password :" + password);
//
//            Transport.send(message);
//
//            JOptionPane.showMessageDialog(null, "Approved and Details send");
//        
//        }
        
        
        
        
        
        
        
        
        
        LicenceRequest licReq;
        int selectedRow = approveLicenceJTable.getSelectedRow();
        if (selectedRow >= 0) {
            licReq = (LicenceRequest) approveLicenceJTable.getValueAt(selectedRow, 0);
            //licReq.setReceiver(account);
            licReq.setStatus("Accepted");
            licReq.setLicenceRequest("Licenced Approved");
            licReq.setReceiver(account);
            licReq.setSender(account);
            
            populateTable();
        }
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JTable approveLicenceJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rejectJButton;
    // End of variables declaration//GEN-END:variables
}

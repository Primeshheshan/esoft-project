/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_esoft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PRIMESH
 */
public class MainmenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Mainmenu
     */
    public MainmenuAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnexit = new javax.swing.JButton();
        btnstk = new javax.swing.JButton();
        btnsup = new javax.swing.JButton();
        btncus = new javax.swing.JButton();
        btnin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnuser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexit.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        btnexit.setForeground(new java.awt.Color(204, 0, 0));
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 250, 42));

        btnstk.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        btnstk.setForeground(new java.awt.Color(204, 0, 0));
        btnstk.setText("STOCK");
        btnstk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstkActionPerformed(evt);
            }
        });
        getContentPane().add(btnstk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 250, 42));

        btnsup.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        btnsup.setForeground(new java.awt.Color(204, 0, 0));
        btnsup.setText("ADD SUPPLIER");
        btnsup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 250, 42));

        btncus.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        btncus.setForeground(new java.awt.Color(204, 0, 0));
        btncus.setText("ADD CUSTOMER");
        btncus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncusActionPerformed(evt);
            }
        });
        getContentPane().add(btncus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 250, 42));

        btnin.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        btnin.setForeground(new java.awt.Color(204, 0, 0));
        btnin.setText("INVOICE");
        btnin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninActionPerformed(evt);
            }
        });
        getContentPane().add(btnin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 250, 42));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main menu");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, 40));

        btnuser.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        btnuser.setForeground(new java.awt.Color(204, 0, 0));
        btnuser.setText("ADD USER");
        btnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserActionPerformed(evt);
            }
        });
        getContentPane().add(btnuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 250, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_esoft/dynamic-animation-smooth-gradient-background-footage-090801165_prevstill.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);      // TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnstkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstkActionPerformed

        new Stock().setVisible(true);
        // this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnstkActionPerformed

    private void btnsupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupActionPerformed
        // this.setVisible(false);
        new Supplier_details().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnsupActionPerformed

    private void btncusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncusActionPerformed
        // this.setVisible(false);
        new Customer().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_btncusActionPerformed

    private void btninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninActionPerformed

        // this.setVisible(false);
        new Invoice().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btninActionPerformed

    private void btnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserActionPerformed
        new Adduser().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnuserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainmenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainmenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainmenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainmenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new MainmenuAdmin().setVisible(true);
          
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncus;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnin;
    private javax.swing.JButton btnstk;
    private javax.swing.JButton btnsup;
    private javax.swing.JButton btnuser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
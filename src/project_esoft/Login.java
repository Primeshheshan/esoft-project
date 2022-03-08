/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_esoft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PRIMESH
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cmbchoser = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(204, 0, 0));
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 120, 45));

        txtuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 100, 30));

        txtpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 200, 30));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" LOGIN");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 310, 40));

        cmbchoser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbchoser.setForeground(new java.awt.Color(0, 0, 204));
        cmbchoser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        getContentPane().add(cmbchoser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 160, 30));

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 120, 45));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_esoft/40pyh0E.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
  try {
     
        String u=txtuser.getText();   
           
        String t= txtpass.getText();
        int idpass= Integer.parseInt(t);
        
     String c= cmbchoser.getSelectedItem().toString();
        
       
           Connection con = DBConnection.getConnection();
             
            
            String qu = "select * from login_details where username=? and password=? and type=?";
            PreparedStatement ps = con.prepareStatement(qu);
            
            ps.setString(1, u);
            ps.setInt(2, idpass);
            ps.setString(3, c);
           
           ResultSet rs= ps.executeQuery();
           
          if(rs.next())
          {    if (cmbchoser.getSelectedIndex()==0) 
              {
                    new MainmenuAdmin().setVisible(true); 
                     clear();
                   
              }
          else 
              {
                   new Mainmenu().setVisible(true); 
                   clear();
                  
              }
              
          

          }
          else{
             clear();
              JOptionPane.showMessageDialog(null, "Password Incorrect, Please Try Again", "Login", JOptionPane.INFORMATION_MESSAGE);
          }
                          
            //System.out.println("Login Successfull ");
        }catch (SQLException ex) {
            System.out.println("error");
            ex.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed
void clear()
{
    txtuser.setText("");
    txtpass.setText("");
}
    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JComboBox<String> cmbchoser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
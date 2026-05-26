
package clinicinventory;

import java.sql.*;
import javax.swing.JOptionPane;


public class ResetPass extends javax.swing.JFrame {
    String connector =  "jdbc:mysql://localhost:3306/clinicsystem";
    String rt = "root";
    String p = "";
    
    Connection conn;
    PreparedStatement pst;//to execute parametized sql statement
    ResultSet rs;//to retrieve and process the data returned by sql select statement
 
    public ResetPass() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_uname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTN_enter = new javax.swing.JButton();
        BTN_Back = new javax.swing.JButton();
        TXT_pass = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(TXT_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 153, 299, 49));

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 48, 71));
        jLabel1.setText("Enter Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 99, -1, -1));

        jLabel2.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 48, 71));
        jLabel2.setText("Enter New Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 220, -1, -1));

        BTN_enter.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        BTN_enter.setForeground(new java.awt.Color(37, 84, 84));
        BTN_enter.setText("Enter");
        BTN_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_enterActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 385, 96, 39));

        BTN_Back.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        BTN_Back.setForeground(new java.awt.Color(204, 0, 0));
        BTN_Back.setText("Back");
        BTN_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BackActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 385, -1, -1));

        TXT_pass.setForeground(new java.awt.Color(153, 153, 153));
        TXT_pass.setText("Password");
        getContentPane().add(TXT_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 268, 308, 53));

        jCheckBox1.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 327, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginBG.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_enterActionPerformed
    String uname = TXT_uname.getText();
    String conpass = TXT_pass.getText();

    try {
        conn = DriverManager.getConnection(connector, rt, p);
        pst = conn.prepareStatement("UPDATE 0_Admins SET pass = ? WHERE uname = ?");

        pst.setString(1, conpass);
        pst.setString(2, uname);
        pst.executeUpdate();
        pst.close();
        conn.close();

        JOptionPane.showMessageDialog(this, "Password Updated Successfully!");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating password. Please try again.");
    }

    }//GEN-LAST:event_BTN_enterActionPerformed

    private void BTN_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BackActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
               
    }//GEN-LAST:event_BTN_BackActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            TXT_pass.setEchoChar((char)0);
        }
        else
        {
            TXT_pass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed


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
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_enter;
    private javax.swing.JPasswordField TXT_pass;
    private javax.swing.JTextField TXT_uname;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

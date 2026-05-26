
package clinicinventory;

import clinicinventory.DashBoard;
import java.util.Hashtable;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;





public class Login extends javax.swing.JFrame {
    
    PreparedStatement pst;
    Connection conn;
    String connector = "jdbc:mysql://localhost:3306/clinicsystem";
    String rt = "root";
    String p = "";
    ResultSet rs;
    Hashtable<String, String> userCredentials = new Hashtable<>();
    
    public Login() {
        initComponents();
        jPanel1.setBackground(new Color(2, 48, 71,160));
        Color color = new Color(2, 48, 71, 160);
        TXT_uname.setBackground(new java.awt.Color(2, 48, 71,160));
        TXT_pass.setBackground(new java.awt.Color(2, 48, 71,160));
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXT_pass = new javax.swing.JPasswordField();
        BTN_login1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTN_resetpass = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TXT_uname = new javax.swing.JTextField();
        BTN_register = new javax.swing.JButton();
        chckbox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));

        TXT_pass.setText("jPasswordField1");
        TXT_pass.setBorder(null);
        TXT_pass.setCaretPosition(0);

        BTN_login1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        BTN_login1.setForeground(new java.awt.Color(2, 48, 71));
        BTN_login1.setText("LOGIN");
        BTN_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_login1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usernameicon.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passwordicon.png"))); // NOI18N
        jLabel2.setAlignmentX(0.5F);

        BTN_resetpass.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        BTN_resetpass.setForeground(new java.awt.Color(2, 48, 71));
        BTN_resetpass.setText("Forgot Password");
        BTN_resetpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_resetpassActionPerformed(evt);
            }
        });

        TXT_uname.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        TXT_uname.setForeground(new java.awt.Color(255, 255, 255));
        TXT_uname.setBorder(null);

        BTN_register.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        BTN_register.setForeground(new java.awt.Color(2, 48, 71));
        BTN_register.setText("REGISTER");
        BTN_register.setMaximumSize(new java.awt.Dimension(154, 26));
        BTN_register.setMinimumSize(new java.awt.Dimension(154, 26));
        BTN_register.setPreferredSize(new java.awt.Dimension(154, 26));
        BTN_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_registerActionPerformed(evt);
            }
        });

        chckbox.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        chckbox.setForeground(new java.awt.Color(242, 242, 242));
        chckbox.setText("Show Password");
        chckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(BTN_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_resetpass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_register, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chckbox))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSeparator2)
                                        .addComponent(TXT_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(TXT_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chckbox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_resetpass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_register, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginBG.jpg"))); // NOI18N
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setIconTextGap(0);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        setSize(new java.awt.Dimension(890, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_registerActionPerformed
        new Register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_registerActionPerformed

    private void BTN_resetpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_resetpassActionPerformed
        new ResetPass().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_resetpassActionPerformed

    private void BTN_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_login1ActionPerformed
        String userName = TXT_uname.getText();
        String password = new String(TXT_pass.getPassword());

        try {
            conn = DriverManager.getConnection(connector, rt, p);
            pst = conn.prepareStatement("SELECT uname, pass FROM 0_Admins");
            rs = pst.executeQuery();

            Hashtable<String, String> userCredentials = new Hashtable<>();

            while (rs.next()) {
                String username = rs.getString("uname");
                String hashedPassword = rs.getString("pass");
                userCredentials.put(username, hashedPassword);
            }

            if (verifyPassword(userName, password, userCredentials)) {
                new DashBoard().setVisible(true);
                DashBoard dboard = new DashBoard(TXT_uname.getText());
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Login Successful");

            } else {
                JOptionPane.showMessageDialog(this, "Username or password is incorrect");
            }
        } catch (SQLException ex) {
            System.err.println("SQL Exception " + ex.getMessage());
        }
    }//GEN-LAST:event_BTN_login1ActionPerformed

    private void chckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckboxActionPerformed
        if(chckbox.isSelected())
        {
            TXT_pass.setEchoChar((char)0);
        }
        else
        {
            TXT_pass.setEchoChar('*');
        }
    }//GEN-LAST:event_chckboxActionPerformed

    private boolean verifyPassword(String enteredUsername, String enteredPassword, Hashtable<String, String> userCredentials) {
        String storedHash = userCredentials.get(enteredUsername);
        if (storedHash != null) {
            // Compare the entered password with the stored hash
            // Here, you can use your preferred method for password verification
            return storedHash.equals(hashPassword(enteredPassword));
        }
        return false;
    }

    private String hashPassword(String password) {
        // Implement your password hashing method here
        // Replace this dummy implementation with your actual hashing algorithm
        return password;
    }

   
    







    
    
    
    
    
    
    
    
    
    
    
    
  
    
    
    
    
    
    
    
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_login1;
    private javax.swing.JButton BTN_register;
    private javax.swing.JButton BTN_resetpass;
    private javax.swing.JPasswordField TXT_pass;
    public javax.swing.JTextField TXT_uname;
    private javax.swing.JCheckBox chckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

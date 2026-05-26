
package clinicinventory;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.sound.midi.Track;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    PreparedStatement pst;
    Connection conn;
    String connector =  "jdbc:mysql://localhost:3306/clinicsystem";
    String rt = "root";
    String p = "";          

 
    public Register() {
        initComponents();
        jPanel1.setBackground(new Color(255, 255, 255, 160));
        TXT_lname.setBackground(new java.awt.Color(0,0,0,1));
        TXT_fname.setBackground(new java.awt.Color(0,0,0,1)); 
        TXT_initial.setBackground(new java.awt.Color(0,0,0,1));
        TXT_uname.setBackground(new java.awt.Color(0,0,0,1));
        TXT_pass.setBackground(new java.awt.Color(0,0,0,1));
        TXT_email.setBackground(new java.awt.Color(0,0,0,1));
        
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXT_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TXT_uname = new javax.swing.JTextField();
        TXT_pass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXT_initial = new javax.swing.JTextField();
        TXT_fname = new javax.swing.JTextField();
        TXT_lname = new javax.swing.JTextField();
        BTN_register = new javax.swing.JButton();
        BTN_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(887, 643));

        jLabel2.setBackground(new java.awt.Color(2, 48, 71));
        jLabel2.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 48, 71));
        jLabel2.setText("REGISTER");

        jLabel3.setBackground(new java.awt.Color(2, 48, 71));
        jLabel3.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 48, 71));
        jLabel3.setText("LAST NAME");

        jLabel4.setBackground(new java.awt.Color(2, 48, 71));
        jLabel4.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 48, 71));
        jLabel4.setText("PASSWORD");

        jLabel5.setBackground(new java.awt.Color(2, 48, 71));
        jLabel5.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 48, 71));
        jLabel5.setText("M.I.");

        jLabel6.setBackground(new java.awt.Color(2, 48, 71));
        jLabel6.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 48, 71));
        jLabel6.setText("EMAIL");

        TXT_email.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_email.setForeground(new java.awt.Color(153, 153, 153));
        TXT_email.setText("Email");
        TXT_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 48, 71)));
        TXT_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_emailFocusLost(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(2, 48, 71));
        jLabel7.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 48, 71));
        jLabel7.setText("FIRST NAME");

        jLabel8.setBackground(new java.awt.Color(2, 48, 71));
        jLabel8.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 48, 71));
        jLabel8.setText("USERNAME");

        TXT_uname.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_uname.setForeground(new java.awt.Color(153, 153, 153));
        TXT_uname.setText("Username");
        TXT_uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 48, 71)));
        TXT_uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_unameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_unameFocusLost(evt);
            }
        });

        TXT_pass.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_pass.setForeground(new java.awt.Color(153, 153, 153));
        TXT_pass.setText("Password");
        TXT_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 48, 71)));
        TXT_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_passFocusLost(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(2, 48, 71));
        jLabel9.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 48, 71));
        jLabel9.setText("M.I.");

        TXT_initial.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_initial.setForeground(new java.awt.Color(153, 153, 153));
        TXT_initial.setText("M.I.");
        TXT_initial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 48, 71)));
        TXT_initial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_initialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_initialFocusLost(evt);
            }
        });

        TXT_fname.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_fname.setForeground(new java.awt.Color(153, 153, 153));
        TXT_fname.setText("First Name");
        TXT_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 48, 71)));
        TXT_fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_fnameFocusLost(evt);
            }
        });

        TXT_lname.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_lname.setForeground(new java.awt.Color(153, 153, 153));
        TXT_lname.setText("Last Name");
        TXT_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 48, 71)));
        TXT_lname.setSelectionColor(new java.awt.Color(255, 255, 255));
        TXT_lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_lnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_lnameFocusLost(evt);
            }
        });

        BTN_register.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        BTN_register.setForeground(new java.awt.Color(2, 48, 71));
        BTN_register.setText("REGISTER");
        BTN_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_registerActionPerformed(evt);
            }
        });

        BTN_Back.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        BTN_Back.setForeground(new java.awt.Color(204, 0, 0));
        BTN_Back.setText("Back");
        BTN_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(TXT_email, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_lname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(TXT_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_initial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(162, 162, 162)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(BTN_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_register, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 53, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXT_initial, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(TXT_fname))
                                .addGap(16, 16, 16)))
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_register)
                            .addComponent(BTN_Back))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(TXT_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 550, 350));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginBG.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_registerActionPerformed
    String lname = TXT_lname.getText();
    String fname = TXT_fname.getText();
    String mname = TXT_initial.getText();
    String uname = TXT_uname.getText();
    String pass = TXT_pass.getText();
    String email = TXT_email.getText();
    
    String query = "INSERT INTO 0_Admins (lname,fname,mname,uname,pass,email) VALUES (?, ?, ?, ?, ?, ?)";
    
        try 
        {
             
            conn = DriverManager.getConnection(connector,rt,p);
            pst = conn.prepareStatement(query);
            pst.setString(1, lname);
            pst.setString(2, fname);
            pst.setString(3, mname);
            pst.setString(4, uname);
            pst.setString(5, pass);
            pst.setString(6, email);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Recorded");
            new Login().setVisible(true);
            this.setVisible(false);
            
        }
        
        catch (HeadlessException | SQLException e) 
        {
            System.err.println("SQL Exception " + e.getMessage());
        }
    }//GEN-LAST:event_BTN_registerActionPerformed

    private void BTN_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BackActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_BackActionPerformed

    private void TXT_lnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_lnameFocusGained
        if(TXT_lname.getText().equals("Last Name"))
        {
            TXT_lname.setText("");
            TXT_lname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TXT_lnameFocusGained

    private void TXT_lnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_lnameFocusLost
       if(TXT_lname.getText().equals(""))
       {
           TXT_lname.setText("Last Name");
           TXT_lname.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_TXT_lnameFocusLost

    private void TXT_fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_fnameFocusGained
        if(TXT_fname.getText().equals("First Name"))
        {
            TXT_fname.setText("");
            TXT_fname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TXT_fnameFocusGained

    private void TXT_fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_fnameFocusLost
        if(TXT_fname.getText().equals(""))
        {  
           TXT_fname.setText("First Name");
           TXT_fname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TXT_fnameFocusLost

    private void TXT_initialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_initialFocusGained
        if(TXT_initial.getText().equals("M.I."))
        {
            TXT_initial.setText("");
            TXT_initial.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TXT_initialFocusGained

    private void TXT_initialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_initialFocusLost
       if(TXT_initial.getText().equals(""))
       {
           TXT_initial.setText("M.I.");
           TXT_initial.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_TXT_initialFocusLost

    private void TXT_unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_unameFocusGained
        if(TXT_uname.getText().equals("Username"))
        {
           TXT_uname.setText("");
           TXT_uname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TXT_unameFocusGained

    private void TXT_unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_unameFocusLost
       if(TXT_uname.getText().equals(""))
       {
           TXT_uname.setText("Username");
           TXT_uname.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_TXT_unameFocusLost

    private void TXT_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_passFocusGained
        if(TXT_pass.getText().equals("Password"))
        {
            TXT_pass.setText("");
            TXT_pass.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TXT_passFocusGained

    private void TXT_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_passFocusLost
       if(TXT_pass.getText().equals(""))
       {
           TXT_pass.setText("Password");
           TXT_pass.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_TXT_passFocusLost

    private void TXT_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_emailFocusGained
       if(TXT_email.getText().equals("Email"))
       {
           TXT_email.setText("");
           TXT_email.setForeground(new Color(0,0,0));       
       }
    }//GEN-LAST:event_TXT_emailFocusGained

    private void TXT_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_emailFocusLost
        if(TXT_email.getText().equals(""))
        {
            TXT_email.setText("Email");
            TXT_email.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TXT_emailFocusLost


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     // TODO add your handling code here:
    
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_register;
    private javax.swing.JTextField TXT_email;
    private javax.swing.JTextField TXT_fname;
    private javax.swing.JTextField TXT_initial;
    private javax.swing.JTextField TXT_lname;
    private javax.swing.JTextField TXT_pass;
    private javax.swing.JTextField TXT_uname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


package clinicinventory;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;



public class DashBoard extends javax.swing.JFrame {

    public DashBoard() {
        initComponents();
        showDate();
        showTime();
        setIconImage();
    }
    
    public DashBoard(String name)
    {
        initComponents();
       LBL_name.setText(name);
    }
    
    public void close()
    {
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        else
        {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BTN_log = new javax.swing.JButton();
        BTN_tracker = new javax.swing.JButton();
        BTN_monthreport = new javax.swing.JButton();
        BTN_addmed = new javax.swing.JButton();
        BTN_addcrs = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        bgLOL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LBL_name = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        BTN_logout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jPanel2.setBackground(new java.awt.Color(2, 48, 71));
        jPanel2.setForeground(new java.awt.Color(2, 48, 71));
        jPanel2.setToolTipText("");

        BTN_log.setBackground(new java.awt.Color(2, 48, 71));
        BTN_log.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        BTN_log.setForeground(new java.awt.Color(255, 255, 255));
        BTN_log.setText("Log");
        BTN_log.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN_log.setBorderPainted(false);
        BTN_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_logActionPerformed(evt);
            }
        });

        BTN_tracker.setBackground(new java.awt.Color(2, 48, 71));
        BTN_tracker.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        BTN_tracker.setForeground(new java.awt.Color(255, 255, 255));
        BTN_tracker.setText("Student Tracker");
        BTN_tracker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_trackerActionPerformed(evt);
            }
        });

        BTN_monthreport.setBackground(new java.awt.Color(2, 48, 71));
        BTN_monthreport.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        BTN_monthreport.setForeground(new java.awt.Color(255, 255, 255));
        BTN_monthreport.setText("Monthly Report");
        BTN_monthreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_monthreportActionPerformed(evt);
            }
        });

        BTN_addmed.setBackground(new java.awt.Color(2, 48, 71));
        BTN_addmed.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        BTN_addmed.setForeground(new java.awt.Color(255, 255, 255));
        BTN_addmed.setText("Inventory");
        BTN_addmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_addmedActionPerformed(evt);
            }
        });

        BTN_addcrs.setBackground(new java.awt.Color(2, 48, 71));
        BTN_addcrs.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        BTN_addcrs.setForeground(new java.awt.Color(255, 255, 255));
        BTN_addcrs.setText("Courses");
        BTN_addcrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_addcrsActionPerformed(evt);
            }
        });

        jSeparator1.setFont(new java.awt.Font("Fira Sans", 0, 20)); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setToolTipText("");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(BTN_log, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_tracker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_monthreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_addmed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_addcrs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(168, 168, 168)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_addcrs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_addmed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_monthreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_tracker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_log, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel3.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgLOL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGOBG.png"))); // NOI18N
        jPanel3.add(bgLOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -10, 880, 650));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 48, 71));
        jLabel1.setText("WELCOME,");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 660, 150));

        LBL_name.setFont(new java.awt.Font("Noto Sans", 3, 80)); // NOI18N
        LBL_name.setForeground(new java.awt.Color(2, 48, 71));
        LBL_name.setText("NURSE");
        jPanel3.add(LBL_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        dateLabel.setFont(new java.awt.Font("Fira Sans ExtraBold", 0, 18)); // NOI18N
        dateLabel.setText("Date");
        jPanel3.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        timeLabel.setFont(new java.awt.Font("Fira Sans ExtraBold", 0, 18)); // NOI18N
        timeLabel.setText("Time");
        jPanel3.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        BTN_logout.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        BTN_logout.setForeground(new java.awt.Color(204, 0, 0));
        BTN_logout.setText("LogOut");
        BTN_logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        BTN_logout.setMaximumSize(new java.awt.Dimension(168, 29));
        BTN_logout.setMinimumSize(new java.awt.Dimension(168, 29));
        BTN_logout.setPreferredSize(new java.awt.Dimension(168, 29));
        BTN_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(BTN_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 530, -1, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1259, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_addcrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_addcrsActionPerformed
        new addCrsGrdSec().setVisible(true);
    }//GEN-LAST:event_BTN_addcrsActionPerformed

    private void BTN_trackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_trackerActionPerformed
        new PatientTracker().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_trackerActionPerformed

    private void BTN_addmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_addmedActionPerformed
        // TODO add your handling code here:
        new addMedecine().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_addmedActionPerformed

    private void BTN_monthreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_monthreportActionPerformed
       new MonthlyReport().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_BTN_monthreportActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void BTN_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_logActionPerformed
        new Log().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_logActionPerformed

    private void BTN_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_logoutActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_logoutActionPerformed
    
    public void setLoggedInUser(String username) {
    DashBoard db = new DashBoard();
        db.LBL_name.setText(username);
    }   
    
    void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MMMM-dd-yyyy");
        dateLabel.setText(s.format(d));
    }
    
    void showTime(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                String formattedTime = s.format(d);
                timeLabel.setText(formattedTime);
            }
        });
        timer.start();
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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_addcrs;
    private javax.swing.JButton BTN_addmed;
    private javax.swing.JButton BTN_log;
    private javax.swing.JButton BTN_logout;
    private javax.swing.JButton BTN_monthreport;
    private javax.swing.JButton BTN_tracker;
    public javax.swing.JLabel LBL_name;
    private javax.swing.JLabel bgLOL;
    private javax.swing.JLabel dateLabel;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

    public void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
}

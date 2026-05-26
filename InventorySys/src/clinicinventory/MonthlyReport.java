
package clinicinventory;

import clinicinventory.DashBoard;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormatSymbols;
import java.util.Locale;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class MonthlyReport extends javax.swing.JFrame {
    String connector =  "jdbc:mysql://localhost:3306/clinicsystem";
    String rt = "root";
    String p = "";
    
    Connection conn;
    PreparedStatement pst;//to execute parametized sql statement
    ResultSet rs;//to retrieve and process the data returned by sql select statement


    public MonthlyReport() {
        initComponents();
        yearJCOMB();
        monthJCOMB();
        loadTable();
        loadTable1();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLBL_year = new javax.swing.JLabel();
        JLBL_month = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_complaincases = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBL_medsandtaken = new javax.swing.JTable();
        BTN_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JCOMB_year = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JCOMB_month = new javax.swing.JComboBox<>();
        BGLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Fira Sans Condensed ExtraBold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 48, 71));
        jLabel4.setText("Monthly Report");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        JLBL_year.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        JLBL_year.setForeground(new java.awt.Color(2, 48, 71));
        JLBL_year.setText("2023");

        JLBL_month.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        JLBL_month.setForeground(new java.awt.Color(2, 48, 71));
        JLBL_month.setText("May");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(JLBL_month)
                .addGap(77, 77, 77)
                .addComponent(JLBL_year)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBL_year)
                    .addComponent(JLBL_month))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        TBL_complaincases.setFont(new java.awt.Font("Fira Sans", 1, 14)); // NOI18N
        TBL_complaincases.setShowHorizontalLines(true);
        TBL_complaincases.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TBL_complaincases);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 350, 470));

        TBL_medsandtaken.setFont(new java.awt.Font("Fira Sans", 1, 14)); // NOI18N
        TBL_medsandtaken.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine", "Quantity"
            }
        ));
        TBL_medsandtaken.setShowHorizontalLines(true);
        TBL_medsandtaken.setShowVerticalLines(true);
        jScrollPane2.setViewportView(TBL_medsandtaken);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 330, 470));

        BTN_back.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        BTN_back.setForeground(new java.awt.Color(204, 0, 0));
        BTN_back.setText("Back");
        BTN_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_backActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, 140, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setForeground(new java.awt.Color(2, 48, 71));

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 48, 71));
        jLabel1.setText("Year");

        JCOMB_year.setFont(new java.awt.Font("Fira Sans", 0, 19)); // NOI18N
        JCOMB_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCOMB_yearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 48, 71));
        jLabel2.setText("Month");

        JCOMB_month.setFont(new java.awt.Font("Fira Sans", 0, 19)); // NOI18N
        JCOMB_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCOMB_monthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JCOMB_month, 0, 257, Short.MAX_VALUE)
                        .addComponent(JCOMB_year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCOMB_year, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCOMB_month, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 310, 260));

        BGLBL.setForeground(new java.awt.Color(2, 48, 71));
        BGLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wush.jpg"))); // NOI18N
        getContentPane().add(BGLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_backActionPerformed
        new DashBoard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_backActionPerformed

    private void JCOMB_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCOMB_yearActionPerformed
        String selectedYear = (String) JCOMB_year.getSelectedItem();
        JLBL_year.setText(selectedYear);
        loadTable();
        loadTable1();
    }//GEN-LAST:event_JCOMB_yearActionPerformed

    private void JCOMB_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCOMB_monthActionPerformed
        String selectedmonth = (String) JCOMB_month.getSelectedItem();
        JLBL_month.setText(selectedmonth);
        loadTable();
        loadTable1();
    }//GEN-LAST:event_JCOMB_monthActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        else
        {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void yearJCOMB() {
        String sql = "SELECT DISTINCT year FROM 2_complaintsDB ORDER BY year ASC"; 
        try {
            conn = DriverManager.getConnection(connector, rt, p);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                JCOMB_year.addItem(rs.getString("year"));
            }   
        } catch (SQLException e) {
            System.err.println("SQL Exception " + e.getMessage());
        }
    }

    private void monthJCOMB() {
    String sql = "SELECT DISTINCT month FROM 2_complaintsDB ORDER BY year ASC";
            try {
            conn = DriverManager.getConnection(connector, rt, p);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                JCOMB_month.addItem(rs.getString("month"));
            }   
        } catch (SQLException e) {
            System.err.println("SQL Exception " + e.getMessage());
        }
    }

private void loadTable() {
    tableUI();
    String year = JCOMB_year.getSelectedItem().toString();
    String month = JCOMB_month.getSelectedItem() != null ? JCOMB_month.getSelectedItem().toString() : "";

    if (!year.equals("") && !month.equals("")) {
        String selectedMonth = "";
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
        String[] months = dfs.getMonths();
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(month)) {
                selectedMonth = dfs.getMonths()[i];
                break; 
            }
        }

        String sql = "SELECT Complaint AS 'Remarks', COUNT(student_name) AS 'No. of cases' FROM 2_complaintsDB WHERE `year` = ? AND `month` = ? GROUP BY complaint";
        try (Connection conc = DriverManager.getConnection(connector, rt, p);
             PreparedStatement prp = conc.prepareStatement(sql)) {

            prp.setString(1, year);
            prp.setString(2, selectedMonth);

            try (ResultSet rss = prp.executeQuery()) {
                ResultSetMetaData rsmd = rss.getMetaData();
                DefaultTableModel model = (DefaultTableModel) TBL_complaincases.getModel();
                model.setRowCount(0);
                int cols = rsmd.getColumnCount();
                String[] colName = new String[cols];
                for (int i = 0; i < cols; i++) {
                    colName[i] = rsmd.getColumnName(i + 1);
                }
                model.setColumnIdentifiers(colName);

                String meds, quanti;

                while(rss.next()) {
                    meds = rss.getString("Remarks");
                    quanti = rss.getString("No. of cases");

                    String[] row = {meds, quanti};
                    model.addRow(row);
                }
            } catch (SQLException ex) {
                System.err.println("SQL Exception " + ex.getMessage());
            }
        } catch (SQLException ex) {
            System.err.println("SQL Exception " + ex.getMessage());
            
        }
    }
}

    private void loadTable1() {
        String year = JCOMB_year.getSelectedItem().toString();
        String month = JCOMB_month.getSelectedItem() != null ? JCOMB_month.getSelectedItem().toString() : "";
        table1UI();
        if (!year.equals("") && !month.equals("")) {
            String selectedYear = Integer.toString(Integer.parseInt(year));
            String selectedMonth = "";
            DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
            String[] months = dfs.getMonths();
            for (int i = 0; i < months.length; i++) {
                if (months[i].equals(month)) {
                    selectedMonth = dfs.getMonths()[i];
                    break;
                }
            }

            String sql = "SELECT Medicine AS Medecine, COUNT(Medicine) AS Quantity FROM 3_usedMedecine WHERE year = ? AND month = ? GROUP BY Medicine";

            try (Connection conc = DriverManager.getConnection(connector, rt, p);
                 PreparedStatement prp = conc.prepareStatement(sql)) {

                prp.setString(1, selectedYear);
                prp.setString(2, selectedMonth);

                try (ResultSet rss = prp.executeQuery()) {
                    ResultSetMetaData rsmd = rss.getMetaData();
                    DefaultTableModel model = (DefaultTableModel) TBL_medsandtaken.getModel();
                    model.setRowCount(0);
                    int cols = rsmd.getColumnCount();
                    String[] colName = new String[cols];
                    for (int i = 0; i < cols; i++) {
                        colName[i] = rsmd.getColumnName(i + 1);
                    }
                    model.setColumnIdentifiers(colName);

                    String meds, quanti;

                    while(rss.next()) {

                        meds = rss.getString("Medecine");
                        quanti = rss.getString("Quantity");

                        String[] row = {meds, quanti};
                        model.addRow(row);
                    }
                } catch (SQLException ex) {
                    System.err.println("SQL Exception " + ex.getMessage());
                }
            } catch (SQLException ex) {
                System.err.println("SQL Exception " + ex.getMessage());
            }
        }
    }
public void tableUI(){
            JTableHeader Theader = TBL_complaincases.getTableHeader();
            Theader.setForeground(new Color (37,84,84));
            TBL_complaincases.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
            TBL_complaincases.setBackground(new Color (144, 238, 144)); 
        }
public void table1UI(){
            JTableHeader Theader = TBL_medsandtaken.getTableHeader();
            Theader.setForeground(new Color (37,84,84));
            TBL_medsandtaken.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
            TBL_medsandtaken.setBackground(new Color (144, 238, 144)); 
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
            java.util.logging.Logger.getLogger(MonthlyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlyReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlyReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLBL;
    private javax.swing.JButton BTN_back;
    private javax.swing.JComboBox<String> JCOMB_month;
    private javax.swing.JComboBox<String> JCOMB_year;
    private javax.swing.JLabel JLBL_month;
    private javax.swing.JLabel JLBL_year;
    private javax.swing.JTable TBL_complaincases;
    private javax.swing.JTable TBL_medsandtaken;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

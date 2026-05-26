
package clinicinventory;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class addCrsGrdSec extends javax.swing.JFrame {
    
    String connector =  "jdbc:mysql://localhost:3306/clinicsystem";
    String rt = "root";
    String p = "";

    
    Connection conn;
    PreparedStatement pst;//to execute parametized sql statement
    ResultSet rs;//to retrieve and process the data returned by sql select statement
  
    public addCrsGrdSec() {
        initComponents();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TXT_crsyrsec = new javax.swing.JTextField();
        BTN_adddata = new javax.swing.JButton();
        BTN_remove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_addCrs = new javax.swing.JTable();
        BTN_back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Fira Sans ExtraBold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 48, 71));
        jLabel2.setText("Courses");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 110));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 48, 71));
        jLabel1.setText("Course /Year or Grade/ Section");

        TXT_crsyrsec.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_crsyrsec.setForeground(new java.awt.Color(153, 153, 153));
        TXT_crsyrsec.setText("course /year or grade/ section");
        TXT_crsyrsec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_crsyrsecFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_crsyrsecFocusLost(evt);
            }
        });

        BTN_adddata.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        BTN_adddata.setForeground(new java.awt.Color(2, 48, 71));
        BTN_adddata.setText("Add");
        BTN_adddata.setToolTipText("");
        BTN_adddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_adddataActionPerformed(evt);
            }
        });

        BTN_remove.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        BTN_remove.setForeground(new java.awt.Color(2, 48, 71));
        BTN_remove.setText("Remove");
        BTN_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_adddata, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(BTN_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(TXT_crsyrsec, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TXT_crsyrsec, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_adddata, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(BTN_remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 452, 250));

        TBL_addCrs.setFont(new java.awt.Font("Fira Sans", 1, 14)); // NOI18N
        TBL_addCrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Course/Yr or Grade/Section"
            }
        ));
        TBL_addCrs.setAlignmentX(2.0F);
        TBL_addCrs.setAlignmentY(2.0F);
        TBL_addCrs.setGridColor(new java.awt.Color(37, 84, 84));
        TBL_addCrs.setShowHorizontalLines(true);
        TBL_addCrs.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TBL_addCrs);
        if (TBL_addCrs.getColumnModel().getColumnCount() > 0) {
            TBL_addCrs.getColumnModel().getColumn(0).setHeaderValue("ID");
            TBL_addCrs.getColumnModel().getColumn(1).setHeaderValue("Course/Yr or Grade/Section");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 630, 580));

        BTN_back.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        BTN_back.setForeground(new java.awt.Color(204, 0, 0));
        BTN_back.setText("Back");
        BTN_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_backActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 630, 110, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wush.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_adddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_adddataActionPerformed
    String crsyrsec = TXT_crsyrsec.getText();
    String query = "INSERT INTO 5_CrsGrdSec (course) VALUES (?)";
    
        try 
        {
            conn = DriverManager.getConnection(connector,rt,p);
            pst = conn.prepareStatement(query);
            pst.setString(1, crsyrsec);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Recorded");
            loadTable();
        }
        
        catch (HeadlessException | SQLException e) 
        {
            System.err.println("SQL Exception " + e.getMessage());
        }

    }//GEN-LAST:event_BTN_adddataActionPerformed

    private void BTN_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_removeActionPerformed
    DefaultTableModel model = (DefaultTableModel)TBL_addCrs.getModel();
    int selectedRow = TBL_addCrs.getSelectedRow();

    if (selectedRow >= 0) {
        // Get the course ID from the selected row
        int courseId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

        // Delete the course from the database using a SQL DELETE statement
        try {
            conn = DriverManager.getConnection(connector,rt,p);
            String sql = "DELETE FROM 5_CrsGrdSec WHERE ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, courseId);
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                // Remove the row from the table model
            if(JOptionPane.showConfirmDialog(null, "Are your sure you want to delete this record ?", "Please Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Data Deleted");
                loadTable();
            }
            
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Delete");
            }

            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to Delete");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please Select a Row to Delete");
    }

    }//GEN-LAST:event_BTN_removeActionPerformed

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

    private void TXT_crsyrsecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_crsyrsecFocusGained
        if(TXT_crsyrsec.getText().equals("course /year or grade/ section"))
        {
            TXT_crsyrsec.setText("");
            TXT_crsyrsec.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TXT_crsyrsecFocusGained

    private void TXT_crsyrsecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_crsyrsecFocusLost
        if(TXT_crsyrsec.getText().equals(""))
        {
           TXT_crsyrsec.setText("course /year or grade/ section");
           TXT_crsyrsec.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TXT_crsyrsecFocusLost

    private void BTN_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_backActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_BTN_backActionPerformed

    
    
    private void loadTable()
    {
        try 
        {
            conn = DriverManager.getConnection(connector, rt, p);
            
            try (Statement st = conn.createStatement()) {
                String sql = "select * from 5_CrsGrdSec";
                rs = st.executeQuery(sql);
                ResultSetMetaData rsmd = rs.getMetaData();
                DefaultTableModel model = (DefaultTableModel)TBL_addCrs.getModel();
                model.setRowCount(0);
                int cols = rsmd.getColumnCount();
                String[] colName = new String[cols];
                for(int i = 0; i < cols; i ++)
                {
                    colName[i] = rsmd.getColumnName(i + 1);
                }   model.setColumnIdentifiers(colName);
                String id,crsgradesec;
                while(rs.next())
                {
                    id = rs.getString(1);
                    crsgradesec = rs.getString(2);

                    
                    String[] row = {id,crsgradesec};
                    model.addRow(row);
                }
            }
            conn.close();
            tableUI();
        } 
        
        catch (SQLException ex) 
        {
            System.err.println("SQL Exception " + ex.getMessage());
        }       
    }
    
    public void tableUI(){
            JTableHeader Theader = TBL_addCrs.getTableHeader();
            Theader.setForeground(new Color (37,84,84));
            TBL_addCrs.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
            TBL_addCrs.setBackground(new Color (144, 238, 144)); 
        }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addCrsGrdSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCrsGrdSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCrsGrdSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCrsGrdSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCrsGrdSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_adddata;
    private javax.swing.JButton BTN_back;
    private javax.swing.JButton BTN_remove;
    private javax.swing.JTable TBL_addCrs;
    private javax.swing.JTextField TXT_crsyrsec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

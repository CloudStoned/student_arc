
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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;



public class PatientTracker extends javax.swing.JFrame {
    String connector =  "jdbc:mysql://localhost:3306/clinicsystem";
    String rt = "root";
    String p = "";
    
    Connection conn;
    PreparedStatement pst;//to execute parametized sql statement
    ResultSet rs;//to retrieve and process the data returned by sql select statement
    

    public PatientTracker() {
        initComponents();
        loadTable();
 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_data = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TXT_name = new javax.swing.JTextField();
        BGLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBL_data.setFont(new java.awt.Font("Fira Sans", 1, 14)); // NOI18N
        TBL_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student ID", "Grade/Course"
            }
        ));
        TBL_data.setToolTipText("");
        TBL_data.setGridColor(new java.awt.Color(37, 84, 84));
        TBL_data.setShowGrid(true);
        TBL_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBL_data);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 564, -1));

        jButton1.setFont(new java.awt.Font("Fira Sans", 1, 19)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 620, 130, 50));

        jLabel3.setFont(new java.awt.Font("Fira Sans Condensed ExtraBold", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 48, 71));
        jLabel3.setText("Patient Tracker");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 48, 71));
        jLabel1.setText("Enter Student ID");

        TXT_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_nameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TXT_name, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TXT_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 370, 270));

        BGLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wush.jpg"))); // NOI18N
        BGLBL.setText("jLabel2");
        getContentPane().add(BGLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1430, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DashBoard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TXT_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_nameKeyReleased
        String searchString = TXT_name.getText();
        search(searchString);
    }//GEN-LAST:event_TXT_nameKeyReleased

    private void TBL_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_dataMouseClicked
        if(evt.getClickCount() == 1)
        {
            int selectedRow = TBL_data.getSelectedRow();
            if(selectedRow != -1)
            {
                String studentID = (String) TBL_data.getValueAt(selectedRow, 0);
                showStudentDetails(studentID);
            }
        }
    }//GEN-LAST:event_TBL_dataMouseClicked

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
    
    public void search(String str)
    {
        DefaultTableModel model = (DefaultTableModel)TBL_data.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        TBL_data.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    private void loadTable()
    {
        try 
        {
            conn = DriverManager.getConnection(connector, rt, p);
            
            try (Statement st = conn.createStatement()) {
                String sql = "select Student_ID,Last_Name, Class from 1_LogStudents";
                rs = st.executeQuery(sql);
                ResultSetMetaData rsmd = rs.getMetaData();
                DefaultTableModel model = (DefaultTableModel)TBL_data.getModel();
                model.setRowCount(0);
                int cols = rsmd.getColumnCount();
                String[] colName = new String[cols];
                for(int i = 0; i < cols; i ++)
                {
                    colName[i] = rsmd.getColumnName(i + 1);
                }   
                model.setColumnIdentifiers(colName);
                
                String sid,lname,yrsec;
                while(rs.next())
                {
                    sid = rs.getString(1);
                    lname = rs.getString(2);
                    yrsec = rs.getString(3);
                    
                  
                    String[] row = {sid,lname, yrsec};
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
    
    private void showStudentDetails(String studentID) {
        String sql = "SELECT * FROM 1_LogStudents WHERE Student_ID = ?";

        try {
            
            conn = DriverManager.getConnection(connector, rt, p);
            pst = conn.prepareStatement(sql);
            pst.setString(1, studentID);

            rs = pst.executeQuery();
            if (rs.next()) {
                String firstName = rs.getString("First_Name");
                String middleInitial = rs.getString("Middle_Initial");
                String lastName = rs.getString("Last_Name");
                String yearCourse = rs.getString("Class");
                String complaints = rs.getString("Complaint");

                StringBuilder messageBuilder = new StringBuilder();
                messageBuilder.append("Student ID: ").append(studentID).append("\n");
                messageBuilder.append("First Name: ").append(firstName).append("\n");
                messageBuilder.append("Middle Initial: ").append(middleInitial).append("\n");
                messageBuilder.append("Last Name: ").append(lastName).append("\n");
                messageBuilder.append("Year Course: ").append(yearCourse).append("\n");
                messageBuilder.append("Complaints: ").append(complaints).append("\n");

                // Show pop-up form
                JOptionPane.showMessageDialog(null, messageBuilder.toString(), "Student Details", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources (result set, statement, and connection) in the finally block
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void tableUI(){
            JTableHeader Theader = TBL_data.getTableHeader();
            Theader.setForeground(new Color (37,84,84));
            TBL_data.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
            TBL_data.setBackground(new Color (144, 238, 144)); 
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
            java.util.logging.Logger.getLogger(PatientTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLBL;
    private javax.swing.JTable TBL_data;
    private javax.swing.JTextField TXT_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

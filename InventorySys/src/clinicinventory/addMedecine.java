
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class addMedecine extends javax.swing.JFrame {
    
    String connector =  "jdbc:mysql://localhost:3306/clinicsystem";
    String rt = "root";
    String p = "";
    
    Connection conn;
    PreparedStatement pst;//to execute parametized sql statement
    ResultSet rs;//to retrieve and process the data returned by sql select statement

    public addMedecine() {
        initComponents();
        loadTable();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_data = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BTN_enter = new javax.swing.JButton();
        DATETODAY = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        TXT_quantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TXT_med = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTN_remove = new javax.swing.JButton();
        BTN_update = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LBLBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBL_data.setFont(new java.awt.Font("Fira Sans", 1, 17)); // NOI18N
        TBL_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Medecine", "Quantity", "Date Added"
            }
        ));
        TBL_data.setAlignmentX(1.0F);
        TBL_data.setAlignmentY(1.0F);
        TBL_data.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TBL_data.setGridColor(new java.awt.Color(37, 84, 84));
        TBL_data.setShowHorizontalLines(true);
        TBL_data.setShowVerticalLines(true);
        TBL_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBL_data);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 570, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        BTN_enter.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        BTN_enter.setForeground(new java.awt.Color(2, 48, 71));
        BTN_enter.setText("Enter");
        BTN_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_enterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 48, 71));
        jLabel3.setText("Date Today");

        TXT_quantity.setFont(new java.awt.Font("Fira Sans", 0, 19)); // NOI18N
        TXT_quantity.setForeground(new java.awt.Color(153, 153, 153));
        TXT_quantity.setText("Quantity");
        TXT_quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_quantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_quantityFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 84, 84));
        jLabel1.setText("Quantity to add");

        TXT_med.setFont(new java.awt.Font("Fira Sans", 0, 19)); // NOI18N
        TXT_med.setForeground(new java.awt.Color(153, 153, 153));
        TXT_med.setText("Medicine");
        TXT_med.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_medFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_medFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 84, 84));
        jLabel2.setText("Type of Medicine");

        BTN_remove.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        BTN_remove.setForeground(new java.awt.Color(2, 48, 71));
        BTN_remove.setText("Remove");
        BTN_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_removeActionPerformed(evt);
            }
        });

        BTN_update.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        BTN_update.setForeground(new java.awt.Color(2, 48, 71));
        BTN_update.setText("Update");
        BTN_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_quantity)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DATETODAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXT_med)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BTN_update, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(BTN_remove, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(BTN_enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_med, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXT_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DATETODAY, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(BTN_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_update, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 330, 490));

        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(247, 0, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 620, 95, 37));

        jLabel4.setFont(new java.awt.Font("Fira Sans Condensed ExtraBold", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 48, 71));
        jLabel4.setText("Add Medicine");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        LBLBG.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        LBLBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wush.jpg"))); // NOI18N
        LBLBG.setText("jLabel5");
        getContentPane().add(LBLBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_enterActionPerformed
        String med = TXT_med.getText();
        String quant = TXT_quantity.getText();
        String selectdate = ((JTextField)DATETODAY.getDateEditor().getUiComponent()).getText();
        
        //Validation
        if(TXT_med.getText().isBlank())
        {
           JOptionPane.showMessageDialog(this, "Invalid Please Enter Medecine Name...");
        } 
        
        try 
        {
            conn = DriverManager.getConnection(connector, rt, p);

            // Check if medicine already exists in the database
            String checkMedicineQuery = "SELECT Quantity FROM 4_availableMedecine WHERE medecine = ?";
            PreparedStatement checkMedicineStmt = conn.prepareStatement(checkMedicineQuery);
            checkMedicineStmt.setString(1, med);
            rs = checkMedicineStmt.executeQuery();

            int currentQuantity = 0;
            
            if (rs.next()) 
            {
                currentQuantity = rs.getInt("Quantity");
            }

            // If medicine already exists, update its quantity in the database
            if (currentQuantity > 0) 
            {
                int newQuantity = currentQuantity + Integer.parseInt(quant);
                String updateMedicineQuery = "UPDATE 4_availableMedecine SET Quantity = ? WHERE medecine = ?";
                PreparedStatement updateMedicineStmt = conn.prepareStatement(updateMedicineQuery);
                updateMedicineStmt.setInt(1, newQuantity);
                updateMedicineStmt.setString(2, med);
                updateMedicineStmt.executeUpdate();
                JOptionPane.showMessageDialog(null, quant + " " + med + " added to the database. Total quantity is now " + newQuantity +  " \n" + " \t\t" + selectdate);
            }
            
            else 
            {
                String insertq = "INSERT INTO 4_availableMedecine(medecine, Quantity, Date_Added) VALUES (?, ?, ?)";
                // If medicine does not exist, add it to the database with the specified quantity
                pst = conn.prepareStatement(insertq,Statement.RETURN_GENERATED_KEYS);
                pst.setString(1, med);
                pst.setString(2, quant);
                pst.setString(3, selectdate);                
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, quant + " " + med + " added to the database.");
            }
            clearFields();
            loadTable();
            conn.close();
        } 
        catch (SQLException ex) 
        {
            System.err.println("SQL Exception " + ex.getMessage());
        }
            
    }//GEN-LAST:event_BTN_enterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new DashBoard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BTN_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_removeActionPerformed
     DefaultTableModel model = (DefaultTableModel)TBL_data.getModel();
    int selectedRow = TBL_data.getSelectedRow();

    if (selectedRow >= 0) {
        // Get the course ID from the selected row
        int courseId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

        // Delete the course from the database using a SQL DELETE statement
        try {
            conn = DriverManager.getConnection(connector,rt,p);
            String sql = "DELETE FROM 4_availableMedecine WHERE ID = ?";
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

    private void BTN_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_updateActionPerformed
        DefaultTableModel model = (DefaultTableModel)TBL_data.getModel();
        
        if(TBL_data.getSelectedRowCount() == 1)
        {
            String medname = TXT_med.getText();
            String quantt = TXT_quantity.getText();
            if(JOptionPane.showConfirmDialog(null, "Are your sure you want to update this record ?", "Please Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                //set update row
                model.setValueAt(medname, TBL_data.getSelectedRow(), 1);
                model.setValueAt(quantt, TBL_data.getSelectedRow(), 2);

                JOptionPane.showMessageDialog(this, "Updated Successfully");
            }
        }
        
        else
        {
            if(TBL_data.getRowCount() == 0)
            {
                JOptionPane.showMessageDialog(this, "Table is Empty");
            }
            
            else
            {
                JOptionPane.showMessageDialog(this, "Please Select a Single Row For Update");
            }
        }
    }//GEN-LAST:event_BTN_updateActionPerformed

    private void TBL_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_dataMouseClicked
        DefaultTableModel model = (DefaultTableModel)TBL_data.getModel();
        
        String tblmed = model.getValueAt(TBL_data.getSelectedRow(), 1).toString();
        String tblquant = model.getValueAt(TBL_data.getSelectedRow(), 2).toString();
        
        TXT_med.setText(tblmed);
        TXT_quantity.setText(tblquant);
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

    private void TXT_medFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_medFocusGained
        if(TXT_med.getText().equals("Medicine"))
                {
                    TXT_med.setText("");
                    TXT_med.setForeground(new Color(0,0,0));
                }
    }//GEN-LAST:event_TXT_medFocusGained

    private void TXT_medFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_medFocusLost
        if(TXT_med.getText().equals(""))
        {
            TXT_med.setText("Medicine");
            TXT_med.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TXT_medFocusLost

    private void TXT_quantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_quantityFocusGained
        if(TXT_quantity.getText().equals("Quantity"))
                {
                    TXT_quantity.setText("");
                    TXT_quantity.setForeground(new Color(0,0,0));
                }
    }//GEN-LAST:event_TXT_quantityFocusGained

    private void TXT_quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_quantityFocusLost
        if(TXT_quantity.getText().equals(""))
                {
                    TXT_quantity.setText("Quantity");
                    TXT_quantity.setForeground(new Color(153,153,153));
                }
    }//GEN-LAST:event_TXT_quantityFocusLost

    
    
    
    
    
    
    
    
    
    
    
    
    
    private void loadTable()
    {
        try 
        {
            conn = DriverManager.getConnection(connector, rt, p);
            
            try (Statement st = conn.createStatement()) {
                String sql = "select * from 4_availableMedecine";
                rs = st.executeQuery(sql);
                ResultSetMetaData rsmd = rs.getMetaData();
                DefaultTableModel model = (DefaultTableModel)TBL_data.getModel();
                model.setRowCount(0);
                int cols = rsmd.getColumnCount();
                String[] colName = new String[cols];
                for(int i = 0; i < cols; i ++)
                {
                    colName[i] = rsmd.getColumnName(i + 1);
                }   model.setColumnIdentifiers(colName);
                
                String id,medecine,quantity,Date;
                while(rs.next())
                {
                    id = rs.getString(1);
                    medecine = rs.getString(2);
                    quantity = rs.getString(3);
                    Date = rs.getString(4);
                    
                    String[] row = {id,medecine,quantity,Date};
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
            java.util.logging.Logger.getLogger(addMedecine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMedecine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMedecine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMedecine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addMedecine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_enter;
    private javax.swing.JButton BTN_remove;
    private javax.swing.JButton BTN_update;
    private com.toedter.calendar.JDateChooser DATETODAY;
    private javax.swing.JLabel LBLBG;
    private javax.swing.JTable TBL_data;
    private javax.swing.JTextField TXT_med;
    private javax.swing.JTextField TXT_quantity;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        TXT_med.setText("");
        TXT_quantity.setText("");
        
        
    }
}


package clinicinventory;

import clinicinventory.DashBoard;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.sql.*;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.JTableHeader;


public class Log extends javax.swing.JFrame {

    String connector = "jdbc:mysql://localhost:3306/clinicsystem";
    String rt = "root";
    String p = "";
    Connection conn;
    PreparedStatement pst;//to execute parametized sql statement
    ResultSet rs;//to retrieve and process the data returned by sql select statement
    private String fname;
    private String mname;
    private String lname;
    private String student_id;
    private String yrsec;
    private String med;
    
    public Log() {
        
        initComponents();
        medecineComboBox();
        crssecgrdComboBox();
        loadTable();
        AutoCompleteDecorator.decorate(JCOMB_crsgradesec);
        CHCKB_others.setSelected(true);
        

    }
    
    
    public Log(JTextField TXT_fname, JTextField TXT_mname, JTextField TXT_lname, JTextField TXT_sid)
    {
        this.fname = TXT_fname.getText();
        this.mname = TXT_mname.getText();
        this.lname = TXT_lname.getText();
        this.student_id = TXT_sid.getText();
    }
    
    public Log(JComboBox JCOMB_yeargrade, JComboBox JCOMB_med)
    {
        this.yrsec = JCOMB_yeargrade.getSelectedItem().toString();
        this.med = JCOMB_med.getSelectedItem().toString();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_complaint = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BTN_Enter = new javax.swing.JButton();
        JCOMB_crsgradesec = new javax.swing.JComboBox<>();
        DATECHOOSER = new com.toedter.calendar.JDateChooser();
        JCOMB_medecine = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_datatable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TXT_fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TXT_mname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXT_lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TXT_sid = new javax.swing.JTextField();
        CHCKB_flu = new javax.swing.JCheckBox();
        CHCKB_headache = new javax.swing.JCheckBox();
        CHCKB_tummyache = new javax.swing.JCheckBox();
        CHCKB_others = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 84, 84));
        jLabel1.setText("Course/Yr or Grade /Sec");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 320, 34));

        jLabel2.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 84, 84));
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 230, 28));

        TXT_complaint.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_complaint.setForeground(new java.awt.Color(153, 153, 153));
        TXT_complaint.setText("Type complaint...");
        TXT_complaint.setToolTipText("");
        TXT_complaint.setNextFocusableComponent(JCOMB_medecine);
        TXT_complaint.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_complaintFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_complaintFocusLost(evt);
            }
        });
        getContentPane().add(TXT_complaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 230, 40));

        jLabel4.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 84, 84));
        jLabel4.setText("Date Today");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 230, 38));

        jLabel5.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 84, 84));
        jLabel5.setText("Medicine");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 230, 34));

        BTN_Enter.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        BTN_Enter.setForeground(new java.awt.Color(2, 48, 71));
        BTN_Enter.setText("Enter");
        BTN_Enter.setNextFocusableComponent(TBL_datatable);
        BTN_Enter.setRequestFocusEnabled(false);
        BTN_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EnterActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 620, 97, 37));

        JCOMB_crsgradesec.setEditable(true);
        JCOMB_crsgradesec.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        JCOMB_crsgradesec.setForeground(new java.awt.Color(2, 48, 71));
        JCOMB_crsgradesec.setToolTipText("");
        JCOMB_crsgradesec.setBorder(null);
        JCOMB_crsgradesec.setNextFocusableComponent(TXT_complaint);
        getContentPane().add(JCOMB_crsgradesec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 230, 40));

        DATECHOOSER.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DATECHOOSER.setForeground(new java.awt.Color(2, 48, 71));
        DATECHOOSER.setToolTipText("");
        DATECHOOSER.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        DATECHOOSER.setNextFocusableComponent(BTN_Enter);
        getContentPane().add(DATECHOOSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 230, 40));

        JCOMB_medecine.setEditable(true);
        JCOMB_medecine.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        JCOMB_medecine.setForeground(new java.awt.Color(2, 48, 71));
        JCOMB_medecine.setToolTipText("");
        JCOMB_medecine.setBorder(null);
        JCOMB_medecine.setNextFocusableComponent(DATECHOOSER);
        Color color1 = new Color(2, 48, 71);
        int thickness1 = 1;
        int crad = 10;

        JCOMB_crsgradesec.setBorder(new LineBorder(color1,thickness1,true));
        JCOMB_medecine.setBorder(new LineBorder(color1,thickness1,true));
        JCOMB_crsgradesec.setPreferredSize(new Dimension(200, 30));
        JCOMB_medecine.setPreferredSize(new Dimension(200, 30));
        getContentPane().add(JCOMB_medecine, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 230, 40));

        TBL_datatable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        TBL_datatable.setFont(new java.awt.Font("Fira Sans", 1, 14)); // NOI18N
        TBL_datatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student I.D", "First Name", "Middle Initial", "Last Name", "Medicine", "Date"
            }
        ));
        TBL_datatable.setToolTipText("");
        TBL_datatable.setAlignmentX(2.0F);
        TBL_datatable.setAlignmentY(2.0F);
        TBL_datatable.setGridColor(new java.awt.Color(37, 84, 84));
        TBL_datatable.setName(""); // NOI18N
        TBL_datatable.setRowHeight(25);
        TBL_datatable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TBL_datatable.setShowGrid(true);
        jScrollPane1.setViewportView(TBL_datatable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 660, 480));

        jLabel7.setFont(new java.awt.Font("Fira Sans Condensed ExtraBold", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 48, 71));
        jLabel7.setText("Daily Log");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        TXT_fname.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_fname.setForeground(new java.awt.Color(153, 153, 153));
        TXT_fname.setText("First Name");
        TXT_fname.setToolTipText("");
        TXT_fname.setBorder(null);
        TXT_fname.setNextFocusableComponent(TXT_mname);
        TXT_fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_fnameFocusLost(evt);
            }
        });
        getContentPane().add(TXT_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 230, 40));

        jLabel3.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 84, 84));
        jLabel3.setText("Complaint");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 230, 34));

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Back");
        jButton1.setAlignmentX(5.0F);
        jButton1.setAlignmentY(5.0F);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 95, 37));

        jLabel8.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 84, 84));
        jLabel8.setText("Middle Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 230, 28));

        TXT_mname.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_mname.setForeground(new java.awt.Color(153, 153, 153));
        TXT_mname.setText("M.I.");
        TXT_mname.setToolTipText("");
        TXT_mname.setBorder(null);
        TXT_mname.setNextFocusableComponent(TXT_lname);
        TXT_mname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_mnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_mnameFocusLost(evt);
            }
        });
        getContentPane().add(TXT_mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 140, 40));

        jLabel9.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 84, 84));
        jLabel9.setText("Last Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 230, 28));

        TXT_lname.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_lname.setForeground(new java.awt.Color(153, 153, 153));
        TXT_lname.setText("Last Name");
        TXT_lname.setToolTipText("");
        TXT_lname.setBorder(null);
        TXT_lname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXT_lname.setNextFocusableComponent(TXT_sid);
        TXT_lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_lnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_lnameFocusLost(evt);
            }
        });
        getContentPane().add(TXT_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 230, 40));

        jLabel10.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(37, 84, 84));
        jLabel10.setText("Student ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 230, 28));

        TXT_sid.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        TXT_sid.setForeground(new java.awt.Color(153, 153, 153));
        TXT_sid.setText("Student ID");
        TXT_sid.setToolTipText("");
        TXT_sid.setBorder(null);
        TXT_sid.setNextFocusableComponent(JCOMB_crsgradesec);
        TXT_sid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_sidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_sidFocusLost(evt);
            }
        });
        getContentPane().add(TXT_sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 230, 40));

        buttonGroup3.add(CHCKB_flu);
        CHCKB_flu.setText("Flu");
        getContentPane().add(CHCKB_flu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        buttonGroup3.add(CHCKB_headache);
        CHCKB_headache.setText("Headache");
        getContentPane().add(CHCKB_headache, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        buttonGroup3.add(CHCKB_tummyache);
        CHCKB_tummyache.setText("Tummyache");
        getContentPane().add(CHCKB_tummyache, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        buttonGroup3.add(CHCKB_others);
        CHCKB_others.setText("Others..");
        CHCKB_others.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CHCKB_othersItemStateChanged(evt);
            }
        });
        getContentPane().add(CHCKB_others, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DashBoard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTN_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EnterActionPerformed

        try 
        {
            String selectdate = ((JTextField)DATECHOOSER.getDateEditor().getUiComponent()).getText();
            String[] yearAndMonth = getYearAndMonth(DATECHOOSER);
            int year = Integer.parseInt(yearAndMonth[0]);
            String monthName = yearAndMonth[1];

            // Validation
             if(TXT_fname.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Invalid Please Enter Your Name...");
            } 

            else 
            {
                  try 
                  {
                        Log log = new Log(TXT_fname,TXT_mname,TXT_lname,TXT_sid);
                        Log log1 = new Log(JCOMB_crsgradesec,JCOMB_medecine);
                        conn = DriverManager.getConnection(connector, rt, p);
                            // For inserting data into the table LogStudents
                            pst = conn.prepareStatement("INSERT INTO 1_LogStudents(First_Name, Middle_Initial, Last_Name, Student_ID, Class, complaint, Medicine, Date, year, month) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                            pst.setString(1, log.fname);
                            pst.setString(2, log.mname);
                            pst.setString(3, log.lname);
                            pst.setString(4, log.student_id);
                            pst.setString(5, log1.yrsec);
                            pst.setString(6, getComplaint());
                            pst.setString(7, log1.med);
                            pst.setString(8, selectdate);
                            pst.setInt(9, year);
                            pst.setString(10, monthName);
                            pst.executeUpdate();

                            // Insert into Complaints table
                            PreparedStatement pst2 = conn.prepareStatement("INSERT INTO 2_complaintsDB(student_name, Complaint, Date, year, month) VALUES (?, ?, ?, ?, ?)");
                            pst2.setString(1, log.lname);
                            pst2.setString(2, getComplaint());
                            pst2.setString(3, selectdate);
                            pst2.setInt(4, year);
                            pst2.setString(5, monthName);
                            pst2.executeUpdate();

                            // Insert into 3_usedmedecine Table
                            PreparedStatement pst3 = conn.prepareStatement("INSERT INTO 3_usedMedecine (Medicine,Date,year,month) VALUES (?, ?, ?, ?)");
                            pst3.setString(1, log1.med);
                            pst3.setString(2, selectdate);
                            pst3.setInt(3, year);
                            pst3.setString(4, monthName);
                            pst3.executeUpdate();

                            // Update 4_availablemedecine table everytime may kukuha ng gamot mababawasan yung quantity
                            PreparedStatement pst4 = conn.prepareStatement("UPDATE 4_availableMedecine SET quantity = quantity - 1 WHERE Medicine = ?");
                            pst4.setString(1, log1.med);
                            pst4.executeUpdate();
                            
                            if(JOptionPane.showConfirmDialog(null, "Are you sure about your details ?", "Please Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog(null, "Data Recorded");
                                clearFields();
                                loadTable();
                                conn.close();      
                            }
                }
                  
                catch (SQLException ex) 
                {
                    System.err.println("SQL Exception " + ex.getMessage());
                }
            }
        
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid date format: " + ex.getMessage());
    }

    }//GEN-LAST:event_BTN_EnterActionPerformed

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

    private void CHCKB_othersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CHCKB_othersItemStateChanged
    if (evt.getSource() == CHCKB_others) {
        if (CHCKB_others.isSelected()) {
            TXT_complaint.setVisible(true);
        } else {
            TXT_complaint.setVisible(false);
        }
    }
    }//GEN-LAST:event_CHCKB_othersItemStateChanged

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

    private void TXT_sidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_sidFocusGained
        if(TXT_sid.getText().equals("Student ID"))
        {
            TXT_sid.setText("");
            TXT_sid.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TXT_sidFocusGained

    private void TXT_sidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_sidFocusLost
        if(TXT_sid.getText().equals(""))
        {
            TXT_sid.setText("Student ID");
            TXT_sid.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TXT_sidFocusLost

    private void TXT_mnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_mnameFocusGained
        if(TXT_mname.getText().equals("M.I."))
        {
          TXT_mname.setText("");
          TXT_mname.setForeground(new Color(0,0,0));
          
        }
    }//GEN-LAST:event_TXT_mnameFocusGained

    private void TXT_mnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_mnameFocusLost
        if(TXT_mname.getText().equals(""))
        {
           TXT_mname.setText("M.I.");
           TXT_mname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TXT_mnameFocusLost

    private void TXT_complaintFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_complaintFocusGained
        if(TXT_complaint.getText().equals("Type complaint..."))
        {
           TXT_complaint.setText("");
           TXT_complaint.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_TXT_complaintFocusGained

    private void TXT_complaintFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_complaintFocusLost
        if(TXT_complaint.getText().equals(""))
        {
            TXT_complaint.setText("Type complaint...");
            TXT_complaint.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TXT_complaintFocusLost

    private void TXT_fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_fnameFocusLost
        if(TXT_fname.getText().equals(""))
        {
            TXT_fname.setText("First Name");
            TXT_fname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TXT_fnameFocusLost

    private void TXT_fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_fnameFocusGained
        if(TXT_fname.getText().equals("First Name"))
        {
            TXT_fname.setText("");
            TXT_fname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TXT_fnameFocusGained
       
    private void loadTable()
    {
        try 
        {
            conn = DriverManager.getConnection(connector, rt, p);
            
            try (Statement st = conn.createStatement()) {
                String sql = "select Student_ID, First_Name, Middle_Initial, Last_Name, Class, Date from 1_LogStudents";
                rs = st.executeQuery(sql);
                ResultSetMetaData rsmd = rs.getMetaData();
                DefaultTableModel model = (DefaultTableModel)TBL_datatable.getModel();
                model.setRowCount(0);
                int cols = rsmd.getColumnCount();
                String[] colName = new String[cols];
                for(int i = 0; i < cols; i ++)
                {
                    colName[i] = rsmd.getColumnName(i + 1);
                }   
                model.setColumnIdentifiers(colName);
                
                String fname,mname,lname,sid,yrsec,date;
                while(rs.next())
                {
                    sid = rs.getString(1);
                    fname = rs.getString(2);
                    mname = rs.getString(3);
                    lname = rs.getString(4);
                    yrsec = rs.getString(5);
                    date = rs.getString(6);
                    
                    
                    String[] row = {sid,fname,mname,lname,yrsec,date};
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
    
    private void medecineComboBox()
    {
        // Para hindi sobrang daming gamot yung madedesplay sa combo box kaya siya distinct
        // Pag wala ng gamot mageeror na pawala na gamot??
        String sql = "SELECT DISTINCT Medicine FROM 4_availableMedecine"; 
        try 
        {
            conn = DriverManager.getConnection(connector, rt, p);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                JCOMB_medecine.addItem(rs.getString("Medicine"));
            }
            
        }
        catch (SQLException e) 
        {
            System.err.println("SQL Exception " + e.getMessage());
        }
    }
    
    private void crssecgrdComboBox()
    {
        // Para hindi sobrang daming gamot yung madedesplay sa combo box kaya siya distinct
        // Pag wala ng gamot mageeror na pawala na gamot??
        String sql = "SELECT *  FROM 5_CrsGrdSec"; 
        try 
        {
            conn = DriverManager.getConnection(connector, rt, p);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                JCOMB_crsgradesec.addItem(rs.getString("course"));
            }
            
        }
        catch (SQLException e) 
        {
            System.err.println("SQL Exception " + e.getMessage());
        }
    }
    
    public static String[] getYearAndMonth(JDateChooser dateChooser) throws ParseException {
    // Extract the date value from the JDateChooser
    String selectdate = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    
    // Extract the year and month values from the selected date using a Calendar object
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
    java.util.Date parsedDate = dateFormat.parse(selectdate);
    calendar.setTime(parsedDate);
    int year = calendar.get(Calendar.YEAR);
    String monthName = new DateFormatSymbols(Locale.ENGLISH).getMonths()[calendar.get(Calendar.MONTH)];

    // Create a string array to hold the year and month name, and return it
    String[] yearAndMonth = { Integer.toString(year), monthName };
    return yearAndMonth;
}

  
    public void tableUI(){
            JTableHeader Theader = TBL_datatable.getTableHeader();
            Theader.setForeground(new Color (37,84,84));
            TBL_datatable.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
            TBL_datatable.setBackground(new Color (144, 238, 144)); 
        }
    
    private String getComplaint() {
        String complaint = "";
        
        if (CHCKB_headache.isSelected()) 
        {
            complaint = "Headache";
        } 
        else if (CHCKB_tummyache.isSelected()) 
        {
            complaint = "Tummyache";
        } 
        else if (CHCKB_others.isSelected()) 
        {
            complaint = TXT_complaint.getText();
        }
        else if(CHCKB_flu.isSelected())
        {
            complaint = "Flu";
        }
        return complaint;
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
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Enter;
    private javax.swing.JCheckBox CHCKB_flu;
    private javax.swing.JCheckBox CHCKB_headache;
    private javax.swing.JCheckBox CHCKB_others;
    private javax.swing.JCheckBox CHCKB_tummyache;
    public static com.toedter.calendar.JDateChooser DATECHOOSER;
    private javax.swing.JComboBox<String> JCOMB_crsgradesec;
    private javax.swing.JComboBox<String> JCOMB_medecine;
    private javax.swing.JTable TBL_datatable;
    public static javax.swing.JTextField TXT_complaint;
    public static javax.swing.JTextField TXT_fname;
    public static javax.swing.JTextField TXT_lname;
    public static javax.swing.JTextField TXT_mname;
    public static javax.swing.JTextField TXT_sid;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        TXT_lname.setText("");
        TXT_fname.setText("");
        TXT_mname.setText("");
        TXT_sid.setText("");
        JCOMB_crsgradesec.setSelectedIndex(0);
        JCOMB_medecine.setSelectedIndex(0);
        CHCKB_headache.setSelected(false);
        CHCKB_tummyache.setSelected(false);
        CHCKB_others.setSelected(false);
        
    }
}

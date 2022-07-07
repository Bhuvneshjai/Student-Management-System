
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class manageStudentForm extends javax.swing.JFrame {
    // create object of student class and caling method to fetch data from student database table into table (jTable_managestudentform)
    student std = new student();
    DefaultTableModel model;
    public manageStudentForm() {
        initComponents();
        std.fillStudentJtable(jTable_managestudentform,"");
        // for select only one radio button from male or female
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_male);
        bg.add(jRadioButton_female);
        model = (DefaultTableModel) jTable_managestudentform.getModel();
        // for set the height of the table
        jTable_managestudentform.setRowHeight(40);
        jTable_managestudentform.setShowGrid(true);
        jTable_managestudentform.setGridColor(Color.red);
        jTable_managestudentform.setSelectionBackground(Color.black);
        // for off the button minimize
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_female = new javax.swing.JRadioButton();
        jRadioButton_male = new javax.swing.JRadioButton();
        jDateChooser_birthdate = new com.toedter.calendar.JDateChooser();
        jTextField_phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jButton_remove = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField_lastname = new javax.swing.JTextField();
        jTextField_firstname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jButton_edit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_managestudentform = new javax.swing.JTable();
        jTextField_valuetosearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE STUDENT FORM");

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setText("Sex : ");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setText("Birthdate : ");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setText("Phone : ");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setText("Address : ");

        jRadioButton_female.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_female.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton_female.setText("FEMALE");

        jRadioButton_male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_male.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton_male.setText("MALE");

        jDateChooser_birthdate.setForeground(new java.awt.Color(255, 0, 0));
        jDateChooser_birthdate.setDateFormatString("yyyy-MM-dd");
        jDateChooser_birthdate.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N

        jTextField_phone.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jTextField_phone.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_phoneActionPerformed(evt);
            }
        });
        jTextField_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_phoneKeyTyped(evt);
            }
        });

        jTextArea_address.setColumns(20);
        jTextArea_address.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jTextArea_address.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea_address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_address);

        jButton_remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_remove.setText("REMOVE");
        jButton_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeActionPerformed(evt);
            }
        });

        jButton_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_add.setText("ADD");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel9.setText("Last Name : ");

        jTextField_lastname.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jTextField_lastname.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lastnameActionPerformed(evt);
            }
        });
        jTextField_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_lastnameKeyTyped(evt);
            }
        });

        jTextField_firstname.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jTextField_firstname.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_firstnameActionPerformed(evt);
            }
        });
        jTextField_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_firstnameKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setText("First Name : ");

        jLabel11.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel11.setText("Id : ");

        jTextField_id.setEditable(false);
        jTextField_id.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });
        jTextField_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_idKeyTyped(evt);
            }
        });

        jButton_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_edit.setText("EDIT");
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        jTable_managestudentform.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable_managestudentform.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "Birthdate", "Phone", "Address"
            }
        ));
        jTable_managestudentform.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_managestudentformMouseClicked(evt);
            }
        });
        jTable_managestudentform.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_managestudentformKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_managestudentform);

        jTextField_valuetosearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_valuetosearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_valuetosearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_valuetosearchKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel2.setText("Enter Value To Search :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(466, 466, 466)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_valuetosearch, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(482, 482, 482)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton_male)
                                    .addGap(93, 93, 93)
                                    .addComponent(jRadioButton_female))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jDateChooser_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jButton_remove))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(75, 75, 75)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_valuetosearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jTextField_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton_male)
                                    .addComponent(jRadioButton_female))))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_edit)
                                    .addComponent(jButton_remove)
                                    .addComponent(jButton_add)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phoneActionPerformed
   
    }//GEN-LAST:event_jTextField_phoneActionPerformed

    private void jTextField_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneKeyTyped
        // Allow Only Numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_phoneKeyTyped

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
        // when we delete a student we must also delete all score affected to this student        // we have to add a constraint to score table to do this
        // constraint -> foreign key + on delete cascade
        /*
            ALTER TABLE score
            add constraint fk_score_student
            FOREIGN KEY(`student_id`)
            REFERENCES student (id)
            on DELETE CASCADE
        */



        // for remove data from the database table student
        if(jTextField_id.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Select Data");
        }
        else{
        int id = Integer.valueOf(jTextField_id.getText());
        std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null);
        std.fillStudentJtable(jTable_managestudentform, "");
        jTable_managestudentform.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","Birthdate","Phone","Address"})) ;
        std.fillStudentJtable(jTable_managestudentform, jTextField_valuetosearch.getText());
        MainForm.jLabel_studentscount.setText("Students Count = "+Integer.toString(MyFunction.countData("student")));
        }
    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        // Open Add New Student Form
        AddStudentForm Addmf = new AddStudentForm();
        Addmf.setVisible(true);
        Addmf.pack();
        Addmf.setLocationRelativeTo(null);
        // for close only AddStudentForm Window
        Addmf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jTextField_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lastnameActionPerformed
       
    }//GEN-LAST:event_jTextField_lastnameActionPerformed

    private void jTextField_lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_lastnameKeyTyped
        
    }//GEN-LAST:event_jTextField_lastnameKeyTyped

    private void jTextField_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_firstnameActionPerformed
       
    }//GEN-LAST:event_jTextField_firstnameActionPerformed

    private void jTextField_firstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_firstnameKeyTyped
        
    }//GEN-LAST:event_jTextField_firstnameKeyTyped

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jTextField_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_idKeyTyped
       
    }//GEN-LAST:event_jTextField_idKeyTyped

    public boolean verifText(){
        if(jTextField_firstname.getText().equals("") || jTextField_lastname.getText().equals("") || 
           jTextField_phone.getText().equals("") || jTextArea_address.getText().equals("")
           || jDateChooser_birthdate.getDate() == null || jTextField_id.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"One or More Empty Fields");
            return false;
        }
        else{
            return true;
        }
    }
    
    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        // Edit Student data and update it
        if(jTextField_id.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Select Data");
        }
        else{
        String fname = jTextField_firstname.getText();
        String lname = jTextField_lastname.getText();
        String phone = jTextField_phone.getText();
        String address = jTextArea_address.getText();
        int id = Integer.valueOf(jTextField_id.getText());
        String sex = "";
        if(jRadioButton_female.isSelected())
        {
            sex = "Female";
        }
        else if(jRadioButton_male.isSelected())
        {
            sex = "Male";
        }
        
        if(verifText())
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(jDateChooser_birthdate.getDate());
            std.insertUpdateDeleteStudent('u', id, fname, lname, sex, bdate, phone, address);
            MainForm.jLabel_studentscount.setText("Students Count = "+Integer.toString(MyFunction.countData("student")));
            jTextField_id.setText("");
            jTextArea_address.setText("");
            jTextField_firstname.setText("");
            jTextField_lastname.setText("");
            jTextField_phone.setText("");
            jRadioButton_male.setSelected(false);
            jRadioButton_female.setSelected(false);
            jDateChooser_birthdate.setDate(null);
        }
      }
    }//GEN-LAST:event_jButton_editActionPerformed
    int rowIndex;
    private void jTable_managestudentformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_managestudentformMouseClicked
        // fetch data from table (jTable_managestudentform) when we clicked to particular row into manage student form (textfield)
        rowIndex = jTable_managestudentform.getSelectedRow();
        
        if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
        {
            jRadioButton_male.setSelected(true);
            jRadioButton_female.setSelected(false);
        }else{
            jRadioButton_female.setSelected(true);
            jRadioButton_male.setSelected(false);
        }
        jTextField_id.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_firstname.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_lastname.setText(model.getValueAt(rowIndex, 2).toString());
        jTextField_phone.setText(model.getValueAt(rowIndex, 5).toString());
        jTextArea_address.setText(model.getValueAt(rowIndex, 6).toString());
        
        Date bdate;
        try{
            bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
            jDateChooser_birthdate.setDate(bdate);
        }catch(ParseException ex){
            Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_jTable_managestudentformMouseClicked

    private void jTextField_valuetosearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_valuetosearchKeyTyped

    }//GEN-LAST:event_jTextField_valuetosearchKeyTyped

    private void jTextField_valuetosearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_valuetosearchKeyPressed
        
    }//GEN-LAST:event_jTextField_valuetosearchKeyPressed

    private void jTextField_valuetosearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_valuetosearchKeyReleased
        // value search for a particular from the database into table
        jTable_managestudentform.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","Birthdate","Phone","Address"})) ;
        std.fillStudentJtable(jTable_managestudentform, jTextField_valuetosearch.getText());
    }//GEN-LAST:event_jTextField_valuetosearchKeyReleased

    private void jTable_managestudentformKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_managestudentformKeyReleased
        // By up-key and down-key we can fetch data from jtable_managestudentform into fields
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
        {
         rowIndex = jTable_managestudentform.getSelectedRow();
         jTextField_id.setText(model.getValueAt(rowIndex, 0).toString());
         jTextField_firstname.setText(model.getValueAt(rowIndex, 1).toString());
         jTextField_lastname.setText(model.getValueAt(rowIndex, 2).toString());
         jTextField_phone.setText(model.getValueAt(rowIndex, 5).toString());
         jTextArea_address.setText(model.getValueAt(rowIndex, 6).toString());
         
         if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
         {
             jRadioButton_male.setSelected(true);
             jRadioButton_female.setSelected(false);
         }
         else{
             jRadioButton_male.setSelected(false);
             jRadioButton_female.setSelected(true);
         }
         Date bdate;
        try{
            bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
            jDateChooser_birthdate.setDate(bdate);
        }catch(ParseException ex){
            Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null,ex);
        }
        }
    }//GEN-LAST:event_jTable_managestudentformKeyReleased

    
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
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_remove;
    private com.toedter.calendar.JDateChooser jDateChooser_birthdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_managestudentform;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextField jTextField_firstname;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_lastname;
    private javax.swing.JTextField jTextField_phone;
    private javax.swing.JTextField jTextField_valuetosearch;
    // End of variables declaration//GEN-END:variables
}

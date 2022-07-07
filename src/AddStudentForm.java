
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form AddStudentForm
     */
    student std = new student();
    public AddStudentForm() {
        initComponents();
        // for selected only one radio button and male is always true
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_male);
        bg.add(jRadioButton_female);
        jRadioButton_male.setSelected(true);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_firstname = new javax.swing.JTextField();
        jTextField_lastname = new javax.swing.JTextField();
        jRadioButton_female = new javax.swing.JRadioButton();
        jRadioButton_male = new javax.swing.JRadioButton();
        jDateChooser_birthdate = new com.toedter.calendar.JDateChooser();
        jTextField_phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jButton_cancel = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51), 5));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("NEW STUDENT FORM");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setText("First Name : ");

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setText("Last Name : ");

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setText("Sex : ");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setText("Birthdate : ");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setText("Phone : ");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setText("Address : ");

        jTextField_firstname.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jTextField_firstname.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_firstnameActionPerformed(evt);
            }
        });

        jTextField_lastname.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jTextField_lastname.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lastnameActionPerformed(evt);
            }
        });

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

        jButton_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_cancel.setText("CANCEL");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jButton_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_add.setText("ADD");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton_female))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_male)
                    .addComponent(jRadioButton_female))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_add, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void jTextField_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_firstnameActionPerformed
       
    }//GEN-LAST:event_jTextField_firstnameActionPerformed

    private void jTextField_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lastnameActionPerformed
       
    }//GEN-LAST:event_jTextField_lastnameActionPerformed

    private void jTextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phoneActionPerformed
       
    }//GEN-LAST:event_jTextField_phoneActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        // cancel only particular window by clicking cancel button
        this.dispose();
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jTextField_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneKeyTyped
        // Allow Only Numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_phoneKeyTyped

    public boolean verifText(){
        // for check new student form that is entry filled or not if it is filled then entry added into database otherwise not
        if(jTextField_firstname.getText().equals("") || jTextField_lastname.getText().equals("") 
                || jDateChooser_birthdate.getDate() == null || jTextField_phone.getText().equals("") 
                || jTextArea_address.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"One or More Empty Field");
            return false;
        }
        // when you choose a date higher than the current date
        else if(jDateChooser_birthdate.getDate().compareTo(new Date()) > 0){
            JOptionPane.showMessageDialog(null,"Please Choose Correct Date , No Future Student DOB Allowed");
            return false;
        }
        else
        {
            return true;
        }
    }
    
    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        // Add Student Entry
        String fname = jTextField_firstname.getText();
        String lname = jTextField_lastname.getText();
        String sex = "Male";
        String phone = jTextField_phone.getText();
        String address = jTextArea_address.getText();
        if(jRadioButton_female.isSelected()){
            sex = "Female";
        }
        if(verifText())
        {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String bdate = dateformat.format(jDateChooser_birthdate.getDate());
        student std = new student();
        
        // for insert the entry or add
        std.insertUpdateDeleteStudent('i', null, fname, lname, sex, bdate, phone, address);
        
        // for increase the direct entry into the MainForm when we add entry
        MainForm.jLabel_studentscount.setText("Students Count = "+Integer.toString(MyFunction.countData("student")));
        
        // when we add new student entry it will direclty reflect on table (JTable_managestudentform) , it ll shows
        
        try{
            manageStudentForm.jTable_managestudentform.setModel(new DefaultTableModel(null, new Object[]{"Id","First Name","Last Name","Sex","Birthdate","Phone","Address"}));
            std.fillStudentJtable(manageStudentForm.jTable_managestudentform, "");
        }catch(Exception ex)
        {
            // if the manageStudentform are not open
            System.out.println(ex.getMessage());
        }
        
        }
    }//GEN-LAST:event_jButton_addActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_cancel;
    private com.toedter.calendar.JDateChooser jDateChooser_birthdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextField jTextField_firstname;
    private javax.swing.JTextField jTextField_lastname;
    private javax.swing.JTextField jTextField_phone;
    // End of variables declaration//GEN-END:variables
}

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class manageCourseForm extends javax.swing.JFrame {

    /**
     * Creates new form manageCourseForm
     */
    course c = new course();
    public manageCourseForm() {
        initComponents();
        c.fillCourseJtable(jTable_managecourseform);
        jTable_managecourseform.setRowHeight(40);
        jTable_managecourseform.setSelectionBackground(Color.black);
        jTable_managecourseform.setShowGrid(true);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_managecourseid = new javax.swing.JTextField();
        jSpinner_manageform = new javax.swing.JSpinner();
        jButton_editcourse = new javax.swing.JButton();
        jButton_addcourse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_managecourseform = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField_managecourselabel = new javax.swing.JTextField();
        jButton_removecourse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 5));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("MANAGE COURSE FORM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Label : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Hours : ");

        jTextField_managecourseid.setEditable(false);
        jTextField_managecourseid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_managecourseid.setForeground(new java.awt.Color(102, 0, 102));

        jSpinner_manageform.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner_manageform.setModel(new javax.swing.SpinnerNumberModel(1, 1, 300, 1));

        jButton_editcourse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_editcourse.setForeground(new java.awt.Color(51, 0, 102));
        jButton_editcourse.setText("EDIT");
        jButton_editcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editcourseActionPerformed(evt);
            }
        });

        jButton_addcourse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_addcourse.setForeground(new java.awt.Color(51, 0, 102));
        jButton_addcourse.setText("ADD");
        jButton_addcourse.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton_addcourseAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButton_addcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addcourseActionPerformed(evt);
            }
        });

        jTable_managecourseform.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable_managecourseform.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Label", "Hours"
            }
        ));
        jTable_managecourseform.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_managecourseformMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_managecourseform);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Id :");

        jTextField_managecourselabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_managecourselabel.setForeground(new java.awt.Color(102, 0, 102));

        jButton_removecourse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_removecourse.setForeground(new java.awt.Color(51, 0, 102));
        jButton_removecourse.setText("REMOVE");
        jButton_removecourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removecourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_addcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_editcourse)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_removecourse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner_manageform, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_managecourselabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_managecourseid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(307, 307, 307))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_managecourseid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField_managecourselabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner_manageform, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_editcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_addcourse)
                                    .addComponent(jButton_removecourse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_editcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editcourseActionPerformed
        // For Edit the Manage Course Form database table course
        if(jTextField_managecourseid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Select Data");
        }
        else{
        int id = Integer.valueOf(jTextField_managecourseid.getText());
        String label = jTextField_managecourselabel.getText();
        int hours = Integer.valueOf(jSpinner_manageform.getValue().toString());
        c.insertUpdateDeleteStudent('u', id, label, hours);
        manageCourseForm.jTable_managecourseform.setModel(new DefaultTableModel(null, new Object[]{"Id","Level","Hours"}));
        c.fillCourseJtable(manageCourseForm.jTable_managecourseform);
       }
    }//GEN-LAST:event_jButton_editcourseActionPerformed

    private void jButton_addcourseAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton_addcourseAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addcourseAncestorAdded

    private void jButton_addcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addcourseActionPerformed
        // for add course into database table course through addCourseForm
        addCourseForm acf = new addCourseForm();
        acf.setVisible(true);
        acf.pack();
        acf.setLocationRelativeTo(null);
        acf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_addcourseActionPerformed

    private void jButton_removecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removecourseActionPerformed
        // when we delete a course we must also delete all score affected to this course
        // we have to add a constraint to score table to do this
        // constraint -> foreign key + on delete cascade
        /*
            ALTER TABLE score
            add constraint fk_score_course
            FOREIGN KEY(`course_id`)
            REFERENCES coursse (id)
            on DELETE CASCADE
        */


        // To Remove the data into course database as well as jTable_managecourseform
        if(jTextField_managecourseid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Select Data To Remove");
        }
        else{
            int id = Integer.valueOf(jTextField_managecourseid.getText());
            c.insertUpdateDeleteStudent('d', id, null, null);
            manageCourseForm.jTable_managecourseform.setModel(new DefaultTableModel(null,new Object[]{"Id","Label","Hours"}));
            c.fillCourseJtable(manageCourseForm.jTable_managecourseform);
            jTextField_managecourseid.setText("");
            jTextField_managecourselabel.setText("");
            jSpinner_manageform.setValue(4);
        }
    }//GEN-LAST:event_jButton_removecourseActionPerformed

    private void jTable_managecourseformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_managecourseformMouseClicked
        // To fetch data from JTable_managecourseform into Fields when we clicked
        int index = jTable_managecourseform.getSelectedRow();
        jTextField_managecourseid.setText(jTable_managecourseform.getValueAt(index, 0).toString());
        jTextField_managecourselabel.setText(jTable_managecourseform.getValueAt(index, 1).toString());
        jSpinner_manageform.setValue(Integer.valueOf(jTable_managecourseform.getValueAt(index,2).toString()));
    }//GEN-LAST:event_jTable_managecourseformMouseClicked

    
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
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageCourseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addcourse;
    private javax.swing.JButton jButton_editcourse;
    private javax.swing.JButton jButton_removecourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_manageform;
    public static javax.swing.JTable jTable_managecourseform;
    private javax.swing.JTextField jTextField_managecourseid;
    private javax.swing.JTextField jTextField_managecourselabel;
    // End of variables declaration//GEN-END:variables
}

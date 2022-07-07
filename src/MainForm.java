
import javax.swing.JFrame;
public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_welcomeusername12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_studentscount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_coursescount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_welcomeusername = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_add = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_addcourse = new javax.swing.JMenuItem();
        jMenuItem_managecourse = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_addscore = new javax.swing.JMenuItem();
        jMenuItem_editdeletescore = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_welcomeusername12.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel_welcomeusername12.setText("WELCOME ");

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        jLabel_studentscount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_studentscount.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_studentscount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_studentscount.setText("Students Count = ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_studentscount, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_studentscount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel_coursescount.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_coursescount.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel_coursescount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_coursescount.setText("Courses Count = ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_coursescount, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel_coursescount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clg_1_90_1.png"))); // NOI18N

        jLabel_welcomeusername.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel_welcomeusername.setText("<# # # #>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(375, 375, 375))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_welcomeusername12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel_welcomeusername)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel_welcomeusername12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel_welcomeusername, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109))
        );

        jMenu3.setText("Student");

        jMenuItem_add.setText("Add");
        jMenuItem_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_add);

        jMenuItem1.setText("Manage");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Course");

        jMenuItem_addcourse.setText("Add");
        jMenuItem_addcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addcourseActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_addcourse);

        jMenuItem_managecourse.setText("Manage");
        jMenuItem_managecourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_managecourseActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_managecourse);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Score");

        jMenuItem_addscore.setText("Add");
        jMenuItem_addscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addscoreActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_addscore);

        jMenuItem_editdeletescore.setText("Edit / Delete");
        jMenuItem_editdeletescore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_editdeletescoreActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_editdeletescore);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addActionPerformed
        // Open Add New Student Form
        AddStudentForm Addmf = new AddStudentForm();
        Addmf.setVisible(true);
        Addmf.pack();
        Addmf.setLocationRelativeTo(null);
        // for close only AddStudentForm Window
        Addmf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_addActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        manageStudentForm mf = new manageStudentForm();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        // for close only manageStudentForm Window
        mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem_addcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addcourseActionPerformed
        // Open Add Course Form
        addCourseForm Addcf = new addCourseForm();
        Addcf.setVisible(true);
        Addcf.pack();
        Addcf.setLocationRelativeTo(null);
        // for close only addCourseForm Window
        Addcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_addcourseActionPerformed

    private void jMenuItem_managecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_managecourseActionPerformed
        // Open Manage Course Form
        manageCourseForm mcf = new manageCourseForm();
        mcf.setVisible(true);
        mcf.pack();
        mcf.setLocationRelativeTo(null);
        mcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_managecourseActionPerformed

    private void jMenuItem_addscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addscoreActionPerformed
        // for add score
         AddScore asc = new AddScore();
         asc.setVisible(true);
         asc.pack();
         asc.setLocationRelativeTo(null);
         asc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_addscoreActionPerformed

    private void jMenuItem_editdeletescoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_editdeletescoreActionPerformed
        // for edit/delete score
        editdeletescoreform edsf = new editdeletescoreform();
        edsf.setVisible(true);
        edsf.pack();
        edsf.setLocationRelativeTo(null);
        edsf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_editdeletescoreActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel_coursescount;
    public static javax.swing.JLabel jLabel_studentscount;
    public static javax.swing.JLabel jLabel_welcomeusername;
    public static javax.swing.JLabel jLabel_welcomeusername12;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_add;
    private javax.swing.JMenuItem jMenuItem_addcourse;
    private javax.swing.JMenuItem jMenuItem_addscore;
    private javax.swing.JMenuItem jMenuItem_editdeletescore;
    private javax.swing.JMenuItem jMenuItem_managecourse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

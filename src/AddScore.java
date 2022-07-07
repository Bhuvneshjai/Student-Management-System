
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class AddScore extends javax.swing.JFrame {

    /**
     * Creates new form AddScore
     */
    course c = new course();
    student s = new student();
    score sc = new score();
    DefaultTableModel model;
    public AddScore() {
        initComponents();
        // call fillCourseCombo Method from course class
        c.fillCourseCombo(jComboBox_courseid);
        s.fillStudentJtable(jTable_addscoreform, "");
        
                
        HideColumn(6);
        HideColumn(5);
        HideColumn(4);
        HideColumn(3);
        
        model = (DefaultTableModel) jTable_addscoreform.getModel();
        // for set the height of the table
        jTable_addscoreform.setRowHeight(40);
        jTable_addscoreform.setShowGrid(true);
        jTable_addscoreform.setGridColor(Color.red);
        jTable_addscoreform.setSelectionBackground(Color.black);
        
        setResizable(false);
    }

    private void HideColumn(int ColIndex)
    {
        TableColumn col = jTable_addscoreform.getColumnModel().getColumn(ColIndex);
        col.setMaxWidth(0);
        col.setMinWidth(0);
        col.setPreferredWidth(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_studentid = new javax.swing.JTextField();
        jButton_addscore = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_addscoreform = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField_score = new javax.swing.JTextField();
        jButton_cancelscore = new javax.swing.JButton();
        jComboBox_courseid = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField_description = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 5));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("ADD SCORE FORM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Course Id : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Score : ");

        jTextField_studentid.setEditable(false);
        jTextField_studentid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_studentid.setForeground(new java.awt.Color(102, 0, 102));

        jButton_addscore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_addscore.setForeground(new java.awt.Color(102, 0, 51));
        jButton_addscore.setText("Add");
        jButton_addscore.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton_addscoreAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButton_addscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addscoreActionPerformed(evt);
            }
        });

        jTable_addscoreform.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable_addscoreform.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "Birthdate", "Phone", "Address"
            }
        ));
        jTable_addscoreform.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jTable_addscoreformMouseWheelMoved(evt);
            }
        });
        jTable_addscoreform.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_addscoreformMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_addscoreform);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Student ID :");

        jTextField_score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_score.setForeground(new java.awt.Color(102, 0, 102));

        jButton_cancelscore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_cancelscore.setForeground(new java.awt.Color(102, 0, 51));
        jButton_cancelscore.setText("Cancel");
        jButton_cancelscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelscoreActionPerformed(evt);
            }
        });

        jComboBox_courseid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Description : ");

        jTextField_description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_description.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(jButton_addscore, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_score)
                            .addComponent(jComboBox_courseid, 0, 218, Short.MAX_VALUE)
                            .addComponent(jTextField_description, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jButton_cancelscore))
                    .addComponent(jTextField_studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(387, 387, 387))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_courseid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_score, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_description, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_addscore)
                            .addComponent(jButton_cancelscore))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void jButton_addscoreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton_addscoreAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addscoreAncestorAdded

    private void jButton_addscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addscoreActionPerformed
        if((jTextField_studentid.getText().equals("")) || (jTextField_score.getText().equals("")) || (jTextField_description.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null, "Please Fill Entry");
        }
        else
        {
        int stdId = Integer.valueOf(jTextField_studentid.getText());
        int crsId = c.getCourseId(jComboBox_courseid.getSelectedItem().toString());
        double scr = Double.valueOf(jTextField_score.getText());
        System.out.println(crsId);
        sc.insertUpdateDeleteStudent('i', stdId, crsId, scr, jTextField_description.getText());
       try{
           editdeletescoreform.jTable_addscoreform.setModel(new DefaultTableModel(null, new Object[]{"Student Id","Course Id","Score","Description"}));
           sc.fillScoreJtable(editdeletescoreform.jTable_addscoreform);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
       }
    }//GEN-LAST:event_jButton_addscoreActionPerformed

    private void jButton_cancelscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelscoreActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton_cancelscoreActionPerformed

    private void jTable_addscoreformMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jTable_addscoreformMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_addscoreformMouseWheelMoved

    private void jTable_addscoreformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_addscoreformMouseClicked
       int rowIndex = jTable_addscoreform.getSelectedRow(); 
       jTextField_studentid.setText(jTable_addscoreform.getValueAt(rowIndex,0).toString());
    }//GEN-LAST:event_jTable_addscoreformMouseClicked

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
            java.util.logging.Logger.getLogger(AddScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addscore;
    private javax.swing.JButton jButton_cancelscore;
    private javax.swing.JComboBox<String> jComboBox_courseid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_addscoreform;
    private javax.swing.JTextField jTextField_description;
    private javax.swing.JTextField jTextField_score;
    private javax.swing.JTextField jTextField_studentid;
    // End of variables declaration//GEN-END:variables
}

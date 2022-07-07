
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class editdeletescoreform extends javax.swing.JFrame {

    /**
     * Creates new form editdeletescoreform
     */
    
    score sc = new score();
    public editdeletescoreform() {
        initComponents();
        sc.fillScoreJtable(jTable_addscoreform);
        
        jTable_addscoreform.setRowHeight(40);
        jTable_addscoreform.setShowGrid(true);
        jTable_addscoreform.setGridColor(Color.pink);
        jTable_addscoreform.setSelectionBackground(Color.black);
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
        jButton_removescore = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_description = new javax.swing.JTextField();
        jTextField_courseid = new javax.swing.JTextField();
        jButton_editscore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("EDIT / DELETE FORM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Course Id : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Score : ");

        jTextField_studentid.setEditable(false);
        jTextField_studentid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_studentid.setForeground(new java.awt.Color(102, 0, 102));

        jButton_addscore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_addscore.setForeground(new java.awt.Color(0, 51, 153));
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
                "Student Id", "Course Id", "Score", "Description"
            }
        ));
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

        jButton_removescore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_removescore.setForeground(new java.awt.Color(0, 51, 204));
        jButton_removescore.setText("Remove");
        jButton_removescore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removescoreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Description : ");

        jTextField_description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_description.setForeground(new java.awt.Color(102, 0, 102));

        jTextField_courseid.setEditable(false);
        jTextField_courseid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_editscore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_editscore.setForeground(new java.awt.Color(0, 51, 204));
        jButton_editscore.setText("Edit");
        jButton_editscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editscoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)))
                    .addComponent(jButton_addscore, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_courseid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_studentid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_editscore, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_removescore))
                        .addComponent(jTextField_description, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_studentid, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_courseid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_score, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_description, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_addscore)
                            .addComponent(jButton_removescore)
                            .addComponent(jButton_editscore)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addscoreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton_addscoreAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addscoreAncestorAdded

    private void jButton_addscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addscoreActionPerformed
    AddScore asc = new AddScore();
    asc.setVisible(true);
    asc.pack();
    asc.setLocationRelativeTo(null);
    asc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_addscoreActionPerformed

    private void jTable_addscoreformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_addscoreformMouseClicked
        int rowIndex = jTable_addscoreform.getSelectedRow();
        jTextField_studentid.setText(jTable_addscoreform.getValueAt(rowIndex,0).toString());
        jTextField_courseid.setText(jTable_addscoreform.getValueAt(rowIndex, 1).toString());
        jTextField_score.setText(jTable_addscoreform.getValueAt(rowIndex, 2).toString());
        jTextField_description.setText(jTable_addscoreform.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_jTable_addscoreformMouseClicked

    private void jButton_removescoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removescoreActionPerformed
        // for delete the data from database table score as well as jTable_addscoreform
        if((jTextField_studentid.getText().equals("")) || (jTextField_courseid.getText().equals("")) || (jTextField_score.getText().equals("")) || (jTextField_description.getText().equals("")))
        {
            JOptionPane.showMessageDialog(null, "Please Select Data For Remove");
        }
        else{
        int sid = Integer.valueOf(jTextField_studentid.getText());
        int cid = Integer.valueOf(jTextField_courseid.getText());
        sc.insertUpdateDeleteStudent('d', sid, cid, null, null);
        jTable_addscoreform.setModel(new DefaultTableModel(null,new Object[]{"Student Id","Course Id","Score","Description"}));
        sc.fillScoreJtable(jTable_addscoreform);
        }
    }//GEN-LAST:event_jButton_removescoreActionPerformed

    private void jButton_editscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editscoreActionPerformed
        // for edit the data
        if((jTextField_studentid.getText().equals("")) || (jTextField_courseid.getText().equals("")) || (jTextField_score.getText().equals("")) || (jTextField_description.getText().equals("")))
        {
            JOptionPane.showMessageDialog(null, "Please Select Data For Edit");
        }
        else{
        int sid = Integer.valueOf(jTextField_studentid.getText());
        int cid = Integer.valueOf(jTextField_courseid.getText());
        double scr = Double.valueOf(jTextField_score.getText());
        String ds = jTextField_description.getText();
        
        sc.insertUpdateDeleteStudent('u', sid, cid, scr, ds);
        jTable_addscoreform.setModel(new DefaultTableModel(null,new Object[]{"Student Id","Course Id","Score","Description"}));
        sc.fillScoreJtable(jTable_addscoreform);
        }
    }//GEN-LAST:event_jButton_editscoreActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(editdeletescoreform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editdeletescoreform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editdeletescoreform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editdeletescoreform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editdeletescoreform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addscore;
    private javax.swing.JButton jButton_editscore;
    private javax.swing.JButton jButton_removescore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_addscoreform;
    private javax.swing.JTextField jTextField_courseid;
    private javax.swing.JTextField jTextField_description;
    private javax.swing.JTextField jTextField_score;
    private javax.swing.JTextField jTextField_studentid;
    // End of variables declaration//GEN-END:variables
}

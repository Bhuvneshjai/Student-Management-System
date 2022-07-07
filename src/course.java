
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class course {
    public void insertUpdateDeleteStudent(char operation, Integer id, String label, Integer hours)
    {
      java.sql.Connection con = MyConnection.getConnection();
      PreparedStatement ps;
      
      // i for insert
      if(operation == 'i')
      {
          try{
          ps = con.prepareStatement("INSERT INTO `course`(`label`, `hours_number`) VALUES (?,?)");
          ps.setString(1, label);
          ps.setInt(2, hours);
          
          if(ps.executeUpdate()>0){
              JOptionPane.showMessageDialog(null,"New Course Added");
          }
          
          }catch (SQLException ex){
              Logger.getLogger(student.class.getName()).log(Level.SEVERE,null,ex);
              }
        }
      
      // u for update
      if(operation == 'u')
      {
          try{
              ps = con.prepareStatement("UPDATE course SET label = ?, hours_number = ? WHERE id = ?");
              ps.setString(1,label);
              ps.setInt(2,hours);
              ps.setInt(3, id);
              if(ps.executeUpdate()>0)
              {
                  JOptionPane.showMessageDialog(null,"Course Data Updated");
              }
          }catch(SQLException ex){
              Logger.getLogger(student.class.getName()).log(Level.SEVERE,null,ex);
          }
      }
      
      // d for delete
       if(operation == 'd')
      {
          int YesOrNo = JOptionPane.showConfirmDialog(null,"Scores will also be deleted","Delete Course",JOptionPane.OK_CANCEL_OPTION,0);
          if (YesOrNo == JOptionPane.OK_OPTION)
          {
            try{
              ps = con.prepareStatement("DELETE FROM course WHERE id = ?");
              ps.setInt(1, id);
              if(ps.executeUpdate()>0)
              {
                  JOptionPane.showMessageDialog(null,"Course Data Deleted");
              }
          }catch(SQLException ex){
              Logger.getLogger(student.class.getName()).log(Level.SEVERE,null,ex);
          }
          }
          
      }
    }
    
    // for check course is exist or not
    public boolean isCourseExist(String courseName)
    {
        boolean isExist = false;
        java.sql.Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `label` = ?");
            ps.setString(1, courseName);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                isExist = true;
            }
        }catch(Exception ex) 
        {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isExist;
    }
    
    // fetch data from database table (course) into table jTable_managecourseform
    public void fillCourseJtable(JTable table)
    {
        java.sql.Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * From course");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row; 
            while(rs.next())
            {
                row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getInt(3);
                model.addRow(row);
            }
        }catch(Exception ex) 
        {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // fetch courses from database into courseid through AddScore
    public int getCourseId(String courseLabel)
    {
        int courseId = 0;
        java.sql.Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `label` = ?");
            ps.setString(1, courseLabel);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                courseId = rs.getInt("Id");
            }
        }catch(Exception ex) 
        {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courseId;
    }
    
    public void fillCourseCombo(JComboBox combo)
    {
        java.sql.Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * From course");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                combo.addItem(rs.getString(2));
            }
        }catch(Exception ex) 
        {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

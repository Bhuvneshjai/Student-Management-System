import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

public class MyFunction {
    public static int countData(String tableName)
    {
        int total = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'table' FROM "+tableName);
            while(rs.next()){
                total = rs.getInt(1);
            }
        }catch(SQLException ex)
        {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return total;
    }
}

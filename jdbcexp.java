import java.sql.*;

public class jdbcexp {
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //loading MYSQL driver

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "pass"); // getting connection

            st = conn.createStatement(); // creating statement 

            String sql = "SELECT * FROM user"; //executing the query
            rs = st.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id : " + id + "name : " + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }finally{
            try{   //closing connection
                if(rs!=null) rs.close();
                if(st!=null) st.close();
                if(conn!=null) conn.close();
            }
        }
    }
}


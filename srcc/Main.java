package srcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college"; 
        String username = "root";
        String password = "GJASa@2024";

        try {
            Connection con = DriverManager.getConnection(url,username,password);

            System.out.println("Connection successful");

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM student";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ID\tName\tDept");
            System.out.println("----------------------");

            while(rs.next()){
                System.out.println(
                    rs.getInt("id") + "\t"  + 
                    rs.getString("name") + "\t" + 
                    rs.getString("department")
                );
            }
            rs.close();
            stmt.close();
            con.close();
            
        } catch (Exception e) {

            e.printStackTrace();
        }
        
    }
    
}

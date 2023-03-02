
package registration;

import java.sql.*;



public class DbConnection {

            Connection conn = null;

            
            public static Connection ConnectionDB(){
                try{
                    Class.forName("org.sqlite.JDBC");
                    Connection con = DriverManager.getConnection("jdbc:sqlit:Information.db");
                    System.out.println("Connection Succeeded");
                    return con;
                }catch (Exception e){
                    System.out.println("Connection failed" + e);
                    return null;
                }
            }
}

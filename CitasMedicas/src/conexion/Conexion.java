
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/citasmedicas";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "dylanchus8";
    
    public static Connection getConnection(){
              Connection con = null;
              try {
                  Class.forName("com.mysql.cj.jdbc.Driver");
                          con= DriverManager.getConnection(URL, USERNAME, PASSWORD);
                          JOptionPane.showMessageDialog(null,"Conexion Exitosa");
              } catch (Exception e){
                    System.out.print(e);
              }
              return con;
    }

}

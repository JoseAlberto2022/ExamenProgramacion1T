
package eliminar.examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class EliminarExamen {

  
    public static void main(String[] args) {
         try{Class.forName("com.mysql.jdbc.Driver");
            //Ahora establezco la conexion
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava", "cursojava", "cursojava");
              // Preparo una peticion a la base de datos
              Statement peticion = conexion.createStatement();
              peticion.execute("DELETE FROM agenda WHEREs identificador = 2");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertarexamen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertarexamen {

   
    public static void main(String[] args) {
       try{Class.forName("com.mysql.jdbc.Driver");
            //Ahora establezco la conexion
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava", "cursojava", "cursojava");
              // Preparo una peticion a la base de datos
              Statement peticion = conexion.createStatement();
              peticion.execute("INSERT INTO agenda VALUES (NULL,'pepe','1234','Carlos@correo.com')");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
    
    


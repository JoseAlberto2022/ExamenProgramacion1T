
package leerexamen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Leerexamen {

   
    public static void main(String[] args) {
      try{
            Class.forName("com.mysql.jdbc.Driver");
            //Ahora establezco la conexion
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava", "cursojava", "cursojava");
             // Preparo una peticion a la base de datos
             Statement peticion = conexion.createStatement();
             //A continuacion le pedimos algo a la basse de datos y lo guardamos dentro de un objeto (vomo si fuera una variable)
             ResultSet resultado = peticion.executeQuery("SELECT * FROM agenda");
             // Mientras que el resultado tenga lineas+
             while(resultado.next()){
                 //Imprimeme en la pantalla el resultado
                System.out.println(resultado.getString(1)+"-"+resultado.getString(2)+"-"+resultado.getString(3));
             
             }
        }catch(Exception e){
            e.printStackTrace();
    }
    }
    
}

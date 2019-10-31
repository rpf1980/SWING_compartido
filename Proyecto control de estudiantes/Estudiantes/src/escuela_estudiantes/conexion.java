
package escuela_estudiantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conexion {
    
    private final String url = "jdbc:mysql://localhost/db_gestion_alumnos_rpf";
    PreparedStatement psPrepararSentencia;
    Connection con = null;
   

    
    public conexion() {
     try{  
         
         Class.forName("com.mysql.jdbc.Driver");         
         con = DriverManager.getConnection(url,"root","");
         if (con!=null){
            System.out.println("Conexión a base de datos estudiantes. listo");
         }
      }
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
    }

    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("La conexion a la  base de datos a terminado");

    } 

    
}

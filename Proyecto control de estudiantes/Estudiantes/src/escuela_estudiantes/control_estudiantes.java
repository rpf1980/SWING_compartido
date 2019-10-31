
package escuela_estudiantes;

public class control_estudiantes {
    
    sql sensql;
   
    public control_estudiantes() {
        
        sensql = new sql();
    }

    
    public boolean ingresar_estudiante(String id_carnet, String documento, String Tipo_doc, String nombre, String apellido, String sexo)
    {               
        
            String datos[] = {id_carnet,documento,Tipo_doc,nombre,apellido,sexo};           
            return sensql.insertar(datos, "insert into alumno(id_dni, ref_alumno,Tipo_doc,nombre,apellidos,sexo) values(?,?,?,?,?,?)");
                                  
        
    }
    
    
    
}

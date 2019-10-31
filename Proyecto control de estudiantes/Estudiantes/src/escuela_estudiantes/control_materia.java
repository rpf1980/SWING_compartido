
package escuela_estudiantes;

public class control_materia {
    
    sql sqlmat;
   
    public control_materia() {
        
        sqlmat = new sql();
    }

    
    public boolean ingresar_materia(String nombre_asignatura, int horas_asignatura)
    {               
        
            String datos[] = {nombre_asignatura, Integer.toString(horas_asignatura)};           
            return sqlmat.insertar(datos, "insert into asignatura(nombre_asignatura, horas_asignatura) values(?,?)");
                                  
        
    }
    
}

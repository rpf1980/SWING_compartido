
package escuela_estudiantes;

public class control_matricula {
    private sql sen;
    private String id_dni;

    public String getId_dni() {
        return id_dni;
    }

    public void setId_dni(String id_carnet) {
        this.id_dni = id_carnet;
    }
    
    public control_matricula()
    {
    
        sen = new sql();
}
    
    public String inserta_nombre_estudiante()
     { 
       String result;
       result = sen.datos_string("nombre", "select nombre from alumno where id_dni='"+this.id_dni+"';");
       return result;
    }
    public String inserta_apellidos_estudiante()
     { 
       String result;
       result = sen.datos_string("apellidos", "select apellidos from alumno where id_dni='"+this.id_dni+"';");
       return result;
    }
    
    public Object[][] inserta_cod_asignatura(String nombre_asignatura)
     { 
       String[] columnas = {"id_asignatura"};
       Object[][] result = sen.datosTabla(columnas,"asignatura", "select * from asignatura where nombre_asignatura='"+nombre_asignatura+"';");
       return result;
    }
    
    public String inserta_carnet_estudiante()
     { 
       String result;
       result = sen.datos_string("id_dni", "select id_dni from alumno where id_dni='"+this.id_dni+"';");
       return result;
    }
    
    public Object[] combox(String tabla, String campo)
     {
        return sen.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
     }
    
    public boolean existe_alumno( String cod)
     {
         
        this.id_dni = cod;
        return sen.existe(cod, " from alumno where id_dni='"+cod+"';");
      
    }
    
    public Boolean registrar_asignatura_x_estudiante(int cod_asignatura)
     {
        String[] datos = {id_dni, Integer.toString(cod_asignatura)};
        return sen.insertar(datos, "insert into asignaturaxestudiante(cod_dni,cod_asignatura ) values(?,?);");
    }
    
    public Object[][] datos_matricula (String id_alumno)
     {
        String[] columnas={"cod_dni","nombre_asignatura"};
        Object[][] resultado = sen.datosTabla(columnas, "asignaturaxestudiante", "select * from asignaturaxestudiante, asignatura where  id_asignatura=cod_asignatura and cod_dni='"+id_alumno+"';");
        return resultado;
      }
}
     


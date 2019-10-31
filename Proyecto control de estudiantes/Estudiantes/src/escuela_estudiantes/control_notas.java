
package escuela_estudiantes;

public class control_notas {
    
      private sql sen;
    
    public control_notas()
    {
      sen = new sql();  
    }
    
    
    
    public Object[][] consulta_asignatura_notas(String id)
       {
        String[] columnas={"cod_dni","cod_asignatura", "nombre_asignatura"};
        Object[][] resultado = sen.datosTabla(columnas, "asignaturaxestudiante", "select * from asignaturaxestudiante, asignatura where cod_asignatura=id_asignatura  and cod_dni='"+id+"';");
        return resultado;
       }
    
    public boolean insertar_notas(String cod_dni_nota, String cod_asignatura_nota, Double nota)
    {               
           
            String datos[] = {cod_dni_nota, cod_asignatura_nota, Double.toString(nota)};           
            return sen.insertar(datos, "insert into nota(cod_dni_nota, cod_asignatura_nota, nota) values(?,?,?)");
                                  
        
    }
    
}

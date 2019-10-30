/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener.dao.alumno;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.ArrayList;
import javax.swing.JTable;
import dao.alumno.DAOAlumno;
import pojo.alumno.Alumno;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RPF
 */
public class ListenerCargaJTableDaoAlumnos
{

    public static void cargaEnJTableDaoAlumnos(JTable jtable)
    {
        //Instanciamos DAOalumnos para que el constructor nos cree los alumnos del DAO
        DAOAlumno dao = new DAOAlumno();
        //Aquí estamos llamando al constructor del dao que nos cargará datos por defecto
        ArrayList<Alumno> daoAlumnos = dao.getListaAlumnos();

        DefaultTableModel tabla = new DefaultTableModel();

        tabla.addColumn("DNI");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("APELLIDOS");
        tabla.addColumn("CURSO");
        tabla.addColumn("FECHA DE NACIMIENTO");
        
        for(Alumno alumno: daoAlumnos)
        {
            Object[] registroAlumnos = 
            {
                alumno.getDni(),
                alumno.getNombre(),
                alumno.getApellidos(),
                alumno.getCurso(),
                alumno.getFechaNac()
            };
            tabla.addRow(registroAlumnos);
        }
        jtable.setModel(tabla);
    }
}

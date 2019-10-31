/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener.dao.matricula;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.ArrayList;
import javax.swing.JTable;
import dao.matricula.DAOmatriculas;
import pojo.matricula.Matricula;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RPF
 */
public class ListenerCargaJTableDaoMatriculas
{

    public static void cargaEnJTableDaoMatriculas(JTable jtable)
    {
        //Instanciamos DAOmatriculas para que el constructor
        //nos cree las matrículas del DAO        
        DAOmatriculas dao = new DAOmatriculas();
        
        //Llamamos al constructor del dao que nos cargará datos por defecto
        ArrayList<Matricula> daoMatriculas = dao.getListaMatriculas();
        
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("DNI");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("APELLIDOS");
        tabla.addColumn("CURSO");
        tabla.addColumn("FECHA ALTA");
        tabla.addColumn("FECHA BAJA");
        
        for (Matricula matricula: daoMatriculas)
        {
            Object[] registroMatriculas = 
            {
                matricula.getDni(),
                matricula.getNombre(),
                matricula.getApellidos(),
                matricula.getCurso(),
                matricula.getFechaAlta(),
                matricula.getFechaBaja()
            };
            tabla.addRow(registroMatriculas);
        }
        jtable.setModel(tabla);
    }
}

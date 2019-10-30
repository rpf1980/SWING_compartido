/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener.asignatura;

import java.util.ArrayList;
import javax.swing.JTable;
import dao.asignatura.DAOasignaturas;
import pojo.asignatura.Asignatura;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RPF
 */
public class ListenerCargaJTableDaoAsignaturas
{
    public static void cargarEnJTableDaoAsignaturas(JTable jtable)
    {
        //Instanciamos DaoAsignaturas para que el constructor
        //nos cree las asignaturas de su DAO
        DAOasignaturas dao = new DAOasignaturas();
        
        //Llamamos al constructor del DAO para que nos carge
        //la lista de asignaturas del mismo
        ArrayList<Asignatura> daoAsignaturas = dao.getListaAsignaturas();
        
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("ASIGNATURA");
        tabla.addColumn("CURSO");
        
        for(Asignatura a: daoAsignaturas)
        {
            Object[] registroAsignaturas =
            {
                a.getNombreAsignatura(),
                a.getCurso()
            };
            tabla.addRow(registroAsignaturas);
        }
        jtable.setModel(tabla);
    }
}

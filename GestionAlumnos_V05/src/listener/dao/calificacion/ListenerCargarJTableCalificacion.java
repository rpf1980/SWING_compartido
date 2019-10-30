/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener.dao.calificacion;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.*;
import javax.swing.JTable;
import dao.calificacion.DAOcalificaciones;
import pojo.calificacion.Calificacion;
import javax.swing.table.DefaultTableModel;
import jtable.JTableCalificacion;
/**
 *
 * @author RPF
 */
public class ListenerCargarJTableCalificacion
{
    public static void cargaEnJTableDaoCalificaciones(JTable jtable)
    {
        DAOcalificaciones dao = new DAOcalificaciones();
        
        ArrayList<Calificacion> daoCalificaciones = dao.getListaCalificaciones();
        
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("NOMBRE");
        tabla.addColumn("APELLIDOS");
        tabla.addColumn("ASIGNATURA");
        tabla.addColumn("1º TRIMESTRE");
        tabla.addColumn("2º TRIMESTRE");
        tabla.addColumn("3º TRIMESTRE");
        
        for(Calificacion calificacion: daoCalificaciones)
        {
            Object[] registroCalificaciones = 
            {
                calificacion.getNombreAlumno(),
                calificacion.getApellidos(),
                calificacion.getNombreAsignatura(),
                calificacion.getCalificacionTrimestre1(),
                calificacion.getCalificacionTrimestre2(),
                calificacion.getCalificacionTrimestre3()
            };
            tabla.addRow(registroCalificaciones);
        }
        jtable.setModel(tabla);
    }      
}

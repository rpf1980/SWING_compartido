/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.calificacion;

import java.util.ArrayList;
import pojo.calificacion.Calificacion;

/**
 *
 * @author RPF
 */
public interface IDAOcalificaciones
{

    public void insertaCalificacion(Calificacion cal);
    public void eliminaCalificacion(Calificacion cal);
    public void eliminaCalificacionApellidos(String apellidos);
    public int buscaCalificacion(Calificacion cal);
    public Calificacion buscaCalificacionApellidos(String apellidos);
    public String muestraCalificacion();    
    public ArrayList<Calificacion> getListaCalificaciones();  
    public String[] recuperarArrayCalificacion();
    public void modificaCalificacion(String nombreAlumno, String nombreAsignatura,
            double calificacionTrimestre1,
            double calificacionTrimestre2,
            double calificacionTrimestre3);
}

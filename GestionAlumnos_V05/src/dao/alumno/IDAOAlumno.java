/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.alumno;

import java.util.ArrayList;
import pojo.alumno.Alumno;

/**
 *
 * @author RPF
 */
public interface IDAOAlumno
{
    public void insertaAlumno(Alumno alumno);
    public void eliminaAlumno(Alumno alumno);
    public void eliminaAlumnoDni( String dni );
    public void modificaAlumno(String dni, String nombre, String apellidos, String curso, String fechaNac);
    public int buscaAlumno(Alumno alumno);
    public String muestraListadoAlumnos();
    public ArrayList<Alumno> getListaAlumnos();
    public String[] recuperarArrayAlumnos();
    public Alumno buscaAlumnoDNI( String dni );
}

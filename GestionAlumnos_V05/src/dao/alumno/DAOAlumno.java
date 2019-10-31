/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.alumno;

import java.util.ArrayList;
import java.util.List;
import pojo.alumno.Alumno;

/**
 *
 * @author RPF
 */
public class DAOAlumno implements IDAOAlumno
{

    public static Object getInstance()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Atributos
    //Array static para que podamos conservar datos de una instancia a otra
    private static ArrayList<Alumno> listaAlumnos;

    //Constructor
    public DAOAlumno()
    {
        if (listaAlumnos == null)
        {
            this.listaAlumnos = new ArrayList<Alumno>();
            this.listaAlumnos.add(new Alumno("121212-R", "María", "Rodriguez Guzmán", "3ºESO", "12-03-2001"));
            this.listaAlumnos.add(new Alumno("131313-W", "Lucas", "Martin Pozo", "3ºESO", "11-10-2008"));
        }
    }

    @Override
    public void insertaAlumno(Alumno alumno)
    {
        this.getListaAlumnos().add(alumno);
    }

    @Override
    public void eliminaAlumno(Alumno alumno)
    {
        int indice = buscaAlumno(alumno);

        //Si el índice existe 
        if (indice != -1)
        {
            this.getListaAlumnos().remove(indice);
        }
    }

    @Override
    public void modificaAlumno(String dni, String nombre, String apellidos, String curso, String fechaNac)
    {
        //Pasamos por parámetro dni del alumno, lo buscamos en el array de alumnos y lo modificamos					
        for (int i = 0; i < this.getListaAlumnos().size(); i++)
        {
            if (this.getListaAlumnos().get(i).getDni().equalsIgnoreCase(dni))
            {
                this.getListaAlumnos().get(i).setDni(dni);
                this.getListaAlumnos().get(i).setNombre(nombre);
                this.getListaAlumnos().get(i).setApellidos(apellidos);
                this.getListaAlumnos().get(i).setCurso(curso);
                this.getListaAlumnos().get(i).setFechaNac(fechaNac);
            }
        }
    }

    @Override
    public int buscaAlumno(Alumno a)
    {
        int indice = -1;

        //Recorremos la lista de alumnos 
        for (int i = 0; i < this.getListaAlumnos().size(); i++)
        {
            if (this.getListaAlumnos().get(i).getNombre().equalsIgnoreCase(a.getNombre()))
            {
                indice = i;
            }
        }

        //Devolvemos el índice del alumno buscado
        return indice;
    }

    @Override
    public String muestraListadoAlumnos()
    {
        String strListaAlumnos = "";

        for (int i = 0; i < this.getListaAlumnos().size(); i++)
        {

            strListaAlumnos += this.getListaAlumnos().get(i).toString() + "\n";
        }

        return strListaAlumnos;
    }
    
    @Override
    public Alumno buscaAlumnoDNI( String dni )
    {
        Alumno a = new Alumno();
                       
        for(int i = 0; i < size(); i++)
        {
            a = this.listaAlumnos.get(i);
            if(a.getDni().compareToIgnoreCase(dni) == 0)
            {
                return a;
            }            
        }
        
        return a;
    }

    @Override
    public ArrayList<Alumno> getListaAlumnos()
    {
        return this.listaAlumnos;
    }

    public int size()
    {
       return this.listaAlumnos.size();
    }
    
    @Override
     public void eliminaAlumnoDni( String dni )
     {
         for(int i = 0; i < size(); i++)
         {
             if(this.listaAlumnos.get(i).getDni().equalsIgnoreCase(dni))
             {
                 this.listaAlumnos.remove(i);
             }
         }
     }
    
    @Override
    public String[] recuperarArrayAlumnos()
    {
        String[] strArray = new String[size()];
        
        for(int i = 0; i < size(); i++)
        {
            strArray[i] = this.listaAlumnos.get(i).getDni() + "   " +
                          this.listaAlumnos.get(i).getNombre();
        }
        
        return strArray;
    }
}

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
public class DAOcalificaciones implements IDAOcalificaciones
{
    public static Object getInstance()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Atributos
    private static ArrayList<Calificacion> listaCalificaciones;

    //Constructores
    public DAOcalificaciones()
    {
        if (listaCalificaciones == null)
        {
            this.listaCalificaciones = new ArrayList<Calificacion>();
            this.listaCalificaciones.add(new Calificacion("Marcos", "Minera Morrino", "2ºDAM", 7.5, 6.4, 8.9));
            this.listaCalificaciones.add(new Calificacion("Lucía", "Azarona Marcarroni", "2ºDAM", 4.5, 9.4, 7.9));
            this.listaCalificaciones.add(new Calificacion("Ramón", "Torrezno Albondiguilla", "4ºDAM", 6.5, 4.4, 7.2));
        }
    }

    @Override
    public void insertaCalificacion(Calificacion cal)
    {
        this.getListaCalificaciones().add(cal);
    }

    @Override
    public void eliminaCalificacion(Calificacion cal)
    {
        int indice = buscaCalificacion(cal);

        //Si el índice existe ( no un entero negativo )
        if (indice != -1)
        {
            //Elimina el elemento en situado en ese índice
            this.listaCalificaciones.remove(indice);
        }
    }
    
    @Override
    public void eliminaCalificacionApellidos(String apellidos)
    {
        for(int i = 0; i < this.listaCalificaciones.size(); i++)
         {
             if(this.listaCalificaciones.get(i).getApellidos().equalsIgnoreCase(apellidos))
             {
                 this.listaCalificaciones.remove(i);
             }
         }
    }
    
    @Override
    public String[] recuperarArrayCalificacion()
    {
        String[] strArray = new String[size()];
        
        for(int i = 0; i < size(); i++)
        {
            strArray[i] = this.listaCalificaciones.get(i).getNombreAlumno() + "  " +
                          this.listaCalificaciones.get(i).getApellidos() + "  " +
                          this.listaCalificaciones.get(i).getNombreAsignatura() + "  " +
                          this.listaCalificaciones.get(i).getCalificacionTrimestre1() + "  " +
                          this.listaCalificaciones.get(i).getCalificacionTrimestre2() + "  " + 
                          this.listaCalificaciones.get(i).getCalificacionTrimestre3();
        }
        
        return strArray;
    }

    @Override
    public int buscaCalificacion(Calificacion cal)
    {
        int indice = -1;

        for (int i = 0; i < this.listaCalificaciones.size(); i++)
        {
            if (this.listaCalificaciones.get(i).getNombreAlumno().equalsIgnoreCase(cal.getNombreAlumno()))
            {
                indice = i;
            }
        }
        return indice;
    }
    
    @Override
    public Calificacion buscaCalificacionApellidos(String apellidos)
    {
        Calificacion c = new Calificacion();
        
        for(int i = 0; i < size(); i++)
        {
            c = this.listaCalificaciones.get(i);
            
            if(c.getApellidos().compareToIgnoreCase(apellidos) == 0)
            {
                return c;
            }            
        }       
        return c;        
    }

    @Override
    public String muestraCalificacion()
    {
        String strListaCalificacion = "";

        for (int i = 0; i < this.listaCalificaciones.size(); i++)
        {
            strListaCalificacion += this.listaCalificaciones.get(i).toString() + "\n";
        }

        return strListaCalificacion;
    }

    @Override
    public void modificaCalificacion(String nombreAlumno, String nombreAsignatura, double calificacionTrimestre1, double calificacionTrimestre2, double calificacionTrimestre3)
    {
        for (int i = 0; i < this.listaCalificaciones.size(); i++)
        {
            if (this.listaCalificaciones.get(i).getNombreAlumno().equalsIgnoreCase(nombreAlumno))
            {
                this.listaCalificaciones.get(i).setNombreAlumno(nombreAlumno);
                this.listaCalificaciones.get(i).setNombreAsignatura(nombreAsignatura);
                this.listaCalificaciones.get(i).setCalificacionTrimestre1(calificacionTrimestre1);
                this.listaCalificaciones.get(i).setCalificacionTrimestre2(calificacionTrimestre2);
                this.listaCalificaciones.get(i).setCalificacionTrimestre3(calificacionTrimestre3);
            }
        }
    }

    @Override
    public ArrayList<Calificacion> getListaCalificaciones()
    {
        return this.listaCalificaciones;
    }

    public int size() {
        return this.listaCalificaciones.size();
    }

    

}

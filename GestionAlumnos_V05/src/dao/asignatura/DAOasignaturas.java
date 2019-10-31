/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.asignatura;

import java.util.ArrayList;
import pojo.asignatura.Asignatura;

/**
 *
 * @author RPF
 */
public class DAOasignaturas implements IDAOasignaturas
{

    //Atributos
    private static ArrayList<Asignatura> listaAsignaturas;

    //Constructores
    public DAOasignaturas()
    {
        if(this.listaAsignaturas == null)
        {
            //1ºESO
        this.listaAsignaturas = new ArrayList<Asignatura>();
        this.listaAsignaturas.add(new Asignatura("Biología y Geología", "1º ESO"));
        this.listaAsignaturas.add(new Asignatura("Geografía e Historia", "1º ESO"));
        this.listaAsignaturas.add(new Asignatura("Lengua Castellana y Literatura", "1º ESO"));
        this.listaAsignaturas.add(new Asignatura("Matemáticas", "1º ESO"));
        this.listaAsignaturas.add(new Asignatura("Primera Lengua Extranjera", "1º ESO"));
        this.listaAsignaturas.add(new Asignatura("Educación Física", "1º ESO"));
        this.listaAsignaturas.add(new Asignatura("Religión o Valores Éticos", "1º ESO"));
        this.listaAsignaturas.add(new Asignatura("Música", "1º ESO"));
        this.listaAsignaturas.add(new Asignatura("Tecnología", "1º ESO"));
        
        //2ºESO
        this.listaAsignaturas.add(new Asignatura("Biología y Geología", "2º ESO"));
        this.listaAsignaturas.add(new Asignatura("Geografía e Historia", "2º ESO"));
        this.listaAsignaturas.add(new Asignatura("Lengua Castellana y Literatura", "2º ESO"));
        this.listaAsignaturas.add(new Asignatura("Matemáticas", "2º ESO"));
        this.listaAsignaturas.add(new Asignatura("Primera Lengua Extranjera", "2º ESO"));
        this.listaAsignaturas.add(new Asignatura("Educación Física", "2º ESO"));
        this.listaAsignaturas.add(new Asignatura("Religión o Valores Éticos", "2º ESO"));
        this.listaAsignaturas.add(new Asignatura("Música", "2º ESO"));
        this.listaAsignaturas.add(new Asignatura("Tecnología", "2º ESO"));
        
        //3ºESO
        this.listaAsignaturas.add(new Asignatura("Biología y Geología", "3º ESO"));
        this.listaAsignaturas.add(new Asignatura("Física y Química", "3º ESO"));
        this.listaAsignaturas.add(new Asignatura("Geografía e Historia", "3º ESO"));
        this.listaAsignaturas.add(new Asignatura("Lengua Castellana y Literatura", "3º ESO"));
        this.listaAsignaturas.add(new Asignatura("Primera Lengua Extranjera", "3º ESO"));
        this.listaAsignaturas.add(new Asignatura("Matemáticas Orientadas a las Enseñanzas Académicas", "3ºESO"));
        this.listaAsignaturas.add(new Asignatura("Matemáticas Orientadas a las Enseñanzas Aplicadas", "3º ESO"));
        this.listaAsignaturas.add(new Asignatura("Cultura Clásica", "3º ESO"));
        this.listaAsignaturas.add(new Asignatura("Tecnología", "3º ESO"));
        
        //BACHILLERATO
        this.listaAsignaturas.add(new Asignatura("Humanidades y Ciencias Sociales", "BACHILLERATO"));
        this.listaAsignaturas.add(new Asignatura("Filosofía Lengua Castellana y Literatura", "BACHILLERATO"));
        this.listaAsignaturas.add(new Asignatura("Primera Lengua Extranjera", "BACHILLERATO"));
        this.listaAsignaturas.add(new Asignatura("Latín", "BACHILLERATO"));
        this.listaAsignaturas.add(new Asignatura("Matemáticas Aplicadas a las Ciencias", "BACHILLERATO"));
        this.listaAsignaturas.add(new Asignatura("Sociales", "BACHILLERATO"));           
        }             
    }

    @Override
    public void insertaAsignatura(Asignatura asignatura)
    {
        this.listaAsignaturas.add(asignatura);
    }

    @Override
    public void eliminaAsignatura(Asignatura asignatura)
    {
        int indice = buscaAsignatura(asignatura);

        //Si el índice no es un número negativo ( quiere decir lo ha encontrado entre 0 y lista.size())
        if (indice != -1)
        {

            //Lo eliminamos
            this.listaAsignaturas.remove(indice);
        }
    }

    @Override
    public void modificaAsigantura(String nombreAsignatura, String curso)
    {
        for (int i = 0; i < this.listaAsignaturas.size(); i++)
        {
            if (this.listaAsignaturas.get(i).getNombreAsignatura().equalsIgnoreCase(nombreAsignatura))
            {
                this.listaAsignaturas.get(i).setNombreAsignatura(nombreAsignatura);
                this.listaAsignaturas.get(i).setCurso(curso);
            }
        }
    }

    @Override
    public String muestraAsignatura()
    {
        String strListaAsignaturas = "";

        for (int i = 0; i < this.listaAsignaturas.size(); i++)
        {
            strListaAsignaturas += this.listaAsignaturas.get(i).toString() + "\n";
        }

        return strListaAsignaturas;
    }

    @Override
    public int buscaAsignatura(Asignatura a)
    {
        int indice = -1;

        for (int i = 0; i < this.listaAsignaturas.size(); i++)
        {
            if (this.listaAsignaturas.get(i).getNombreAsignatura().equalsIgnoreCase(a.getNombreAsignatura()))
            {
                indice = i;
            }
        }
        return indice;
    }
    
    @Override
    public ArrayList getListaAsignaturas()
    {
        return this.listaAsignaturas;
    }

}

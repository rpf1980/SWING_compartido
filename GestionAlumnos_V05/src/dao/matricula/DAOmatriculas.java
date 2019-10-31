/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.matricula;

import java.util.ArrayList;
import pojo.alumno.Alumno;
import pojo.matricula.Matricula;

/**
 *
 * @author RPF
 */
public class DAOmatriculas implements IDAOmatriculas
{

    //Atributos
    private static ArrayList<Matricula> listaMatriculas;

    //Constructores
    public DAOmatriculas()
    {
        if (listaMatriculas == null)
        {
            this.listaMatriculas = new ArrayList<Matricula>();
            this.listaMatriculas.add(new Matricula("131313-R", "Marcos", "Minera Morrino", "2ºDAM", "12-06-2010", ""));
            this.listaMatriculas.add(new Matricula("141414-R", "Lucía", "Azarona Marcarroni", "2ºDAM", "11-06-2010", ""));
        }
    }

    @Override
    public void insertaMatricula(Matricula matricula)
    {
        this.getListaMatriculas().add(matricula);
    }

    @Override
    public void eliminaMatricula(Matricula matricula)
    {
        int indice = buscaMatricula(matricula);

        if (indice != -1)
        {
            this.listaMatriculas.remove(indice);
        }
    }

    @Override
    public int buscaMatricula(Matricula matricula)
    {
        int indice = 0;

        for (int i = 0; i < this.listaMatriculas.size(); i++)
        {
            if (this.listaMatriculas.get(i).getNombre().equalsIgnoreCase(matricula.getNombre()))
            {
                indice = i;
            }
        }
        return indice;
    }

     public Matricula buscaMatriculaDNI(String dni)
     {
         Matricula a = new Matricula();
                       
        for(int i = 0; i < size(); i++)
        {
            a = this.listaMatriculas.get(i);
            if(a.getDni().compareToIgnoreCase(dni) == 0)
            {
                return a;
            }            
        }
        
        return a;
     }
    @Override
    public void modificaMatricula(String dni, String nombre, String apellidos, String curso, String fechaAlta, String fechaBaja)
    {
        for (int i = 0; i < this.listaMatriculas.size(); i++)
        {
            if (this.listaMatriculas.get(i).getDni().equalsIgnoreCase(dni))
            {
                this.listaMatriculas.get(i).setDni(dni);
                this.listaMatriculas.get(i).setNombre(nombre);
                this.listaMatriculas.get(i).setApellidos(apellidos);
                this.listaMatriculas.get(i).setCurso(curso);
                this.listaMatriculas.get(i).setFechaAlta(fechaAlta);
                this.listaMatriculas.get(i).setFechaBaja(fechaBaja);
            }
        }
    }

    @Override
    public String muestraListaMatriculas()
    {
        String strListaMatriculas = "";

        for (int i = 0; i < this.listaMatriculas.size(); i++)
        {
            strListaMatriculas += this.listaMatriculas.get(i).toString() + "\n";
        }

        return strListaMatriculas;
    }

    @Override
    public ArrayList getListaMatriculas()
    {
        return this.listaMatriculas;
    }

    private int size() {
        return this.listaMatriculas.size();
    }
    
    public String[] recuperaArrayMatriculas()
    {
        String[] strArray = new String[size()];
        
        for(int i = 0; i < size(); i++)
        {
            strArray[i] = this.listaMatriculas.get(i).getDni() + "   " +
                          this.listaMatriculas.get(i).getNombre();
        }
        
        return strArray;
    }

}

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
public interface IDAOasignaturas
{

    public void insertaAsignatura(Asignatura asignatura);

    public void eliminaAsignatura(Asignatura asignatura);

    public void modificaAsigantura(String nombreAsignatura, String curso);

    public String muestraAsignatura();

    public int buscaAsignatura(Asignatura asignatura);
    
    public ArrayList getListaAsignaturas();
}

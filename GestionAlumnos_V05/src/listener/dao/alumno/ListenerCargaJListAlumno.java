/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener.dao.alumno;

import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import pojo.alumno.Alumno;
import dao.alumno.DAOAlumno;

/**
 *
 * @author RPF
 */
public class ListenerCargaJListAlumno 
{
    public void cargaEnJListDaoAlumnos(JList jlist, ArrayList<DAOAlumno> daoAlumnosLista)
    {
        DefaultListModel listModel = new DefaultListModel();
        
        for (int i = 0; i < daoAlumnosLista.size(); i++)
        {
            listModel.addElement(daoAlumnosLista.get(i));
        }
    }
}

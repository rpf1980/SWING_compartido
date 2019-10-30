/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener.dao.calificacion;

import java.util.*;
import javax.swing.*;
import pojo.calificacion.Calificacion;
import dao.calificacion.DAOcalificaciones;
import dao.matricula.DAOmatriculas;

/**
 *
 * @author RPF
 */
public class ListenerCargaJListCalificacion
{
    public void cargaEnListaDaoCalificaciones(JList jlist, ArrayList<DAOcalificaciones> daoCalificaciones)
    {
        DefaultListModel listModel = new DefaultListModel();
        
        for (int i = 0; i < daoCalificaciones.size(); i++)
        {
            listModel.addElement(daoCalificaciones.get(i));
        }
    }
}

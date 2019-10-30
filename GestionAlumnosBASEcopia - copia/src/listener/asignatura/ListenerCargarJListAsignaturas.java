/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener.asignatura;

import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import pojo.asignatura.Asignatura;
import dao.asignatura.DAOasignaturas;

/**
 *
 * @author RPF
 */
public class ListenerCargarJListAsignaturas
{
    public void cargaEnJListDaoAsignaturas(JList jlist, ArrayList<DAOasignaturas> daoAsignaturaLista)
    {
        DefaultListModel listModel = new DefaultListModel();
        
        for (int i = 0; i < daoAsignaturaLista.size(); i++)
        {
            listModel.addElement(daoAsignaturaLista.get(i));
        }
    }
}

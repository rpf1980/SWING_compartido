/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener.dao.matricula;

import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import pojo.matricula.Matricula;
import dao.matricula.DAOmatriculas;

/**
 *
 * @author RPF
 */
public class ListenerCargaJListMatricula
{
    public void cargaEnJListDaoMatriculas(JList jlist, ArrayList<DAOmatriculas> daoMatriculasLista)
    {
        DefaultListModel lisModel = new DefaultListModel();
        
        for (int i = 0; i < daoMatriculasLista.size(); i++)
        {
            lisModel.addElement(daoMatriculasLista.get(i));
        }
    }
}

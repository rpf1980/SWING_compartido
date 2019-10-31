/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.matricula;

import java.util.ArrayList;
import pojo.matricula.Matricula;

/**
 *
 * @author RPF
 */
public interface IDAOmatriculas
{

    public void insertaMatricula(Matricula matricula);

    public void eliminaMatricula(Matricula matricula);

    public int buscaMatricula(Matricula matricula);
     
    public Matricula buscaMatriculaDNI(String dni);

    public void modificaMatricula(String dni, String nombre, String apellidos,
            String curso, String fechaAlta, String fechaBaja);

    public String muestraListaMatriculas();
    
    public String[] recuperaArrayMatriculas();
    
    public ArrayList getListaMatriculas();
    
}

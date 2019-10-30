/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo.asignatura;

/**
 *
 * @author RPF
 */
public class Asignatura {
        //Atributos
	private String nombreAsignatura;
	private String curso;
	
	//Constructores
	public Asignatura() {}
	
	//Propiedades de los atributos ( Getter && Setter )
	public Asignatura(String nombreAsignatura, String curso) 
	{
		this.setNombreAsignatura(nombreAsignatura);
		this.setCurso(curso);
	}

	public String getNombreAsignatura()
	{
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura)
	{
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getCurso()
	{
		return curso;
	}

	public void setCurso(String curso)
	{
		this.curso = curso;
	}
	
}

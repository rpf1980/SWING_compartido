/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo.alumno;

/**
 *
 * @author RPF
 */
public class Alumno {
    //Atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private String curso;
	private String fechaNac;
	
	//Constructores
	public Alumno() {}
	
	public Alumno (String dni, String nombre, String apellidos,
				   String curso, String fechaNac)
	{
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setCurso(curso);
		this.setFechaNac(fechaNac);	
	}

	//Propiedades de los atributos ( Getter && Setter )
	public String getDni() 
	{
		return dni;
	}

	public void setDni(String dni) 
	{
		this.dni = dni;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellidos() 
	{
		return apellidos;
	}

	public void setApellidos(String apellidos) 
	{
		this.apellidos = apellidos;
	}

	public String getCurso() 
	{
		return curso;
	}

	public void setCurso(String curso) 
	{
		this.curso = curso;
	}

	public String getFechaNac() 
	{
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) 
	{
		this.fechaNac = fechaNac;
	}
	
	//Métodos
	@Override
	public String toString() 
	{
		
		return "DNI: " 				+ getDni() + "\n" +
			   "Nombre: " 			+ getNombre() + "\n" +
			   "Apellidos: "		+ getApellidos() + "\n" +
			   "Curso: " 		    + getCurso() + "\n" +
			   "Fecha nacimiento: " + getFechaNac();
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo.calificacion;

/**
 *
 * @author RPF
 */
public class Calificacion
{
    //Atributos
	
    private String nombreAlumno;
    private String apellidos;
    private String nombreAsignatura;
    private double calificacionTrimestre1;
    private double calificacionTrimestre2;
    private double calificacionTrimestre3;
	
    //Constructores
    public Calificacion() {}
	
    public Calificacion(String nombreAlumno, String apellidos, String nombreAsignatura, double calificacionTrimestre1,
			double calificacionTrimestre2, double calificacionTrimestre3) 
    {
	this.nombreAlumno = nombreAlumno;
        this.apellidos = apellidos;
        this.nombreAsignatura = nombreAsignatura;
        this.calificacionTrimestre1 = calificacionTrimestre1;
        this.calificacionTrimestre2 = calificacionTrimestre2;
        this.calificacionTrimestre3 = calificacionTrimestre3;
    }

	//Propiedades de los atributos ( Getter && Setter )
	public String getNombreAlumno()
	{
            return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno)
	{
            this.nombreAlumno = nombreAlumno;
	}

        public String getApellidos()
        {
            return this.apellidos;
        }
        
        public void setApellidos(String apellidos)
        {
            this.apellidos = apellidos;
        }
        
	public String getNombreAsignatura()
	{
            return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura)
	{
            this.nombreAsignatura = nombreAsignatura;
	}

	public double getCalificacionTrimestre1()
	{
            return calificacionTrimestre1;
	}

	public void setCalificacionTrimestre1(double calificacionTrimestre1)
	{
            this.calificacionTrimestre1 = calificacionTrimestre1;
	}

	public double getCalificacionTrimestre2()
	{
            return calificacionTrimestre2;
	}

	public void setCalificacionTrimestre2(double calificacionTrimestre2)
	{
            this.calificacionTrimestre2 = calificacionTrimestre2;
	}

	public double getCalificacionTrimestre3()
	{
            return calificacionTrimestre3;
	}

	public void setCalificacionTrimestre3(double calificacionTrimestre3)
	{
            this.calificacionTrimestre3 = calificacionTrimestre3;
	}
        
        @Override
        public String toString()
        {
            return "NOMBRE: "               + getNombreAlumno() + "\n" +
                   "APELLIDOS: "            + getApellidos() + "\n" +
                   "ASIGNATURA: "           + getNombreAsignatura() + "\n" +
                   "NOTAS 1º TRIMESTRE: "   + getCalificacionTrimestre1() + "\n" +
                   "NOTAS 2º TRIMESTRE: "   + getCalificacionTrimestre2() + "\n" +
                   "NOTAS 3º TRIMESTRE: "   + getCalificacionTrimestre3();
        }
}

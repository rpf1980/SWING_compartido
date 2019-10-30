/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo.matricula;

/**
 *
 * @author RPF
 */
public class Matricula
{

    //Atributos

    private String dni;
    private String nombre;
    private String apellidos;
    private String curso;
    private String fechaAlta;
    private String fechaBaja;

    //Constructores
    public Matricula()
    {
    }

    public Matricula(String dni, String nombre, String apellidos, String curso,
            String fechaAlta, String fechaBaja)
    {

        this.setDni(dni);
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setCurso(curso);
        this.setFechaAlta(fechaAlta);
        this.setFechaBaja(fechaBaja);
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

    public String getFechaAlta()
    {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta)
    {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja()
    {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja)
    {
        this.fechaBaja = fechaBaja;
    }
    
    @Override
    public String toString()
    {
        return "DNI: "              + getDni()+ "\n" +
               "NOMBRE: "           + getNombre() + "\n" +
               "APELLIDOS: "        + getApellidos() + "\n" +
               "CURSO: "            + getFechaAlta() + "\n" +
               "FECHA ALTA: "       + getFechaBaja();
    }
}

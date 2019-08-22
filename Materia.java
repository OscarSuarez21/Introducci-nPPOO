/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosTarea;

/**
 *
 * @author Oscar
 */
public class Materia {
    
    private String Nombre;
    private double Credito;
    private String Docente;
    private Carrera carrera;

    public Materia() {
    }

    public Materia(String Nombre, double Credito, String Docente, Carrera carrera) {
        this.Nombre = Nombre;
        this.Credito = Credito;
        this.Docente = Docente;
        this.carrera = carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCredito() {
        return Credito;
    }

    public void setCredito(double Credito) {
        this.Credito = Credito;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
    
}

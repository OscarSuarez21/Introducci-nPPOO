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
public class Carrera {
    private String Nombre;
    private int NumeroCiclos;
    private double NumerosCreditos;

    public Carrera() {
    }

    public Carrera(String Nombre, int NumeroCiclos, double NumerosCreditos) {
        this.Nombre = Nombre;
        this.NumeroCiclos = NumeroCiclos;
        this.NumerosCreditos = NumerosCreditos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroCiclos() {
        return NumeroCiclos;
    }

    public void setNumeroCiclos(int NumeroCiclos) {
        this.NumeroCiclos = NumeroCiclos;
    }

    public double getNumerosCreditos() {
        return NumerosCreditos;
    }

    public void setNumerosCreditos(double NumerosCreditos) {
        this.NumerosCreditos = NumerosCreditos;
    }
    
    
    
}

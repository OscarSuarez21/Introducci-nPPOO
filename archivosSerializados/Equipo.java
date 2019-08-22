/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializados;

import java.io.Serializable;

/**
 *
 * @author IST.LOJA
 */
public class Equipo implements Serializable {
    
    private String Nombre;
    private int numeroTitulos;
    private String Ciudad;

    public Equipo() {
    }

    public Equipo(String Nombre, int numeroTitulos, String Ciudad) {
        this.Nombre = Nombre;
        this.numeroTitulos = numeroTitulos;
        this.Ciudad = Ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroTitulos() {
        return numeroTitulos;
    }

    public void setNumeroTitulos(int numeroTitulos) {
        this.numeroTitulos = numeroTitulos;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.io.Serializable;

/**
 *
 * @author IST.LOJA
 */
public class Autor implements Serializable {
    
    private String Nombre;
    private String Apellido;
    private String Pais;
    private int Edad;
    private int LibrosPublicados;

    public Autor() {
    }

    public Autor(String Nombre, String Apellido, String Pais, int Edad, int LibrosPublicados) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Pais = Pais;
        this.Edad = Edad;
        this.LibrosPublicados = LibrosPublicados;
    }

   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getLibrosPublicados() {
        return LibrosPublicados;
    }

    public void setLibrosPublicados(int LibrosPublicados) {
        this.LibrosPublicados = LibrosPublicados;
    }
    
    
}

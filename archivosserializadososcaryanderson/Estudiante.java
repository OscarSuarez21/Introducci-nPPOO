/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosserializadososcaryanderson;

import java.io.Serializable;

/**
 *
 * @author its loja
 */
public class Estudiante implements Serializable {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private double Promedio;
    private Direccion dirrecion;
    private Curso curso; 

    public Estudiante() {
    }

    public Estudiante(String Nombre, String Apellido, int Edad, double Promedio, Direccion dirrecion, Curso curso) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Promedio = Promedio;
        this.dirrecion = dirrecion;
        this.curso = curso;
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public Direccion getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(Direccion dirrecion) {
        this.dirrecion = dirrecion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}

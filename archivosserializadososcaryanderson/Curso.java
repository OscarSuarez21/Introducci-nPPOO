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
public class Curso implements Serializable{
    
    private String Carrera;
    private String Nombre;
    private int NumCiclo;
    private int NumEstudiantes;

    public Curso() {
    }

    public Curso(String Carrera, String Nombre, int NumCiclo, int NumEstudiantes) {
        this.Carrera = Carrera;
        this.Nombre = Nombre;
        this.NumCiclo = NumCiclo;
        this.NumEstudiantes = NumEstudiantes;
    }
    

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumCiclo() {
        return NumCiclo;
    }

    public void setNumCiclo(int NumCiclo) {
        this.NumCiclo = NumCiclo;
    }

    public int getNumEstudiantes() {
        return NumEstudiantes;
    }

    public void setNumEstudiantes(int NumEstudiantes) {
        this.NumEstudiantes = NumEstudiantes;
    }
    
    
    
}

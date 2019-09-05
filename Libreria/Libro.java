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
public class Libro implements Serializable {
    
    private String NombreLibro;
    private int NumPaginas;
    private String TipoLibro;
    private int Añodepublicacion;
    private Autor autor;

    public Libro() {
    }

    public Libro(String NombreLibro, int NumPaginas, String TipoLibro, int Añodepublicacion, Autor autor) {
        this.NombreLibro = NombreLibro;
        this.NumPaginas = NumPaginas;
        this.TipoLibro = TipoLibro;
        this.Añodepublicacion = Añodepublicacion;
        this.autor = autor;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public String getTipoLibro() {
        return TipoLibro;
    }

    public void setTipoLibro(String TipoLibro) {
        this.TipoLibro = TipoLibro;
    }

    public int getAñodepublicacion() {
        return Añodepublicacion;
    }

    public void setAñodepublicacion(int Añodepublicacion) {
        this.Añodepublicacion = Añodepublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
}

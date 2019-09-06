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
public class Direccion implements Serializable{
    
    private String Ciudad;
    private String Calle;
    private int NumCasa;

    public Direccion() {
    }

    public Direccion(String Ciudad, String Calle, int NumCasa) {
        this.Ciudad = Ciudad;
        this.Calle = Calle;
        this.NumCasa = NumCasa;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumCasa() {
        return NumCasa;
    }

    public void setNumCasa(int NumCasa) {
        this.NumCasa = NumCasa;
    }
    
    
}

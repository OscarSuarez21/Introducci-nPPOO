/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Oscar
 */
public class Estudiante {

    private String Nombres, Apellidos, Fecha_Nacimiento,Correo,Telefono;

   
    
    public Estudiante(String Nombres, String Apellidos, String Fecha_Nacimiento , String Correo, String Telefono) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public Estudiante() {
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNumero_Id() {
        return Fecha_Nacimiento;
    }

    public void setNumero_Id(String Numero_Id) {
        this.Fecha_Nacimiento = Numero_Id;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

//    @Override
//    public String toString() {
//        return "Estudiante{" + "Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Numero_Id=" + Fecha_Nacimiento + ", Correo=" + Correo + ", Telefono=" + Telefono + '}';
//    }
    
    
   

    
    

   
    

    
    }
    
    


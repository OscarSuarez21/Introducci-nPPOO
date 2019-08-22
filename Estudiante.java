/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosTarea;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Estudiante {
    
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int Edad;
    private Materia materia;

    public Estudiante() {
    }

    public Estudiante(String Nombre, String Apellido, String Direccion, int Edad, Materia materia) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Edad = Edad;
        this.materia = materia;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    
    
    public void leerLista (String direccion) {
        try{
            ObjectInputStream lector = new ObjectInputStream (new FileInputStream (direccion));
            Object auxiliar = lector.readObject();
            while(auxiliar ! = null){
            Estudiante E1= (Estudiante) auxiliar;
            System.out.println(E1.getNombre());
            auxiliar = lector.readObject();
        }
        }catch (Exception e){
            System.out.println(e);
            
        }
    
    
    }
    
    public void escribirLista(String direccion, List<Estudiante> Lista){
        try{
            ObjectOutputStream escritor = new ObjectOutputStream (new FileOutputStream (direccion));
            for (Estudiante estudiante : lista ){
                escritor.writeObject(estudiante);
            }
            escritor.close();
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        Estudiante E = new Estudiante ("Oscar","Suarez","Vilcabamba",25, new Materia());
        System.out.println("El Nombre y Apellido del estudiante es: " + E.getNombre()+ E.getApellido());
        
        Estudiante E1 =  new  Estudiante ( " Oscar " ,"Suarez", " Vilcabamba " , 18 , " lenjuaje ");
        Estudiante E2 =  new  Estudiante ( " Oscar " ,"Suarez", " Vilcabamba " , 18 , " historia " );
        Estudiante E3 =  new Estudiante ( " Oscar " ,"Suarez",  " Vilcabamba " , 18 , " matematica " );
        Estudiante E4 =  new Estudiante ( " Oscar " ,"Suarez", " Vilcabamba " , 18 , " Etica " );
        Estudiante E5 =  new Estudiante ( " Oscar " ,"Suarez", " Vilcabamba " , 18 , "contavilidad" );
        Estudiante E6 =  new Estudiante ( " Oscar " , "Suarez", " Vilcabamba " , 18 , " quimica " );
        Estudiante E7 =  new Estudiante ( " Oscar"  ,"Suarez", " Vilcabamba " , 18 , " matematica " );
        Estudiante E8 =  new  Estudiante ( " Oscar " ,"Suarez", " Vilcabamba " , 18 , " lenguaje " );
        Estudiante E9 =  new  Estudiante ( " Oscar " , "Suarez", " Vilcabamba" , 18 , " fisica " );
        Estudiante E10 =  new  Estudiante ( " Oscar " ,"Suarez", " Vilcabamba " , 18 , " historia " );
        
        lista <Estudiante> lista = new ArrayList <>();
        lista.add(E);
        lista.add(E1);
        lista.add(E2);
        lista.add(E3);
        lista.add(E4);
        lista.add(E5);
        lista.add(E6);
        lista.add(E7);
        lista.add(E8);
        lista.add(E9);
        lista.add(E10);
        
        int a = lista.size();
        System.out.println(a);
        for(Estudiante estudiante: lista){
            System.out.println(" El Nombre y el Apellido del estudiante es: " E.getNombre()+ E.getApellido());
        }
        a.escrbirLista("C:\\Users\\Oscar\\Desktop\\Tarea Archivos.txt");
        
        
    }
}

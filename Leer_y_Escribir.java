/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos_Serializados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IST.LOJA
 */
public class Leer_y_Escribir {

    public void escribirObjeto(String direccion, Persona p1) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(p1);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error" + e);

        }

    }

    public void leerLista(String url) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Persona p1 = (Persona) auxiliar;
                System.out.println(p1.getMascota().getNombre() + "su edad es:" + p1.getMascota());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void leerArchivos(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object Auxiliar = lector.readObject();
            Persona p1 = (Persona) Auxiliar;
            System.out.println(p1.getMascota().getNombre() + " su edad es " + p1.getMascota().getEdad());
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public List<Persona> leerPersona(String url) {

        List<Persona> lista = new ArrayList<>();
       try{ 
          ObjectInputStream lector =new ObjectInputStream ( new FileInputStream(url));
          Object Auxiliar = lector.readObject();
          while (Auxiliar != null)  {
           Persona p1 =(Persona) Auxiliar;
           lista.add(p1);
           Auxiliar = lector.readObject();
       }
       }catch (Exception e){
           System.out.println(e);
       }
       return lista;

       
    }

    public void escribirlista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) {//for para recorer una lista 
                escritor.writeObject(persona);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se ha producido un error" + e);
        }
    }

    public static void main(String[] args) {
        Leer_y_Escribir objeto = new Leer_y_Escribir();
        Persona p2 = new Persona("Francelito", "Pineda", "098365", 21, new Mascota("Max", 2, 4));
        Persona p1 = new Persona("Celio", "alvarado", "098365", 20, new Mascota("lobo", 2, 4));
        Persona p3 = new Persona("Jhon", "puglla", "09845365", 21, new Mascota("juy", 2, 4));
        Persona p4 = new Persona("Vcente ", "Luzuriaga", "098365", 21, new Mascota("Max", 2, 4));
        List<Persona> lista = new ArrayList<>();//creamo la lista para guardar objetos
        //un avez que creamos la lista, ponemo los objetos dentro de ella
        lista.add(p1);
        lista.add(p2);
        
        lista.add(p3);
        lista.add(p4);

        int a = lista.size();
        System.out.println(a);//obtengo el tamaño de la lista
         //for(Persona persona : lista){
           //  System.out.println(persona.getNombre());//for nos sirve para recorrer una lista

         //objeto.escribirlista("C:\\Users\\IST.LOJA\\Desktop\\Ejemplo 1.txt", lista);
        // objeto.escribirObjeto("\\Users\\IST.LOJA\\Desktop\\Ejemplo 1.txt",p2);
        List <Persona> b=objeto.leerPersona("\"C:\\\\Users\\\\IST.LOJA\\\\Desktop\\\\Ejemplo 1.txt\"");
        //objeto.leerLista("C:\\Users\\IST.LOJA\\Desktop\\Ejemplo 1.txt");
        
        

    }
}


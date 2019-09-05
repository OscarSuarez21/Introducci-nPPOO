/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import archivosSerializados.Jugador;
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
public class Ejecutar {
    
    public void escribirObjeto(String direccion, Libro L) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(L);
            escritor.close();
            
        } catch (Exception e) {
            System.out.println("se produjo un error" + e);

        }
    }
    
    public void leerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro L = (Libro) auxiliar;
                System.out.println(L.getAutor().getNombre() + "su nombre es:" + L.getAutor());
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
            Libro L = (Libro) Auxiliar;
            System.out.println(L.getAutor().getEdad()+ " su edad es " + L.getAutor().getPais());
            
        } catch (Exception e) {
            System.out.println(e);

        }
    }
     
      public void escribirlista(String direccion, List<Libro> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Libro libro : lista) {
                escritor.writeObject(libro);
            }
            escritor.close();
            
        } catch (Exception e) {
            System.out.println("se ha producido un error" + e);
        }
    }
      
      public List<Libro> leerLibro(String url) {

        List<Libro> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object Auxiliar = lector.readObject();
            while (Auxiliar != null) {
                Libro L = (Libro) Auxiliar;
                lista.add(L);
                Auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;

    }
      public int LibromasAntiguo(List<Libro> lista) {
        int libromasantiguo = lista.get(0).getAñodepublicacion();
        for (Libro libro : lista) {
            //System.out.println("El libro mas antiguo es:" + libromasantiguo + "El año del libro es es:" + libro.getAñodepublicacion());
            if (libro.getAñodepublicacion()< libromasantiguo) {
                libromasantiguo = libro.getAñodepublicacion();
            }
        }
        return libromasantiguo;

    }
      
      
      public int LibroActulizado(List<Libro> lista) {
        int libroactualizado = lista.get(0).getAñodepublicacion();
        for (Libro libro : lista) {
            //System.out.println("El libro masactualizado es:" +libroactualizado  + "El año del libro es es:" + libro.getAñodepublicacion());
            if (libro.getAñodepublicacion()>= 5) {
                libroactualizado = libro.getAñodepublicacion();
            }
        }
        return libroactualizado;

      }
       public static void main(String[] args) {
        Ejecutar objeto = new Ejecutar();
        
        Libro L1 = new Libro ("las mil y una noche",170,"Cuentos",1704,new Autor("Edward","Lane","India",45,36));
        Libro L2 = new Libro ("Historia de dos ciudades",120,"Novela",1874,new Autor("V.S","Ramachandran","Rusia",51,150));
        Libro L3 = new Libro ("Gerra y paz",69,"Literatura",1869,new Autor("Leon","Tolstoi","Rusia",36,58));
        Libro L4 = new Libro ("Lo que el cerebro nos dice ",159,"Ciencia",2012,new Autor("","Lane","India",45,32));
        Libro L5 = new Libro ("Orgullo y Prejuicio",132,"Novela",1813,new Autor("Jane","Austen","EE UU",40,20));
        
        List<Libro> lista = new ArrayList<>();

        lista.add(L1);
        lista.add(L2);
        lista.add(L3);
        lista.add(L4);
        lista.add(L5);
        
        int a = lista.size();

        System.out.println(a);

       
       objeto.leerLista("C:\\Users\\IST.LOJA\\Desktop\\Libreria.txt");
//       objeto.escribirObjeto("C:\\Users\\IST.LOJA\\Desktop\\Libreria.txt", L1);
//        objeto.escribirlista("C:\\Users\\IST.LOJA\\Desktop\\Libreria.txt", lista);
//        objeto.leerArchivos("C:\\Users\\IST.LOJA\\Desktop\\Libreria.txt");
       
        List<Libro> L = objeto.leerLibro("C:\\Users\\IST.LOJA\\Desktop\\Libreria.txt");
        
        System.out.println("el libro mas antiguo  es  " +objeto.LibromasAntiguo(L));
         System.out.println("el libro mas actulizado  es  " +objeto.LibroActulizado(L));
}
       
}










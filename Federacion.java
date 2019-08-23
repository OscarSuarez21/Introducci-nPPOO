/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IST.LOJA
 */
public class Federacion implements Serializable{
    
    private String Nombre;
    private String Pais;
    private int numEquipo;

    public Federacion() {
    }

    public Federacion(String Nombre, String Pais, int numEquipo) {
        this.Nombre = Nombre;
        this.Pais = Pais;
        this.numEquipo = numEquipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getNumEquipo() {
        return numEquipo;
    }

    public void setNumEquipo(int numEquipo) {
        this.numEquipo = numEquipo;
    }
    
    
    
    
    public void escribirObjeto(String direccion, Federacion F) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(F);
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
                Federacion F = (Federacion) auxiliar;
                System.out.println(F.getNombre() + "su nimbre es:" + F.getPais()+"su pais es"+F.getNumEquipo()+"su equipo es ");
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
            Federacion F = (Federacion) Auxiliar;
            System.out.println(F.getNombre() + " su nombre es " +F.getPais()+"su pais es" +F.getNumEquipo()+"su equpo es");
        } catch (Exception e) {
            System.out.println(e);

        }
    }
     
     public void escribirlista(String direccion, List<Federacion> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Federacion federacion : lista) {
                escritor.writeObject(federacion);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se ha producido un error" + e);
        }
    }
     
     public List<Federacion> leerFederacion(String url) {

        List<Federacion> lista = new ArrayList<>();
       try{ 
          ObjectInputStream lector =new ObjectInputStream ( new FileInputStream(url));
          Object Auxiliar = lector.readObject();
          while (Auxiliar != null)  {
           Federacion F =(Federacion) Auxiliar;
           lista.add(F);
           Auxiliar = lector.readObject();
       }
       }catch (Exception e){
           System.out.println(e);
       }
       return lista;

       
    }
     
     
    
    public static void main(String[] args) {
       Federacion objeto = new Federacion();
       
        Federacion F1 = new Federacion("Chilena","Chile", 13);
        Federacion F2 = new Federacion("Boliviana","Bolivia",10);
        
         List<Federacion> lista = new ArrayList<>();
         
         lista.add(F1);
         lista.add(F2);
         
          int a = lista.size();
        System.out.println(a);
        
        objeto.leerLista("C:\\Users\\IST.LOJA\\Desktop\\federacion.txt");
        objeto.escribirObjeto("C:\\Users\\IST.LOJA\\Desktop\\federacion.txt",F1);
        objeto.escribirlista("C:\\Users\\IST.LOJA\\Desktop\\federacion.txt", lista);
         List <Federacion> b=objeto.leerFederacion("C:\\Users\\IST.LOJA\\Desktop\\federacion.txt");
}
}
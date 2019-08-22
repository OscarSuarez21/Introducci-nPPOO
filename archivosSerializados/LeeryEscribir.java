/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializados;

import Archivos_Serializados.Persona;
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
public class LeeryEscribir {
    
    public void escribirObjeto(String direccion, Jugador j1) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(j1);
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
                Jugador j1 = (Jugador) auxiliar;
                System.out.println(j1.getEquipo().getNombre() + "su edad es:" + j1.getEquipo());
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
            Jugador j1 = (Jugador) Auxiliar;
            System.out.println(j1.getEquipo().getNombre() + " su edad es " + j1.getEquipo().getCiudad());
        } catch (Exception e) {
            System.out.println(e);

        }
    }
     
     
     
    public void escribirlista(String direccion, List<Jugador> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Jugador jugador : lista) {
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se ha producido un error" + e);
        }
    }
    
    public List<Jugador> leerJugador(String url) {

        List<Jugador> lista = new ArrayList<>();
       try{ 
          ObjectInputStream lector =new ObjectInputStream ( new FileInputStream(url));
          Object Auxiliar = lector.readObject();
          while (Auxiliar != null)  {
           Jugador j1 =(Jugador) Auxiliar;
           lista.add(j1);
           Auxiliar = lector.readObject();
       }
       }catch (Exception e){
           System.out.println(e);
       }
       return lista;

       
    }

    public int edadMayor (List<Jugador>lista){
            int edadmayor=lista.get(0).getEdad();
            for(Jugador jugador:lista){
                System.out.println("El valor mayor es:" +edadmayor+ "La edad del objeto es:" +jugador.getEdad());
                if(jugador.getEdad()> edadmayor){
                    edadmayor = jugador.getEdad();
                }
            }
        return edadmayor;
            
                    
    }
    public Jugador edadmenorObjeto(List<Jugador>lista){
        Jugador edadmenor = lista.get(0);
        for(Jugador jugador : lista){
            if(edadmenor.getEdad()>jugador.getEdad()){
                edadmenor =jugador;
                }
    }
        return edadmenor;
    }
    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Jugador j1 = new Jugador("Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"));
        Jugador j2 = new Jugador("Lionel", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"));
        Jugador j3 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"));
        Jugador j4 = new Jugador("Eden", "Hazard", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Madrid"));

        List<Jugador> lista = new ArrayList<>();
       

        lista.add(j1);
        lista.add(j2);

        lista.add(j3);
        lista.add(j4);

        int a = lista.size();
        System.out.println(a);
        objeto.leerLista("C:\\Users\\IST.LOJA\\Desktop\\Jugadores.txt");
        objeto.escribirObjeto("C:\\Users\\IST.LOJA\\Desktop\\Jugadores.txt", j1);
        objeto.escribirlista("C:\\Users\\IST.LOJA\\Desktop\\Jugadores.txt", lista);
         List <Jugador> b=objeto.leerJugador("C:\\Users\\IST.LOJA\\Desktop\\Jugadores.txt");
         
        
        }
        
        
        
    }

    


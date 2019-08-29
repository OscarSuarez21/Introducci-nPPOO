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
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object Auxiliar = lector.readObject();
            while (Auxiliar != null) {
                Jugador j1 = (Jugador) Auxiliar;
                lista.add(j1);
                Auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;

    }

    public int edadMayor(List<Jugador> lista) {
        int edadmayor = lista.get(0).getEdad();
        for (Jugador jugador : lista) {
            System.out.println("El valor mayor es:" + edadmayor + "La edad del objeto es:" + jugador.getEdad());
            if (jugador.getEdad() > edadmayor) {
                edadmayor = jugador.getEdad();
            }
        }
        return edadmayor;

    }

    public Jugador edadmenorObjeto(List<Jugador> lista) {
        Jugador edadmenor = lista.get(0);
        for (Jugador jugador : lista) {
            if (edadmenor.getEdad() > jugador.getEdad()) {
                edadmenor = jugador;
            }
        }
        return edadmenor;
    }

    public Jugador masGoles(List<Jugador> lista) {
        Jugador mayorgoles = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getNumeroGoles() > mayorgoles.getNumeroGoles()) {
                mayorgoles = jugador;
            }
        }
        return mayorgoles;
    }

    public Jugador debutoP(List<Jugador> lista) {
        Jugador debutoP = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getAñoDebut() > debutoP.getAñoDebut()) {

            }
        }
        return debutoP;
    }

    public Jugador masTitulos(List<Jugador> lista) {
        Jugador mastitulos = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getEquipo().getNumeroTitulos() > mastitulos.getEquipo().getNumeroTitulos()) {

            }
        }
        return mastitulos;
    }

    public double PctjdeAciertos(Jugador jugadorpro) {
        return (jugadorpro.getNumeroGoles() + jugadorpro.getAsistencias()) / jugadorpro.getFallosGol();

    }

    public double PctjdeEfectividad(Jugador jugadorefc) {
        return (jugadorefc.getPasesCompletados() / jugadorefc.getPerdidadeBalon());

    }

    public double EficienciaJugador(Jugador jugadorEF) {
        return (PctjdeAciertos(jugadorEF) + PctjdeEfectividad(jugadorEF) + jugadorEF.getKmRecoridos());
    }

    public Jugador MayorEficiencia(List<Jugador> lista) {
        Jugador mayoreficiencia = lista.get(0);
        for (Jugador jugador : lista) {
            if (EficienciaJugador(jugador) > EficienciaJugador(mayoreficiencia)) {

            }

        }
        return mayoreficiencia;
    }

    public Jugador MayorPctjAcirtos(List<Jugador> lista) {
        Jugador mayorpctjciertos = lista.get(0);
        for (Jugador jugador : lista) {
            if (PctjdeAciertos(jugador) > PctjdeAciertos(mayorpctjciertos)) {

            }
        }
        return mayorpctjciertos;
    }

    public Jugador MayorEfectividadJugador(List<Jugador> lista) {
        Jugador mayorefecjugador = lista.get(0);
        for (Jugador jugador : lista) {
            if (PctjdeEfectividad(jugador) > PctjdeEfectividad(mayorefecjugador)) {

            }
        }
        return mayorefecjugador;
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();

        Jugador j1 = new Jugador("Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"), 1, 3, 7.5, 8, 8);
        Jugador j2 = new Jugador("Lionel", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"), 2, 3, 4.5, 8, 6);
        Jugador j3 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"), 5, 3, 5.5, 8, 11);
        Jugador j4 = new Jugador("Eden", "Hazard", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Madrid"), 3, 1, 7.5, 5, 9);

        List<Jugador> lista = new ArrayList<>();

        lista.add(j1);
        lista.add(j2);

        lista.add(j3);
        lista.add(j4);

        int a = lista.size();

        System.out.println(a);
        objeto.leerLista("C:\\Users\\IST.LOJA\\Desktop\\Jugadores.txt");
       //objeto.escribirObjeto("C:\\Users\\IST.LOJA\\Desktop\\Jugadores.txt", j1);
        //objeto.escribirlista("C:\\Users\\IST.LOJA\\Desktop\\Jugadores.txt", lista);
        List<Jugador> b = objeto.leerJugador("C:\\Users\\IST.LOJA\\Desktop\\Jugadores.txt");

        System.out.println("el jugador con menor edad es  " + objeto.edadmenorObjeto(b).getNombre());
        System.out.println("el jugador que mas pronto debuto es " + " " + objeto.debutoP(b).getNombre() + " y su año de dedut" + " " + objeto.debutoP(b).getAñoDebut());
        System.out.println("el equipo com mas titulos obtenidos es " + " " + objeto.masTitulos(b).getNombre() + "con " + " " + objeto.masTitulos(b).getEquipo().getNumeroTitulos() + " " + "titulos");
        System.out.println(" el jugador mas eficiente es " + objeto.MayorEficiencia(b).getNombre());
        System.out.println(" el jugador mas eficiente es " + objeto.MayorPctjAcirtos(b).getNombre());
        System.out.println(" el jugador mas eficiente es " + objeto.MayorEfectividadJugador(b).getNombre());
    }

}

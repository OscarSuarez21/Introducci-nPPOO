/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosserializadososcaryanderson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author its loja
 */
public class Ejecutar {
    
    
    public void escribirObjeto(String direccion,Estudiante Es) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(Es);
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
                Estudiante Es = (Estudiante) auxiliar;
                System.out.println(Es.getCurso().getCarrera() + "su carrera es:" +Es.getCurso());
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
            Estudiante Es = (Estudiante) Auxiliar;
            System.out.println(Es.getDirrecion().getCalle()+ " su calle es " +Es.getDirrecion().getNumCasa());
            
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    
    public void escribirlista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante Es : lista) {
                escritor.writeObject(Es);
            }
            escritor.close();
            
        } catch (Exception e) {
            System.out.println("se ha producido un error" + e);
        }
    }
    
     public List<Estudiante> leerEstudiante(String url) {

        List<Estudiante> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object Auxiliar = lector.readObject();
            while (Auxiliar != null) {
                Estudiante Es= (Estudiante) Auxiliar;
                lista.add(Es);
                Auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;

}
      public Estudiante EdadMenor(List<Estudiante> lista) {
        Estudiante mayor = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (estudiante.getEdad()<=18) {
             mayor = estudiante;
            System.out.println("El alumno con menor edad es :" +estudiante.getNombre()+" "+estudiante.getApellido() + " Su edad es: " + estudiante.getEdad());
        }else{
        }
    }
        return mayor;
    }
      
     public Estudiante MayorPromedio(List<Estudiante> lista) {
        Estudiante mayor = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (estudiante.getPromedio()>mayor.getPromedio()) {
             mayor = estudiante;
            System.out.println("El alunmo con mayor promedio es :" +estudiante.getNombre()+" "+estudiante.getApellido() + " Su promedio es: " + estudiante.getPromedio());
        }else{
        }
    }
        return mayor;
    }
     public Estudiante MayorEstudiantes(List<Estudiante>lista){
         Estudiante cantestudiante=lista.get(0);
         for(Estudiante estudiante: lista){
             if(estudiante.getCurso().getNumEstudiantes()>cantestudiante.getCurso().getNumEstudiantes()){
                 cantestudiante=estudiante;
                 System.out.println("El curso con mayor estudiantes es :" +estudiante.getCurso());
             }else{
                 
             }
         }
         return cantestudiante;
     }
    
      public static void main(String[] args) {
        Ejecutar objeto = new Ejecutar();
        
        Estudiante Es1 = new Estudiante ("jhon","puglla",19,7.05, new Direccion("malacatos","belen",223), new Curso("desarrollo de software","desarrollo de software",2,15));
        Estudiante Es2 = new Estudiante ("francel","pineda",21,7.00, new Direccion("cucanama","cucanama alto",105), new Curso("desarrollo de software","desarrollo de software",2,15));
        Estudiante Es3 = new Estudiante ("jhulisa","ramon",19,8.05, new Direccion("malacatos","nangola",423), new Curso("contavilidad","contavilidad",2,22));
        Estudiante Es4 = new Estudiante ("Celio","alvarado",19,7.75, new Direccion("masanamaca","masanamaca",003), new Curso("desarrollo de software","desarrollo de software",2,15));
        Estudiante Es5 = new Estudiante ("jose ","macas",20,6.05, new Direccion("loja","tebaida",1233), new Curso("mecanica","mecanica",3,10));
        Estudiante Es6 = new Estudiante ("andrea","palacios",18,8.0, new Direccion("malacatos","belen",243), new Curso("parbularia","parbularia",4,12));
        Estudiante Es7 = new Estudiante ("tania","leon",19,7.25, new Direccion("malacatos","carmen",123), new Curso("contavilidad","contavilidad",2,22));
        Estudiante Es8 = new Estudiante ("javier","lojan",23,7.50, new Direccion("loja","sauses",1253), new Curso("mecanica","mecanica",2,14));
        Estudiante Es9 = new Estudiante ("jhon","quevedo",21,7.05, new Direccion("malacatos","malacatos",253), new Curso("electricidad","electricidad",2,12));
        Estudiante Es10 = new Estudiante ("luis","ramon",22,7.25, new Direccion("loja","belen",2223), new Curso("prosesamiento de alimentos","prosesamiento de alimentos",3,15));
           
     List<Estudiante> lista = new ArrayList<>();

        lista.add(Es1);
        lista.add(Es2);
        lista.add(Es3);
        lista.add(Es4);
        lista.add(Es5);
        lista.add(Es6);
        lista.add(Es7); 
        lista.add(Es8);
        lista.add(Es9);
        lista.add(Es10);
        
        int a = lista.size();
         System.out.println(a);
        
//        objeto.leerLista("C:\\Users\\its loja\\Desktop\\Leccion Serializable.txt");
//        objeto.escribirObjeto("C:\\Users\\its loja\\Desktop\\Leccion Serializable.txt",Es1);
//        objeto.escribirlista("C:\\Users\\its loja\\Desktop\\Leccion Serializable.txt", lista);
//        objeto.leerArchivos("C:\\Users\\its loja\\Desktop\\Leccion Serializable.txt");
        List<Estudiante>Es =objeto.leerEstudiante("C:\\Users\\its loja\\Desktop\\Leccion Serializable.txt");
        
 
    System.out.println(objeto.EdadMenor(Es));
    System.out.println(objeto.MayorPromedio(Es));
    System.out.println(objeto.MayorEstudiantes(Es));
}
}
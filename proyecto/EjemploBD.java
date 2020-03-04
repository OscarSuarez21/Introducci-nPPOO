/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author Oscar
 */
public class EjemploBD {

    public static void main(String[] args) {
        
        
        ConeccionDB cn = new ConeccionDB();
        ObjectContainer ob = cn.ConectionDB("C:\\Users\\Oscar\\Desktop\\Registro\\Estudiantes.yap");

       EstudiantesBD40 estudiante = new EstudiantesBD40();
        ob.store(estudiante);
        
        //traerUnEstudiante(ob);
       // agregarEstudiante(ob, new Estudiante("oscar ",25));

    }
    public static void agregarEstudiante(ObjectContainer ob, EstudiantesBD40 estudiante         ){
       ob.store(estudiante);
        System.out.println("EestudianteAlmacenado:"+ estudiante);
        
    }
    public static void trerEstudiates (ObjectSet result) {
        System.out.println("Numero de items:"+result.size());
        while (result.hasNext()){
        System.out.println(result.next());
        System.out.println("\n___________\n");
        
    }
    }
    public static void traerUnEstudiante(ObjectContainer ob){
     Estudiante estudiante = new Estudiante();
     ObjectSet objectSet = ob.queryByExample(estudiante);
     trerEstudiates(objectSet);
     ob.close();
     
    
    }
}       
    
   
        





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST.LOJA
 */
public class Computador {
    //declaro los atributos
    private int año;
    private String modelo ;
    private String marca;
    private double capacidaprocesador;
    private boolean portatil;
    //declaro metodos
    public void guardarInformacion(){
        System.out.println("Hola soy la computadora y guardo informacion");
    }
    public void leerInformacion(){
        System.out.println("Hola soy la computadora y leo informacion");
        
    }
    public void imprimirInformacion (String info){
        System.out.println(info);
    }
    public static void main(String[] args) {
        Computador primerobjeto=new Computador();//he creado mi primer objeto
        primerobjeto.guardarInformacion();//llama a un metodo
        primerobjeto.imprimirInformacion("HOLA");
        primerobjeto.imprimirInformacion("CHAO");
    }
}

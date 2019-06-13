/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST.LOJA
 */
public class Impresora {
    
    private int año;
    private String modelo ;
    private String marca;
    private String tamaño;
    
    public void imprimirInformacion(){
        System.out.println("Imprimo informacion");
    }
    public void copiarInformacion(){
        System.out.println("copio informacion");
    }
    public static void main(String[] args) {
        Impresora primerobjeto = new Impresora();
        primerobjeto.imprimirInformacion();
        primerobjeto.copiarInformacion();
    }
            
    
    
    
}

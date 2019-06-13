/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST.LOJA
 */
public class FlasMemory {
    
    private String modelo ;
    private String marca;
    private String tamaño;
    private double capacida;
    private boolean portatil;
    
    public void guardarInformacion(){
        System.out.println("Hola soy una FlasMemory y guardo tu informacion");
    }
    public void protegerInformacion(){
        System.out.println("Hola soy una FlasMemory y guardo tu informacion");
    }
    public static void main(String[] args) {
        FlasMenory primerobjeto = new FlasMemory();
        primerobjeto.gurdarInformacion();
        primerobjeto.protegerInformacion();
        
                
    }
}

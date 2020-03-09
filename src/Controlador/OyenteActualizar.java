/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Oscar
 */
public class OyenteActualizar implements ActionListener {

    Formulario f;
    AlumnoBD abd;
    Alumno a;

    public OyenteActualizar(Formulario f) {
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        a=f.ActualizarAlumno();
        abd.actualizarAlumno(a);
        f.cargarCampos(a);
        
        
        
        
        
    
    
    
}
}

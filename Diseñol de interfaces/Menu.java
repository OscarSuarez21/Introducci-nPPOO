/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentweek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import trabajos_pp_aa.Calculo;
import trabajos_pp_aa.CalculoIva;

/**
 *
 * @author Oscar
 */
public class Menu {

    JFrame f = new JFrame();
    
    JPanel p = new JPanel();
    JMenuBar m = new JMenuBar();
    JMenu menu1;
    JMenu menu2;
    JMenuItem miFor, miSalir, miAle;

    public Menu() {
        f.setTitle("VENTANA PRINCIPAL");
        f.setSize(500, 500);
        f.setLocation(200, 200);
        f.setResizable(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    public void iniciarComponentes() {

        f.setJMenuBar(m);
       
        menu1 = new JMenu("Menu");
        m.add(menu1);

        miFor = new JMenuItem("Formulario");
        miFor.addActionListener(new OyenteVentana());
        menu1.add(miFor);

        miAle = new JMenuItem("Nombres Aleatorios");
        miAle.addActionListener(new OyenteVentana());
        menu1.add(miAle);

        miSalir = new JMenuItem("Salir");
        miSalir.addActionListener(new OyenteVentana());
        menu1.add(miSalir);

    }

    public class OyenteVentana implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == miSalir) {
                System.exit(0);

            }
            if (e.getSource() == miFor) {
                new Formulario();
            }
            if (e.getSource() == miAle) {
                new Nombres_Aleatorios();

            }

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseñografico;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ISTLOJAV
 */
public class VentanaIST extends JFrame {

    public VentanaIST() {
        super();
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        cp.setLayout(new FlowLayout());
        
        JPanel p = new JPanel();
        JPanel m = new JPanel();
        JLabel etiqueta = new JLabel("Correo electronico o telefono");
        JTextField texto = new JTextField(25);
        JLabel etiqueta1 = new JLabel("contraseña");
        JTextField texto1 = new JTextField(25);
        JButton b = new JButton("Entrar");
        
        

        cp.add(etiqueta);
        cp.add(texto);
        cp.add(etiqueta1);
        cp.add(texto1);
        cp.add(b);

    }

}

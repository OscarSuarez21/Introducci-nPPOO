/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentweek;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Oscar
 */
public class Formulario {

    JFrame f = new JFrame();

    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
   // JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();

    JLabel l1 = new JLabel("Nombres:");
    JLabel l2 = new JLabel("Apellidos:");
    JLabel l3 = new JLabel("Numero de Id:");
    JLabel l4 = new JLabel("Ciudadania");
    JLabel l5 = new JLabel("Sexo");
    JLabel l6 = new JLabel("Telefono:");
    JLabel l7 = new JLabel("Direccion:");
    JLabel l8 = new JLabel("Correo:");

    JTextField t1 = new JTextField(25);
    JTextField t2 = new JTextField(25);
    JTextField t3 = new JTextField(25);
    JTextField t4 = new JTextField(25);
    JTextField t5 = new JTextField(25);
    JTextField t6 = new JTextField(25);
    JTextField t7 = new JTextField(25);
    

    JCheckBox ch1 = new JCheckBox("M");
    JCheckBox ch2 = new JCheckBox("F");

    JButton b1 = new JButton("Crear");
    JButton b2 = new JButton("Cerrar");

    public Formulario() {

        f.setTitle("Formulario");
        f.setSize(600, 500);
        f.setLocation(100, 100);
        f.dispose();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AgregarComponentes();

    }

    public void AgregarComponentes() {
        
         f.getContentPane().add(p);

        p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();

        a.gridx = 0;
        a.gridy = 0;
        p.add(p1);
        a.insets = new Insets(5,5,5,5);

        //1Panel
        p1.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        p1.setBackground(Color.GRAY);
        b.insets = new Insets(3,3,3,3);
        //1
        b.gridx = 0;
        b.gridy = 1;
        p1.add(l1, b);

        b.gridx = 1;
        p1.add(t1, b);

        //2
        b.gridx = 0;
        b.gridy = 2;
        p1.add(l2, b);

        b.gridx = 1;
        p1.add(t2, b);
        
        //3
        b.gridx = 0;
        b.gridy = 3;
        p1.add(l3, b);
       
        b.gridx = 1;
        p1.add(t4, b);
        
        //4
        b.gridx = 0;
        b.gridy = 4;
        p1.add(l4, b);

        b.gridx = 1;
        p1.add(t3, b);
        
        //5
        b.gridx = 0;
        b.gridy = 5;
        p1.add(l5, b);

         b.gridx = 1;
        p1.add(ch1, b);
        b.gridx = 2;
        p1.add(ch2, b);
        
        //6
        b.gridx = 0;
        b.gridy = 6;
        p1.add(l6, b);

        b.gridx = 1;
        p1.add(t5, b);
        
        //7
        b.gridx = 0;
        b.gridy = 7;
        p1.add(l7, b);

        b.gridx = 1;
        p1.add(t6, b);
        
        //7
        b.gridx = 0;
        b.gridy = 8;
        p1.add(l8, b);

        b.gridx = 1;
        p1.add(t7, b);
        
                 
        //2Panel
        a.gridy = 1;
        p.add(p3, a);
        
        p3.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        p3.setBackground(Color.PINK);
        c.insets = new Insets(3,3,3,3);
        c.gridx = 0;
        c.gridy = 0;
        p3.add(b1, c);
        c.gridx = 1;
        p3.add(b2, c);
        c.gridx = 2;

        p3.add(b2, c);

    }
 public static void main(String[] args) {
        new Formulario();
             
         }
        
    
  }


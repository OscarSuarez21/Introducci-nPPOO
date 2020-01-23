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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ISTLOJAV
 */
public class ventanaprincipal extends JFrame {

    JLabel l = new JLabel("Que numero de semana estamos");
    JTextField t = new JTextField(20);
    JButton b = new JButton("CHEQUEAR");
    JPanel p = new JPanel();
    ventanaresultante r ;
   JComboBox Cm = new JComboBox ();
    
   
    public ventanaprincipal() {

        super("VENTANA PRINCIPAL");
        setSize(300, 300);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        agregarComponentes();
       pack();
        
    }

    public void agregarComponentes() {

        getContentPane().add(p);
        p.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10,15,10,15);

        p.add(l, c);

        c.gridy = 1;
//
        p.add(t, c);

        c.gridy = 2;
        p.add(b, c);
        
          Cm.addItem ("AÑO");
       Cm.addItem ("MES");
        Cm.addItem ("SEMAN");
        Cm.addItem ("DIA");
         Cm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                Cm.getSelectedItem().toString();
                }
        });
                 
        
        

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!t.getText().isEmpty()) {
                    
                int a=checkCombo(0);
                    Comprobar (a);
                }else{
                 
                    JOptionPane.showMessageDialog(null, "AGREGA" + "EL NUMERO DE LA SEMANA PARA JUGAR");
                }

            }

        });

    }

    public void Comprobar(int a ) {
        try {
           
            
           
            if (a== 0) {
                
                b.setEnabled(false);
                r = new ventanaresultante();
                r.lr.setText("CORRECTO GANASTE");
                r.lr.setForeground(Color.GREEN);
                r.br.setText("TERMINAR");
                
            }else{
                //b.setEnabled(false);
                r=new ventanaresultante();
                r.lr.setText("INCORRECTO VUELVE INTENTAR");
                r.lr.setForeground(Color.RED);
                r.br.setText("TRATA DE NUEVO");
            }

            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "POR FAVOR AGREGE NUMERO PARA JUGAR");
        }
    }
    public int checkCombo(int a){
       
        
        Calendar cal = Calendar.getInstance();
         int c=0;
         switch (a){
             case 0:
         c=cal.get(Calendar.WEEK_OF_YEAR);
                 System.out.println("wek" +c);
                 
             case 1:
                 c=cal.get(Calendar.DAY_OF_MONTH);
                 System.out.println("wek" +c); 
        
        
    }
        return c;
}
}


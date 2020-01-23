/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package currentweek;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author ISTLOJAV
 */
public class ventanaresultante extends JFrame{
    

    JLabel lr= new JLabel("BIEN ");
    JButton br= new JButton ("FINALIZAR");
    JPanel pr= new JPanel();
    ventanaprincipal vp;
    
    public  ventanaresultante(){
        
        super ("VENTANA RESULTADO");
        setSize(300,300);
        agregarComponentes();
        setLocation(400,300);
        dispose();
        setVisible(true);
        
    
    
}
     public void  agregarComponentes(){
          
     getContentPane().add(pr);
     pr.setLayout(new GridBagLayout());
     
     GridBagConstraints c = new GridBagConstraints();
     c.gridx=0;
     c.gridy=0;
     c.insets = new Insets(10,15,10,15);
     
     pr.add(lr,c);
     c.gridy = 15;
     pr.add(br,c);
     
    br.addActionListener (new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            
     
        
    
        if (br.getText()=="TERMINAR"){
            System.exit(0);
            
        }else{
            dispose();
           
    }
         
     }
     
     
    }); 
            }
}


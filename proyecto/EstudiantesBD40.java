/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Oscar
 */
public class EstudiantesBD40 {

    JFrame f = new JFrame();

    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    JLabel LNombres = new JLabel("Nombres:");
    JLabel LApellidos = new JLabel("Apellidos:");
    JLabel LFecNac = new JLabel("Fecha de Nacmiento:");
    JLabel LCorreo = new JLabel("Correo:");
    JLabel LTelefono = new JLabel("Telefono:");

    JTextField TNombres = new JTextField(25);
    JTextField TApellidos = new JTextField(25);
    JTextField TFecNac = new JTextField(25);
    JTextField TCorreo = new JTextField(25);
    JTextField TTelefono = new JTextField(25);

    JButton BGuardar = new JButton("Guardar");
    JButton BTraer = new JButton("Alumnos Registrados");

    JTextArea Area = new JTextArea(10, 40);

    public EstudiantesBD40() {
        f.setTitle("Registro de Estudiantes");
        f.setSize(600, 500);
        f.setLocation(100, 100);
        f.dispose();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AgregarComponentes();

    }

    public void AgregarComponentes() {

        f.getContentPane().add(panel);

        panel.setBackground(Color.blue);
        panel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
        // a.insets = new Insets(5, 5, 5, 5);

        a.gridx = 0;
        a.gridy = 0;
        panel.add(panel1);
        a.insets = new Insets(5, 5, 5, 5);

        //panel1
        panel.add(panel1);
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        panel1.setBackground(Color.GRAY);
        b.insets = new Insets(3, 3, 3, 3);

        //1
        b.gridx = 0;
        b.gridy = 1;
        panel1.add(LNombres, b);

        b.gridx = 1;
        panel1.add(TNombres, b);

        //2
        b.gridx = 0;
        b.gridy = 2;
        panel1.add(LApellidos, b);

        b.gridx = 1;
        panel1.add(TApellidos, b);

        //3
        b.gridx = 0;
        b.gridy = 3;
        panel1.add(LFecNac, b);

        b.gridx = 1;
        panel1.add(TFecNac, b);

        //4
        b.gridx = 0;
        b.gridy = 4;
        panel1.add(LCorreo, b);

        b.gridx = 1;
        panel1.add(TCorreo, b);

        //5
        b.gridx = 0;
        b.gridy = 5;
        panel1.add(LTelefono, b);

        b.gridx = 1;
        panel1.add(TTelefono, b);

        //Panel2
        a.gridy = 1;
        panel.add(panel2, a);
        panel2.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        panel2.setBackground(Color.BLACK);
        c.insets = new Insets(3, 3, 3, 3);

        c.gridx = 0;
        c.gridy = 0;
        panel2.add(BGuardar, c);

        c.gridx = 1;
        c.gridy = 0;
        panel2.add(BTraer, c);

        //p3.add(b2, c);
        //panel3
        a.gridy = 2;
        panel.add(panel3, a);
        panel2.setLayout(new GridBagLayout());
        GridBagConstraints d = new GridBagConstraints();
        panel3.setBackground(Color.ORANGE);
        d.insets = new Insets(3, 3, 3, 3);

        d.gridx = 0;
        d.gridy = 0;
        panel3.add(Area, d);

        BGuardar.addActionListener(new OyenteCrearAlumno(this));
        BTraer.addActionListener(new OyenteTraerAlumno(this));

    }

    public Estudiante guardarEstudiante() {
        Estudiante est = new Estudiante();

        est.setNombres(TNombres.getText());
        est.setApellidos(TApellidos.getText());
        est.setNumero_Id(TFecNac.getText());
        est.setCorreo(TCorreo.getText());
        est.setTelefono(TTelefono.getText());

        return est;

    }

    public class OyenteCrearAlumno implements ActionListener {

        EstudiantesBD40  Est;
       
        Estudiante es;
               
           public OyenteCrearAlumno( EstudiantesBD40  Est) {
        this.Est = Est;
        
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            es = Est.guardarEstudiante();
            
            
           
                   //System.out.println("bbbb");

        }
        public class OyenteTraerAlumno implements ActionListener{
            
            EstudiantesBD40  Est;
       
        Estudiante es;
               
           public OyenteTraerAlumno( EstudiantesBD40  Est) {
        this.Est = Est;

                       
        }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
            }
       
        
        }

    }

    public static void main(String[] args) {
        new EstudiantesBD40();

    }
    }

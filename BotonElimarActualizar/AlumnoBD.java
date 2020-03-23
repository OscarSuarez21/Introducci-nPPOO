/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ISTLOJA_05
 */
public class AlumnoBD {
    
    public static  ArrayList<String> listNombres;

    public static void guardarAlumnoBD(Alumno alumno) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registro", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into formulario values('"
                    + alumno.getNombres()
                    + "','" + alumno.getApellidos()
                    + "','" + alumno.getNumero_Id()
                    + "','" + alumno.getCiudadania()
                    + "','" + alumno.getSexo()
                    + "','" + alumno.getTelefono()
                    + "','" + alumno.getDireccion()
                    + "','" + alumno.getCorreo()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
    }

    public static void eliminar(String Numero_de_ID) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registro", "root", "root");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from formulario where Numero_de_ID = '" + Numero_de_ID + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

    }
    public static Alumno buscarAlumno(String Numero_de_ID) {
        //meter este método a la base de datos
        Alumno alumno = new Alumno();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registro", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from formulario where Numero_de_ID ='" + Numero_de_ID + "'");

            while (necesario.next()) {
                String ced = necesario.getString("Numero_de_ID");
                String ciu = necesario.getString("Ciudadania");
                String ape = necesario.getString("Apellidos");
                String nom = necesario.getString("Nombres");
                String sex = necesario.getString("Sexo");
                String tel = necesario.getString("Telefono");
                String dir = necesario.getString("Direccion");
                String cor = necesario.getString("Correo");

                alumno.setNumero_Id(ced);
                alumno.setCiudadania(ciu);
                alumno.setApellidos(ape);
                alumno.setNombres(nom);
                alumno.setSexo(sex);
                alumno.setTelefono(tel);
                alumno.setDireccion(dir);
                alumno.setCorreo(cor);

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return alumno;

    }

    public static Alumno actualizarAlumno(Alumno alumno) {
        //meter este método a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registro", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("update formulario set('"
                    + alumno.getNombres()
                    + "','" + alumno.getApellidos()
                    + "','" + alumno.getNumero_Id()
                    + "','" + alumno.getCiudadania()
                    + "','" + alumno.getSexo()
                    + "','" + alumno.getTelefono()
                    + "','" + alumno.getDireccion()
                    + "','" + alumno.getCorreo()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return alumno;

    }
    
    public static  ArrayList cargarNombres(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registro", "root", "root");
            System.out.printf("conexion establesida");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario=sentencia.executeQuery("select Nombres,Apellidos from formulario");
        
            listNombres = new ArrayList<>();
            while (necesario.next()) {
                
                String nom=necesario.getString("Nombres");
                String ape=necesario.getString("Apellidos");
                 
                listNombres.add(nom+" "+ape);
                
                 }
            sentencia.close();
            conexion.close();
        }catch(Exception ex){
            System.out.println("Error en la conexion"+ex);
            
        }return listNombres;
    }

}

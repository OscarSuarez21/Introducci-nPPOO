/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author IST.LOJA
 */
public class Conexion_Basica {

    public void leer(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1", usuario, clave);//localhost para conectarse a los datos de la propia computadora
            System.out.println(conexion.getCatalog());//.getSchema es una base de datos
            Statement variable = conexion.createStatement();
            ResultSet result = variable.executeQuery("select * from persona"); //se pone la consulta 
        while (result.next()){
            System.out.println(result.getString("nombre")+" "+result.getString("apellido"));
        }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }

    }

    public static void main(String[] args) {
        Conexion_Basica objeto = new Conexion_Basica();
        objeto.leer("Oscar", "4321");
    }
}

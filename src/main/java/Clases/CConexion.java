/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author resti
 */

public class CConexion 
{

Connection conectar = null;

String usuario = "root";
String contra = "12345";
String db = "bank";
String ip = "127.0.0.1";
String puerto = "3306";

String cadena = "jdbc:mysql:// " + ip + ":" + puerto + "/" + db;

public Connection estableceConexion()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contra);
        }


        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Error al conectar a base de datos");
        }
        return conectar;
    }   


}

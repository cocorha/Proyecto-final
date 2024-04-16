/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.awt.Label;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author resti
 */
public class Clogin 
{
    CConexion conexion = new CConexion();
        String name, lastName, address, city, zipCode, phone, email, password, DNI;
        static String usuario;
        static String credito;

        
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public CConexion getConexion() {
        return conexion;
    }

    public void setConexion(CConexion conexion) {
        this.conexion = conexion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Clogin.usuario = usuario;
    }

    public static String getCredito() {
        return credito;
    }

    public static void setCredito(String credito) {
        Clogin.credito = credito;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
public void InsertUser (JTextField Pname, JTextField Plastname, JTextField Padress, JTextField Pcity, JTextField PzipCode, JTextField Pemail, JTextField Ppassword, JTextField PDNI)
{
    setName(Pname.getText());
    setLastName(Plastname.getText());
    setAddress(Padress.getText());
    setCity(Pcity.getText());
    setZipCode(PzipCode.getText());
    setEmail(Pemail.getText());
    setPassword(Ppassword.getText());
    setDNI(PDNI.getText());
    
    String sql = "insert into Users(nombre, apellido, adress, city, zipCode, phone, email, contrasenia, DNI) values(?,?,?,?,?,?,?,?,?)";
    CConexion conexion = new CConexion();
    
  
    try
    {
    
        CallableStatement cs = conexion.estableceConexion().prepareCall(sql);
        cs.setString(1, getName());
        cs.setString(2, getLastName());
        cs.setString(3, getAddress());
        cs.setString(4, getCity());
        cs.setString(5, getZipCode());
        cs.setString(6, "0");
        cs.setString(7, getEmail());
        cs.setString(8, getPassword());
        cs.setString(9, getDNI());
        cs.execute();
    } 
    
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "error");
    }   
}
 

public int validarUser(JTextField Pemail, JTextField Ppassword)
{
    PreparedStatement ps = null;
    ResultSet rs = null;
    CConexion conexion = new CConexion();
            
    String sql = "select *from Users where email = ? and  contrasenia = ?";
    
    
    try
    {
    ps = conexion.estableceConexion().prepareStatement(sql);
    ps.setString(1, Pemail.getText());
    ps.setString(2, Ppassword.getText());
    rs = ps.executeQuery();
    
    if(rs.next())
    {
       usuario = rs.getString(1);
       return 1;
       
    }
    
    else
    {
    return 0;
    }
    
    } catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "error");
        return  0;
    }
}

    public static void valoresUsuario(JLabel cuenta, JLabel ahorro, JLabel Credito, JLabel codeAhorro, JLabel codeCredito) throws SQLException 
    {
    Statement st;
    CConexion conexion = new CConexion();
    String sql = "select *from Users where idUsuer = " +usuario;
    
    try
    {
    st = conexion.estableceConexion().createStatement();
    ResultSet rs = st.executeQuery(sql);
    String ac = " ";
    String valor = "N/A";
    String code = "N/A";
        while (rs.next()) 
        {
            ac = rs.getString(2) + " " +rs.getString(3);
        }
        cuenta.setText(ac);
        
        
        sql = "select *from Accounts where id = "+ usuario+" and acType = 1";
        rs = st.executeQuery(sql);
        while (rs.next()) 
        {
            valor = rs.getString(2);
            code = rs.getString(6);
        }
        ahorro.setText(valor);
        codeAhorro.setText(code);
        
        
        sql = "select *from Accounts where id = "+ usuario+" and acType = 2";
        rs = st.executeQuery(sql);
        while (rs.next()) 
        {
            valor = rs.getString(2);
            code = rs.getString(6);
            credito = rs.getString(6);
        }
        Credito.setText(valor);
        codeCredito.setText(code);
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "error");
    }   
    
    }
    
    public int transferencia(JTextField cuenta, JTextField monto, JTextField destino) {
    Statement st;
    CConexion conexion = new CConexion();
    String sql = "SELECT * FROM Accounts WHERE id = '" + usuario + "' AND accNumber = '" + cuenta.getText() + "'";
    int Lmonto = 0, confirmar = 0;

    try {
        st = conexion.estableceConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Lmonto = Integer.parseInt(rs.getString(2));
        }

        sql = "SELECT * FROM Accounts WHERE accNumber = '" + destino.getText() + "'";
        ResultSet rs2 = st.executeQuery(sql);
        while (rs2.next()) {
            confirmar = rs2.getInt(6);
        }

        if (confirmar != 0) {
            if (Lmonto > Integer.parseInt(monto.getText())) 
            {
                // 1
                sql = "UPDATE Accounts SET balance = " + (Lmonto - Integer.parseInt(monto.getText())) + " WHERE id = '" + usuario + "' AND accNumber = '" + cuenta.getText() + "'";
                st.executeUpdate(sql);

                // 2
                sql = "SELECT * FROM Accounts WHERE accNumber = '" + destino.getText() + "'";
                ResultSet rs3 = st.executeQuery(sql);
                while (rs3.next()) {
                    Lmonto = rs3.getInt(2);
                }

                // 3
                sql = "UPDATE Accounts SET balance = " + (Lmonto + Integer.parseInt(monto.getText())) + " WHERE accNumber = '" + destino.getText() + "'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "transferencia realizada");
                return 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                return 0;
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "El destinatario no existe");
            return 0;
        }

    } 
    catch (SQLException e) 
    {
        JOptionPane.showMessageDialog(null, "Error en la conexión");
        return 0;
    }
}
    
    public void eliminar(JTextField cuenta)
    {
    Statement st;
    CConexion conexion = new CConexion();
    String sql = "delete from Accounts where id =" + usuario + "and accNumber =" + cuenta.getText();
    int Lmonto = 0, confirmar = 0;

    try {
        st = conexion.estableceConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        }
    
    catch (Exception e) 
    {
        JOptionPane.showMessageDialog(null, "Error en la conexión");
    }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tayon
 */
public class ConnectionDAO {
    public Connection connectDB(){
    Connection con = null;
     String url = "jdbc:jtds:sqlserver://localhost:51200/AdventureWorks2014;instance=NATIONALSOFT;useLOBs=false";

          try{      
                con = DriverManager.getConnection(url, "sa", "National09");
                return con;

          

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Sin conexión con SQL-server");

      
}
    
    return con;
    
    
    
    
}}

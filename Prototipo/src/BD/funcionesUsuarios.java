/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author jeffr
 */
public class funcionesUsuarios {
    //clase que se usaria para hacer la conexion y almacenar los usuarios

    private String bdUser = "requeDBA";
    private String bdPassword = "requePrototype";
    private String url = "jdbc:mysql://localhost:3306/requerimientos";
    Connection conn;
    
 public funcionesUsuarios() {
    }
 public User findUser(String username){
        User user = new User();
        try {
            conn = DriverManager.getConnection(url, bdUser, bdPassword);
            CallableStatement stmt = conn.prepareCall("{call findUser(?)}");
            stmt.setString(1, username);     
            ResultSet rs =stmt.executeQuery();
            rs.next();
            user.setUsername(rs.getString("USERNAME"));
            user.setPassword(rs.getString("password"));
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(funcionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
 public void updateUser(String username, String password){
        try {
            conn = DriverManager.getConnection(url, bdUser, bdPassword);
            CallableStatement stmt = conn.prepareCall("{call updateUser(?,?)}");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(funcionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void addUser(String username, String password){
        try {
            conn = DriverManager.getConnection(url, bdUser, bdPassword);
            CallableStatement stmt = conn.prepareCall("{call addUser(?,?)}");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(funcionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteUser(String username, String password){
        try {
            conn = DriverManager.getConnection(url, bdUser, bdPassword);
            CallableStatement stmt = conn.prepareCall("{call deleteUser(?, ?)}");
            stmt.setString(1, username);
            stmt.setString(2, password);    
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(funcionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<String> getUsers(){
        ArrayList<String> users = new ArrayList<String>();
        try {
            conn = DriverManager.getConnection(url, bdUser, bdPassword);
            CallableStatement stmt = conn.prepareCall("{call getUsers()}");  
            ResultSet rs =stmt.executeQuery();
            while(rs.next()){
                users.add(rs.getString("username"));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(funcionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import BD.User;
import BD.funcionesUsuarios;

/**
 *
 * @author Sharon
 */
public class Auth {
    private funcionesUsuarios dataBase; ;

    public Auth() {
        dataBase = new funcionesUsuarios();
    }
    
    private User searchUser(String username){
        return dataBase.findUser(username);
    }
    
    public boolean userExists(String username){
        if (searchUser(username).getUsername() == null)
            return false;
        else 
            return true;
    }
    
    public boolean validateUserCredentials(String username, String password){
        User user = searchUser(username);
        if (user.getPassword().equals(password))
            return true;
        else
            return false;
    }
    
   
    
    public void createUser(String username, String password){
        dataBase.addUser(username, password);
    }
    
    public void updateUser(String suername, String password){
        dataBase.updateUser(suername, password);
    }
 
    
    
}

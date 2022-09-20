/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Sharon
 */
public class ControllerAuth {
    private Auth auth;

    public ControllerAuth() {
        auth = new Auth();
    }
    
    public boolean findUserExists(String username){
        return auth.userExists(username);
    }
    
    public boolean validateCredentials(String username, String password){
        return auth.validateUserCredentials(username, password);
    }
    
    public void createUser(String username, String password){
        auth.createUser(username, password);
    }
    
    public void changeUserPassword(String username, String password){
        auth.updateUser(username, password);
    }
    
}

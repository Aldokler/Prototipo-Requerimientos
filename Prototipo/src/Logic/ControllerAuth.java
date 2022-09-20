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
    private SearchAlg algorit;
    private String[] users;

    public ControllerAuth() {
        auth = new Auth();
        algorit = new SearchAlg();
        users = getUsers();
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
    
    private String[] getUsers(){
        return algorit.getUsers();
    }
    
    public boolean findUserExistsL(String username){
        System.out.println("tamaño" + users.length);
        return algorit.linearSearch(users, username);
    }
    
    public boolean findUserExistsB(String username){
        return algorit.binarySearch(users, username);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import BD.funcionesUsuarios;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Sharon
 */
public class SearchAlg {
    private funcionesUsuarios dataBase = new funcionesUsuarios();

    public SearchAlg() {
    }
    
    public String[] getUsers(){
       return dataBase.getUsers();
    }
    
    public boolean linearSearch(String[] usersList, String usernameToSearch){
        for (String user : usersList) {
            if(user == usernameToSearch)
                return true;
        }
        return false;
    }
    
    
    public boolean binarySearch(String[] usersList, String usernameToSearch){
        Arrays.sort(usersList);
        
        if(Arrays.binarySearch(usersList, usernameToSearch) < 0)
            return false;
        else
            return true;
    }
}

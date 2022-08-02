/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.util.ArrayList;

/**
 *
 * @author jeffr
 */
public class users {
    //clase que se usaria para hacer la conexion y almacenar los usuarios
    ArrayList<String> users;
    ArrayList<String> password;
    public users() {
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    public ArrayList<String> getPassword() {
        return password;
    }

    public void setPassword(ArrayList<String> password) {
        this.password = password;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import BD.User;
import BD.funcionesUsuarios;
import Logic.ControllerAuth;

/**
 *
 * @author Aldokler
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginEmail window = new LoginEmail();
        funcionesUsuarios f = new funcionesUsuarios();
        f.getUsers();
        for(int i = 0;i<1000;i++){
            String user = "usuario-"+ i;
            String password = "prueba" + i;
            f.addUser(user, password);
        }
        window.setVisible(true);
        window.setLocationRelativeTo(null);         
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import BD.UsersFunctionsBD;

/**
 *
 * @author Aldokler
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsersFunctionsBD Prueba = new UsersFunctionsBD();
        Prueba.deleteUser("prueba2@gmail.com", "P422w0rd");
        LoginEmail window = new LoginEmail();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    
}

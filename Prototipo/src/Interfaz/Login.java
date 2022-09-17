/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import BD.funcionesUsuarios;

/**
 *
 * @author Aldokler
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        funcionesUsuarios f = new funcionesUsuarios();
        f.addUser("pruebaxd@gmail.com", "aaadddfff");
        LoginEmail window = new LoginEmail();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    
}

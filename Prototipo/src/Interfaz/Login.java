/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import BD.User;
import BD.funcionesUsuarios;
import Logic.ControllerAuth;
import Logic.merge;
import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Aldokler
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static String getUsuario(String[] usuarios, String usuarioBuscar){
        String usuario = "";
        for(int i =0;i<usuarios.length;i++){
            if(usuarios[i] ==usuarioBuscar){
                usuario = usuarios[i];
                break;
            }
        }
        return usuario;
    }
    public static void main(String[] args) {
        Date t = new Date();
        Long X =t.getTime();
        LoginEmail window = new LoginEmail();
        funcionesUsuarios f = new funcionesUsuarios();
        //String[] users = f.getUsers();
        //for (String user : users) {
          //  System.out.println(user);
        //}
        
        //merge.mergeSort(users, 0, users.length-1);
        //for (String user : users) {
          //  System.out.println(user);
        //}
        System.out.println(f.findUser("usuario-56642"));
        //System.out.println(getUsuario(users, "usuario-1"));
        //System.out.println(Arrays.binarySearch(users, "usuario-65"));
        Date t2 = new Date();
        Long Y =t2.getTime();
        System.out.println((Y-X));
        window.setVisible(true);
        window.setLocationRelativeTo(null);         
    }
    
}

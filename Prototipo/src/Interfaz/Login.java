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
        String usuario = "null";
        for(int i =0;i<usuarios.length;i++){
            //System.out.println(usuarios[i]);
            if(usuarios[i].equals(usuarioBuscar)){
                usuario = usuarios[i];
                break;
            }
        }
        return usuario;
    }
    
   
    
    public static void main(String[] args) {
       LoginEmail window = new LoginEmail();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        
       /*
       for (int i = 0; i < 2000; i++) {
            funcionesUsuarios f = new funcionesUsuarios();
            f.addUser("nombre" + i, "pass"+ "i");
        }
       
       for (int i = 0; i < 3000; i++) {
            funcionesUsuarios f = new funcionesUsuarios();
            f.addUser("lolo" + i, "pass"+ "i");
        }
       
       for (int i = 0; i < 2000; i++) {
            funcionesUsuarios f = new funcionesUsuarios();
            f.addUser("aitb" + i +"@gmail.com", "pass"+ "i");
        }
        */
        
       
        funcionesUsuarios f = new funcionesUsuarios();
        String[] users = f.getUsers();
        merge.mergeSort(users, 0, users.length-1);
        
        
        Date t = new Date();
        Long X =t.getTime();
        System.out.println(f.findUser("usuario-55456"));
        //System.out.println(getUsuario(users, "name"));
        //System.out.println(Arrays.binarySearch(users, "usuario-5546"));
        Date t2 = new Date();
        Long Y =t2.getTime();
        System.out.println(X);
        System.out.println(Y);
        System.out.println((Y-X));


       /* for (String user : users) {
            System.out.println(user);
        }   */     
        /*
        for (int i = 0; i < 10000; i++) {
            funcionesUsuarios f = new funcionesUsuarios();
            f.addUser("user" + i, "pass"+ "i");
        }
        
       
        
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
        //
        Date t2 = new Date();
        Long Y =t2.getTime();
        System.out.println((Y-X));
        window.setVisible(true);
        window.setLocationRelativeTo(null);         */
    }
    
}

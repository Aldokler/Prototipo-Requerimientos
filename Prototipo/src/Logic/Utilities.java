/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import BD.funcionesUsuarios;
/**
 *
 * @author Aldokler
 */
public class Utilities {
    public static boolean verifyEmail(String email){
        int validaciones = 0;
        int largo = 0;
        for(int x = 0; x < email.length(); x++){
            if (validaciones == 0){
                if (email.charAt(x) == '@'){
                    validaciones++;
                }
            }
            else if(validaciones == 1){
                largo++;
                if (email.charAt(x) == '.' && largo>=6){
                    validaciones++;
                    break;
                }
            } 
        }
        return validaciones == 2 && email.charAt(email.length()-1)!='.' && email.charAt(email.length()-2)!='.';
    }
    public static String convertPassword(char[] passwordArray){
        //returns the conversion from char[] to String;
        String password = "";
        for(int i =0;i<passwordArray.length;i++)
            password+=passwordArray[i];
        return password;
    }
    
}

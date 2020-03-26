/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoatbas1;

import java.util.Scanner;

/**
 *
 * @author Kevin Absalon
 */
public class CodigoATBAS1 {

    /**
     * @param args the command line arguments
     */
private static Scanner in;
    public static void main (String[] args) {
        in = new Scanner(System.in);
            System.out.println("----Encriptado------");
            cipherEncryption();
       
        }

    private static void cipherEncryption() {
        String alpa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String reverseAlpa = "";
        
        for (int i = alpa.length()-1; i > -1; i--){
            reverseAlpa += alpa.charAt(i);
        }
        System.out.println("Introduce un mensaje para encriptar: ");
        String message = in.nextLine();
        message = message.toUpperCase();
        
        String encryText = "";
        for (int i = 0; i < message.length(); i++){
            if(message.charAt(i) == (char)32){
                encryText += " ";
            } else{
                int count = 0;
                for (int j = 0; j < alpa.length(); j++){
                if(message.charAt(i)== alpa.charAt(j)){
                    encryText += reverseAlpa.charAt(j);
                    break;
                }
            }
        }
        }
            System.out.println("Mensaje encriptado: " + encryText);
            
    }
} 
    
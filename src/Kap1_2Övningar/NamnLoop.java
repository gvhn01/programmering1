/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2Övningar;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class NamnLoop {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        String namn; 
        int antalVarv; 
        
        //Initiering
        System.out.print("vad heter du? ");
        namn = sc.nextLine();
        System.out.print("Hur många gånger ska dit namn skrivas ut? ");
        antalVarv = sc.nextInt(); 
        //loop
        for (int i = 0; i < antalVarv; i++) {
            System.out.println(namn);
            
        }//end for loop
    }//end main    
}//end class

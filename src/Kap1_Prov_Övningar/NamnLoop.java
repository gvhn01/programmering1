/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_Prov_Övningar;

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
        Support loopObject = new Support(); 

        //initiering, tilldelar de olika variablerna ett värde. 
        System.out.print("Ange ditt namn: ");
        namn = sc.nextLine();
        System.out.print("Hur många gånger vill du att ditt namn ska skrivas ut: ");
        antalVarv = sc.nextInt();
        
        loopObject.namnLoop(namn, antalVarv); 
       
    }//end main    
}//end class

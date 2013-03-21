/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class Selektion {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner (System.in);
        int alder;
        //Inmatning 
         System.out.println("Hur gammal är du?:"); 
         alder = sc.nextInt ();
         
         if (alder > 17){
             System.out.println("Du är myndig");
         
        }
        else { 
            System.out.println("Du är inte myndig");
        }
        
    }//end main
    
} //end class

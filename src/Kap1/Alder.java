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
public class Alder {
    
    
    public static void main(String[] args) {
        //Deklaration
        int alder; 
        Scanner sc = new Scanner(System.in);
        
        //Inmatning
        System.out.println("Hur gammal är du?:");
        alder = sc.nextInt();
        alder = alder + 1;
       
        
        //Utskrift
        System.out.println("Nästa födelsedag fyller du: "  + alder );
        
    }//end main 
    
}//end class

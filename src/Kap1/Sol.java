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
public class Sol {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        
        
        
        //Inmatning + loopar
        //Antal soltimmar Oslo
        System.out.print("Ange antalet soltimmar i Oslo:");
        int antaletSolTimmarIOslo = sc.nextInt();
        System.out.print("O:");
        int i = 0;
        while (i < antaletSolTimmarIOslo) {
            System.out.print("*");
            i++;
            
        }
        System.out.println("");
        //Antalet soltimmar i Stockholm
        
        System.out.print("Ange antalet soltimmar i Stockholm:");
        int antaletSolTimmarIStockholm = sc.nextInt();
        System.out.print("S:");
        i = 0;
        while (i < antaletSolTimmarIStockholm) {
            System.out.print("*");
            i++;
            
        }
        System.out.println("");
        
         //Antalet soltimmar i Helsingfors
        System.out.print("Ange antalet soltimmar i Helsingfors:");
        int antaletSolTimmarIHelsingfors = sc.nextInt();
        System.out.print("H:");
        i = 0;
        while (i < antaletSolTimmarIHelsingfors) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        
       
        
    }//end main
    
}//end class

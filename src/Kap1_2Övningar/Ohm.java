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
public class Ohm {
    public static void main(String[] args) {
        //deklaration
        double i, r, u; 
        char fortsatt;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Hur stor är resistansen: ");
            r = sc.nextDouble();
            System.out.print("Hur hög är strömmen: ");
            i = sc.nextDouble(); 
            u = r * i;
            System.out.println("Spänning är " + u + "V" );
            System.out.print("Vill du räkna igen? J/N: ");
            fortsatt = sc.next().charAt(0); 
        }while (fortsatt == 'j' || fortsatt == 'J');
                   
        
        
        
        
        
    }//end main    
}//end class

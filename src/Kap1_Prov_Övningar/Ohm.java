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
public class Ohm {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        double i, r; 
        
        System.out.print("Hur hög är strömmen: ");
        i = sc.nextDouble();
        System.out.print("Hur hög är resistansen ");
        r = sc.nextDouble();
        
        Support supportOhm = new Support(); 
        double u = supportOhm.ohm(r, i); 
        
        
        System.out.println("Spänningen är " + u + " V");
        
    }//end main    
}//end class

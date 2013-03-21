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
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0; 
        int antalTimmarOslo;
        int antalTimmarSthml;
        int antalTimmarHels; 
        
        System.out.print("Ange antalet soltimmar i Oslo: ");
        antalTimmarOslo = sc.nextInt(); 
        System.out.print("Ange antalet soltimmar i Stockholm: ");
        antalTimmarSthml = sc.nextInt(); 
        System.out.print("Ange antalet soltimmar i Helsingfors: ");
        antalTimmarHels = sc.nextInt(); 
        
        System.out.print("O:");
        for (int j = 0; j < antalTimmarOslo; j++) 
        {
            System.out.print("*");
        }//end for
        System.out.println("");
        System.out.print("H:");
        for (int j = 0; j < antalTimmarHels; j++) 
        {
            System.out.print("*");
        }//end for
        System.out.println("");
        System.out.print("S:");
        for (int j = 0; j < antalTimmarSthml; j++) 
        {
            System.out.print("*");
        }//end for
        
    }//end main    
}//end class

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
public class Deltagare2 {
    public static void main(String[] args) {
        int antalDeltagare; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ange antalet deltagare: ");
        antalDeltagare = sc.nextInt(); 
        
        if (antalDeltagare >= 12) 
        {
            System.out.println("För många");
        }
        else
        {
            System.out.println("OK!");
        }
            
        
    }//end main    
}//end class

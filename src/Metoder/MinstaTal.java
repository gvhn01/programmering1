/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metoder;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class MinstaTal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tal, tal2;
        
  
        System.out.print("Ange ett tal: ");
        tal = sc.nextDouble(); 
        System.out.print("Ange ett tal till: ");
        tal2 = sc.nextDouble(); 
         
        //Hämta funktion från support class
        Support minTal = new Support();
        
        double min = minTal.minstaTal(tal, tal2);
         
        System.out.println("Det minsta talet är:" + min);
        
    }//end main     
}//end class

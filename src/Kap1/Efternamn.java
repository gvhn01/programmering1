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
public class Efternamn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enamn; 
        
        System.out.print("Skriv ditt för och efternamn:");
        enamn = sc.nextLine();
        System.out.println("Du heter " + enamn  );
                
    }//end main
    
}//end class

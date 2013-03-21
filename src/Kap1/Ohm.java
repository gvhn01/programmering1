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
public class Ohm {
    public static void main(String[] args) {
    
    //Deklaration    
    Scanner sc = new Scanner(System.in);    
    double i, u, r; 
    
    //inmatning
        System.out.print("Hur mycket är strömmen?: ");
        i = sc.nextDouble();
        
        System.out.print("Hur mycket är resistansen?: ");
        r = sc.nextDouble();
        
    //Beräkning utskrift 
        u = r*i; 
        System.out.println("spänningen är " + u + " volt");
    }//End main
    
    
}//end class

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
public class Summera {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double x, y, sum; 
        
        System.out.print("Skriv ett tal: ");
        x = sc.nextDouble ();
        
        System.out.print("Skriv ett till tal: ");
        y = sc.nextDouble ();
        
        sum = x * y;
   
        
        
        System.out.println("Summan är:" + sum );
        
    }//end main 
 
}//end class

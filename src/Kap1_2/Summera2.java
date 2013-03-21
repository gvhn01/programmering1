/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class Summera2 {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        int x, y, s;
        char fortsatt;
        
        //initiering
        do
        {
            System.out.print("skriv ett tal: ");
            x = sc.nextInt();
            System.out.print("skriv ett till tal: "); 
            y = sc.nextInt();            
            s = x + y;
            System.out.println("Summan är: " + s);
            System.out.print("Ny beräkning? (J/N): ");
            fortsatt = sc.next() .charAt(0);
            
        }while (fortsatt == 'j' || fortsatt == 'J');
        
        
    }//end main     
}//end class

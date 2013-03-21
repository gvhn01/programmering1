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
public class Deltagare {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int x; 
        
        //inmatning
        System.out.print("Hur många deltagare? ");
        x = sc.nextInt();
        
        //beräkning
        if (x >= 12) {
            System.out.println("Det är för många");
        }
        else { 
            System.out.println("ok");
        }    
        
    }//end main
    
}//end class

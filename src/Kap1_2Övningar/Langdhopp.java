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
public class Langdhopp {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        double langd, vind;
        
        //initiering
        System.out.print("Ange vindhastighet:");
        vind = sc.nextDouble();
        
        //beräkning
        System.out.print("Ange längde på hoppet(m): ");
        langd = sc.nextDouble(); 
        
        if (langd > 7.92 && vind <= 2){
            System.out.println("Grattis, du har slagit nytt rekord");
        }
        else {
            System.out.println("Inget rekord");
        }
        
       
        
        
    }//end main    
}//end class

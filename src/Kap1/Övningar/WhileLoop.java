/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1.Övningar;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class WhileLoop {
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
       
        //Loop
        
        System.out.print("Hur många stjärnor? ");
        int antalStjärnor = sc.nextInt();
        int i = 0;
        while (i < antalStjärnor){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }//end main 
    
}//end class

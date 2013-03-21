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
public class LoopTräning {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hur många stjärnor? ");
        int antalStjärnor = sc.nextInt();
        
        int i = 0;
        while (i < antalStjärnor){
            i++;
            
         System.out.print("*");   
        }
        System.out.println("");
        
        
        
        
    }//end main
    
}//end class

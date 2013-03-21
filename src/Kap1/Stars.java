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
public class Stars {
    
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        int n;
        
        //inmatning
        System.out.println("Hur många stjärnor? ");
        n = sc.nextInt();
        int x = 0;
        //loop
        while (x < n){ 
            System.out.print(" * ");
            x++;
            
        }
      
    }//end main
    
}//end class

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_Prov_Övningar;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i = 0; 
        int n; //antal stjärnor
        
        System.out.print("Ange hur många stjärnor som du vill ska skrivas ut:");
        n = sc.nextInt(); 
        
        while (i < n){ 
            System.out.print("*");
            i++;                     
        }
                         
    }//end main    
}//end class

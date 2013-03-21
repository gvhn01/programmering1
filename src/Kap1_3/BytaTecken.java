/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class BytaTecken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder hemligtOrd = new StringBuilder("??????");
        
        for (int i = 0; i < hemligtOrd.length(); i++) {
            System.out.print("Ange en bokstav: ");
            char tecken = sc.next().charAt(0);
            hemligtOrd.setCharAt(i, tecken); 
            System.out.println(hemligtOrd.toString());
        }//end for
        
        /*System.out.println("Ange första tecknet: ");
        char tecken = sc.next().charAt(0); 
        hemligtOrd.setCharAt(0, tecken);
        System.out.println(hemligtOrd.toString());
        
        tecken = sc.next().charAt(0); 
        hemligtOrd.setCharAt(1, tecken);
        System.out.println(hemligtOrd.toString());
        
        tecken = sc.next().charAt(0); 
        hemligtOrd.setCharAt(2, tecken);
        System.out.println(hemligtOrd.toString());
        
        tecken = sc.next().charAt(0); 
        hemligtOrd.setCharAt(3, tecken);
        System.out.println(hemligtOrd.toString());*/
        
    }//end main    
}//end class

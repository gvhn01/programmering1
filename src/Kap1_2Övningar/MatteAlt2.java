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
public class MatteAlt2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double tal1, tal2, summa, kvot, produkt, differens; 
    char raknesatt;
    
        System.out.print("mata in ett tal: ");
        tal1 = sc.nextDouble();
        System.out.print("mata in ett tal till: ");
        tal2 = sc.nextDouble(); 
        System.out.print("ange raknesatt: ");
        raknesatt = sc.next().charAt(0); 
        
        switch (raknesatt) {
            case '+': 
                summa = tal1 + tal2; 
                System.out.println("Summan är " + summa);
                break;
            
            case '-': 
                differens = tal1 - tal2; 
                System.out.println("differensen är " + differens);
                break;
            
        
            case '*':
                produkt = tal1 * tal2; 
                System.out.println("produkten är " + produkt);
                break;
          
            case '/':
                kvot = tal1 / tal2; 
                System.out.println("kvoten är " + kvot);
                break;
                
            default: 
                System.out.println("Du har matat in ett ogiltigt räknesätt");
        }//end switch
    }//end main     
}//end class

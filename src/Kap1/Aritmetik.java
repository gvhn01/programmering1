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
public class Aritmetik {
    public static void main(String[] args) {
        
        //Deklarera variabler
        Scanner sc = new Scanner(System.in);
        double x, y, sum, diff, produkt, kvot; 
        
        //Inmatning av variabler
        System.out.print("Skriv ett tal: ");
        x = sc.nextDouble();
        System.out.print("Skriv ett tal till: ");
        y = sc.nextDouble();
        
        //Beräkning 
        sum = x + y; 
        diff = x - y; 
        produkt = x * y; 
        kvot = x / y;
        
        //Utskrift
        System.out.println("Summan är: " + sum);
        System.out.println("Differensen är: " + diff);
        System.out.println("Produkten är: " + produkt);
        System.out.println("Kvoten är: " + kvot); 
    }//end main
    
}//end class

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
public class Cirkeln {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double pi, radie, area, omkrets;
        pi = 3.14159;
        char fortsatt;
        //inmatning
        do 
        {
            System.out.print("Hur stor är radien (cm)?");
            radie = sc.nextDouble();
        
            //beräkning
            area = pi * radie * radie;
            omkrets = pi * radie * 2;
        
            //utskrivning
            System.out.println("Arean är " + area + " cm i kvadrat");
            System.out.println("Omkretsen är " + omkrets + " cm");
            System.out.println("Vill du räkna igen? J/N: ");
            fortsatt = sc.next().charAt(0);
         }  while (fortsatt == 'j' || fortsatt == 'J' );
            
            System.out.println("Hej då");        
        
        
        
    }//end main
}//end class
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
public class Cirkeln {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        double pi, radie, area, omkrets;
        pi = 3.14159;
        //inmatning
        System.out.print("Hur stor är radien (cm)?");
        radie = sc.nextDouble();
        
        //beräkning
        area = pi * radie * radie;
        omkrets = pi * radie * 2;
        
        //utskrivning
        System.out.println("Arean är " + area + "cm i kvadrat");
        System.out.println("Omkretsen är " + omkrets + "cm");
    }//end main
    
}//end class

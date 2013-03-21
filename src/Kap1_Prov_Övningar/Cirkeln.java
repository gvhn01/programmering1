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
public class Cirkeln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radie;
        
        System.out.print("Hur stor är radien: ");
        radie = sc.nextDouble(); 
        
        
        Support program = new Support(); 
        double area = program.area(radie);
        double omkrets = program.omkrets(radie);
        System.out.println("Arean är " + area);
        System.out.println("Omkretsen är "+ omkrets);
        
    }//end main    
}//end class

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
public class Klotet {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        double volym, radie, pi; 
        pi = 3.14; 
        
        //initiering 
        System.out.print("Hur stor är radien: ");
        radie = sc.nextDouble(); 
        
        //beräkning
        volym = 4*pi*radie*radie*radie/3; 
        
        //utskrift
        System.out.print("Volymen är " + volym); 
    }
    
}

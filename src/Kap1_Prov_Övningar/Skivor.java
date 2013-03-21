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
public class Skivor {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        int antalskivor; 
        
        //initering
        System.out.print("Hur många skivor vill du ha: ");
        antalskivor = sc.nextInt();
        
        //hämtar metod från support class
        Support program = new Support(); 
        double pris = program.skivor(antalskivor);
        //utskrift av pris
        System.out.print("Priset blir " + pris + "kr");
        System.out.println("");
 
    }//end main    
}//end class

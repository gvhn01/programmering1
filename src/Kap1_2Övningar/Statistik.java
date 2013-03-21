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
public class Statistik {
    public static void main(String[] args) {
        //deklarering
        Scanner sc = new Scanner(System.in);
        int tal;
        double summa = 0; 
        int antalTal; 
        double medelvarde;
        int max = 0;
        
         System.out.print("Hur många vill du ska behandlas: ");
         antalTal = sc.nextInt(); 
        //behandling av talen 
        for (int i = 0; i < antalTal; i++) {
            System.out.print("mata in ett tal: ");
            tal = sc.nextInt();
            summa = summa + tal;
            
            if (tal > max){
                max = tal; 
                
            }
        }//end for-loop
        //utskrift
        System.out.println("Summan av talen är " + summa);
        medelvarde = summa / antalTal; 
        System.out.println("Medelvärdet är " + medelvarde);
        System.out.println("Det största talet är " + max);
         
    }//end main
}//end class

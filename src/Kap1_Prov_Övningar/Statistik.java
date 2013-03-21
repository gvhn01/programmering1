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
public class Statistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklaration
        double tal;
        double summa;
        double max; 
        double medelvarde; 
        int antalVarv;
        summa = 0; 
        max = 0;
        
        System.out.print("Ange antalet tal: ");
        antalVarv = sc.nextInt(); 
        
            for (int i = 0; i < antalVarv; i++) 
            {
                System.out.print("Ange ett tal: ");
                tal = sc.nextDouble(); 
                summa = summa + tal; 
            
                if (tal > max) 
                { 
                    max = tal; 
                }//end if sats 
            
            }//end for loop
            
            //algoritm för medelvarde
            medelvarde = summa/ antalVarv; 
            
            //anrop på metod för att beräkna summan
            System.out.println("Summan av talen är " + summa);
            
            //Beräkning av medelvärde
             System.out.println("Medelvärdet är " + medelvarde);
            
            //anrop på metod för att kolla max talet            

            //utskrift av det största talet
            System.out.println("Det största talet är " + max);
    }//end main    
}//end class

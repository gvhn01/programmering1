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
public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String stad; 
        int antaltimmar = 0; 
        /*
        System.out.print("Vilken stad: ");
        stad = sc.next(); 
        System.out.print("Ange anatal timmar: ");
        antaltimmar = sc.nextInt(); 
        */
        Support program = new Support();
        /*
        System.out.print(stad+":");
        program.soltimmar(stad,antaltimmar ); 
        System.out.println("");
        */
      
        
            
        
        char fortsatt; 
        do { 
            System.out.print("Vilken stad: ");
            stad = sc.next(); 
            System.out.print("Ange anatal timmar: ");
            antaltimmar = sc.nextInt();
            System.out.print(stad+":");
            program.soltimmar(stad,antaltimmar );
            System.out.println("");
            System.out.print("Vill du köra igen? J/N: ");
            fortsatt = sc.next().charAt(0); 
        }//end do 
        while (fortsatt == 'J' || fortsatt == 'j');
        System.out.println("Du valde att inte fortsätta");

    }//end main    
}//end class

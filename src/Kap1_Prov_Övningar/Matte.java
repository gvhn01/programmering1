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
public class Matte {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        char raknesatt; 
        double tal1, tal2; 
        double summa, kvot, produkt, differans;
 
        
        //initiering
        System.out.print("Ange ett tal: ");
        tal1 = sc.nextDouble();
        System.out.print("Ange ett tal till: ");
        tal2 = sc.nextDouble();
        System.out.print("Ange ett räknesätt (+,-,/,*): ");
        raknesatt = sc.next().charAt(0);
        
        char fortsatt;
        do 
        {
            //hämtar svar från metod
            Support program = new Support(); 
            program.matte(tal1, tal2, raknesatt);
            double svar = program.matte(tal1, tal2, raknesatt);
            //skriver ut svaret
            switch (raknesatt) 
            {
                case '+':
                    System.out.println("Summan är " + svar);
                    break;
                    
                case '-':
                    System.out.println("Differanse är " + svar);
                    break; 
                    
                case '/':
                    System.out.println("Kvoten är " + svar);
                    break;
                    
                case '*':
                    System.out.println("Produkten är " + svar);
                    break;
                    
                default:
                    throw new AssertionError();
            }//end switch

            System.out.print("Vill du räkna igen? J/N: ");
            fortsatt = sc.next().charAt(0); 
            
        } while (fortsatt == 'j' || fortsatt == 'J');
        //end do

        
        
        
    }//end main    
}//end class


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
public class Matte {
    public static void main(String[] args) {
    //deklaration    
    double tal1, tal2, summa, differens, kvot, produkt;    
    char raknesatt;
    char fortsatt;
    Scanner sc = new Scanner(System.in); 
    
    //initiering
    do {
        System.out.print("ange ett tal: ");
        tal1 = sc.nextDouble();
        System.out.print("ange ett till tal: ");
        tal2 = sc.nextDouble(); 
        
        System.out.print("vilket räknesätt: ");
        raknesatt = sc.next().charAt(0);
        
        if (raknesatt == '+' )
        { 
            summa = tal1 + tal2;             
            System.out.println("summan är "+summa);
        }else if (raknesatt == '-') {            
            differens = tal1 - tal2;            
            System.out.println("differensen är "+ differens);
        }else if (raknesatt =='/') {
            kvot = tal1 / tal2;
            System.out.println("kvoten är " + kvot);
        }else if(raknesatt == '*'){
            produkt = tal1 * tal2;
            System.out.println("produkten är " + produkt);         
        }//end if, else if
            System.out.print("Vill du räkna igen? J/N:");
            fortsatt = sc.next().charAt(0);
    }while ( fortsatt == 'j' || fortsatt == 'J');                
        
    }//end main    
}//end class

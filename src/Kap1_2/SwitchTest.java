/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class SwitchTest {
    
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        int manad;
        
        //Inmatning
        System.out.print("Ange månad 1-12: ");
        manad = sc.nextInt();
        
        //Switch sats
        switch (manad) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
           case 3:
                System.out.println("Mars");
                break;
           case 4:
                System.out.println("April");
                break;
           case 5:
                System.out.println("Maj");
                break;
           case 6:
                System.out.println("Juni");
                break;
           case 7:
                System.out.println("Juli");
                break;
           case 8:
                System.out.println("Augusti");
                break;
           case 9:
                System.out.println("September");
                break;
           case 10:
                System.out.println("Oktober");
                break;
           case 11:
                System.out.println("November");
                break;
           case 12:
                System.out.println("December");
                break;
           
            default:
                System.out.print("Invalid month");
            
                
        }//end switch        
    }//end main    
}//end class

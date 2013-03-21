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
public class Betyg {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int poang;
        
        //inmatning
        System.out.print("Ange antal poäng: ");
        poang = sc.nextInt();
        //koll
        
        
        
        if(poang >= 90 ){
            System.out.println("MVG");
        }
            else if (poang  >=75) {
                System.out.println("VG");
            }
            else if (poang >=50){
                System.out.println("G");
            }
                
        else{
            System.out.println("Underkänd");
        }//end if else
        
    }//end main
    
}//end class

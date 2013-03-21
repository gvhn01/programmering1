/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;


/**
 *
 * @author gvhn01
 */
public class Feber {
        
        //Deklaration
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double temp; 
        
        //Inmatning 
        System.out.print("Ange din temperatur:");
        temp = sc.nextDouble (); 
       
        //Beräkning
        if (temp > 37.5 ){
            System.out.println("Du har feber");
        }
        else {
            if (temp > 33 ){
            System.out.println("Du har inte feber!");
        }
            else {
                System.out.println("Du är mycket sjuk.");
            }}
    }//end main
    
}//end class

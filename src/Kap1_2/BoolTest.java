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
public class BoolTest {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int alder;
        boolean myndig;
        
        //inmatning
        System.out.print("Ange din ålder: ");
        
        
        //True or false
        alder = sc.nextInt();
        myndig = alder > 17;
        
        if (myndig) {
            System.out.println("Du är myndig");
        } //end if
        else {
            System.out.println("du är inte myndig");
        }//end else
    }//end main
    
}//end class

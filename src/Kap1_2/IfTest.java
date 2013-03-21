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
public class IfTest {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int x,y; 
        
        //inmatning
        System.out.print("ange x: ");
        x = sc.nextInt();
        System.out.print("ange y: ");
        y = sc.nextInt(); 
        
        //if, else if, else 
        if (x > 0 && y > 0){
            System.out.print("Båda talen är positiva");
        }//end if
        else if (x > 0 || y > 0){
            System.out.println("Ett av talen är negativt");
        }//end else if
        else {
            System.out.println("Inget tal är positivt");
        }//end else        
    }//end main    
}//end class

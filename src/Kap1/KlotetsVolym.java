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
public class KlotetsVolym {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        double radie, volym, pi;
        pi = 3.14159;
                
        //inmatning
        System.out.println("Hur stor är radien (cm)? ");
        radie = sc.nextDouble(); 
        
        //beräkning
        volym = 4 * pi * radie * radie * radie / 3; 
        
        //ustskrift
        System.out.println("volymen är " + volym + " kubikcentimeter ");
    }//end main
    
}//end class

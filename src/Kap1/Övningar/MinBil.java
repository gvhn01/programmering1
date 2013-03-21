/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1.Övningar;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class MinBil {
    
    public static void main(String[] args) {
       
        System.out.println("   _____   ");
        System.out.println("__/_____\\__   ");
        System.out.println("-0-------0-");
        
        Scanner sc = new Scanner(System.in);
        //inmatning
        System.out.print("Hur långa ska bilen vara? ");
        int längd = sc.nextInt();
        
        //loop
        int i = 0;
        System.out.print("   ");
        if (längd < 101){
        while (i < längd){
            System.out.print("_");
            i++;
            
        }
        System.out.println("");
        System.out.print("__/");
        
        i = 0;
        while (i < längd){
            
            System.out.print("_");
            i++;
        }
        System.out.println("\\__");
        
        System.out.print("-0 ");
        
        i = 0;
        while (i < längd){
            System.out.print("-");
            i++;
        }
        
        System.out.print(" 0--");
        
        }//end if
        else {
            System.out.print("Din bil är för lång");
            System.out.println("");
        }
        
        
    }//end main
    
}//end class

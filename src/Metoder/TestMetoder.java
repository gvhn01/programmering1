/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metoder;

import java.util.Scanner;


/**
 *
 * @author gvhn01
 */
public class TestMetoder {
    
    public static void main(String[] args) {
        
        Support SupportObject = new Support(); 
        Scanner input = new Scanner(System.in);
        System.out.print("Vad heter du: ");
        String name = input.nextLine(); 
        SupportObject.simpleMessage(name); 
        
        
    }//end main 
}//end class

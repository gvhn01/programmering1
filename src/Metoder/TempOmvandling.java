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
public class TempOmvandling {
    public static void main(String[] args) {
        double fahr; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ange temperaturen i fahrenheit: ");
        fahr = sc.nextInt(); 
        
        
        Support program = new Support();
        double svar = program.temp(fahr);
        System.out.print(fahr + " grader fahrenheit är lika med ");
        System.out.print(svar + " grader celcius");
    }//end main
}//end class

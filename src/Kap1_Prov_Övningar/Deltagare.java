/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_Prov_Övningar;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class Deltagare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ange antalet deltagare: ");
        int deltagare = sc.nextInt(); 
        
        Support program = new Support(); 
        program.deltagare(deltagare);
        
    }//end main    
}//end class

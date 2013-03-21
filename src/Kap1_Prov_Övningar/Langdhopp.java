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
public class Langdhopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double langd, vind;
 
        
        System.out.print("Ange längden: ");
        langd = sc.nextDouble();
        System.out.print("Ange vindstyrkan: ");
        vind = sc.nextDouble(); 
        
        Support program = new Support(); 
        boolean rekord = program.langdhopp(langd, vind);
        if (rekord == true) 
        {
            System.out.print("Rekord");
        }
        else
        { 
            System.out.print("Inget rekord");
        }    
        System.out.println("");
        
        /*rekord = langd > 7.92 & vind <= 2; 
        if (rekord) {
            System.out.print("Grattis");
        }else System.out.print("du suger");
        */
        
    }//end main    
}//end class

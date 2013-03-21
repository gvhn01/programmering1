/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class Initialer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fornamn = "Gustav";
        String efternamn = "Henningsson";
        
        System.out.print(fornamn.charAt(0));
        System.out.println("." + efternamn.charAt(0));
        
        String helaNamnet = "Gustav Henningsson";
        System.out.print(helaNamnet.charAt(0) + ".");
        
        for (int i = 0; i < helaNamnet.length(); i++) {
            if (helaNamnet.charAt(i)==' ') {//kolla vilken plats mellanslaget har
                System.out.print(helaNamnet.charAt(i + 1));
                //plussa på ett steg och skriv första bokstaven efter mellanslaget
            }//end if 
        }//end for
    }//end main    
}//end class

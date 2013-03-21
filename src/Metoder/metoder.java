/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metoder;

/**
 *
 * @author gvhn01
 */
import java.util.Scanner; 

public class metoder {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
                
        tuna tunaObject = new tuna();
        
        System.out.print("Enter namne of your first gf here: ");
        String temp = input.nextLine(); 
        tunaObject.setName(temp); 
        tunaObject.saying(); 
    }
    
}

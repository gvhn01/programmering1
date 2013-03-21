/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

/**
 *
 * @author gvhn01
 */
public class StringNamn {
    public static void main(String[] args) {
        String namn; 
        namn = "gustav"; 
        for (int i = 0; i < namn.length(); i++) 
        {
            System.out.print(namn.charAt(i));
        }//END FOR

        for (int i = namn.length()-1; i >= 0; i--) 
        {
            System.out.print(namn.charAt(i));
        }//End for, baklänges loop
       
    }//end main    
}//end class

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap9_1;

import java.util.Arrays;

/**
 *
 * @author gvhn01
 */
public class TestaArrayer {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,34,3};
        
        Arrays.equals(a, b);
        
        if (a == b) {
            System.out.println("Lika");
        }else{
            System.out.println("Olika");
        }
        
    }//end main    
}//end class

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap9_1;

import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class SekvensSok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {13,15,7};
        int pos = -1;
        
        System.out.print("Vilket heltal söker du? ");
        int t = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            if (t==arr[i]) {
                pos = i;//anger positionen på hittad plats
                i = arr.length;//avlustar loopen                
            }//end if
        }//end for
        
        if (pos == -1) {
            System.out.println("Talet hittades inte");
        }else{
            System.out.println("Talet finns i elementet " + pos);
        }
    }//end main    
}//end class

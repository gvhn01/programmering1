/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap9_1;

/**
 *
 * @author gvhn01
 */
public class Sortera 
{
    public static void main(String[] args) {
        int n = 100;
        int [] a = new int [n];
        System.out.println("Dessa tal slumpas i arrayen");
        System.out.println("Listan är osorterad");
        for (int i = 0; i < n; i++) {
            if (i%10==0) {
                System.out.println("");
            }//end if
            a[i] = (int)(1000 * Math.random());
            System.out.print(a[i] + "\t");            
        }//end for
        System.out.println("");
        //här sker sorteringen 
        int s;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }//end if                
            }//end for inner
        }//end for outer
        System.out.println("Här skrivs den sorterade listan ut");
        for (int i = 0; i < n; i++) {
            if (i%10==0) {
                System.out.println("");
            }//end if
            System.out.print(a[i] + "\t");
        }//end for
        System.out.println("");
    }//end main    
}//end class

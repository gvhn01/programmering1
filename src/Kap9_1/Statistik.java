/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap9_1;

/**
 *
 * @author gvhn01
 */
public class Statistik {
    public static void main(String[] args) {
        int n = 100; 
        int [] a = new int[n];
        System.out.println("Dessa tal slumpas till arrayen");
        for (int i = 0; i < a.length; i++) {
            if (i%10==0) {
                System.out.println("");                
            }//end if
            a [i] = (int)(1000* Math.random());
            System.out.print(a[i] + "\t");
        }//end for
        int summa;
        int max;
        int min; 
        double medel;
        summa = 0; 
        max = -1;
        min = 1000;
        for (int i = 0; i < n; i++) {
            summa = summa +a[i];
            if (a[i]>max) {
                max = a[i];
            }//end if
            if (a[i]< min) {
                min = a[i];
            }
        }//end for
        medel = (double)summa/n;
        System.out.println("");
        System.out.println("Summa = " + summa + " Medel = " + medel);
        System.out.println("Max = " + max + " Min = " + min);
    }//end main    
}//end class

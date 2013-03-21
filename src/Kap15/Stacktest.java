/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author gvhn01
 */
public class Stacktest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> minStack = new Stack<String>();
        String namn;
        boolean fortsatt = true;



        while (fortsatt) {

            System.out.println("STACK: ");

            System.out.println("");
            System.out.println("Välj: ");
            System.out.println("1. Lägg en tallrik på tallrikstraven ");
            System.out.println("2. Vems tallrik ligger högst upp?");
            System.out.println("3. Ta bort översta tallriken ");
            System.out.println("0. Avsluta");
            System.out.print("Välj något av ovanstående alternativ: ");
            
            try {
                int svar = sc.nextInt();
                switch (svar) {
                    case 1:
                        System.out.println("");
                        System.out.print("Vems tallrik? ");
                        namn = sc.nextLine();
                        minStack.push(namn);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println(minStack.peek() + "tallrik ligger högst upp");
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("Tar bort " + minStack.pop() + "tallrik");
                        break;
                    case 0:
                        fortsatt = false;
                        System.out.println("Slut");

                        break;
                    default:

                }

            } catch (Exception e) {
                System.out.println("Error");
            }
        }//end while     
    }//end main    
}//end class

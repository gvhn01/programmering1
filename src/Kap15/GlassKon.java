/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class GlassKon {
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        LinkedList<String> namnLista = new LinkedList<>();
        int val;
        String namn;
        boolean fortsatt = true;
        while (fortsatt) 
        {//loopen körs så länge fortsatt = true
            
            if (namnLista.isEmpty()) {
                System.out.println("Listan är tom");
            }else{
                for (int i = 0; i < namnLista.size(); i++) {
                    
                    System.out.println(i + ". " + namnLista.get(i));//skriver ut namnlistan
                }//End for
            }//end if else
            
            System.out.println("");
            
            System.out.println("Dina val");
            System.out.println("1. Lägg till en person");
            System.out.println("2. Vem är först i kön?");
            System.out.println("3. Ta bort person");
            System.out.println("0. Avsluta");
            System.out.println("");
            
            try {                
            
            System.out.print("Välj något av ovanstående alternativ: ");
            val = sc.nextInt();

            switch (val) {
                case 1:
                    char laggTillNamn = 'n';
                    do {
                        System.out.print("Ange en person: ");
                        namn = sc.next();
                        namnLista.addLast(namn);
                        System.out.print("Vill du lägga till en till person(j/n)? ");
                        laggTillNamn = sc.next().charAt(0);
                        System.out.println("");
                    } while (laggTillNamn == 'J' || laggTillNamn == 'j');
                    System.out.println("");
//                    namnLista.add("Kalle");
//                    namnLista.add("Pelle");
//                    namnLista.add("Olle");
//                    namnLista.add("Johan");
//                    namnLista.add("Lisa");
//                    namnLista.add("Patrik");
                    
                    break;
                case 2:                    
                    namn = namnLista.getFirst();
                    System.out.println("");
                    System.out.println(namn + " är först i kön");
                    System.out.println("");
                        
                    break;
                case 3:                    
                    namnLista.removeFirst();
                    break;
                    
                case 0:
                    
                    fortsatt = false;
                    System.out.println("GoodBye");
                    break;
                default:                    
            }//end switch
            } catch (Exception e) {
                System.out.println("Error");
            }//end try
        }//end while
        
    }//end main    
}//end class

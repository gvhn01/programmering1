/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class Hashtest2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String land;
        int antalratt = 0;
        Hashtable<String, String> ht = new Hashtable<String, String>();
        boolean fortsatt = true;

        while (fortsatt) {


            System.out.println("");
            System.out.println("1. Skapa hashtabell");
            System.out.println("2. Söka huvudstad");
            System.out.println("3. Visa tabellen");
            System.out.println("4. Geografiförhör");
            System.out.println("0. Avsluta");
            System.out.print("Välj: ");
            int svar = sc.nextInt();

            switch (svar) {
                case 1:
                    System.out.println("");
                    ht.put("Danmark", "Köpenhamn");
                    ht.put("Finland", "Helsingfors");
                    ht.put("Norge", "Oslo");
                    ht.put("Ryssland", "Moskva");
                    ht.put("Tyskland", "Berlin");
                    ht.put("Finland", "Helsingfors");
                    ht.put("Frankrike", "Paris");
                    ht.put("Sverige", "Stockholm");
                    break;
                case 2:
                    System.out.print("Land? ");
                    land = sc.next();
                    System.out.println("Huvudstad: " + ht.get(land));
                    break;
                case 3:
                    for (String nyckel : ht.keySet()) {
                        System.out.print(nyckel + ": ");
                        System.out.println(ht.get(nyckel));
                    }
                    break;
                case 4:
                    for (String nyckel : ht.keySet()) {
                        System.out.println("Vad heter Huvudstaden i " + nyckel + " :");
                        String svaret = sc.next();
                        if (svaret.equals(ht.get(nyckel))) {
                            System.out.println("Rätt");
                            antalratt = antalratt + 1;
                        }else {
                            System.out.println("Fel! Rätt svar är " + ht.get(nyckel));
                        }
                    }
                    System.out.println("Du fick " + antalratt + "  rätt ");
                    break;
                case 0:
                    fortsatt = false;
                    break;
                default:



            }//end switch
        }//end while
        System.out.println("SLUT");
    }//end main    
}//end class

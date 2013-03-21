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
public class Glostest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, String> ht = new Hashtable<String, String>();  
        int antalRatt = 0;
        boolean fortsatt = true;

        while (fortsatt) {

            System.out.println("");
            System.out.println("1. Skapa gloslistan");
            System.out.println("2. Visa gloslista");
            System.out.println("3. Lägg till en glosa");
            System.out.println("4. Glostest");
            System.out.println("0. Avsluta");
            System.out.print("Välj: ");

            int svar = sc.nextInt();
            try {
                switch (svar) {
                    case 1:
                        ht.put("måne", "moon");
                        ht.put("sol", "sun");
                        ht.put("regn", "rain");
                        ht.put("snö", "snow");
                        break;
                    case 2:
                        for (String nyckel : ht.keySet()) {
                            System.out.print(nyckel + ": ");
                            System.out.println(ht.get(nyckel));
                        }
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("Lägg till en ny glosa: ");
                        System.out.print("Svenskt ord: ");
                        String svenskGlosa = sc.next();
                        System.out.print("Engelskt ord: ");
                        String engelskGlosa = sc.next();
                        System.out.println("");
                        
                        ht.put(svenskGlosa, engelskGlosa); 

                        break;
                    case 4:
                        for (String nyckel : ht.keySet()) {
                            System.out.println("Vad heter " + nyckel + " på engelska: ");
                            String svaret = sc.next();
                            if (svaret.equals(ht.get(nyckel))) {
                                System.out.println("Rätt");
                                antalRatt = antalRatt + 1;
                            }else{
                                System.out.println("Fel!");
                                System.out.println("Rätt svar var " + ht.get(nyckel));
                            }//end if, else
                        }
                        System.out.println("Du fick " + antalRatt + " / " + ht.size() + " rätt");
                        antalRatt = 0;
                        break;
                    case 0:
                        System.out.println("Slut");
                        fortsatt = false;                        
                        break;

                    default:
                }//end switch
            } catch (Exception e) {
            }
        }//end while
    }//end main    
}//end class

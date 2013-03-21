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
public class Hashtest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String land;
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("Danmark", "Köpenhamn");
        ht.put("Finland", "Helsingfors");
        ht.put("Norge", "Oslo");
        ht.put("Ryssland", "Moskva");
        ht.put("Tyskland", "Berlin");
        ht.put("Finland", "Helsingfors");
        ht.put("Frankrike", "Paris");
        ht.put("Sverige" , "Stockholm");
        System.out.print("Land? ");
        land = sc.next();
        while (!land.equals("#")) {
            System.out.println("Huvudstad: " + ht.get(land));
            System.out.print("Land? ");
            land = sc.nextLine();
        }
        System.out.println("SLUT");
    }//end main    
}//end class

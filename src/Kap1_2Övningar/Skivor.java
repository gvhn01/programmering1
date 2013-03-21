/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2Övningar;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author gvhn01
 */
public class Skivor {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.##");
        String formateratTal; 
        int antalSkivor;
        double skivPris; 
        
        //initiering
        System.out.println("Välkommen till CD shopen");
        System.out.println("Priset på en skiva är 9,90kr");
        System.out.println("Du får mängdrabbat");
        System.out.println("Vid köp av 10 skivor ges 5% rabatt");
        System.out.println("Vid köp av 50 skivor ges 10% rabatt");
        System.out.println("Vid köp av 100 skivor gest 15% rabatt");
        System.out.print("Hur många skivor vill du köpa: ");
        antalSkivor = sc.nextInt(); 
        
        skivPris = antalSkivor * 9.90; 
        formateratTal = d.format(skivPris);
        
        if (antalSkivor >= 100){
            skivPris = skivPris * 0.85;  
            formateratTal = d.format(skivPris);
            System.out.println(" Du har fått 15% rabbat. Du får betala " + formateratTal + "kr");
        }else if ( antalSkivor >= 50){
            skivPris = skivPris * 0.90; 
            formateratTal = d.format(skivPris);
            System.out.println("Du har fått 10% rabatt. Du får betala " + formateratTal + "kr");
        }else if (antalSkivor >=10){
            skivPris = skivPris * 0.95;
            formateratTal = d.format(skivPris);
            System.out.println("Du har fått 5% rabatt. Du får betala " + formateratTal + "kr");
        }else if (antalSkivor == 0 ){
            System.out.println("Du har inte köpt några skivor.");
            System.out.println("Välkommen åter");
        }
        else {
            System.out.println("Du får ingen rabatt. Priset är " + formateratTal + "kr");
        }//end if, else if, else        
    }//end main    
}//end class

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_Prov_Övningar;

/**
 *
 * @author gvhn01
 */
public class Support {
     public double ohm(double r, double i)
    {   
        double u; 
        u = r*i; 
        return u; 
    }//end ohm 
     
     public void soltimmar (String stad, int antaltimmar)
     {
         for (int i = 0; i < antaltimmar; i++) {
             System.out.print("*");    
         }//end for
     }//end soltimmar
     
     public double area(double radie){
         double pi, area; 
         pi = 3.14;
         area = radie * radie * pi; 
         return area; 
     }//end area
     
     public double omkrets(double radie){ 
         double pi, omkrets; 
         pi = 3.14; 
         omkrets = radie * 2 * pi; 
         return omkrets; 
     }//end omkrets
     
     public void deltagare (int deltagare){
         if (deltagare <= 12) {
             System.out.print("OK");
             System.out.println("");
         }//end if
         else {
             System.out.print("För många");
             System.out.println("");
         }//end else
     }//end deltagare
     
     public boolean langdhopp(double langd, double vind){
         boolean rekord; 
         if (langd > 7.92 & vind <= 2.0) {
             rekord = true;             
         }//end if
         else 
         {
             rekord = false;
         }//end else 
         return rekord; 
     }//end langdhop
     
     public double skivor (int antalskivor)
     {
         
         double skivpris, pris; 
         skivpris = 9.9; 
         pris = skivpris * antalskivor;
         
        if (antalskivor > 100) 
        {
            pris = pris * 0.85; 

        }//end if
        else if (antalskivor > 50)
        {
            pris = pris * 0.90; 
        }//end else if
        else if (antalskivor > 10)
        {
            pris = pris * 0.95; 
        }//end else if
        else 
        {
            pris = pris; 
        }//end else
         
         return pris;
     }//end skivpris
     
     public double matte (double tal1, double tal2, char raknesatt)
     {
          double svar;
          switch (raknesatt) 
        {
            case '+':  
                svar = tal1 + tal2; 
                break;
                
            case '-':
                svar = tal1 - tal2; 
                break; 
                
            case '*':
                svar = tal1 * tal2; 
                break; 
            case '/':
                svar = tal1 / tal2; 
                break; 
            default:
                throw new AssertionError();
          }       
         return svar; 
     }//end matte
     
     public void namnLoop (String namn, int antalVarv)
     {
         //Loop som skriver ut ditt namn
        for (int i = 0; i < antalVarv; i++) 
        {
            System.out.println("Du heter " + namn);
        }//end for loop 

     }//end 
}//end class

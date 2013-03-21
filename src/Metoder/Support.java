/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metoder;

/**
 *
 * @author gvhn01
 */
public class Support {
    
    
    
    public void simpleMessage(String name){      
        System.out.print("Hej" + name);
    
    
    }//end simplemessage
    public int tal(){ 
    int tal = 25; 
    return tal; 
    }//end tal
    public double temp(double fahr)
    { 
        double celcius = (fahr - 32) / 1.8; 
        return celcius;        
    }//end fahr
    
    public double minstaTal(double tal, double tal2)
    {
        double min = tal;
         if (tal2 < min)
        {
            min = tal2;             
        }
        return min;
        
    }//end minstaTal        
    
   
    
}//end class


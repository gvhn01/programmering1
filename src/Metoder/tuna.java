/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metoder;

/**
 *
 * @author gvhn01
 */
public class tuna {
    private String girlName; 
    public void setName(String name){
        girlName = name; 
        
    } 
    public String getName(){
        return girlName; 
    } 
    
    public void saying() {
        System.out.printf("Your first gf was %s", getName());
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

/**
 *
 * @author moabi
 */
public class ShoppingCart {
     
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt ("Sailor", 'G', 30);
        Shirt shirt02 = new Shirt ("Sweetheart", 'B',25.5);
        Shirt shirt03 = new Shirt ("Skull Tee", 'Y', 15.9);
        Shirt shirt04 = new Shirt ("Tropical", 'R', 55);
        
        shirt01.setColor("Purple");
        System.out.println(shirt01.display());
        
    }
}   
        
        
  
    

    
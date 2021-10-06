/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author moabi
 */
public class ArrayExample {
    public static void main(String[] args) {
        String [] names = new String[4];
        names[0] = "Ndabe";
        names[1] = "Lesedi";
        names[2] = "Elgin";
        
         
         
        
        for (String name : names){
            if (name == "Elgin") {
            break;
            }
            
            else {
                System.out.println("My name is" + " " + name);
        }  
       }
    }
}


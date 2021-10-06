/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeExercise;

/**
 *
 * @author moabi
 */
public class Main {
    public static void main (String[] args) {
        Finance emp1 = new Employees ("Hugo", "Broos", 'Male', 23);
        Engineering emp2 = new Employees ("Connie", "Fegurson", 'F',30);
        Employees emp3 = new Employees ( "Floyd", "Mayweather", 'M', 45)
         
        
        
        emp1.display();
        System.out.println(".......................................");
        emp2.display();
        System.out.println(".........................................");
        emp3.display();
        System.out.println("...........................................");

        
        
        
        
    }
}
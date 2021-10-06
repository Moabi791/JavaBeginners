/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author moabi
 */
public class Main {

    public static void main(String[] args) {
        Employees emp1 = new Employees("John", "Wick", 50, "0118861265", 9465921);
        Employees emp2 = new Employees("Chris", "Smith", 65, "01254646554", 02475455);
        Employees emp3 = new Employees("Wesley", "Snipes",52,"0127865529",6559654);
        
        Employees[] myEmps = {emp1,emp2,emp3};
        
        for (Employees emp: myEmps){
            emp.displayDetails();
            System.out.println("\n");
        }
    }
}

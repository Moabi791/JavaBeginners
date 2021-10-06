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
public class Finance extends Employees {
    
    private String role;
    private double salary;

    public Finance(String firstName, String lastName, char gender, double age, String role, double salary ) {
        super(firstName, lastName, gender, age);
        this.role = role;
        this.salary = salary;
    }
    
   @Override
   public void display() {
       super.display();
       System.out.println("role: "  + getRole());
       System.out.println("salary: " + getSalary());
   }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
            
    
}

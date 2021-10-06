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
public class Employees {
    private String name;
    private String surname;
    private int age;
    private String conatactNum;
    private int identityNum;

    public Employees(String name, String surname, int age, String conatactNum, int identityNum) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.conatactNum = conatactNum;
        this.identityNum = identityNum;
    }
    
    public void displayDetails(){
        System.out.println("Name: " + getName() + "\nSurname: " + getSurname()
        + "\nAge: " + getAge() + "\nContact Number: " + getConatactNum()
        + "\nID Number: " + getIdentityNum());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getConatactNum() {
        return conatactNum;
    }

    public void setConatactNum(String conatactNum) {
        this.conatactNum = conatactNum;
    }

    public int getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(int identityNum) {
        this.identityNum = identityNum;
    }
    
}

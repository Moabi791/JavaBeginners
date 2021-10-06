/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

/**
 *
 * @author moabi
 */
public class incrementDecrement {
    public static void main(String[] args) {
        int ID = 6;
        int newID = --ID;
        System.out.println("ID: " + ID + ", NewID: " + newID);
        int count = 15;
        int a, b, c, d;
        a = count++;
        b = count;
        c = ++count;
        d = count;
        System.out.println(a +  ", " + b + ", " + c + ", " + d);
    }
    
}

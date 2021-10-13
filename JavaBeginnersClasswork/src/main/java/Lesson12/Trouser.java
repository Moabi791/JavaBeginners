/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author moabi
 */
public class Trouser extends Clothing{
    private int length;
    private int width;
    
    public Trouser(int itemID, String description, char colorCode, double price, int length, int width){
        super(itemID, description, colorCode, price);
        this.length = length;
        this.width = width;
}
    
@Override
public void display() {
    super.display();
    System.out.println("length: " + getLength());
    System.out.println("width: " + getWidth());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9;

/**
 *
 * @author moabi
 */
public class Shirt {
    private int ShirtID;
    private String description = "-description-";
    private char colorCode = 'U';
    private double price = 0.0;

    public Shirt(int ShirtID, char colorCode,  String description, double price) {
        this.ShirtID = ShirtID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }
    
     public Shirt( char colorCode,  String description, double price) {
        this.ShirtID = ShirtID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }
     
      public Shirt(  String description, double price) {
        this.ShirtID = ShirtID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }
      
      
      public Shirt( double price) {
        this.ShirtID = ShirtID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }
      
      
    public void display () {
        System.out.println("ShirtID: " + getShirtID());
        System.out.println("Description: " + getDescription());
        System.out.println("colorCode: " + getColorCode());
        System.out.println("Price: " + getPrice());
    
    
    }

    public int getShirtID() {
        return ShirtID;
    }

    public void setShirtID(int ShirtID) {
        this.ShirtID = ShirtID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

/**
 *
 * @author moabi
 */
public class Shirt extends Clothing implements Returnable {
    private char fit;
    private String sleeve;
    private char color;

    public Shirt(int itemID, String desc, char colorCode, double price, char fit, String sleeve) {
        super(itemID, desc, colorCode, price);
        this.fit = fit;
        this.sleeve = sleeve;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Fit: " + getFit());
        System.out.println("Sleeve: " + getSleeve());
        System.out.println("\n");
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }
    
    @Override
    public String doReturn(){
        return "This  return mustbe at least in a 1 week or!";
    }
}

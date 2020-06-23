/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bexx
 */
public class Product {

    private int quantity;
    private double price;
    private String name;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        
        this.quantity = initialQuantity;
        this.price = initialPrice;
        this.name = initialName;
        
    }
    
    public void printProduct() {
        System.out.println(this.name + ", price" + this.price + ", " + this.quantity + " pcs");
    }
}

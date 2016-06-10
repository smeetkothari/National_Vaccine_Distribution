/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.enterprise.Vaccine;

/**
 *
 * @author Smeet
 */
public class InventoryItem {

    private Vaccine v;
    private int price;
    private int quantity;
    

    public Vaccine getV() {
        return v;
    }

    public void setV(Vaccine v) {
        this.v = v;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.valueOf(v);
    }

    
    
}

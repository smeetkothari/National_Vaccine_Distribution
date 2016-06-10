/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.enterprise.Vaccine;
import business.organization.WarehouseOrganization;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class InventoryCatalog {

    ArrayList<InventoryItem> inventoryList;
    //WarehouseOrganization organization;

    public InventoryCatalog() {
        inventoryList = new ArrayList<>();
        //organization = new WarehouseOrganization();
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<InventoryItem> inventoryList) {
        this.inventoryList = inventoryList;
    }

    

    
    public InventoryItem addInventoryItem(int quantity,Vaccine v) {
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setPrice(quantity);
        inventoryItem.setV(v);
        inventoryList.add(inventoryItem);
        return inventoryItem;
    }
    
    public void deleteInventoryItem(InventoryItem ii,int quantity){
        inventoryList.remove(ii);
        inventoryList.remove(quantity);
    }
    
    
}


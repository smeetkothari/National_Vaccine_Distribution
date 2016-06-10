/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.ManufacturerOrganization;
import java.util.Date;

/**
 *
 * @author Smeet
 */
public class Vaccine {

    private String vacName;
    private int vacId;
    private static int counter = 0;
    private String vacDescription;
    private String manufactureDate;
    private String expiryDate;
    private int price;
    private int availability;
    private int quantity;
    private Date date;
    private String fundingStatus;
    private int sold;
    private ManufacturerOrganization manufacturer;

    public Vaccine() {
        counter++;
        vacId = counter;
        date = new Date();
    }
    
    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String getVacName() {
        return vacName;
    }

    public void setVacName(String vacName) {
        this.vacName = vacName;
    }

    public int getVacId() {
        return vacId;
    }

    public void setVacId(int vacId) {
        this.vacId = vacId;
    }

    public String getVacDescription() {
        return vacDescription;
    }

    public void setVacDescription(String vacDescription) {
        this.vacDescription = vacDescription;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFundingStatus() {
        return fundingStatus;
    }

    public void setFundingStatus(String fundingStatus) {
        this.fundingStatus = fundingStatus;
    }

    public ManufacturerOrganization getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerOrganization manufacturer) {
        this.manufacturer = manufacturer;
    }

  
    
    
    
    @Override
    public String toString() {
        return vacName;
    }
}

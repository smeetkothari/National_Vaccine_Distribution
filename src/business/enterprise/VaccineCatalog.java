/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.enterprise;

import business.patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class VaccineCatalog {
    ArrayList<Vaccine> vaccineList;
    
    public VaccineCatalog(){
        vaccineList = new ArrayList<>();
        
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

 
    
    
     public Vaccine addVaccine(String name,String manuDate,String expiryDate ,int price,int quantity){
        Vaccine v = new Vaccine();
        v.setVacName(name);
        v.setPrice(price);
        v.setManufactureDate(manuDate);
        v.setExpiryDate(expiryDate);
        v.setQuantity(quantity);
        
        vaccineList.add(v);
        return v;
    }
}

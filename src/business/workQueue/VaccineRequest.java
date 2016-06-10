/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.Order;
import business.organization.Organization;
import java.util.Date;

/**
 *
 * @author Smeet
 */
public class VaccineRequest extends WorkRequest {

    private String requestedVaccine;
    private Order order;
    private int quantity;
    private String vacName;
    private Date date;
    private Organization cOrg;
    private Organization hOrg;

    public VaccineRequest() {
        date = new Date();
    }

    public String getRequestedVaccine() {
        return requestedVaccine;
    }

    public void setRequestedVaccine(String requestedVaccine) {
        this.requestedVaccine = requestedVaccine;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getVacName() {
        return vacName;
    }

    public void setVacName(String vacName) {
        this.vacName = vacName;
    }

    public Organization getcOrg() {
        return cOrg;
    }

    public void setcOrg(Organization cOrg) {
        this.cOrg = cOrg;
    }

    public Organization gethOrg() {
        return hOrg;
    }

    public void sethOrg(Organization hOrg) {
        this.hOrg = hOrg;
    }
    
    
    

    @Override
    public String toString() {
        return String.valueOf(date);
    }

}

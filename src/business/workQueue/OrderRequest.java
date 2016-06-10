/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.Order;
import business.organization.ClinicOrganization;
import business.organization.WarehouseOrganization;
import java.util.Date;

/**
 *
 * @author Smeet
 */
public class OrderRequest extends WorkRequest {

    Order order;
    // private int quantity;
    WarehouseOrganization organization;
    private Date date;
    VaccineRequest vaccineRequest;
    ClinicOrganization cOrg;
    String paymentStatus;

    public OrderRequest() {
        date = new Date();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public WarehouseOrganization getOrganization() {
        return organization;
    }

    public void setOrganization(WarehouseOrganization organization) {
        this.organization = organization;
    }

    public VaccineRequest getVaccineRequest() {
        return vaccineRequest;
    }

    public void setVaccineRequest(VaccineRequest vaccineRequest) {
        this.vaccineRequest = vaccineRequest;
    }

    public ClinicOrganization getcOrg() {
        return cOrg;
    }

    public void setcOrg(ClinicOrganization cOrg) {
        this.cOrg = cOrg;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    

    @Override
    public String toString() {
        return String.valueOf(date);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.organization;

import business.Order;
import business.patient.InjectionCatalog;
import business.patient.Patient;
import business.role.ClinicRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class ClinicOrganization extends Organization {

    private ArrayList<Order> orderList;
    InjectionCatalog injectionCatalog;
    public ClinicOrganization(String name) {
        super(name);
        orderList = new ArrayList<>();
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicRole());
        return roles;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public InjectionCatalog getInjectionCatalog() {
        return injectionCatalog;
    }

    public void setInjectionCatalog(InjectionCatalog injectionCatalog) {
        this.injectionCatalog = injectionCatalog;
    }

  
    
    
    
    
    
}

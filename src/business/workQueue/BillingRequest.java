/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.Order;
import java.util.Date;

/**
 *
 * @author Smeet
 */
public class BillingRequest extends WorkRequest {

    private Order order;
    private String billingRequest;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getBillingRequest() {
        return billingRequest;
    }

    public void setBillingRequest(String billingRequest) {
        this.billingRequest = billingRequest;
    }

    @Override
    public String toString() {
        return billingRequest;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.Order;
import business.organization.Organization;

/**
 *
 * @author Smeet
 */
public class RequestShipping extends WorkRequest {

    private String shippingRequest;
    private Order order;
    private OrderRequest orderRequest;

    public String getShippingRequest() {
        return shippingRequest;
    }

    public void setShippingRequest(String shippingRequest) {
        this.shippingRequest = shippingRequest;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    

}

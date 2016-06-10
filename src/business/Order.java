/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import business.enterprise.Vaccine;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Smeet
 */
public class Order {
   private ArrayList<OrderItem> orderItemList;
    private static int count = 0;
    private int orderNumber;
    private int orderId;
    private String status;
    private Date date;
    private static int count1 = 1;
    private int requestId;
    
    public Order() {
        count++;
        count1++;
        requestId = count1;
        orderId = count;
        date = new Date();
        orderItemList = new ArrayList<>();
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public OrderItem addOrderItem(Vaccine v, int quantity) {

        OrderItem orderItem = new OrderItem();
        orderItem.setVaccine(v);
        orderItem.setQuantity(quantity);
        orderItemList.add(orderItem);
        return orderItem;
    }

    public void deleteOrderItem(OrderItem oi) {
        orderItemList.remove(oi);
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

   
    
    

    @Override
    public String toString() {
        return String.valueOf(date);
    }
}

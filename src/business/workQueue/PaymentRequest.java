/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.workQueue;

import business.enterprise.Vaccine;
import java.util.Date;

/**
 *
 * @author Smeet
 */
public class PaymentRequest extends WorkRequest {
    private String paymentRequest;
    private Date date;
    private String result;
    Vaccine vaccine;

    public PaymentRequest(){
        date = new Date(); 
    }
    public String getPaymentRequest() {
        return paymentRequest;
    }

    public void setPaymentRequest(String paymentRequest) {
        this.paymentRequest = paymentRequest;
    }

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }

    @Override
    public String toString() {
        return String.valueOf(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    
    
    
    
}

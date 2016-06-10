/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.patient;

import business.enterprise.Vaccine;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Smeet
 */
public class PatientHistory {

    String givenBy;
    String place;
    String safety;
    String status;
    int insuranceCovered;
    Vaccine vaccine;
    String result;
    Date date;
    Insurance insurance;

    public PatientHistory() {
        insurance = new Insurance();
        
    }

    public String getGivenBy() {
        return givenBy;
    }

    public void setGivenBy(String givenBy) {
        this.givenBy = givenBy;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getInsuranceCovered() {
        return insuranceCovered;
    }

    public void setInsuranceCovered(int insuranceCovered) {
        this.insuranceCovered = insuranceCovered;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

   
}

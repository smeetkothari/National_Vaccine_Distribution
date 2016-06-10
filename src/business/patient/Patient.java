/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.patient;

import business.enterprise.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class Patient {

    private String patientName;
    private String patientID;
    private int patientAge;
    private String doctorName;
    private String pharmacyName;
    private String address;
    private String insuranceNumber;
    private String dob;
    private String insuranceStatus;
    private Vaccine vaccine;
    
    private ArrayList<PatientHistory> history;

    public Patient() {
        history = new ArrayList<>();
        
    }

    public ArrayList<PatientHistory> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<PatientHistory> history) {
        this.history = history;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }
    
    

    public PatientHistory addPatientHistory() {
        PatientHistory ph = new PatientHistory();
        history.add(ph);
        return ph;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    
    

    @Override
    public String toString() {
        return insuranceNumber;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.patient.Patient;
import business.role.CdcRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class CdcEnterprise extends Enterprise {

    ArrayList<Patient> patientList;

    public CdcEnterprise(String name) {
        super(EnterpriseType.Cdc, name);
        patientList = new ArrayList<Patient>();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CdcRole());
        return roles;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient addPatient() {
        Patient p = new Patient();
        patientList.add(p);
        return p;
    }
    
    public Patient searchUsingInsuranceNumber(String InsuranceNumber){
        for(Patient patient : patientList){
            if(patient.getInsuranceNumber().equals(InsuranceNumber)){
                return patient;
            }
        }
    return null;
    }

}

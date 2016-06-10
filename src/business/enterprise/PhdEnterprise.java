/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.enterprise;

import business.patient.Patient;
import business.role.PhdRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class PhdEnterprise extends Enterprise {
    
    ArrayList<Patient> patientHistory;

    public PhdEnterprise(String name) {
        super(EnterpriseType.Phd, name);
        patientHistory = new ArrayList<>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PhdRole());
        return roles;
    }

    public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Patient> patientHistory) {
        this.patientHistory = patientHistory;
    }
    
    
}

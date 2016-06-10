/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.patient;

import static business.role.Role.RoleType.Patient;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class InjectionCatalog {

    ArrayList<PatientHistory> injectionCatalog;

    public InjectionCatalog() {
        injectionCatalog = new ArrayList<>();

    }

    public ArrayList<PatientHistory> getInjectionCatalog() {
        return injectionCatalog;
    }

    public void setInjectionCatalog(ArrayList<PatientHistory> injectionCatalog) {
        this.injectionCatalog = injectionCatalog;
    }

    

}

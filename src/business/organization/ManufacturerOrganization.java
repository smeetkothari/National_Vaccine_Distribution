/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.enterprise.VaccineCatalog;
import business.role.ManufacturerAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class ManufacturerOrganization extends Organization {

    private VaccineCatalog vaccineCatalog;

    public ManufacturerOrganization() {
        super(Organization.Type.Manufacturer.getValue());
        vaccineCatalog = new VaccineCatalog();

    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog(VaccineCatalog vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufacturerAdminRole());
        return roles;
    }

}

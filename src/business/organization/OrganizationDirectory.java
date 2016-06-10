/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.enterprise.PhdEnterprise;
import business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type, String name) {
        Organization organization = null;
        if (type.getValue().equals(Type.Distributor.getValue())) {
            organization = new DistributorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Manufacturer.getValue())) {
            
            organization = new ManufacturerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Clinic.getValue())) {
            organization = new ClinicOrganization(name);
            organization.setName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Hospital.getValue())) {

            organization = new HospitalOrganization();
            organization.setName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Warehouse.getValue())) {
            
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        } 

        return organization;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.DistributorOrganization;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.patient.Patient;

/**
 *
 * @author Smeet
 */
public abstract class Enterprise extends Organization {

    //  private ArrayList<Disease> diseaseList;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    private DistributorOrganization distrubutorOrganization;
    //  private MasterOrderCatalog moc;

    public Enterprise(EnterpriseType type, String name) {
        super(null);
        this.enterpriseType = type;

        organizationDirectory = new OrganizationDirectory();
        distrubutorOrganization = new DistributorOrganization();
        //  diseaseList = new ArrayList<>();

    }

    public enum EnterpriseType {

        Cdc("CDC"),
        Phd("PHD");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;

        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public DistributorOrganization getDistrubutorOrganization() {
        return distrubutorOrganization;
    }

    public void setDistrubutorOrganization(DistributorOrganization distrubutorOrganization) {
        this.distrubutorOrganization = distrubutorOrganization;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

}

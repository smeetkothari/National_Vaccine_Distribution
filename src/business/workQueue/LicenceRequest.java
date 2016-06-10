/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.organization.Organization;
import business.userAccount.UserAccount;

/**
 *
 * @author Smeet
 */
public class LicenceRequest extends WorkRequest {

    private String licenceRequest;
    private static int licenceId;
    private static int count = 1;
    private Organization name;
   // private UserAccount receiver;

    public LicenceRequest() {
        count++;
        licenceId = count;
    }

    public String getLicenceRequest() {
        return licenceRequest;
    }

    public void setLicenceRequest(String licenceRequest) {
        this.licenceRequest = licenceRequest;
    }

    public int getLicenceId() {
        return licenceId;
    }

    public void setLicenceId(int licenceId) {
        this.licenceId = licenceId;
    }

    public Organization getName() {
        return name;
    }

    public void setName(Organization name) {
        this.name = name;
    }

    
    
}

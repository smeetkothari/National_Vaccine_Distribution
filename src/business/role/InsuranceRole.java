/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.CdcEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.InsuranceOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.insuranceRole.InsuranceWorkArea;

/**
 *
 * @author Smeet
 */
public class InsuranceRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network, Organization Parentorg, Enterprise parentEnt) {
        return new InsuranceWorkArea(userProcessContainer,(InsuranceOrganization)organization, (CdcEnterprise) parentEnt,account,enterprise);
    }

}

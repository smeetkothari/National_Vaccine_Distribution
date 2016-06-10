/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.role;

import business.EcoSystem;
import business.enterprise.CdcEnterprise;
import business.enterprise.Enterprise;
import business.enterprise.PhdEnterprise;
import business.network.Network;
import business.organization.HospitalOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.hospitalRole.HospitalWorkAreaJPanel;

/**
 *
 * @author Smeet
 */
public class HospitalAdminRole extends Role{

    
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,Network network,Organization Parentorg,Enterprise parentEnt) {
        return new HospitalWorkAreaJPanel(userProcessContainer, (HospitalOrganization)organization,account,(PhdEnterprise)enterprise,system,network);
    }
    
}

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
import business.organization.ClinicOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.clinicRole.ClinicWorkAreaJPanel;

/**
 *
 * @author Smeet
 */
public class ClinicRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network, Organization Parentorg, Enterprise parentEnt) {
        //System.out.println(network.getName());
        //System.out.println(parentEnt.getName());
        return new ClinicWorkAreaJPanel(userProcessContainer, account, (ClinicOrganization) organization, (CdcEnterprise)enterprise, Parentorg, network, parentEnt);

    }

}

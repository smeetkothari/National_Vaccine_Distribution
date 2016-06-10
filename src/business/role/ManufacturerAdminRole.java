/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.ManufacturerOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.manufacturerRole.ManufacturerWorkAreaJPanel;

/**
 *
 * @author Smeet
 */
public class ManufacturerAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,Network network,Organization Parentorg,Enterprise parentEnt) {
        return new ManufacturerWorkAreaJPanel(userProcessContainer,(ManufacturerOrganization)organization,account,enterprise);
    }
    
}
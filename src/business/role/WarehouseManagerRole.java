/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.enterprise.PhdEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.WarehouseOrganization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.warehouseRole.WarehouseWorkAreaJPanel;

/**
 *
 * @author Smeet
 */
public class WarehouseManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,Network network,Organization Parentorg,Enterprise parentEnt) {
        return new WarehouseWorkAreaJPanel(userProcessContainer,(WarehouseOrganization)organization,account,enterprise);
    }
    
}

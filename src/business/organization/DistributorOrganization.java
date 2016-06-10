/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.organization;

import business.role.DistributorAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class DistributorOrganization extends Organization {
    
    
    public DistributorOrganization() {
        super(Organization.Type.Distributor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorAdminRole());
        return roles;
    }
    
}

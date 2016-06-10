/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.organization;

import business.InventoryCatalog;
import business.role.Role;
import business.role.WarehouseManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class WarehouseOrganization extends Organization {
    

    public WarehouseOrganization() {
        super(Organization.Type.Warehouse.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WarehouseManagerRole());
        return roles;
    }
    
    
    
}

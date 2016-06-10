/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.organization;

import business.role.HospitalAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class HospitalOrganization extends Organization{

    public HospitalOrganization() {
        super(Organization.Type.Hospital.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalAdminRole());
        return roles;
    }
    
}

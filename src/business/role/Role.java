/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Smeet
 */
public abstract class Role {
    
    public enum RoleType{
        Distributor("Distributor Role"),
        Manufacturer("Manufacturer Role"),
        Phd("Phd Role"),
        Hospital("Hospital Role"),
        Clinic("Clinic Role"),
        Patient("Patient Role"),
        Warehouse("Warehouse Role");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
                                          UserAccount account, Organization organization,
                                          Enterprise enterprise, EcoSystem system,
                                          Network network,Organization Parentorg,Enterprise parentEnt);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

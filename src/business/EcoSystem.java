/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> countryList;
    private MasterOrderCatalog masterOrderCatalog;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
            
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        countryList = new ArrayList<>();
        masterOrderCatalog = new MasterOrderCatalog();
    }

    public ArrayList<Network> getCountryList() {
        return countryList;
    }

    public void setCountryList(ArrayList<Network> countryList) {
        this.countryList = countryList;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        countryList.add(network);
        return network;
    }

}

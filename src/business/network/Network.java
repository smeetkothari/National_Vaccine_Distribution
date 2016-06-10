/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class Network {

   private ArrayList<Network> stateList;
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
         stateList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Network> getStateList() {
        return stateList;
    }

    public void setStateList(ArrayList<Network> stateList) {
        this.stateList = stateList;
    }
    
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import business.employee.Employee;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author Smeet
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        
        //create a network
        //create an enterprise
        //Initialize some Organization
        //have some employees
        //create useraccount of them
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Smeet",
                                                            "USA","MA","Boston",
                                                            Integer.parseInt("02120"),
                                                            "St Alphonsus Street",
                                                            "kothari.sm@husky.neu.edu");
        
        UserAccount ua  = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", 
                                                                             employee, new SystemAdminRole());
        return system;
    }
}

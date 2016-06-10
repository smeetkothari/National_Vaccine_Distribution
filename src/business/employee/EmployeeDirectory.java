/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;

/**
 *
 * @author Smeet
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name, String country, String state,
                                   String city, int zipCode, String location,
                                   String emailId) {
        
        Employee employee = new Employee();
        employee.setName(name);
        employee.setCountry(country);
        employee.setState(state);
        employee.setCity(city);
        employee.setLocation(location);
        employee.setEmailId(emailId);
        employee.setZipCode(zipCode);
        employeeList.add(employee);
        return employee;
    }
}

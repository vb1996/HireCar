package com.example.vehicle;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataSource {

    private static EmployeeDataSource instance = null;
    List<EmployeeData> employees;

    private EmployeeDataSource() {
        employees = new ArrayList<>();

        String[]  empArray = new String[] {"Vineesha B","Gagandeep K","Pulkit S","Arshpreet  S","Jackson S","Logan B","Lucas T","Noah M","Ethan R","Jack W"};
        String[]  fnArray = new String[] {"Vineesha ","Gagandeep ","Pulkit ","Arshpreet","Jackson","Logan","Lucas","Noah","Ethan","Jack"};
        String[]  lnArray = new String[] {"Balne","Kaur","Sharma","Sidhu","Smith","Brown","Tremblay","Martin","Roy","Wilson"};
        String[]  phoneArray = new String[] {"514602451","514602452","514602453","514602454","514602455","514602456","514602457","514602458","514602459","514602460"};

        for (int i = 0; i < 10; i++) {
            EmployeeData employee = new EmployeeData();

            // Put random values, but id must be unique
            employee.id = i;
            employee.userName = empArray[i];
            employee.firstName = fnArray[i];
            employee.lastName = lnArray[i];
            employee.password = "a" + i;
            employee.contact = phoneArray[i];

            employees.add(employee);

        }

    }

    static EmployeeDataSource getInstance() {
        if (instance == null) {
            instance = new EmployeeDataSource();
        }
        return instance;
    }
}

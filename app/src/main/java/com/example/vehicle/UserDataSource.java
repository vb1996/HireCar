package com.example.vehicle;

import java.util.ArrayList;
import java.util.List;

public class UserDataSource {

    private static UserDataSource instance = null;
    List<UserData> users;

    private UserDataSource() {
        users = new ArrayList<>();
        String[]  userArray = new String[] {"Vineesha B","Gagandeep K","Pulkit S","Arshpreet  S","Jackson S","Logan B","Lucas T","Noah M","Ethan R","Jack W"};
        String[]  fnArray = new String[] {"Vineesha ","Gagandeep ","Pulkit ","Arshpreet","Jackson","Logan","Lucas","Noah","Ethan","Jack"};
        String[]  lnArray = new String[] {"Balne","Kaur","Sharma","Sidhu","Smith","Brown","Tremblay","Martin","Roy","Wilson"};
        String[]  phoneArray = new String[] {"514602451","514602452","514602453","514602454","514602455","514602456","514602457","514602458","514602459","514602460"};

        for (int i = 0; i < 10; i++) {
            UserData user = new UserData();

            // Put random values, but id must be unique
            user.id = i+1;
            user.firstName = fnArray[i];
            user.lastName = lnArray[i];
            user.userName = userArray[i];
            user.password = "a" + i;
            user.contact = phoneArray[i];

            users.add(user);

        }
    }

    static UserDataSource getInstance() {
        if (instance == null) {
            instance = new UserDataSource();
        }
        return instance;
    }
}

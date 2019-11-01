package com.example.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleDataSource {
    public static VehicleDataSource instance = null;
    public List<VehicleData> vehicles, searchvehicles, reservationvehicles, rentedvehicles;

    public VehicleDataSource() {

        vehicles = new ArrayList<>();
        searchvehicles = new ArrayList<>();
        reservationvehicles = new ArrayList<>();
        rentedvehicles = new ArrayList<>();

        String[]  typeArray = new String[] {"Corolla","Elantra","Civic","Cx-30","Charger","Cherokee","Sedan","Saloon","RS 3","RDX"};
        String[] brandArray = new String[] {"Toyota","Hyundai","Honda","Mazda","dodge ","Jeep","BMW","Benz","Audi","Acura"};
        String[] modelArray = new String[] {"M1","E1","X6","M2","E2","X8","C1","V1","B3","M2"};
        String[]  yearArray = new String[] {"2019","2018","2018","2017","2017","2016","2016","2016","2016","2018"};
        String[] colorArray = new String[] {"Black","Red","Black","Red","White","Black","Black","Black","Red","Black"};
        String[] stateArray = new String[] {"Rental","Return","Rental","Reservation","Reservation","Return","Reservation","Reservation","Return","Return"};
        String[] sdateArray = new String[] {"10/27/2019","10/26/2019","10/26/2019","10/29/2019","10/29/2019","10/23/2019","10/28/2019","10/29/2019","10/25/2019","10/25/2019"};
        String[] edatdArray = new String[] {"5 Days","10/26/2019","12 Days","10/31/2019","11/5/2019","10/23/2019","11/2/2019","11/15/2019","10/25/2019","10/25/2019"};

        for (int i=0;i<=9;i++ )
        {

            VehicleData vehicle = new VehicleData();

            vehicle.id = i+1;
            vehicle.type = typeArray[i];
            vehicle.brand = brandArray[i];
            vehicle.model = modelArray[i];
            vehicle.year = yearArray[i];
            vehicle.color = colorArray[i];
            vehicle.licenseplate = "ABC 10" + i;
            vehicle.state = stateArray[i];
            vehicle.sdate = sdateArray[i];
            vehicle.edate = edatdArray[i];

            vehicles.add(vehicle);

            VehicleData searchvehicle = new VehicleData();
            VehicleData reservationvehicle = new VehicleData();
            VehicleData rentedvehicle = new VehicleData();

            if (stateArray[i]=="Return") {
                searchvehicle.id = i + 1;
                searchvehicle.type = typeArray[i];
                searchvehicle.brand = brandArray[i];
                searchvehicle.model = modelArray[i];
                searchvehicle.year = yearArray[i];
                searchvehicle.color = colorArray[i];
                searchvehicle.licenseplate = "ABC 10" + i;
                searchvehicle.state = stateArray[i];
                searchvehicle.sdate = sdateArray[i];
                searchvehicle.edate = edatdArray[i];

                searchvehicles.add(searchvehicle);
            }
            else if (stateArray[i]=="Reservation") {
                reservationvehicle.id = i + 1;
                reservationvehicle.type = typeArray[i];
                reservationvehicle.brand = brandArray[i];
                reservationvehicle.model = modelArray[i];
                reservationvehicle.year = yearArray[i];
                reservationvehicle.color = colorArray[i];
                reservationvehicle.licenseplate = "ABC 10" + i;
                reservationvehicle.state = stateArray[i];
                reservationvehicle.sdate = sdateArray[i];
                reservationvehicle.edate = edatdArray[i];

                reservationvehicles.add(reservationvehicle);
            }
            else if (stateArray[i]=="Rental") {
                rentedvehicle.id = i + 1;
                rentedvehicle.type = typeArray[i];
                rentedvehicle.brand = brandArray[i];
                rentedvehicle.model = modelArray[i];
                rentedvehicle.year = yearArray[i];
                rentedvehicle.color = colorArray[i];
                rentedvehicle.licenseplate = "ABC 10" + i;
                rentedvehicle.state = stateArray[i];
                rentedvehicle.sdate = sdateArray[i];
                rentedvehicle.edate = edatdArray[i];

                rentedvehicles.add(rentedvehicle);
            }
        }

    }

    static VehicleDataSource getInstance() {
        if (instance == null) {
            instance = new VehicleDataSource();
        }
        return instance;
    }
}


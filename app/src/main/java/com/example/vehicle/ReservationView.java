package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReservationView extends AppCompatActivity {

    RecyclerView rvRlist;
    Button rscancelbtn, rentalviewbtn;
    TextView titletxt;

    private static final String TAG = "ReservationView";
//    private ReservationAdapter reservationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_view);

        rscancelbtn = findViewById(R.id.rscancelbtn);
        rentalviewbtn = findViewById(R.id.rentalviewbtn);

        titletxt = findViewById(R.id.titletxt);

        rvRlist = findViewById(R.id.rvRlist);
        rvRlist.setLayoutManager(new LinearLayoutManager(this));
        ReservationAdapter reservationAdapter = new ReservationAdapter(getApplicationContext());
        rvRlist.setAdapter(reservationAdapter);

        rscancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ("Rental Vehicles List".equals(titletxt.getText())) {
                    Toast.makeText(getApplicationContext(), " You have return a rented car successfully.", Toast.LENGTH_SHORT).show();

                }
                else if ("Reservation Vehicles List".equals(titletxt.getText())) {
                     Toast.makeText(getApplicationContext(), " You have canceled a car reservation successfully.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rentalviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if ("Rental Vehicles List".equals(titletxt.getText())) {
                    titletxt.setText("Reservation Vehicles List");
                    rscancelbtn.setText("Return Vehicle");
                    rentalviewbtn.setText("Rented Vehicles View");
                    ReservationAdapter reservationAdapter = new ReservationAdapter(getApplicationContext());
                    rvRlist.setAdapter(reservationAdapter);}
                else if ("Reservation Vehicles List".equals(titletxt.getText())) {
                    titletxt.setText("Rental Vehicles List");
                    rscancelbtn.setText("Reservation Cancel");
                    rentalviewbtn.setText("Reservation Vehicles View");
                    RentalviewAdapter rentalviewAdapter = new RentalviewAdapter(getApplicationContext());
                    rvRlist.setAdapter(rentalviewAdapter);
//                    Toast.makeText(getApplicationContext(), " You have canceled a car reservation successfully.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

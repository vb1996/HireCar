package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class vehicledetail extends AppCompatActivity {

    TextView textView;
    RecyclerView rvVdl;
    Button button, reservebtn, rsviewbtn;
    private static final String TAG = "vehicledetail";

    private TextView startDate, endDate,startreserve, endreserve;
    private DatePickerDialog.OnDateSetListener startset, endset, srset, erset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehicledetail);

        button = findViewById(R.id.rentbtn);
        reservebtn = findViewById(R.id.reservebtn);
        rsviewbtn = findViewById(R.id.rsviewbtn);

        rvVdl = findViewById(R.id.rvVdl);
        rvVdl.setLayoutManager(new LinearLayoutManager(this));

        VehicleDetailAdapter vehicleDetailAdapter = new VehicleDetailAdapter(getApplicationContext());
        rvVdl.setAdapter(vehicleDetailAdapter);

        //datepicker part
        startDate = findViewById(R.id.startdate);
        endDate = findViewById(R.id.enddate);
        startreserve = findViewById(R.id.startreserve);
        endreserve = findViewById(R.id.endreserve);

        startDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        vehicledetail.this,
                        android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        startset,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        endDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        vehicledetail.this,
                        android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        endset,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        startreserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        vehicledetail.this,
                        android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        srset,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        endreserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        vehicledetail.this,
                        android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        erset,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        startset = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = month + "/" + day + "/" + year;

                startDate.setText(date);

            }
        };
        endset = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = month + "/" + day + "/" + year;

                endDate.setText(date);
            }
        };
        srset = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = month + "/" + day + "/" + year;

                startreserve.setText(date);

            }
        };
        erset = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = month + "/" + day + "/" + year;

                endreserve.setText(date);
            }
        };
        //
        //    Button Click Listeners: Rent, Reservation, Return, Cancel.
        //
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ad = startDate.getText().toString();
                String ed = endDate.getText().toString();

                if (("Start Date".equals(ad))||("End Date".equals(ed))){
                    Toast.makeText(getApplicationContext(), " Select two dates.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), " You have rented a car successfully.", Toast.LENGTH_SHORT).show();
                }

            }
        });
        reservebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), " You have reserved a car successfully.", Toast.LENGTH_SHORT).show();
            }
        });

        rsviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(vehicledetail.this, ReservationView.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.vehicle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class allvehicledetail extends AppCompatActivity {

    RecyclerView rvvdetail;
    Button vchangebtn, vdeletebtn;
    private static final String TAG = "allvehicledetail";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allvehicledetail);
        vchangebtn = findViewById(R.id.vchangebtn);
        vdeletebtn = findViewById(R.id.vdeletebtn);

        rvvdetail = findViewById(R.id.rvvdetail);
        rvvdetail.setLayoutManager(new LinearLayoutManager(this));
        AllVehicleAdapter allVehicleAdapter = new AllVehicleAdapter(getApplicationContext());
        rvvdetail.setAdapter(allVehicleAdapter);

        vchangebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Vehicle Infomation has changed", Toast.LENGTH_SHORT).show();
            }
        });
        vdeletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "A selected vehicle has deleted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

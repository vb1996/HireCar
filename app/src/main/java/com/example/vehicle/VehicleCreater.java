package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class VehicleCreater extends AppCompatActivity {

    Button vcreatebtn, vcancelbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createvehicle);

        vcreatebtn = findViewById(R.id.vcreatebtn);
        vcancelbtn = findViewById(R.id.vcancelbtn);
        vcreatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"New User is created successfully!", Toast.LENGTH_SHORT).show();

            }
        });
        vcancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserCreater extends AppCompatActivity {

    Button ccreatebtn, ccancelbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_creater);

        ccreatebtn = findViewById(R.id.ccreatebtn);
        ccancelbtn = findViewById(R.id.ccancelbtn);
        ccreatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"New User is created successfully!", Toast.LENGTH_SHORT).show();

            }
        });
        ccancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

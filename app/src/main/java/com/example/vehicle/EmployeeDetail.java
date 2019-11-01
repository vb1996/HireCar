package com.example.vehicle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EmployeeDetail extends AppCompatActivity {
    RecyclerView rvEmpdetail;
    Button deletebtn, changebtn;
    private static final String TAG = "EmployeeDetail";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empdetail);

//        createbtn = findViewById(R.id.createbtn);
        deletebtn = findViewById(R.id.deletebtn);
        changebtn = findViewById(R.id.changebtn);

        rvEmpdetail = findViewById(R.id.rvEmpdetail);
        rvEmpdetail.setLayoutManager(new LinearLayoutManager(this));
        EmployeeDetailAdapter employeeDetailAdapter  = new EmployeeDetailAdapter(getApplicationContext());
        rvEmpdetail.setAdapter(employeeDetailAdapter);

        changebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Customer Infomation has changed", Toast.LENGTH_SHORT).show();
            }
        });
        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "A selected customer has changed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

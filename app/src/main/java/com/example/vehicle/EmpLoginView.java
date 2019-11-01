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

public class EmpLoginView extends AppCompatActivity {
    TextView CustomerList, headtxt;
    RecyclerView rvCustomer;
    Button createbtn, vlistviewbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_login_view);

        createbtn = findViewById(R.id.createbtn);
        vlistviewbtn = findViewById(R.id.vlistviewbtn);
        CustomerList = findViewById(R.id.CustomerList);
        headtxt = findViewById(R.id.headtxt);
        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("Customers List".equals(CustomerList.getText())) {
                    Toast.makeText(getApplicationContext(), this.getClass().toString(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(EmpLoginView.this, UserCreater.class);
                    startActivity(intent);
                }
                else if ("Vehicles List".equals(CustomerList.getText())){
                    Toast.makeText(getApplicationContext(), this.getClass().toString(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(EmpLoginView.this, VehicleCreater.class);
                    startActivity(intent);
                }
            }
        });
        vlistviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("Customers List".equals(CustomerList.getText())) {
                    CustomerList.setText("Vehicles List");
                    vlistviewbtn.setText("Customers List View");
                    headtxt.setText("No                Type                     Brand                     Image");
                    UserAdapter userAdapter = new UserAdapter(getApplicationContext());
                    rvCustomer.setAdapter(userAdapter);


                    userAdapter.setOnItemClickListener(new UserAdapter.OnItemClickListener() {
                        @Override
                        public void onItemClick(int position) {

                            Intent intent = new Intent(EmpLoginView.this, allvehicledetail.class);
                            startActivity(intent);
                        }
                    });
//                    Toast.makeText(getApplicationContext(), " You have canceled a car reservation successfully.", Toast.LENGTH_SHORT).show();
                }
                else if ("Vehicles List".equals(CustomerList.getText())) {
                    CustomerList.setText("Customers List");
                    vlistviewbtn.setText("Vehicles List View");
                    headtxt.setText("No           UserName       PassWord            Contact");
                    EmployeeAdapter employeeAdapter = new EmployeeAdapter(getApplicationContext());
                    rvCustomer.setAdapter(employeeAdapter);

                    EmployeeAdapter.setOnItemClickListener(new EmployeeAdapter.OnItemClickListener() {
                        @Override
                        public void onItemClick(int position) {

                            Intent intent = new Intent(EmpLoginView.this, EmployeeDetail.class);
                            startActivity(intent);
                        }
                    });
                }
            }
        });

        rvCustomer= findViewById(R.id.rvcustomer);
        rvCustomer.setLayoutManager(new LinearLayoutManager(this));
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(getApplicationContext());
        UserAdapter userAdapter = new UserAdapter(getApplicationContext());
        rvCustomer.setAdapter(employeeAdapter);
//        rvCustomer.setAdapter(userAdapter);
        EmployeeAdapter.setOnItemClickListener(new EmployeeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                Intent intent = new Intent(EmpLoginView.this, EmployeeDetail.class);
                startActivity(intent);
            }
        });

        userAdapter.setOnItemClickListener(new UserAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                Intent intent = new Intent(EmpLoginView.this, allvehicledetail.class);
                startActivity(intent);
            }
        });

    }
}

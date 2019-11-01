package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import java.util.Calendar;
import android.widget.Toast;


public class UserLoginView extends AppCompatActivity {
    TextView fromdate, todate;
    String  searchkey="";
    RecyclerView rvUser;
    Button searchbtn, allviewbtn;
    DatePickerDialog.OnDateSetListener fromdateset, todateset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login_view);

        searchbtn = findViewById(R.id.searchbtn);
        allviewbtn = findViewById(R.id.allviewbtn);
        //datepicker part
        fromdate = findViewById(R.id.fromdate);
        todate = findViewById(R.id.todate);

        fromdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        UserLoginView.this,
                        android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        fromdateset,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        todate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        UserLoginView.this,
                        android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        todateset,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        fromdateset = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = month + "/" + day + "/" + year;

                fromdate.setText(date);

            }
        };
        todateset = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = month + "/" + day + "/" + year;

                todate.setText(date);
            }
        };

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fromdatet = fromdate.getText().toString();
                String todatet = todate.getText().toString();

                if ("From_Date".equals(fromdatet)||"To Date".equals(todatet)){
                    Toast.makeText(getApplicationContext(), " Select two dates.", Toast.LENGTH_SHORT).show();
                }
                else {
                    searchkey="Return";
                    SearchAdaper searchAdaper = new SearchAdaper(getApplicationContext(), searchkey);
                    rvUser.setAdapter(searchAdaper);
                }

            }
        });
        allviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                UserAdapter userAdapter = new UserAdapter(getApplicationContext());
                rvUser.setAdapter(userAdapter);
            }
        });
        rvUser = findViewById(R.id.rvUser);
        rvUser.setLayoutManager(new LinearLayoutManager(this));

        UserAdapter userAdapter = new UserAdapter(getApplicationContext());
        SearchAdaper searchAdaper = new SearchAdaper(getApplicationContext(), searchkey);
        rvUser.setAdapter(userAdapter);


        userAdapter.setOnItemClickListener(new UserAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {



                Intent intent = new Intent(UserLoginView.this, vehicledetail.class);
                startActivity(intent);
            }
        });
        searchAdaper.setOnItemClickListener(new SearchAdaper.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {


                Intent intent = new Intent(UserLoginView.this, vehicledetail.class);
                startActivity(intent);
            }
        });
    }
}

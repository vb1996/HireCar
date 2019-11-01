package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class User extends AppCompatActivity {
    TextView textView;
    EditText editTextusername,editTextpassword;
    Button button,btn2;
    String goodPassword="1234";
    String goodUsername="Pulkit";
    String username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

         textView=findViewById(R.id.textView);
        editTextusername=findViewById(R.id.usrername);
        editTextpassword=findViewById(R.id.password);

        button=findViewById(R.id.button);
        btn2=findViewById(R.id.btnc2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = editTextusername.getText().toString();
                password = editTextpassword.getText().toString();

                List<UserData> users = UserDataSource.getInstance().users;
                Boolean is_login = Boolean.FALSE;
                for (int i = 0; i < users.size(); i++) {
                    UserData user = users.get(i);
                    if ((user.userName.equals(username)&&user.password.equals(password))||(goodUsername.equals(username)&&goodPassword.equals(password))) {
                        is_login = Boolean.TRUE;
                        break;
                    }
                }
                if (is_login) {
                    Toast.makeText(getApplicationContext(),username + "  login success!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(User.this, UserLoginView.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });
    }
    }


package com.example.kostcoba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity {
//    private Spinner spUser;
    public Button btnLogin;
    public Button btntToDivide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        spUser= (Spinner) findViewById(R.id.sp_user);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btntToDivide = (Button) findViewById(R.id.btn_to_divide);
        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
        btntToDivide.setOnClickListener(v -> {
            Intent intent = new Intent(this, RoleDivideActivity.class);
            startActivity(intent);
        });
    }
}
package com.example.kostcoba2.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.kostcoba2.R;

public class RoleDivideActivity extends AppCompatActivity {
    public Button btnUserRegister;
    public Button btnOwnerRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_divide);

        btnUserRegister = (Button) findViewById(R.id.btn_to_user_register);
        btnOwnerRegister = (Button) findViewById(R.id.btn_to_owner_register);
        btnUserRegister.setOnClickListener(v -> {
            Intent intent = new Intent(this, UserRegisterActivity.class);
            startActivity(intent);
        });
        btnOwnerRegister.setOnClickListener(v -> {
            Intent intent = new Intent(this, OwnerRegisterActivity.class);
            startActivity(intent);
        });
    }
}
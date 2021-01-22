package com.example.kostcoba2.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;

import com.example.kostcoba2.R;

public class UserRegisterActivity extends AppCompatActivity {
    String text = "<font color=#000000>Sudah Punya Akun? </font><font color=#5E83BB>Login Disini</font>";
    public Button btnToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);
        btnToLogin = (Button)findViewById(R.id.btn_to_login);
        btnToLogin.setText(Html.fromHtml(text));
        btnToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(UserRegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}
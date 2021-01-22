package com.example.kostcoba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.kostcoba2.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // langsung pindah ke MainActivity atau activity lain
        // begitu memasuki splash screen ini
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
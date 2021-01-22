package com.example.kostcoba2.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kostcoba2.R;
import com.example.kostcoba2.owner.MainActivityOwner;
import com.example.kostcoba2.user.MainActivityUser;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
//    private Spinner spUser;
    String text = "<font color=#000000>Belum Punya Akun?</font><font color=#5E83BB>Daftar Disini</font>";
    public EditText txtUsername, txtPassword;
    public TextInputLayout loUsername, loPassword;
    public Button btnLogin, btntToDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //spUser= (Spinner) findViewById(R.id.sp_user);
        txtUsername = (EditText)findViewById(R.id.ip_username);
        txtPassword = (EditText)findViewById(R.id.ip_password);
        loUsername = (TextInputLayout)findViewById(R.id.lo_username);
        loPassword = (TextInputLayout)findViewById(R.id.lo_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        txtUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Fires right as the text is being changed (even supplies the range of text)
                loUsername.setError(null);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // Fires right before text is changing
                loUsername.setError(null);
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                loUsername.setError(null);
            }
        });
        txtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Fires right as the text is being changed (even supplies the range of text)
                loPassword.setError(null);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // Fires right before text is changing
                loPassword.setError(null);
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Fires right after the text has changed
                loPassword.setError(null);
            }
        });

        btnLogin.setOnClickListener(v -> {
            String usernameKey = txtUsername.getText().toString();
            String passwordKey = txtPassword.getText().toString();
            if(usernameKey.isEmpty()){
                loUsername.setError("Username Masih kosong");
            }else if(passwordKey.isEmpty()){
                loPassword.setError("Password Masih Kosong");
            }else if (usernameKey.equals("admin") && passwordKey.equals("admin123")){
                //jika login admin berhasil
                Toast.makeText(getApplicationContext(), "Selamat Datang Admin", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, MainActivityOwner.class);
                LoginActivity.this.startActivity(intent);
                finish();
            }else if (usernameKey.equals("user") && passwordKey.equals("user123")){
                //jika login user berhasil
                Toast.makeText(LoginActivity.this, "Selamat Datang User", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivityUser.class);
                LoginActivity.this.startActivity(intent);
                finish();
            }else {
                //jika login gagal
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Username atau Password Anda Salah!")
                        .setNegativeButton("Retry", null).create().show();
            }

        });
        btntToDivide = (Button) findViewById(R.id.btn_to_divide);
        btntToDivide.setText(Html.fromHtml(text));
        btntToDivide.setOnClickListener(v -> {
            Intent intent = new Intent(this, RoleDivideActivity.class);
            startActivity(intent);
        });
    }
}
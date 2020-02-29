package com.example.learnapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView tvUsername,tvEmail,tvPassword;
    String username, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvUsername = findViewById(R.id.tvUsername);
        tvEmail = findViewById(R.id.tvEmail);
        tvPassword= findViewById(R.id.tvPassword);

        username = getIntent().getExtras().getString("username");
        email = getIntent().getExtras().getString("email");
        password = getIntent().getExtras().getString("password");

        tvUsername.setText(username);
        tvEmail.setText(email);
        tvPassword.setText(password);


    }
}

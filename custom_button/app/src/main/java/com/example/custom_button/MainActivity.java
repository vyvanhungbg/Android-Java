package com.example.custom_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView oldPassword,newPassword,cofirmnewPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oldPassword = findViewById(R.id.oldPassword);
        oldPassword.setOnClickListener(new);
    }
}
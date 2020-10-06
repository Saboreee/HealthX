package com.example.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_screen);

        Intent intent = getIntent();
    }
    public void addfiilis(View view) {
        Intent intent = new Intent(this, fiilis.class);
        startActivity(intent);
    }
    public void addTreeni(View view) {
        Intent intent = new Intent(this, treeni.class);
        startActivity(intent);
    }
}
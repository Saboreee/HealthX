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
    }
    /* Fiilis napin onclick */
    public void addfiilis(View view) {
        Intent intent = new Intent(this, fiilis.class);
        startActivity(intent);
    }
    /* Treeni napin onclick */
    public void addTreeni(View view) {
        Intent intent = new Intent(this, treeni.class);
        startActivity(intent);
    }
    /* Nukkumis napin onclick */
    public void addNukkuminen(View view) {
        Intent intent = new Intent(this, nukkuminen.class);
        startActivity(intent);
    }
    public void bmilaskin(View view) {
        Intent intent = new Intent(this, bmilaskin.class);
        startActivity(intent);
    }
}
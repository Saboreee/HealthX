package com.example.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Locates the right TextView by id */
        TextView text1 = findViewById(R.id.M1);
        TextView text2 = findViewById(R.id.M2);
        TextView text3 = findViewById(R.id.M3);
        TextView text4 = findViewById(R.id.M4);

        /* GetIntent to get Strings from form to MainActivity */
        Intent intent2 = getIntent();

        /* Loads sharedpreference data and updates values */
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("data", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("nimi", "");
        String ika = sharedPreferences.getString("ika", "");
        String pituus = sharedPreferences.getString("pituus", "");
        String paino = sharedPreferences.getString("paino", "");

        text1.setText(name);
        text2.setText(ika);
        text3.setText(pituus);
        text4.setText(paino);


    }

    protected void onPause() {
        super.onPause();
    }
        /* OnClick function to get into add page */
        public void add(View view) {
        Intent intent = new Intent(this, AddScreen.class);
        startActivity(intent);
    }
        /* OnClick function to get into editprofile page */
        public void editProfile(View view) {
        Intent intent1 = new Intent(this, Kayttajatiedot1.class);
        startActivity(intent1);
    }
}
package com.example.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class Kayttajatiedot1 extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    EditText name, ika, pituus, paino;
    String sname, sika, spituus, spaino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayttajatiedot1);

        Intent intent1 = getIntent();
    }

    public void Save(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);

        name = findViewById(R.id.editNimi);
        ika = findViewById(R.id.editIka);
        pituus = findViewById(R.id.editPituus);
        paino = findViewById(R.id.editPaino);

        sname = name.getText().toString();
        sika = ika.getText().toString();
        spituus = pituus.getText().toString();
        spaino = paino.getText().toString();

        /*
        intent2.putExtra(EXTRA_MESSAGE1, message1);
        intent2.putExtra(EXTRA_MESSAGE2, message2);
        intent2.putExtra(EXTRA_MESSAGE3, message3);
        intent2.putExtra(EXTRA_MESSAGE4, message4);
         */

        SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("nimi", sname);
        editor.putString("ika", sika);
        editor.putString("pituus", spituus);
        editor.putString("paino", spaino);
        editor.commit();

        startActivity(intent2);
    }
}
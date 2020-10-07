package com.example.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class Kayttajatiedot1 extends AppCompatActivity {

    EditText name, ika, pituus, paino;
    String sname, sika, spituus, spaino;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayttajatiedot1);
    }

    public void Save(View view) {
        /* Locates EditTexts by id */
        name = findViewById(R.id.editNimi);
        ika = findViewById(R.id.editIka);
        pituus = findViewById(R.id.editPituus);
        paino = findViewById(R.id.editPaino);
        error = findViewById(R.id.Error1);

        /* Puts EditText values to Strings */
        sname = name.getText().toString();
        sika = ika.getText().toString();
        spituus = pituus.getText().toString();
        spaino = paino.getText().toString();

        if (TextUtils.isEmpty(sname) || TextUtils.isEmpty(sika) || TextUtils.isEmpty(spituus) || TextUtils.isEmpty(spaino)){
            error.setText("Täytä tyhjät kentät");
        } else {

            /* Sharedpreference to save the data to named "data" and then load it up on MainActivity */
            SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("nimi", sname);
            editor.putString("ika", sika);
            editor.putString("pituus", spituus+ " cm");
            editor.putString("paino", spaino + " kg");
            editor.commit();

            /* When form filled and saved, opens MainActivity */
            Intent intent2 = new Intent(this, MainActivity.class);
            startActivity(intent2);
        }
    }
}
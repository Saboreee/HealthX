package com.example.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bmilaskin extends AppCompatActivity {
    EditText et,et1;
    Button bt;
    TextView error5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmilaskin);
        bt = (Button) findViewById(R.id.laske);
        et = (EditText) findViewById(R.id.epituus);
        et1 = (EditText) findViewById(R.id.epaino);
        error5 = (TextView) findViewById(R.id.error5);
    }

    /* Oisi voinut käyttää hyödyksi sharedpreferenssistä saatuja painoa ja pituutta, mutta jos käyttäjä ei semmoisia halua asettaa niin tein sen että asettaa raakana painonsa yms */
    public void Laske(View view) {
        if(et.getText().length() == 0 || et1.getText().length() == 0){
            error5.setText("Täytä tyhjät kohdat");
        } else {
            double a = Double.parseDouble(et.getText().toString());
            double b = Double.parseDouble(et1.getText().toString());
            double c = b/(a*a)*10000;
            error5.setText("BMI: "+ String.format("%.2f",c));
        }
    }
}
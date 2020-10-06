package com.example.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class fiilis extends AppCompatActivity {
    EditText et;
    Button bt;
    TextView error2;
    private ArrayList<Tiedot> Atiedot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiilis);

        Atiedot = Tiedot.getInstance().getAtiedot();
        bt = (Button) findViewById(R.id.Tallenna1);
        et = (EditText) findViewById(R.id.editFiilis);
        error2 = (TextView) findViewById(R.id.Error2);
    }

    public void Tallenna(View view) {
        int a = Integer.parseInt(et.getText().toString());
        if (a < 1 || a > 10) {
            error2.setText("Täytä fiilis asteikolla 1-10");
        } else {
            Tiedot fiilis3 = new Tiedot("Fiilis", a);
            Atiedot.add(fiilis3);

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
package com.example.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class nukkuminen extends AppCompatActivity {
    EditText et;
    Button bt;
    TextView error4;
    private ArrayList<Tiedot> Atiedot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukkuminen);

        Atiedot = Tiedot.getInstance().getAtiedot();
        bt = (Button) findViewById(R.id.Tallenna3);
        et = (EditText) findViewById(R.id.editNukkuminen);
        error4 = (TextView) findViewById(R.id.Error4);
    }
    public void Tallenna(View view) {
        if(et.getText().length() == 0){
            error4.setText("Täytä tyhjät kentät");
        } else {
            int a = Integer.parseInt(et.getText().toString());
            Tiedot fiilis3 = new Tiedot("Nukuttu", a, "tuntia");
            Atiedot.add(fiilis3);

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
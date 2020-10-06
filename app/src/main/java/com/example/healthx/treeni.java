package com.example.healthx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class treeni extends AppCompatActivity {
    EditText et1, et2;
    Button bt;
    TextView error3;
    private ArrayList<Tiedot> Atiedot;
    String tnimi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treeni);

        Atiedot = Tiedot.getInstance().getAtiedot();
        bt = (Button) findViewById(R.id.Tallenna1);
        et1 = (EditText) findViewById(R.id.editReps);
        et2 = (EditText) findViewById(R.id.editTnimi);
        error3 = (TextView) findViewById(R.id.Error3);
    }

    public void Tallenna2(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        tnimi = et2.getText().toString();
        if (TextUtils.isEmpty(tnimi) || TextUtils.isEmpty(et1.getText().toString())){
            error3.setText("Täytä tyhjät kentät");
        } else {
            Tiedot fiilis4 = new Tiedot(tnimi, a);
            Atiedot.add(fiilis4);

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
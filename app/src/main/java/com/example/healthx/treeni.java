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

    /* Jos EditText kohdat on tyhjiä laittaa error tekstin, muuten tallentaa ja aloittaa intentin */
    public void Tallenna2(View view) {
        if(et1.getText().length() == 0 || et2.getText().length() == 0){
            error3.setText("Täytä tyhjät kentät");
        } else {
            int a = Integer.parseInt(et1.getText().toString());
            tnimi = et2.getText().toString();
                Tiedot fiilis4 = new Tiedot(tnimi, a, "toistot");
                Atiedot.add(fiilis4);

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
    }
}
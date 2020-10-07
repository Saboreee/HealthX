package com.example.healthx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TiedotListAdapter extends ArrayAdapter<Tiedot> {

    private static final String TAG = "TiedotListAdapter";

    private Context mContext;
    int mResource;

    public TiedotListAdapter(Context context, int resource, ArrayList<Tiedot> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        /* Saadaan Tiedot objektin metodista */
        String nimi = getItem(position).getNimireps();
        int reps = getItem(position).getReps();
        String info = getItem(position).getInfo();

        /* Luodaan tiedot objekti */
        Tiedot tiedot = new Tiedot(nimi,reps,info);

        /* Ei paras koodaus patterni, että convertataan näkymä toiseen, esim jos tulisikin paljon tavaraa niin se voi olla hidas yms. */
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        /* Laittaa arvot tekstikenttiin */
        TextView tvnimi = (TextView) convertView.findViewById(R.id.txt1);
        TextView tvreps = (TextView) convertView.findViewById(R.id.txt2);
        TextView tvinfo = (TextView) convertView.findViewById(R.id.txt3);
        tvnimi.setText(nimi);
        tvreps.setText(Integer.toString(reps));
        tvinfo.setText(info);

        /* Palautetaan muunnettu näkymä. */
        return convertView;
    }
}

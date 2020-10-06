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

        /* Get the Tiedot information */
        String nimi = getItem(position).getNimireps();
        int reps = getItem(position).getReps();

        /* Create the Tiedot object with the information */
        Tiedot tiedot = new Tiedot(nimi,reps);

        /* Not the best pattern to do adapter but in small content its fine. */
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        /* Puts the values into TextView */
        TextView tvnimi = (TextView) convertView.findViewById(R.id.txt1);
        TextView tvreps = (TextView) convertView.findViewById(R.id.txt2);
        tvnimi.setText(nimi);
        tvreps.setText(Integer.toString(reps));

        /* Then returns the view that the user can see it */
        return convertView;
    }
}

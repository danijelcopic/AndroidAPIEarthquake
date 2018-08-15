package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class CustomAdapter extends ArrayAdapter<EarthquakeModel> {

    public CustomAdapter(Context context, ArrayList<EarthquakeModel> earthquakes) {
        super(context,0, earthquakes);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        EarthquakeModel earthquakeModel = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView tv_magnitude = (TextView) convertView.findViewById(R.id.tv_magnitude);
        TextView tv_place = (TextView) convertView.findViewById(R.id.tv_place);
        TextView tv_date = (TextView) convertView.findViewById(R.id.tv_date);


        String tv_magnitude_String = Double.toString(earthquakeModel.getMagnitude());
        tv_magnitude.setText(tv_magnitude_String);

        tv_place.setText(earthquakeModel.getPlace());

        tv_date.setText(earthquakeModel.getDate());

        return convertView;
    }

}

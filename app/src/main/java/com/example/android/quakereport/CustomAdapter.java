package com.example.android.quakereport;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;;
import android.widget.TextView;

import java.text.DecimalFormat;
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
        TextView tv_place_offset = (TextView) convertView.findViewById(R.id.tv_place_offset);
        TextView tv_date = (TextView) convertView.findViewById(R.id.tv_date);
        TextView tv_time = (TextView) convertView.findViewById(R.id.tv_time);



        // get magnitude
        String tv_magnitude_String = formatMagnitude(earthquakeModel.getMagnitude());
        tv_magnitude.setText(tv_magnitude_String);

        // set color to magnitude circle
        GradientDrawable magnitudeCircle = (GradientDrawable) tv_magnitude.getBackground();

        int magnitudeColor = getMagnitudeColor(earthquakeModel.getMagnitude());
        magnitudeCircle.setColor(magnitudeColor);


        //example: ... “74km NW of Rumoi, Japan” ... “Pacific-Antarctic Ridge”


        // get place and place offset
        String placeStringObject = earthquakeModel.getPlace();

        if(placeStringObject.contains("of")) {
            String separateString[] = placeStringObject.split("of");
            tv_place_offset.setText(separateString[0] + "of");
            tv_place.setText(separateString[1].replaceFirst(" ", ""));
        } else {
            tv_place_offset.setText("Near the");
            tv_place.setText(earthquakeModel.getPlace());
        }




        // get date and time
        Date date = new Date(earthquakeModel.getDateMillisecond());

        String dateString = formatDate(date);
        tv_date.setText(dateString);

        String timeString = formatTime(date);
        tv_time.setText(timeString);

        return convertView;
    }


    // date format
    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        return sdf.format(date);
    }


    // time format
    private String formatTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        return sdf.format(date);
    }


    // magnitude format
    private String formatMagnitude(double magnitude) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        return decimalFormat.format(magnitude);
    }


    // set color for magnitude circle
    private int getMagnitudeColor(double magnitude) {



        int magnitudeColor;
        int magInt = (int) Math.floor(magnitude);

        switch(magInt) {
            case 0:
            case 1:
                magnitudeColor = R.color.magnitude1;
                break;
            case 2:
                magnitudeColor = R.color.magnitude2;
                break;
            case 3:
                magnitudeColor = R.color.magnitude3;
                break;
            case 4:
                magnitudeColor = R.color.magnitude4;
                break;
            case 5:
                magnitudeColor = R.color.magnitude5;
                break;
            case 6:
                magnitudeColor = R.color.magnitude6;
                break;
            case 7:
                magnitudeColor = R.color.magnitude7;
                break;
            case 8:
                magnitudeColor = R.color.magnitude8;
                break;
            case 9:
                magnitudeColor = R.color.magnitude9;
                break;
            default:
                magnitudeColor = R.color.magnitude10plus;
                break;

        }

        return ContextCompat.getColor(getContext(), magnitudeColor);

    }

}

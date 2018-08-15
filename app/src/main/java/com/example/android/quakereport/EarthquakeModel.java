package com.example.android.quakereport;

import java.util.Date;


/**
 * {@link EarthquakeModel} represents a some data for earthquake description.
 * Each earthquake object has 3 properties: magnitude, place and date.
 */
public class EarthquakeModel {

    private Double mMagnitude;
    private String mPlace;
    private String mDate;

    public EarthquakeModel() {
    }

    public EarthquakeModel(Double magnitude, String place, String date){
        this.mMagnitude = magnitude;
        this.mPlace = place;
        this.mDate = date;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(Double magnitude) {
        this.mMagnitude = magnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        this.mPlace = place;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        this.mDate = date;
    }
}

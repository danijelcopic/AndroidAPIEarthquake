package com.example.android.quakereport;

import java.util.Date;


/**
 * {@link EarthquakeModel} represents a some data for earthquake description.
 * Each earthquake object has 3 properties: magnitude, place and date.
 */
public class EarthquakeModel {

    private Double mMagnitude;
    private String mPlace;
    private Long mDateMillisecond;

    public EarthquakeModel() {
    }

    public EarthquakeModel(Double magnitude, String place, Long dateMillisecond){
        this.mMagnitude = magnitude;
        this.mPlace = place;
        this.mDateMillisecond = dateMillisecond;
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

    public Long getDateMillisecond() {
        return mDateMillisecond;
    }

    public void setDateMillisecond(Long date) {
        this.mDateMillisecond = date;
    }
}

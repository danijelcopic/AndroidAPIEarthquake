package com.example.android.quakereport;


/**
 * {@link EarthquakeModel} represents a some data for earthquake description.
 * Each earthquake object has 3 properties: magnitude, place and date + URL
 * mUrl  - 'url' part from JSON ... detailed earthquake description
 */
public class EarthquakeModel {

    private Double mMagnitude;
    private String mPlace;
    private Long mDateMillisecond;
    private String mUrl;

    public EarthquakeModel() {
    }

    public EarthquakeModel(Double magnitude, String place, Long dateMillisecond, String mUrl){
        this.mMagnitude = magnitude;
        this.mPlace = place;
        this.mDateMillisecond = dateMillisecond;
        this.mUrl = mUrl;
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

    public String getmUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }
}

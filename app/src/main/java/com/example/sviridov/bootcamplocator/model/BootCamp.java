package com.example.sviridov.bootcamplocator.model;

/**
 * Created by Artem on 10.03.2017.
 */

public class BootCamp {

    private float longtitude;
    private float latitude;
    private String locationTitle;
    private String locationAddress;
    private String locationUrl;

    public BootCamp(float longtitude, float latitude, String locationTitle, String locationAddress, String locationUrl) {
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.locationTitle = locationTitle;
        this.locationAddress = locationAddress;
        this.locationUrl = locationUrl;
    }

    public float getLongtitude() {
        return longtitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getLocationUrl() {
        return locationUrl;
    }
}

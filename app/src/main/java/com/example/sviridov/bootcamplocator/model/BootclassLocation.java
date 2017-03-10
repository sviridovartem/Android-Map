package com.example.sviridov.bootcamplocator.model;

/**
 * Created by Artem on 25.02.2017.
 */

public class BootclassLocation {
    private float longtitude;
    private float latitude;
    private String locationTitle;
    private String lockationAddress;
    private String imageURL;

    public BootclassLocation(float longtitude, float latitude, String locationTitle, String lockationAddress, String imageURL) {
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.locationTitle = locationTitle;
        this.lockationAddress = lockationAddress;
        this.imageURL = imageURL;
    }
}

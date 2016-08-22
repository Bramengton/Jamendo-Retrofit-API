package com.tonyostudio.jammily.Model;

import io.realm.annotations.PrimaryKey;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class Location {

    @PrimaryKey
    private String id;
    private String longitude;
    private String latitude;
    private String country;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

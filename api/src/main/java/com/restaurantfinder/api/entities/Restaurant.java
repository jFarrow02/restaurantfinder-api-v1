package com.restaurantfinder.api.entities;

public class Restaurant {

    private Long id;
    private String restaurantId;
    private String name;
    private String buildingNumber;
    private String street;
    private String borough;
    private String zip;
    private String latitude;
    private String longitude;

    public Restaurant(String restaurantId, String name, String buildingNumber, String street, String borough, String zip, String latitude, String longitude){
        this.restaurantId = restaurantId;
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.borough = borough;
        this.zip = zip;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getBorough() {
        return borough;
    }

    public String getZip() {
        return zip;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}

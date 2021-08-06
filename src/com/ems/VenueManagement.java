package com.ems;

public class VenueManagement {
    private int venueID;
    private String venueName;
    private String venuePlace;
    private double venueCost;
    private String venueContNo;
    private String venueImage;

    public VenueManagement() {
    }

    public VenueManagement(int venueID, String venueName) {
        this.venueID = venueID;
        this.venueName = venueName;
    }
    

    public VenueManagement(int venueID, String venueName, String venuePlace, double venueCost, String venueContNo, String venueImage) {
        this.venueID = venueID;
        this.venueName = venueName;
        this.venuePlace = venuePlace;
        this.venueCost = venueCost;
        this.venueContNo = venueContNo;
        this.venueImage = venueImage;
    }

    public VenueManagement(String venueName, String venuePlace, double venueCost, String venueContNo, String venueImage) {
        this.venueName = venueName;
        this.venuePlace = venuePlace;
        this.venueCost = venueCost;
        this.venueContNo = venueContNo;
        this.venueImage = venueImage;
    }

    public int getVenueID() {
        return venueID;
    }

    public void setVenueID(int venueID) {
        this.venueID = venueID;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenuePlace() {
        return venuePlace;
    }

    public void setVenuePlace(String venuePlace) {
        this.venuePlace = venuePlace;
    }

    public double getVenueCost() {
        return venueCost;
    }

    public void setVenueCost(double venueCost) {
        this.venueCost = venueCost;
    }

    public String getVenueContNo() {
        return venueContNo;
    }

    public void setVenueContNo(String venueContNo) {
        this.venueContNo = venueContNo;
    }

    public String getVenueImage() {
        return venueImage;
    }

    public void setVenueImage(String venueImage) {
        this.venueImage = venueImage;
    }

    @Override
    public String toString() {
        //return "VenueManagement{" + "venueID=" + venueID + ", venueName=" + venueName + ", venuePlace=" + venuePlace + ", venueCost=" + venueCost + ", venueContNo=" + venueContNo + ", venueImage=" + venueImage + '}';
        return this.venueName;
    }
    
    
    
}

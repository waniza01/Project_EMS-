
package com.ems;

import java.util.*;

public class Event {
    private String bookingID;
    private int user_ID;
    private String eventType;
    private int venue;
    private String venueName;
    private String venueType;
    private Date eventDate;
    private String startTime;
    private String endTime;
    private int noOfGuest;
    private ArrayList<FoodManagement> foodItems;
    private ArrayList<EquipmentManagement> equipments;
    private String venueImage;
    private double venueCost;
    private double foodCost;
    private double equipmentCost;
    private double totalCost;
    private Date eventStartDate;
    private Date eventEndDate;

    public Event() {
    }
    
    
    public Event(String bookingID, int venue, String venueType, Date eventDate, ArrayList<FoodManagement> foodItems, ArrayList<EquipmentManagement> equipments, int noOfGuest, String venueImage, double venueCost, double foodCost, double equipmentCost, double totalCost) {
        this.bookingID = bookingID;
        this.venue = venue;
        this.venueType = venueType;
        this.eventDate = eventDate;
        this.foodItems = foodItems;
        this.equipments = equipments;
        this.noOfGuest = noOfGuest;
        this.venueImage = venueImage;
        this.venueCost = venueCost;
        this.foodCost = foodCost;
        this.equipmentCost = equipmentCost;
        this.totalCost = totalCost;
    }

    public Event(String bookingID, int user_ID, String eventType, int venue, String venueType,  Date eventStartDate, Date eventEndDate,int noOfGuest) {
        this.bookingID = bookingID;
        this.user_ID = user_ID;
        this.eventType = eventType;
        this.venue = venue;
        this.venueType = venueType;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.noOfGuest = noOfGuest;
    }

    

    public Event( String bookingID, String eventType, int venue, String venueType, Date eventDate, String startTime, String endTime, int noOfGuest) {
        this.bookingID = bookingID;
        this.eventType = eventType;
        this.venue = venue;
        this.venueType = venueType;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.noOfGuest = noOfGuest;
    }

    public Event(String bookingID, int user_ID, String eventType, String venueName, String venueType, Date eventStartDate, Date eventEndDate , int noOfGuest) {
        this.bookingID = bookingID;
        this.user_ID = user_ID;
        this.eventType = eventType;
        this.venueName = venueName;
        this.venueType = venueType;
        this.noOfGuest = noOfGuest;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
    }

    public Event(String bookingID, String eventType, String venueName, String venueType, int noOfGuest, String venueImage, double venueCost, Date eventStartDate, Date eventEndDate) {
        this.bookingID = bookingID;
        this.eventType = eventType;
        this.venueName = venueName;
        this.venueType = venueType;
        this.noOfGuest = noOfGuest;
        this.venueImage = venueImage;
        this.venueCost = venueCost;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
    }

    public Event(ArrayList<FoodManagement> foodItems, double foodCost) {
        this.foodItems = foodItems;
        this.foodCost = foodCost;
    }

    public Event(String bookingID, ArrayList<EquipmentManagement> equipments, double equipmentCost) {
        this.bookingID = bookingID;
        this.equipments = equipments;
        this.equipmentCost = equipmentCost;
    }

    
    
    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }
    
    
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getVenue() {
        return venue;
    }

    public void setVenue(int venue) {
        this.venue = venue;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<FoodManagement> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodManagement> foodItems) {
        this.foodItems = foodItems;
    }

    public ArrayList<EquipmentManagement> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<EquipmentManagement> equipments) {
        this.equipments = equipments;
    }

    public int getNoOfGuest() {
        return noOfGuest;
    }

    public void setNoOfGuest(int noOfGuest) {
        this.noOfGuest = noOfGuest;
    }

    public String getVenueImage() {
        return venueImage;
    }

    public void setVenueImage(String venueImage) {
        this.venueImage = venueImage;
    }
    
    public double getVenueCost() {
        return venueCost;
    }

    public void setVenueCost(double venueCost) {
        this.venueCost = venueCost;
    }

    public double getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(double foodCost) {
        this.foodCost = foodCost;
    }

    public double getEquipmentCost() {
        return equipmentCost;
    }

    public void setEquipmentCost(double equipmentCost) {
        this.equipmentCost = equipmentCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(Date eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public Date getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(Date eventEndDate) {
        this.eventEndDate = eventEndDate;
    }
}

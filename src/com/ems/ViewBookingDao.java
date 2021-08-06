/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems;

import com.ems.utils.SQL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dell
 */
public class ViewBookingDao {
    public static List<Event> getAll(){
        ArrayList<Event> list = new ArrayList<>();
        String qu = "select a.ID, a.User_ID, a.Event_Type, a.Venue_ID,b.Venue_Name, a.Venue_Type, a.Event_Start_Date, a.Event_End_Date, a.No_Of_Guest " +
                " from Book_Event a, Venue_Management b "+
                " where b.Venue_ID = a.Venue_ID " ;
        try {
            ResultSet rs = SQL.execute(qu);
            while(rs.next()){
                String bookingID = rs.getString("ID");
                int user_ID = rs.getInt("User_ID");
                String eventType = rs.getString("Event_Type");
                int venue = rs.getInt("Venue_ID");
                String venueType = rs.getString("Venue_Type");
                Date eventStartDate = rs.getDate("Event_Start_Date");
                Date eventEndDate = rs.getDate("Event_End_Date");
                int noOfGuest = rs.getInt("No_Of_Guest");
                String venueName = rs.getString("Venue_Name");
                Event event = new Event( bookingID,  user_ID, eventType, venueName, venueType, eventStartDate, eventEndDate , noOfGuest);
                list.add(event);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
     public static List<Event> getAll(int user_Id){
        ArrayList<Event> list = new ArrayList<>();
        String qu = "select a.ID, a.User_ID, a.Event_Type, a.Venue_ID,b.Venue_Name, a.Venue_Type, a.Event_Start_Date, a.Event_End_Date, a.No_Of_Guest " +
                " from Book_Event a, Venue_Management b "+
                " where b.Venue_ID = a.Venue_ID " +
                " and a.user_id = " + user_Id;
        try {
            ResultSet rs = SQL.execute(qu);
            while(rs.next()){
                String bookingID = rs.getString("ID");
                int user_ID = rs.getInt("User_ID");
                String eventType = rs.getString("Event_Type");
                int venue = rs.getInt("Venue_ID");
                String venueType = rs.getString("Venue_Type");
                Date eventStartDate = rs.getDate("Event_Start_Date");
                Date eventEndDate = rs.getDate("Event_End_Date");
                int noOfGuest = rs.getInt("No_Of_Guest");
                String venueName = rs.getString("Venue_Name");
                Event event = new Event( bookingID,  user_ID, eventType, venueName, venueType, eventStartDate, eventEndDate , noOfGuest);
                list.add(event);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public static void deleteEvent(String eventID){
        try {
            String qu = " delete from Book_Event where ID ='"+eventID+"'";
            SQL.delete(qu);             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void deleteEventFood(String eventID){
        try {
            String qu = " delete from Event_Book_Food where Event_ID ='"+eventID+"'";
            SQL.delete(qu);             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void deleteEventEquipment(String eventID){
        try {
            String qu = " delete from Event_Book_Equipment where Event_ID ='"+eventID+"'";
            SQL.delete(qu);             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

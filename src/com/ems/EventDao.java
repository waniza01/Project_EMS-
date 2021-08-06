package com.ems;

import com.ems.utils.DateTimeUtil;
import com.ems.utils.SQL;
import java.sql.*;
import java.util.*;

public class EventDao {


    public static void addEventFood(String eventId, int fdID) {
        try {
            String qu = "insert into Event_Book_Food(Event_ID,Food_ID) values'" + eventId + "'," + fdID;
            SQL.executeUpdate(qu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addEventEquipment(String eventId, int eqID) {
        try {
            String qu = "insert into Event_Book_Equipment(Event_ID,Equipment_ID) values'" + eventId + "'," + eqID;
            SQL.executeUpdate(qu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addEvent(Event event) {
        Connection con = null;
        PreparedStatement pst = null;
        con = SQL.get().create();
        try {

            String qu = "insert into Book_Event(ID,User_ID,Event_Type,Venue_ID,Venue_Type,Event_Start_Date,Event_End_Date,No_Of_Guest) values (?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(qu);
            pst.setString(1, event.getBookingID());
            pst.setInt(2, LoginForm.getUserPersonId());
            pst.setString(3, event.getEventType());
            pst.setInt(4, event.getVenue());
            pst.setString(5, event.getVenueType());
            pst.setDate(6, new java.sql.Date(DateTimeUtil.updateTime(event.getEventDate(), event.getStartTime()).getTime()));
            pst.setDate(7, new java.sql.Date(DateTimeUtil.updateTime(event.getEventDate(), event.getEndTime()).getTime()));
            pst.setInt(8, event.getNoOfGuest());
            pst.executeUpdate();
            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isEventExisted(int venueId, java.sql.Date st, java.sql.Date ed) {
        boolean flag = false;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        con = SQL.get().create();
        try {
            String qu = "select * from Book_Event where Venue_ID = ? and( ? between Event_Start_Date and Event_End_Date or ? between Event_Start_Date and Event_End_Date)";
            pst = con.prepareStatement(qu);
            pst.setInt(1, venueId);
            pst.setDate(2, st);
            pst.setDate(3, ed);
            rs = pst.executeQuery();
            if (rs.next()) {
                flag = true;
            } else {
                flag = false;
            }
            con.close();
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return flag;
    }

    public static Event getEventDetails(String eventID) {
        try {
            String qu = "select a.ID, a.User_ID, a.Event_Type, a.Venue_ID,b.Venue_Name,b.Venue_Cost,b.Venue_Image, a.Venue_Type, a.Event_Start_Date, a.Event_End_Date, a.No_Of_Guest "
                    + " from Book_Event a, Venue_Management b "
                    + " where b.Venue_ID = a.Venue_ID "
                    + " and a.ID = '" + eventID + "'";
            ResultSet rs = SQL.execute(qu);
            if (rs.next()) {
                String eventType = rs.getString("Event_Type");
                String venueName = rs.getString("Venue_Name");
                String venueType = rs.getString("Venue_Type");
                java.util.Date eventStartDate = rs.getDate("Event_Start_Date");
                java.util.Date eventEndDate = rs.getDate("Event_End_Date");
                int noOfGuest = rs.getInt("No_Of_Guest");
                String venueImage = rs.getString("Venue_Image");
                double venueCost = rs.getDouble("Venue_Cost");
                rs.close();
                return new Event(eventID, eventType, venueName, venueType, noOfGuest, venueImage, venueCost, eventStartDate, eventEndDate);
            }
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Event getFoodDetails(String eventID) {
        ArrayList<FoodManagement> foodItems = new ArrayList<>();
        try {
            double cost = 0.0;
            //String qu = "select a.Food_Item_ID , a.Food_Item_Name,a.Food_Item_Cost from Food_Management a, Event_Book_Food b where b.Food_ID = a.Food_Item_ID and b.Event_ID = '"+eventID+"'";
            String qu = "select a.Food_ID,b.Food_Item_Name, b.Food_Item_Cost from Event_Book_Food a , Food_Management b where b.Food_Item_ID = a.Food_ID and a.Event_ID = '" + eventID + "'";
            ResultSet rs = SQL.execute(qu);
            while (rs.next()) {
                String foodName = rs.getString("Food_Item_Name");
                double foodCost = rs.getDouble("Food_Item_Cost");
                cost = cost + foodCost;
                foodItems.add(new FoodManagement(foodName, foodCost));
            }
            rs.close();
            System.out.println(cost);
            return new Event(foodItems, cost);
        } catch (Exception e) {
            System.out.println("at food" + e.getMessage());
        }
        return null;
    }

    public static Event getEquipmentDetails(String eventID) {
        ArrayList<EquipmentManagement> equipments = new ArrayList<>();
        try {
            double cost = 0.0;
            String qu = "select a.Equipment_ID,b.Equipment_Name, b.Equipment_Cost from Event_Book_Equipment a , Equipment_Management b where b.Equipment_ID = a.Equipment_ID and a.Event_ID = '" + eventID + "'";
            ResultSet rs = SQL.execute(qu);
            while (rs.next()) {
                String equipmentName = rs.getString("Equipment_Name");
                double equipmentCost = rs.getDouble("Equipment_Cost");
                cost = cost + equipmentCost;
                equipments.add(new EquipmentManagement(equipmentName, equipmentCost));
            }
            rs.close();
            return new Event(eventID, equipments, cost);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

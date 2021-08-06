
package com.ems;

import com.ems.utils.SQL;
import java.sql.ResultSet;
import java.util.ArrayList;


public class VenueManagementDao {
    
    public static boolean ADD(VenueManagement venue){
        boolean flag = false;
        try {
            String venueName = venue.getVenueName();
            String venuePlace = venue.getVenuePlace();
            double venueCost = venue.getVenueCost();
            String venueCont = venue.getVenueContNo();
            String url = venue.getVenueImage();
            String qu = "insert into Venue_Management(Venue_Name,Venue_Place,Venue_Cost,Venue_Contact,Venue_Image) values('"+venueName+"','"+venuePlace+"',"+venueCost+",'"+venueCont+"','"+url+"')";
            SQL.executeUpdate(qu);
            flag = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flag = false;
        }
        return flag;
    }
    
    public static ArrayList<VenueManagement> getAll(){
        ArrayList<VenueManagement> list = new ArrayList<>();
        String qu = "select * from Venue_Management";
        try {
            ResultSet rs = SQL.execute(qu);
            while(rs.next()){
                int id = rs.getInt("Venue_ID");
                String name = rs.getString("Venue_Name");
                String place = rs.getString("Venue_Place");
                double cost = rs.getDouble("Venue_Cost");
                String contact = rs.getString("Venue_Contact");
                String url = rs.getString("Venue_Image");
                VenueManagement item = new VenueManagement(id,name, place, cost,contact,url);
                list.add(item);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public static void deleteRow(int id){
        String qu = "delete from Venue_Management where Venue_ID ="+id;
        try {
            SQL.delete(qu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void update(int id,String name,String place,double cost,String cont,String url){
        String qu = "update Venue_Management set Venue_Name = '"+name+"',Venue_Place = '"+place+"',Venue_Cost = "+cost+",Venue_Contact = '"+cont+"',Venue_Image = '"+url+"' where Venue_ID = "+id;
        try {
            SQL.executeUpdate(qu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


package com.ems;

import com.ems.utils.SQL;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class FoodManagementDao {
    
    public static boolean ADD(FoodManagement foodmanagement){
        boolean flag = false;
        try {
            String name = foodmanagement.getFoodName();
            double cost = foodmanagement.getFoodCost();
            String url = foodmanagement.getFoodImage();
            String qu = "insert into Food_Management(Food_Item_Name,Food_Item_Cost,Food_Item_Image) values('"+name+"',"+cost+",'"+url+"')";
            SQL.executeUpdate(qu);
            flag = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flag = false;
        }
        return flag;
    }
    
    public static ArrayList<FoodManagement> getAll(){
        ArrayList<FoodManagement> list = new ArrayList<>();
        String qu = "select * from Food_Management";
        try {
            ResultSet rs = SQL.execute(qu);
            while(rs.next()){
                int id = rs.getInt("Food_Item_ID");
                String name = rs.getString("Food_Item_Name");
                double cost = rs.getDouble("Food_Item_Cost");
                String url = rs.getString("Food_Item_Image");
                FoodManagement item = new FoodManagement(id,name,cost,url);
                list.add(item);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public static void deleteRow(int id){
        String qu = "delete from Food_Management where Food_Item_ID ="+id;
        try {
            SQL.delete(qu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void update(int id,String name,double cost,String url){
        String qu = "update Food_Management set Food_Item_Name = '"+name+"',Food_Item_Cost = "+cost+",Food_Item_Image = '"+url+"' where Food_Item_ID = "+id;
        try {
            SQL.executeUpdate(qu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

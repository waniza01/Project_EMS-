
package com.ems;

import com.ems.utils.SQL;
import java.sql.ResultSet;
import java.util.ArrayList;


public class EquipmentManagementDao {
    public static boolean ADD(EquipmentManagement equipment){
        boolean flag = false;
        try {
            String name = equipment.getEquipmentName();
            double cost = equipment.getEquipmentCost();
            String url = equipment.getEquipmentImage();
            String qu = "insert into Equipment_Management(Equipment_Name,Equipment_Cost,Equipment_Image) values('"+name+"',"+cost+",'"+url+"')";
            SQL.executeUpdate(qu);
            flag = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flag = false;
        }
        return flag;
    }
    
    public static ArrayList<EquipmentManagement> getAll(){
        ArrayList<EquipmentManagement> list = new ArrayList<>();
        String qu = "select * from Equipment_Management";
        try {
            ResultSet rs = SQL.execute(qu);
            while(rs.next()){
                int id = rs.getInt("Equipment_ID");
                String name = rs.getString("Equipment_Name");
                double cost = rs.getDouble("Equipment_Cost");
                String url = rs.getString("Equipment_Image");
                EquipmentManagement item = new EquipmentManagement(id,name,cost,url);
                list.add(item);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public static void deleteRow(int id){
        String qu = "delete from Equipment_Management where Equipment_ID ="+id;
        try {
            SQL.delete(qu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void update(int id,String name,double cost,String url){
        String qu = "update Equipment_Management set Equipment_Name = '"+name+"',Equipment_Cost = "+cost+",Equipment_Image = '"+url+"' where Equipment_ID = "+id;
        try {
            SQL.executeUpdate(qu);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

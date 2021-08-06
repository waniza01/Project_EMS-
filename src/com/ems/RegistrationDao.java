/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems;

import com.ems.utils.SQL;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class RegistrationDao {
    public static boolean save(Person person,Login login ){
        ResultSet rs = null;
        String name = person.getName();
        String gender = person.getGender();
        String cno = person.getContactNo();
        String add = person.getAddress();
        String email = person.getEmail();
        String utype = person.getUserType();

        try {
            String qu = "insert into Person_Details(Person_Name,Gender,Contact_No,Address,Email,User_Type) values ('"+name+"','"+gender+"','"+cno+"','"+add+"','"+email+"','"+utype+"')";
            SQL.executeUpdate(qu);
            
            // For getting Id:
        
            qu = "select * from Person_Details where Email ='"+email+"'";
            rs = SQL.execute(qu);
            rs.next();
            int id = rs.getInt("ID");
            String userId = login.getUserId();
            String pass = login.getPassword();
            qu = "insert into Login(Person_ID,User_ID,Password) values ("+id+",'"+userId+"','"+pass+"')";
            SQL.executeUpdate(qu);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        return true;
    }

    public static boolean isEmailExited(String email){
        ResultSet rs = null;
        boolean retval = true;
        try{
                                                                                                                                        
            String qu = "select * from Person_Details where Email = '"+email+"'";
            rs = SQL.execute(qu);
            if(!rs.next()){
                retval = false;
            }
        }catch(Exception e){
            retval = false;
        }
        return retval;
    }
    
    public static Person getPerson(String email){
        ResultSet rs = null;
        try{
                                                                                                                                        
            String qu = "select * from Person_Details where Email = '"+email+"'";
            rs = SQL.execute(qu);
            if(rs.next()){
                int id = rs.getInt("ID");
                String name = rs.getString("Person_Name");
                String gender = rs.getString("Gender");
                String contactNo = rs.getString("Contact_No");
                String address = rs.getString("Address");
                email = rs.getString("Email");
                String userType = rs.getString("User_type");
                return new Person(id, name,gender,contactNo,address,email,userType);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}

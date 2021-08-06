/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems;

import com.ems.utils.SQL;
import java.sql.*;

/**
 *
 * @author dell
 */
public class LoginDao {
    
    public static boolean validationLogin(String userId,String pass){
        boolean flag = false;
        ResultSet rs = null;
        try {
            String qu = "select * from Login where User_ID = '"+userId+"'";
            rs = SQL.execute(qu);
            if(rs.next() && pass.equals(rs.getString("Password"))){
                flag = true;
            }else{
                flag = false;
            }
        } catch (Exception e) {
            flag =  false;
        }
        return flag;   
    }
}

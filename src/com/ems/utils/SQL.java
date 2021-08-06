/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dell
 */
public class SQL {

    private static SQL sql = null;

    private SQL() {

    }

    public static SQL get() {
        if (sql == null) {
            sql = new SQL();
        }
        return sql;
    }

    public Connection create() {
        // for giving access database from code
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://eventmanagementsystem.accdb");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void executeUpdate(String query) throws Exception{
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = SQL.get().create();
            conn.setAutoCommit(false);
            pst = conn.prepareStatement(query);
            pst.executeUpdate();
            pst.close();

            conn.commit();
            conn.setAutoCommit(true);
        } catch (Exception e) {
            conn.rollback();
            throw new RuntimeException(e);
        }finally{
            if(pst != null){
                pst.close();
            }
            if(conn != null){
                conn.close();
            }
        }
    }

        public static ResultSet execute(String query) throws Exception{
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conn = SQL.get().create();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            pst.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            if(pst != null){
                pst.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        
        return rs;
    }

        
        public static void delete(String query) throws Exception{
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = SQL.get().create();
            pst = conn.prepareStatement(query);
            pst.executeUpdate();
            pst.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            if(pst != null){
                pst.close();
            }
            if(conn != null){
                conn.close();
            }
        }
    }
}

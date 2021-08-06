/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems;

public class Manager extends Person{

    public Manager() {
    }

    public Manager(String name, String gender, String contactNo, String address,String email, String userType) {
        super(name, gender, contactNo, address, email, userType);
    }

    public Manager(int id, String name, String gender, String contactNo, String address,String email,String userType) {
        super(id, name, gender, contactNo, address, email, userType);
    }
    
}

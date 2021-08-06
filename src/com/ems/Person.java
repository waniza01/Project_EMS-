/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems;

public class Person {
    protected int id;
    protected String name;
    protected String gender;
    protected String contactNo;
    protected String address;
    protected String email;
    protected String userType;

    public Person() {
    }

    public  Person(String name, String gender, String contactNo, String address,String email, String userType) {
        this.name = name;
        this.gender = gender;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
        this.userType = userType;
    }

    
    public Person(int id, String name, String gender, String contactNo,String address,String email, String userType) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", contactNo=" + contactNo + ", email=" + email + ", userType=" + userType + '}';
    }
    
    
}


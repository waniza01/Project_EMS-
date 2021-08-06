

package com.ems;

public class Login {
    private int id;
    private int personId;
    private String userId;
    private String password;

    public Login() {
    }

    public Login(int id, int personId, String userId, String password) {
        this.id = id;
        this.personId = personId;
        this.userId = userId;
        this.password = password;
    }

    public Login(int personId, String userId, String password) {
        this.personId = personId;
        this.userId = userId;
        this.password = password;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" + "id=" + id + ", personId=" + personId + ", userId=" + userId + ", password=" + password + '}';
    }
    
    
}

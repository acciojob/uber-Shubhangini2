package com.driver.model;


import org.springframework.context.annotation.Configuration;


import javax.persistence.*;

@Entity
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int adminId; //Auto Generated
    private String username;
    private String password;



    //SETTERS


    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //GETTERS

    public int getAdminId(){
        return adminId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
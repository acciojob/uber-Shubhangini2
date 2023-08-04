package com.driver.model;

import javax.persistence.*;

@Entity
public class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int Id; //Auto Generated
   private int perKmRate;

    private boolean available;

    @OneToOne
    @JoinColumn
    Driver driver;

    //SETTERS


    public void setId(int id) {
        Id = id;
    }

    public void setPerKmRate(int perKmRate){
        this.perKmRate=perKmRate;
    }

    public void setAvailable(boolean available){
        this.available=available;
    }

    //GETTERS

    public int getId(){
        return Id;
    }

    public int getPerKmRate(){
        return perKmRate;
    }

    public boolean getAvailable(){
        return available;
    }

    public boolean isAvailable() {
        return available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


}
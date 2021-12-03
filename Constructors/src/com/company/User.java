package com.company;

import java.util.Date;

public class User {

    private boolean isApproved;
    private int id;
    private String name;
    private String emailAddress;
    private String country;

    private Date createdDate;

   public User(){
       country = "Türkiye";
       createdDate = new Date();
    }

    public User(String name,String emailAddress){
        this.emailAddress = emailAddress;
        this.name = name;
        this.country = "Türkiye";
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

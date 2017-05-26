package com.example.vivian.contactbook.db;

import org.litepal.crud.DataSupport;

import java.io.Serializable;

/**
 * Created by Vivian on 2017/5/24.
 */

public class peopleInfo extends DataSupport implements Serializable{
    private int id;
    private String firstName;
    private String secondName;
//    private int imageId;
    private String phoneNumber;
    public peopleInfo(String firstName,String secondName,String phoneNumber){
        this.firstName=firstName;
        this.secondName=secondName;

        this.phoneNumber=phoneNumber;
//        this.imageId=imageId;
    }
    public peopleInfo(){}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

//    public int getImageId() {
//        return imageId;
//    }
//
//    public void setImageId(int imageId) {
//        this.imageId = imageId;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}

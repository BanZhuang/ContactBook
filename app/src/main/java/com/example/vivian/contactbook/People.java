package com.example.vivian.contactbook;

/**
 * Created by Vivian on 2017/5/11.
 */

public class People {
    private String firstName;
    private String secondName;
//    private int imageId;
    private String phoneNumber;
    public People(String firstName,String secondName,String phoneNumber){
        this.firstName=firstName;
        this.secondName=secondName;

        this.phoneNumber=phoneNumber;
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

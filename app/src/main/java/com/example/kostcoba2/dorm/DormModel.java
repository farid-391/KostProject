package com.example.kostcoba2.dorm;

public class DormModel {
    String dormName ;
    String location;
    int Image;

    public DormModel(String dormName, String location, int image) {
        this.dormName = dormName;
        this.location = location;
        this.Image = image;
    }

    public DormModel(String dormName){
        this.dormName = dormName;
    }

    public String getDormName() {
        return this.dormName;
    }

    public String getLocation() {
        return this.location;
    }

    public int getImage() {
        return this.Image;
    }
}

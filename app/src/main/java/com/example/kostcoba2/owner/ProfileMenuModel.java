package com.example.kostcoba2.owner;

public class ProfileMenuModel {
    String Title ;
    String Description;
    int Icon;

    public ProfileMenuModel(String Title, String Description, int Icon){
        this.Title = Title;
        this.Description = Description;
        this.Icon = Icon;
    }

    public ProfileMenuModel(String Title){
        this.Title = Title;
    }

    public String getTitle(){
        return this.Title;
    }

    public String getDescription(){ return this.Description;  }

    public int getIcon(){
        return this.Icon;
    }
}

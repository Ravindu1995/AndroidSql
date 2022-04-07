package com.example.johnkeelsdemo;

public class model
{
  String sId, sName, sAge,sCourse;

    public model(String name, String contact, String email,String course) {
        this.sId = name;
        this.sName = contact;
        this.sAge = email;
        this.sCourse = course;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAge() {
        return sAge;
    }

    public void setsAge(String sAge) {
        this.sAge = sAge;
    }

    public String getsCourse() {
        return sCourse;
    }

    public void setsCourse(String sCourse) {
        this.sCourse = sCourse;
    }
}

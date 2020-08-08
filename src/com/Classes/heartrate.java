package com.Classes;

public class heartrate {

    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    //constructor
    public heartrate(String firstName, String lastName, int day, int month, int year) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public String getlastName() {
        return this.lastName;
    }
    public void setDay(int day) {
        this.day=day;
    }

    public int getDay() {
        return this.day;
    }
    public void setMonth(int month) {
        this.month=month;
    }

    public int getMonth() {
        return this.month;
    }
    public void setYear(int year) {
        this.year=year;
    }

    public int getYear() {
        return this.year;
    }

}

package com.example.bodycalculator;

import java.util.Calendar;
import java.util.Date;

public class Profile {


    //attributes
    String firstName ="";
    String lastName="";
    Date birthdate= new Date();
    Boolean female= true;
    Double bodyHeight=0.0;
    Double boneMass=0.0;

// Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public Profile setFirstName(String firstName) {
        this.firstName = firstName;
        return null;
    }

    public String getLastName() {
        return lastName;
    }

    public Profile setLastName(String lastName) {
        this.lastName = lastName;
        return null;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Profile setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
        return  null;
    }

    public Boolean getFemale() {
        return female;
    }

    public void setFemale(Boolean female) {
        this.female = female;
    }

    public Double getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(Double bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public Double getBoneMass() {
        return boneMass;
    }

    public void setBoneMass(Double boneMass) {
        this.boneMass = boneMass;
    }

    //constructor
    public Profile() {
    this.firstName="";
    this.lastName="";
    this.birthdate=new Date();
    this.female= true;
    this.bodyHeight=0.0;
    this.boneMass=0.0;
    }


    //Functions and methods
    /*public boolean hasBirthday(Date birthday){
                                    Boolean has= false;
                                    //Calendar calendar = birthday.dateToCalendar();
                                    System.out.println(calendar.getTime());
                                    Calendar today=Calendar.getInstance();
                                    if (birthday==today)has=true;

                                    return has;
                                }*/
    public static int getAge(Date dateOfBirth) {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);
        if (birthDate.after(today)) {
            throw new IllegalArgumentException("You don't exist yet");
        }
        int todayYear = today.get(Calendar.YEAR);
        int birthDateYear = birthDate.get(Calendar.YEAR);
        int todayDayOfYear = today.get(Calendar.DAY_OF_YEAR);
        int birthDateDayOfYear = birthDate.get(Calendar.DAY_OF_YEAR);
        int todayMonth = today.get(Calendar.MONTH);
        int birthDateMonth = birthDate.get(Calendar.MONTH);
        int todayDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int birthDateDayOfMonth = birthDate.get(Calendar.DAY_OF_MONTH);
        int age = todayYear - birthDateYear;

        // If birth date is greater than todays date (after 2 days adjustment of leap year) then decrement age one year
        if ((birthDateDayOfYear - todayDayOfYear > 3) || (birthDateMonth > todayMonth)) {
            age--;

            // If birth date and todays date are of same month and birth day of month is greater than todays day of month then decrement age
        } else if ((birthDateMonth == todayMonth) && (birthDateDayOfMonth > todayDayOfMonth)) {
            age--;
        }
        return age;
    }

}

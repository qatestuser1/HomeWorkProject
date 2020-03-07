package com.onemorecompany.professions;

import com.exam.person.Person;

public class Driver extends Person {
    private String fullName;
    private int experience;

    Driver(String fullName, int experience, int age){
        super(fullName, age);
        this.experience = experience;
    }
    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }

}

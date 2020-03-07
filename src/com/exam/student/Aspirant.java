package com.exam.student;

public class Aspirant extends Student {
    public String scienceWork;

    Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }
    public double getScholarship(){
        if(averageMark == 5)
            return 200;
        else return 180;
    }
}

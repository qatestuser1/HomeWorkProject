package com.exam.student;

import org.apache.commons.lang3.RandomStringUtils;
import java.lang.Math;
public class MainClass {
        public static void main(String[] args) {
        //Student student = new Aspirant("Yana", "Kudryk", "14K", 5.0, "RSA");
        int amountOfStudents = 5;
        Student[] students = new Student[amountOfStudents];
            for (int i = 0; i < amountOfStudents; i++) {
                if(i % 2 == 0){
                    students[i] = new Student(RandomStringUtils.random(6, true, false),RandomStringUtils.random(7, true, false),
                            RandomStringUtils.random(3, false, true), Math.random());
                }
                else students[i] = new Aspirant(RandomStringUtils.random(6, true, false),RandomStringUtils.random(7, true, false),
                        RandomStringUtils.random(3, false, true), Math.random(), RandomStringUtils.random(6, true, false));
            }

            for (int i = 0; i < amountOfStudents; i++) {
                System.out.println(students[i].toString());
                System.out.println(students[i].getScholarship());
            }
        }
}

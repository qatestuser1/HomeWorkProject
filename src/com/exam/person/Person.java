package com.exam.person;

public class Person {
    private String fullName;
    private int age;

    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    Person(){
        fullName = "Yana";
        age = 24;
    }
    public void move(){
        System.out.println(fullName + " moves.");
    }
    public void talk(){
        System.out.println(fullName + " talks.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}

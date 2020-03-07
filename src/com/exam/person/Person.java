package com.exam.person;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public Person(){
        fullName = "Yana";
        age = 24;
    }


    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
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

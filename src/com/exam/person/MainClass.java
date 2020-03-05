package com.exam.person;

public class MainClass {
    public static void main(String[] args) {
        Person personDef = new Person();
        Person personNew = new Person("Olga", 29);
        System.out.println(personDef.toString());
        System.out.println(personNew.toString());
    }
}

package com.exam.phone;

public class MainClass {
    public static void main(String[] args) {
    Phone phone1 = new Phone();
    Phone phone2 = new Phone();
    Phone phone3 = new Phone();

    System.out.println("Number: " + phone1.getNumber() + " Model: " + phone1.getModel() + " Weight: " + phone1.getWeight());
    System.out.println("Number: " + phone2.getNumber() + " Model: " + phone2.getNumber() + " Weight: " + phone2.getWeight());
    System.out.println("Number: " + phone3.getNumber() + " Model: " + phone3.getNumber() + " Weight: " + phone3.getWeight());

    phone1.receiveCall("Mother");
    phone2.receiveCall("Olga", "+380445364643");
    phone3.receiveCall("Brother", "+380445364645");
    }
}

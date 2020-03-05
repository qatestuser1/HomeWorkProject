package com.exam.phone;

import java.util.Objects;

public class Phone {
    private String number;
    private String model;
    private int weight;

    Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    Phone(){
        number = "+380669256373";
        model = "Nokia";
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Calling " + name + " " + number);
    }

    public void sendMessage(String... number){
        for (int i = 0; i < number.length ; i++) {
            System.out.println(number[i]);

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return getWeight() == phone.getWeight() &&
                Objects.equals(getNumber(), phone.getNumber()) &&
                Objects.equals(getModel(), phone.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getModel(), getWeight());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

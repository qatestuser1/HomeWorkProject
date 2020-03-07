package com.onemorecompany.details;

public class Engine {
    private int power;
    private String producer;

    Engine(int power, String producer){
        this.power = power;
        this.producer = producer;
    }
    public int getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }
}

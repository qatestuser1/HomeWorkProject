package com.onemorecompany.vehicles;

import com.onemorecompany.details.Engine;
import com.onemorecompany.professions.Driver;

public class Car {
    private String model;
    private String classAuto;
    private int weight;
    private Driver driver;
    private Engine engine;

    Car(String model, String classAuto, int weight, Driver driver, Engine engine){
        this.model = model;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public void start(){
        System.out.println("Go!");
    }
    public void stop(){
        System.out.println("Stop!");
    }
    public void turnLeft(){
        System.out.println("Turn left!");
    }
    public void turnRight(){
        System.out.println("Turn right!");
    }

    public void printInfo(){
        System.out.println("Car{" +
                "model='" + model + '\'' +
                ", classAuto='" + classAuto + '\'' +
                ", weight=" + weight + '\'' +
                ", driver full name=" + driver.getFullName() + '\'' +
                ", driver experience=" + driver.getExperience() + '\'' +
                ", engine producer=" + engine.getProducer() + '\'' +
                ", engine power=" + engine.getPower() +
                '}');
    }
}


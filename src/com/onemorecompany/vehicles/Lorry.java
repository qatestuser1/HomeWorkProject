package com.onemorecompany.vehicles;

import com.onemorecompany.details.Engine;
import com.onemorecompany.professions.Driver;

public class Lorry extends Car {
    private int carryingCapacity;
    Lorry(String model, String classAuto, int weight, Driver driver, Engine engine, int carryingCapacity){
        super(model, classAuto, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;

    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}

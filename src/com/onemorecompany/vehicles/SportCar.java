package com.onemorecompany.vehicles;

import com.onemorecompany.details.Engine;
import com.onemorecompany.professions.Driver;

public class SportCar extends Car {
    private int topSpeed;
    SportCar(String model, String classAuto, int weight,
             Driver driver, Engine engine, int topSpeed){
        super(model, classAuto, weight, driver, engine);
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}

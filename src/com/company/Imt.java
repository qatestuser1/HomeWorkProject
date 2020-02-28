package com.company;
import java.lang.Math;

public class Imt {
    public static double calculateIndex(double height, double weight){
        return weight/Math.pow(height, 2);
    }
}

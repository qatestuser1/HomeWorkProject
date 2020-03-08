package com.company;
import java.lang.Math;

public class Imt {
    public static double calculateIndex(double height, double weight){
        try {
            return weight / Math.pow(height, 2);
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1.0;
        }
    }
}

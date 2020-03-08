package com.company;
import java.lang.Math;

public class AreaTriangle {
    public static double calculateArea (int a, int b, int c){
        try {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1.0;
        }
    }
}

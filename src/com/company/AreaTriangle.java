package com.company;
import java.lang.Math;

public class AreaTriangle {
    public static double calculateArea (int a, int b, int c){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

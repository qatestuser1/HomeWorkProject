package com.company;
import java.lang.Math;

public class Points extends LoggerClass{
    public static double getDistance(int x1, int y1, int x2, int y2){
        try {
            return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
            return -1.0;
        }
    }
}

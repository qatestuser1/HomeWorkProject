package com.company;

import static com.company.AreaTriangle.calculateArea;

public class Hexagon extends LoggerClass{
    public static double calculateHexagonSquare(int a){
        try {
            return 6.0 * calculateArea(a, a, a);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
            return -1.0;
        }
    }
}

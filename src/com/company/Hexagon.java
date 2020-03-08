package com.company;

public class Hexagon extends AreaTriangle {
    public static double calculateHexagonSquare(int a){
        try {
            return 6.0 * calculateArea(a, a, a);
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1.0;
        }
    }
}

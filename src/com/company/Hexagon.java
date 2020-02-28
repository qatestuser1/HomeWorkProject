package com.company;

public class Hexagon extends AreaTriangle {
    public static double calculateHexagonSquare(int a){
        return 6.0 * calculateArea(a, a, a);
    }
}

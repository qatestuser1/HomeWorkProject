package com.company;

public class Triangle {
    public static boolean isExistTriangle(int a, int b, int c){
        if (a + b < c || a + c < b || a + b < c)
            return true;
        else return false;
    }
}

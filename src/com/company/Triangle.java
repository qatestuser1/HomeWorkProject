package com.company;

public class Triangle {
    public static boolean isExistTriangle(int a, int b, int c){
        try {
            if (a + b < c || a + c < b || a + b < c)
                return true;
            else return false;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return false;
        }
    }
}

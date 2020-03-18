package com.company;

public class Triangle extends LoggerClass{
    public static boolean isExistTriangle(int a, int b, int c){
        try {
            if (a + b < c || a + c < b || a + b < c)
                return true;
            else return false;
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
            return false;
        }
    }
}

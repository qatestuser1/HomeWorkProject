package com.company;

public class Pool {
    public static int calculateBathCapacity(int length, int width, int height){
        try {
            return length * width * height;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1;
        }
    }
}

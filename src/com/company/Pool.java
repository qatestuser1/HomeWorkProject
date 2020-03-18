package com.company;

public class Pool extends LoggerClass{
    public static int calculateBathCapacity(int length, int width, int height){
        try {
            return length * width * height;
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
            return -1;
        }
    }
}

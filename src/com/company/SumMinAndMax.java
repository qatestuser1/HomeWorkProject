package com.company;
import java.sql.Array;
import java.util.Scanner;


public class SumMinAndMax {

    public static int[] getArray(){
        int[] array = new int[0];
        try {
            System.out.println("Please input array size:");
            Scanner scanNumber = new Scanner(System.in);
            int n = scanNumber.nextInt();
            array = new int[n];
            System.out.println("Please input array:");
            for (int i = 0; i < n; i++) {
                Scanner scanArray = new Scanner(System.in);
                array[i] = scanArray.nextInt();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return array;
    }

    public static int findMin(int[] array){
        try {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= min)
                    min = array[i];
            }
            return min;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1;
        }
    }

    public static int findMax(int[] array){
        try {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= max)
                    max = array[i];
            }
            return max;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1;
        }
    }

    public static int calculateSumMaxAndMin(int a, int b){
        try {
            return a + b;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1;
        }
    }
}

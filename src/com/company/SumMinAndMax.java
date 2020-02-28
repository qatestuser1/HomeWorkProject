package com.company;
import java.sql.Array;
import java.util.Scanner;


public class SumMinAndMax {

    public static int[] getArray(){

        System.out.println("Please input array size:");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        int[] Array = new int[n];
        System.out.println("Please input array:");
        for (int i = 0; i < n; i++){
            Scanner scanArray = new Scanner(System.in);
            Array[i] = scanArray.nextInt();
        }
        return Array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] <= min)
                min = array[i];
        }
        return min;
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] >= max)
                max = array[i];
        }
        return max;
    }

    public static int calculateSumMaxAndMin(int a, int b){
        return a + b;
    }
}

package com.llevel1;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    public static int[] scanArray(){
        System.out.println("Input size of array:");
        Scanner sc = new Scanner(System.in);

        int[] array = new int[sc.nextInt()];
        System.out.println("Input array:");
        for(int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        return array;
    }
    public static int findSum(int[] array, int k){
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] % k == 0)
                result += array[i];
        }
         return result;
    }

    public static ArrayList<Integer> zeroArray(int[] array){
        ArrayList<Integer> arrayWithZero = new ArrayList<>();
        for(int i = 0; i <= array.length; i++){
            if(array[i] == 0)
                arrayWithZero.add(i);
        }
        return arrayWithZero;
    }

    public static void whichEarlier(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                System.out.println("Negative is first!");
                return;
            }
            else if(array[i] > 0){
                System.out.println("Positive is first!");
                return;
            }
            else{
                System.out.println("Value is zero!");
                return;
            }
        }
    }

    /**
     *
     * @param array
     * @return
     */
    public static boolean isSorted(int[] array){
        for(int i = 1; i < array.length; i++){
            if(array[i - 1] <= array[i])
                continue;
            else return false;
        }
        return true;
    }

}

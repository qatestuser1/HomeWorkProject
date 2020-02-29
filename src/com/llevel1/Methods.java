package com.llevel1;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    public static ArrayList<Integer> scanArrayList(){
        System.out.println("Input size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>(size);
        System.out.println("Input array:");

        for(int i = 0; i < array.size(); i++)
            array.add(sc.nextInt());
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

    public static ArrayList<Integer> arrayWithEvenNumbers(ArrayList<Integer> array){
        ArrayList<Integer> evenArray = new ArrayList<>();
        for(int i : array){
            if(array.get(i) % 2 == 0)
                evenArray.add(array.get(i));

        }
        return evenArray;
    }

    public static void printArrayWithEvenNumbers(ArrayList<Integer> array){
        if(array.isEmpty())
            System.out.println("There is no even elements!");
        else{
            System.out.println("Array with even elements:");
            for(int i : array)
                System.out.print(array.get(i) + "");
        }
    }
}

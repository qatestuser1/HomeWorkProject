package com.llevel1;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    public static int findMinNumber (int a, int b){
        if(a > b)
            return b;
        else return a;
    }

    public static int findMaxNumber (int a, int b){
        if(a > b)
            return a;
        else return b;
    }
    public static ArrayList<Integer> scanArrayList(){
        System.out.println("Input size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Input array:");

        for(int i = 0; i < size; i++)
            array.add(sc.nextInt());
        return array;
    }

    public static int[] scanArray(){
        System.out.println("Input size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Input array:");

        for(int i = 0; i < size; i++)
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
        for(int i = 0; i < array.size(); i++){
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
            for(int i = 0; i < array.size(); i++)
                System.out.print(array.get(i) + " ");
        }
    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void printArrayList(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }

    }
    public static void replaceElements(int[] array, int z){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        printArray(array);
        System.out.println();
        System.out.println("Amount or replaces = " + count);

    }

    public static void countAmountOfPosNegZero(int[] array){
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0)
                countNegative ++;
            else if(array[i] > 0)
                countPositive ++;
            else countZero ++;
        }
        System.out.println("Positive = " + countPositive + " Negative = " + countNegative + " Zero = " + countZero);
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] <= min)
                min = array[i];
        }
        return min;
    }

    public static int findMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] >= max)
                max = array[i];
        }
        return max;
    }

    public static int[] switchMaxAndMinInArray(int[] array){
        int max = findMax(array);
        int min = findMin(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] == max)
                array[i] = min;
            else if (array[i] == min)
                array[i] = max;
        }
        return array;
    }

    public static void printArrayWithCondition(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] <= i)
                System.out.print(array[i] + " ");
        }
    }

    public static void printMod(int[] array, int m , int l){
        for (int i = 0; i < array.length; i++){
            if(array[i] % m == l)
                System.out.print(array[i] + " ");
        }
    }

    public static int[] switchPairsInArray(int[] array){
        int[] arrayRes = new int[array.length];
        for (int i = 0; i < array.length - 1; i = i + 2){
                arrayRes[i] = array[i + 1];
                arrayRes[i + 1] = array[i];
        }
        return arrayRes;
    }

    public static void printBeforeNull(int[] array){
        for (int i = 0; i < array.length; i++){
            if(array[i] != 0){
                System.out.print(array[i] + " ");
            }
            else return;
        }
    }

    public static int sumMaxAndMin(int[] array){
        return findMin(array) + findMax(array);
    }

    public static void findComposition(int[] array, int m){
        int composition = 1;
        for (int i = 0; i < array.length; i++)
            if(array[i] > m)
                composition *= array[i];

        if(composition > 1)
            System.out.println("Composition: " + composition);
        else System.out.println("No such elements!");

    }

    public static int[] replaceWithZeroCondition(int[] array){
        int max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > max)
                array[i] = 0;
        }
        return array;
    }

    public static void findGreaterCompositionAbs(int[] array){
        int compositionPositive = 1;
        int compositionNegative = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0)
                compositionPositive *= array[i];
            else if (array[i] < 0)
                compositionNegative *= array[i];
        }
        if(findMaxNumber(Math.abs(compositionPositive), Math.abs(compositionNegative)) == Math.abs(compositionPositive))
            System.out.println("Positive is greater: " + compositionPositive);
        else System.out.println("Negative is greater: " + compositionNegative);

    }

    public static int[] replaceFirstMaxElementWithZero(int[] array){
        int max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                array[i] = 0;
                break;
            }
        }
        return array;
    }

    public static ArrayList<Integer> replaceArrayWithK(ArrayList<Integer> array, int k){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) % 10 == k)
                newArray.add(array.get(i));
        }
        return newArray;
    }

}

package com.llevel1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Methods {
    public static final Logger log = Logger.getLogger(Methods.class);

    public static int findMinNumber (int a, int b){
        try {
            if (a > b)
                return b;
            else return a;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1;
        }
    }

    public static int findMaxNumber (int a, int b){
        try {
            if (a > b)
                return a;
            else return b;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1;
        }
    }
    public static ArrayList<Integer> scanArrayList() {
        ArrayList<Integer> array = null;
        try {
            System.out.println("Input size of array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();

            array = new ArrayList<>();
            System.out.println("Input array:");

            for (int i = 0; i < size; i++)
                array.add(sc.nextInt());
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return array;

    }

    public static int[] scanArray() {
        int[] array = new int[0];
        try {
            System.out.println("Input size of array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            array = new int[size];
            System.out.println("Input array:");

            for (int i = 0; i < size; i++)
                array[i] = sc.nextInt();
            log.info("Array is successfully scanned.");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            log.error("Failed to scan array.", ex);
        }
        return array;
    }

    public static int findSum(int[] array, int k){
        int result = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % k == 0)
                    result += array[i];
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
         return result;
    }

    public static ArrayList<Integer> zeroArray(int[] array) {
        ArrayList<Integer> arrayWithZero = null;
        try {
            arrayWithZero = new ArrayList<>();
            for (int i = 0; i <= array.length; i++) {
                if (array[i] == 0)
                    arrayWithZero.add(i);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return arrayWithZero;
    }

    public static String whichEarlier(int[] array){
        String result = null;
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    result = "Negative";
                } else if (array[i] > 0) {
                    result = "Positive";
                } else {
                    result = "Zero";
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return result;
    }

    public static boolean isSorted(int[] array){
        boolean result = true;
        try {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] <= array[i])
                    continue;
                else result = false;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            result = false;
        }
        return result;

    }

    public static ArrayList<Integer> arrayWithEvenNumbers(ArrayList<Integer> array) {
        ArrayList<Integer> evenArray = null;
        try {
            evenArray = new ArrayList<>();
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) % 2 == 0)
                    evenArray.add(array.get(i));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Something went wrong.");
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
    public static int[] replaceElements(int[] array, int z){
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > z) {
                    array[i] = z;
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return array;
    }

    public static Map<Integer, String> countAmountOfPosNegZero(int[] array){
        Map<Integer, String> result = null;
        try {
            int positive = 0;
            int negative = 0;
            int zero = 0;
            result = new HashMap<Integer, String>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0)
                    positive++;
                else if (array[i] < 0)
                    negative++;
                else zero++;
            }
            result.put(positive, "Positive");
            result.put(negative, "Negative");
            result.put(zero, "Zero");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return result;
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

    public static int[] switchMaxAndMinInArray(int[] array){
        try {
            int max = findMax(array);
            int min = findMin(array);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == max)
                    array[i] = min;
                else if (array[i] == min)
                    array[i] = max;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return array;
    }

    public static ArrayList<Integer> arrayWithCondition(int[] array){
        ArrayList<Integer> resultArray = null;
        try {
            resultArray = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= i)
                    resultArray.add(array[i]);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return resultArray;
    }

    public static ArrayList<Integer> arrayMod(int[] array, int m , int l){
        ArrayList<Integer> resultArray = null;
        try {
            resultArray = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % m == l)
                    resultArray.add(array[i]);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return resultArray;
    }

    public static int[] switchPairsInArray(int[] array){
        int[] arrayRes = new int[array.length];
        try {
            for (int i = 0; i < array.length - 1; i = i + 2) {
                arrayRes[i] = array[i + 1];
                arrayRes[i + 1] = array[i];
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return arrayRes;
    }

    public static ArrayList<Integer> arrayBeforeNull(int[] array){
        ArrayList<Integer> arrayRes = null;
        try {
            arrayRes = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0)
                    arrayRes.add(array[i]);
                else break;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return arrayRes;
    }

    public static int sumMaxAndMin(int[] array){
        int result = 0;
        try {
            result = findMin(array) + findMax(array);
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return result;
    }

    public static int findComposition(int[] array, int m){
        int composition = 1;
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > m)
                    composition *= array[i];
            }
            if(composition > 1)
                return composition;
            else return -1;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1;
        }
    }

    public static int[] replaceWithZeroCondition(int[] array){
        int max = 0;
        try {
            max = findMax(array);
            for (int i = 0; i < array.length; i++) {
                if (Math.abs(array[i]) > max)
                    array[i] = 0;
            }
            log.info("Everything is ok.");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            log.error("Something went wrong.");
        }
        return array;
    }

    public static Map<Integer, String> findGreaterCompositionAbs(int[] array){
        Map<Integer, String> res = null;
        try {
            res = new HashMap<Integer, String>();
            int compositionPositive = 1;
            int compositionNegative = 1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0)
                    compositionPositive *= array[i];
                else if (array[i] < 0)
                    compositionNegative *= array[i];
            }
            if (findMaxNumber(Math.abs(compositionPositive), Math.abs(compositionNegative)) == Math.abs(compositionPositive))
                res.put(compositionPositive, "Positive");
            else res.put(compositionNegative, "Negative");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return res;
    }

    public static int[] replaceFirstMaxElementWithZero(int[] array){
        try {
            int max = findMax(array);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == max) {
                    array[i] = 0;
                    break;
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return array;
    }

    public static ArrayList<Integer> replaceArrayWithK(ArrayList<Integer> array, int k){
        ArrayList<Integer> newArray = null;
        try {
            newArray = new ArrayList<>();
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) % 10 == k)
                    newArray.add(array.get(i));
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return newArray;
    }

}

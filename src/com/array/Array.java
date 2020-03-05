package com.array;

public class Array {
    public int[] numbers;
    public int[] weights;
    public int[] ranges;
    public int sum = 0;

    Array(int[] numbers, int[] weights){
        this.numbers = numbers;
        this.weights = weights;
        ranges = new int[numbers.length];
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }

    }

    /* public double getRandom(){
         for (int i = 0; i < sum; i++) {
             for (int j = 0; j < weights[j]; j++) {
                 ranges[i] = numbers[j];
             }
         }
         return Math.random(ranges);

     }
     */
}

package com.company;

public class Factorial {
     public static int calculateFactorialRecur(int x){
        if (x == 1) {
            return 1;
        }
         return x*calculateFactorialRecur(x - 1);
    }
    
     public static int calculateFactorialLoop(int x){
         int result = 1;
         for (int i = 1; i <= x; i++)
             result *= i;
         return result;
     }

     public static int calculateSumFactorial(){
         int sum = 0;
         for (int i = 1; i <= 9; i++){
             if (i % 2 == 1)
                 sum += calculateFactorialLoop(i);
         }
         return sum;
     }
}

package com.company;

public class Factorial extends LoggerClass{
     public static int calculateFactorialRecur(int x){
         try {
             if (x == 1) {
                 return 1;
             }
             return x * calculateFactorialRecur(x - 1);
         }
         catch (Exception ex){
             ex.printStackTrace();
             log.error("Something went wrong.");
             return -1;
         }
    }
    
     public static int calculateFactorialLoop(int x){
         try {
             int result = 1;
             for (int i = 1; i <= x; i++)
                 result *= i;
             return result;
         }
         catch (Exception ex){
             ex.printStackTrace();
             log.error("Something went wrong.");
             return -1;
         }
     }

     public static int calculateSumFactorial(){
         int sum = 0;
         try {
             for (int i = 1; i <= 9; i++) {
                 if (i % 2 == 1)
                     sum += calculateFactorialLoop(i);
             }
         }
         catch (Exception ex){
             ex.printStackTrace();
             log.error("Something went wrong.");
         }
         return sum;
     }
}

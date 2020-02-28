package com.company;
import java.util.Scanner;


public class Identical {
    public static boolean isIdentical(String input){
        for (int j = 0; j < input.length(); j++)
            for (int i = 0; i < input.length(); i++)
               if (i != j)
                   if (input.charAt(j) == input.charAt(i)) {
                       return true;
                }
        return false;
    }


    public static String inputIdentical(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a number: ");
        return in.next();
    }
}

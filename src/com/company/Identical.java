package com.company;
import java.util.Scanner;


public class Identical extends LoggerClass {
    public static boolean isIdentical(String input){
        try {
            for (int j = 0; j < input.length(); j++)
                for (int i = 0; i < input.length(); i++)
                    if (i != j)
                        if (input.charAt(j) == input.charAt(i)) {
                            return true;
                        }
            return false;
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
            return false;
        }
    }


    public static String inputIdentical(){
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Please input a number: ");
            return in.next();
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
            return "-1";
        }
    }
}

package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class StringPrint {
    public static ArrayList<String> getStringAmountOfTimesN(){
        ArrayList<String> resultArray = null;
        try {
            resultArray = new ArrayList<>();
            System.out.println("Please input string:");
            Scanner sc = new Scanner(System.in);
            String scanString = sc.nextLine();

            System.out.println("Please input N:");
            int n = sc.nextInt();
            for (int i = 1; i < n; i++)
                resultArray.add(scanString);
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return resultArray;
    }
}

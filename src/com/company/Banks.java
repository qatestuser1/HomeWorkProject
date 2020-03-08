package com.company;
import java.util.Scanner;

public class Banks {
    public static int[] getBanks(){
        int[] banks = new int[0];
        try {
            System.out.println("Please enter amount of banks:");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            banks = new int[n];

            System.out.println("Please enter a course:");
            for (int i = 0; i < n; i++) {
                Scanner sc = new Scanner(System.in);
                banks[i] = sc.nextInt();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
        }
        return banks;
    }

    public static int findMin(int[] banks){
        try {
            int min = banks[0];
            for (int i = 0; i < banks.length; i++) {
                if (banks[i] <= min)
                    min = banks[i];
            }
            return min;
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Something went wrong.");
            return -1;
        }
    }
}

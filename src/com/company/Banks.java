package com.company;
import java.util.Scanner;

public class Banks {
    public static int[] getBanks(){
        System.out.println("Please enter amount of banks:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] banks = new int[n];

        System.out.println("Please enter a course:");
        for (int i = 0; i < n; i++){
            Scanner sc = new Scanner(System.in);
            banks[i] = sc.nextInt();
        }
        return banks;
    }

    public static int findMin(int[] banks){
        int min = banks[0];
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] <= min)
                min = banks[i];
        }
        return min;
    }
}

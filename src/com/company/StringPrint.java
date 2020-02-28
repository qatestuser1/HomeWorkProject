package com.company;
import java.util.Scanner;

public class StringPrint {
    public static void printingString(){
        System.out.println("Please input string:");
        Scanner sc = new Scanner(System.in);
        String scanString = sc.nextLine();

        System.out.println("Please input N:");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++)
            System.out.println(scanString);
    }
}

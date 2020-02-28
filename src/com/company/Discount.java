package com.company;
import java.util.Scanner;

public class Discount {
    public static void calculatePriceWithDiscount() {
        System.out.println("Please input price:");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if (price <= 1000)
            System.out.println("No discount! Your price is: " + price);
        else if (price > 1000 && price <= 2000)
            System.out.println("Your price with discount is: " + (price - price * 0.02));
        else if (price > 2000 && price <= 5000)
            System.out.println("Your price with discount is: " + (price - price * 0.05));
        else if (price > 5000)
            System.out.println("Your price with discount is: " + (price - price * 0.07));
        else System.out.println("Invalid input!");
    }
}

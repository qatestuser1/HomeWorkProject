package com.company;
import java.util.Scanner;

public class Discount extends LoggerClass {
    public static double calculatePriceWithDiscount() {
        int price = 0;
        try {
            System.out.println("Please input price:");
            Scanner sc = new Scanner(System.in);
            price = sc.nextInt();

            if (price <= 1000)
                return price;
            else if (price > 1000 && price <= 2000)
                return price - price * 0.02;
            else if (price > 2000 && price <= 5000)
                return price - price * 0.05;
            else if (price > 5000)
                return price - price * 0.07;
            else return -1.0;
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
            return -1;
        }
    }
}

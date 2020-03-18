package com.company;

public class TrianglePrint extends LoggerClass{
    public static void printing(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(0);
            }
            System.out.println();
        }
        log.info("Triangle is successfully printed.");
    }
}

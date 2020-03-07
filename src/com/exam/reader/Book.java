package com.exam.reader;
import java.util.Scanner;
public class Book {

    public String name;
    public String author;

    Book(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of the book: ");
        name = sc.nextLine();
        System.out.println("Input author of the book: ");
        author = sc.nextLine();
    }
}

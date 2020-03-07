package com.exam.reader;
import java.util.Scanner;

public class Reader {
    private String fullName;
    private String readNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public int test1;
    public static String test;

    Reader(){
        System.out.println("Enter reader info:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Full Name: ");
        fullName = sc.nextLine();
        System.out.println("Read Number: ");
        readNumber = sc.nextLine();
        System.out.println("Faculty: ");
        faculty = sc.nextLine();
        System.out.println("Date Of Birth: ");
        dateOfBirth = sc.nextLine();
        System.out.println("Phone Number: ");
        phoneNumber = sc.nextLine();
    }

    public void takeBook(){
        System.out.println("Somebody took The Great Gatsby!");
    }
    public void takeBook(int amount){
        System.out.println(fullName + " took " + amount + " books");
    }

    public void takeBook(String... book){
        System.out.print(fullName + " took the following books: ");
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i] + " ");
        }
    }
    public void takeBook(Book... books){
        System.out.println(fullName + " took the following books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name + " ");
        }
    }
    public void returnBook() {
        System.out.println("Somebody returned The Great Gatsby!");
    }
    public void returnBook(String... book){
        System.out.print(fullName + " returned the following books: ");
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i] + " ");
        }
    }
    public void returnBook(Book... books){
        System.out.println(fullName + " returned the following books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name + " ");
        }
    }

}

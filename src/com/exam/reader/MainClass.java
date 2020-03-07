package com.exam.reader;

public class MainClass {
    public static void main(String[] args) {
        int m = 3;
        Book[] books = new Book[m];

        for (int i = 0; i < m; i++) {
            books[i] = new Book();
        }
        int n = 5;
        Reader[] readers = new Reader[n];

        for (int i = 0; i < n; i++) {
            readers[i] = new Reader();
        }
        for (int i = 0; i < n; i++) {
            readers[i].takeBook();
            readers[i].takeBook(5);
            readers[i].takeBook("Pride and Prejudice", "Pride and Prejudice", "Jane Eyre");
            readers[i].takeBook(books);
        }
    }

}

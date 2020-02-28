package com.company;
import java.util.Scanner;

public class Exam {
    public static int calculateStudents(int[] students){
        int result = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i] == 2)
                result++;
        }
        return result;
    }

    public static int[] scanStudents(int size){
        int result[] = new int[size];
        System.out.println("Please input marks of students: ");
        for (int i = 0; i < size; i++) {
            Scanner in = new Scanner(System.in);
            result[i] = in.nextInt();
        }
        return result;
    }
}

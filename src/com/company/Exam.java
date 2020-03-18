package com.company;
import java.util.Scanner;

public class Exam extends LoggerClass {
    public static int calculateStudents(int[] students){
        int result = 0;
        try {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == 2)
                    result++;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
        }
        return result;
    }

    public static int[] scanStudents(int size){
        int result[] = new int[size];
        try {
            System.out.println("Please input marks of students: ");
            for (int i = 0; i < size; i++) {
                Scanner in = new Scanner(System.in);
                result[i] = in.nextInt();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong.");
        }
        return result;
    }
}

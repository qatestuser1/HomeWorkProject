package com.exam.matrix;
import java.util.Scanner;

public class Matrix {
    public int n;
    public int m;
    public int[][] matrix;

    Matrix() {
        System.out.println("Input N:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Input M:");
        m = sc.nextInt();
        matrix = new int[n][m];
        System.out.println("Input matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }


    public Matrix calculateSum(Matrix matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix.m; j++) {
                matrix.matrix[i][j] = matrix.matrix[i][j] + this.matrix[i][j];
            }
        }
        return matrix;
    }

    public Matrix multiply(Matrix matrix, int multiplier) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix.matrix[i][j] = this.matrix[i][j] * multiplier;
            }
        }
        return matrix;
    }

    public void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.n; i++) {
            for (int j = 0; j < matrix.m; j++) {
                System.out.print(matrix.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
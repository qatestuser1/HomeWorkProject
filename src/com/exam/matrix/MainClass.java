package com.exam.matrix;

public class MainClass {
    public static void main(String[] args) {
    Matrix matrix1 = new Matrix();
    Matrix matrix2 = new Matrix();

    matrix1.calculateSum(matrix2);

    matrix1.printMatrix(matrix2);

    matrix1.multiply(matrix1,5);
    matrix1.printMatrix(matrix1);
    }
}

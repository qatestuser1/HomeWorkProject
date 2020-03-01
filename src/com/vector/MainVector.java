package com.vector;

public class MainVector {
    public static void main(String[] args) {
        Vector firstVector = new Vector(1.0, 2.0, 3.0);
        Vector secondVector = new Vector(-2.0, -4.0, -2.0);

        System.out.println("Length: " + firstVector.calculateLength(firstVector));
        System.out.println("Scale composition: " + firstVector.calculateScaleComposition(firstVector, secondVector));

        System.out.println("Vector composition: ");
        Vector.printVector(firstVector.calculateVectorComposition(firstVector, secondVector));

        System.out.println("Cos of angle: " + firstVector.calculateAngle(firstVector, secondVector));

        System.out.println("Sum of vectors: ");
        Vector.printVector(firstVector.calculateSum(firstVector, secondVector));

        System.out.println("Residual of vectors: ");
        Vector.printVector(firstVector.calculateResidual(firstVector, secondVector));

        int N = 5;
        Vector[] vectorArray = new Vector[N];
        vectorArray = Vector.getVectorArray(N);
        for (int i = 0; i < N; i++) {
            Vector.printVector(vectorArray[i]);
        }

    }
}

package com.vector;

public class Vector {
    public double x, y, z;
    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double calculateLength(Vector vector){
        return Math.sqrt(Math.pow(vector.x, 2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2));
    }

    public double calculateScaleComposition(Vector vectorFirst, Vector vectorSecond){
        return vectorFirst.x * vectorSecond.x + vectorFirst.y * vectorSecond.y + vectorFirst.z * vectorSecond.z;
    }

    public Vector calculateVectorComposition(Vector vectorFirst, Vector vectorSecond){
        double x = vectorFirst.y * vectorSecond.z - vectorFirst.z * vectorSecond.y;
        double y = vectorFirst.z * vectorSecond.x - vectorFirst.x * vectorSecond.z;
        double z = vectorFirst.x * vectorSecond.y - vectorFirst.y * vectorSecond.x;
        Vector vectorResult = new Vector(x, y, z);
        return vectorResult;

    }

    public double calculateAngle(Vector vectorFirst, Vector vectorSecond) {
        return calculateScaleComposition(vectorFirst, vectorSecond) /
                (calculateLength(vectorFirst) * calculateLength(vectorSecond));
    }
    public static Vector calculateSum(Vector vectorFirst, Vector vectorSecond){
        double x = vectorFirst.x + vectorSecond.x;
        double y = vectorFirst.y + vectorSecond.y;
        double z = vectorFirst.z + vectorSecond.z;
        Vector vectorResult = new Vector(x, y, z);
        return vectorResult;
    }

    public static Vector calculateResidual(Vector vectorFirst, Vector vectorSecond){
        double x = vectorFirst.x - vectorSecond.x;
        double y = vectorFirst.y - vectorSecond.y;
        double z = vectorFirst.z - vectorSecond.z;
        Vector vectorResult = new Vector(x, y, z);
        return vectorResult;
    }

    public static Vector[] getVectorArray(int N){
        Vector[] vectorArray = new Vector[N];
        for (int i = 0; i < N; i++) {
            vectorArray[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectorArray;
    }

    public static void printVector(Vector vector){
        System.out.println("Vector (" + vector.x + ", " + vector.y + ", " + vector.z + ")");
        System.out.println();
    }
}

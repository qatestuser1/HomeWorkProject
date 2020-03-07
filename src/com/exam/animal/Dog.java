package com.exam.animal;

public class Dog extends Animal {
    public String favoriteBones;
    public void makeNoise(){
        System.out.println("Dog barks.");
    }
    public void eat(){
        System.out.println("Dog eats bones.");
    }
}

package com.exam.animal;

public class MainClass {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Horse();
        Vet vet = new Vet();
        for (int i = 0; i < 3; i++) {
            vet.treatAnimal(animals[i]);
        }
    }
}

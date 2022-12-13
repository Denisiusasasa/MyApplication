package com.example.myapplication.Lesson12.Homework;

import java.util.HashMap;
import java.util.Scanner;

public class App {

    static HashMap<String, Pet> animals = new HashMap<>();
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Pet catOne = new Cat("Chucho", "Egypt", "Meow");
        Pet catTwo = new Cat("Psychiatrist", "Persian", "Meow-Meow");
        Pet dogOne = new Dog("Poncho", "Collie", "Woof");
        Pet dogTwo = new Dog("Barrel", "Pudel", "Woof-Woof");
        Pet horseOne = new Horse("Baby", "Arabian", "Igogo");

        animals.put(catOne.getName(),catOne);
        animals.put(catTwo.getName(),catTwo);
        animals.put(dogOne.getName(),dogOne);
        animals.put(dogTwo.getName(),dogTwo);
        animals.put(horseOne.getName(),horseOne);

        printInfoAboutAnimals();
        System.out.println("Enter animal to delete");
        enterAnimalAndDeleteAnimal();
        printInfoAboutAnimals();

    }

    private static void printInfoAboutAnimals() {
        System.out.println("List of Animals");
        for (Pet pet: animals.values()){
            System.out.println();
            pet.printInfoAboutAnimal();
        }

    }

    private static void enterAnimalAndDeleteAnimal() {
        while (true) {
            String nameOfDeleteAnimal = SCANNER.nextLine();
            if (animals.containsKey(nameOfDeleteAnimal)) {
                animals.remove(nameOfDeleteAnimal);
            System.out.println("Animal with Name" + '\n'+nameOfDeleteAnimal + '\n'+"Delete successfully");
            break;
        } else{
                System.out.println("Incorrect input. Please try again");
            }
        }
    }
}

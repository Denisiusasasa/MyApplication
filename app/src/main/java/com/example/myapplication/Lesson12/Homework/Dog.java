package com.example.myapplication.Lesson12.Homework;

import java.util.Objects;

public class Dog extends Pet {
    private final String dogSay;

    public Dog(String name, String breed, String dogSay) {
        super(name, breed);
        this.dogSay = dogSay;
    }

    public String getDogSay() {
        return dogSay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogSay, dog.dogSay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dogSay);
    }
    @Override
    public void printInfoAboutAnimal(){
        System.out.println("Dog.Name:"+getName()+'\n'+"Breed:"+getBreed()+'\n'+"Dog-say:"+getDogSay());
    }
}

package com.example.myapplication.Lesson12.Homework;

import java.util.Objects;

public class Cat extends Pet {
    private final String catSay;

    public Cat(String name, String breed, String catSay) {
        super(name, breed);
        this.catSay = catSay;
    }

    public String getCatSay() {
        return catSay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(catSay, cat.catSay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), catSay);
    }
    @Override
    public void printInfoAboutAnimal(){
        System.out.println("Cat.Name:"+getName()+'\n'+"Breed:"+getBreed()+'\n'+"Cat-say:"+getCatSay());
    }

}

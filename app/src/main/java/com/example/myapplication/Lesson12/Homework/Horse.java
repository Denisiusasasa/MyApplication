package com.example.myapplication.Lesson12.Homework;

import java.util.Objects;

public class Horse extends Pet {
    private final String horseSay;

    public Horse(String name, String breed, String horseSay) {
        super(name, breed);
        this.horseSay = horseSay;
    }

    public String getHorseSay() {
        return horseSay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(horseSay, horse.horseSay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horseSay);
    }
    @Override
    public void printInfoAboutAnimal(){
        System.out.println("Horse.Name:"+getName()+'\n'+"Breed:"+getBreed()+'\n'+"Horse-say:"+getHorseSay());
    }
}

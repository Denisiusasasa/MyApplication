package com.example.myapplication;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (scanner.nextInt() % 2 == 0) {
            System.out.println("Ваше число четное!");
        } else{
            System.out.println("Ваше число нечетное!");
        }
    }
}
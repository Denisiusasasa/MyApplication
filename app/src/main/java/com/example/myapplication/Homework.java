package com.example.myapplication;
import java.util.Scanner;
public class Homework {

        public static void main(String[] args) {
            task1();
        }
        public static void task1() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int input = scanner.nextInt();
            if (input % 2 == 0) {
                System.out.println("Это число четное");
            } else {
                System.out.println("Это число нечетное");
            }
        }
    }


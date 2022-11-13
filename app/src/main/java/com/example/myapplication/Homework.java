package com.example.myapplication;

import java.util.Scanner;

public class Homework {

        public static void main(String[] args) {
            task1();
        }

        public static void task1() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            if (input % 2 == 0) {
                System.out.println("This number is even");
            } else {
                System.out.println("This number is odd");
            }
        }

    }


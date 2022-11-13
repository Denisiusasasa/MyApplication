package com.example.myapplication;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
    task1();
    task2();}       
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (scanner.nextInt() % 2 == 0) {
            System.out.println("Ваше число четное!");
        } else{
            System.out.println("Ваше число нечетное!");
        }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        int FirstNum = scanner.nextInt();
        int first = FirstNum > 0 ? FirstNum : -FirstNum;
        System.out.print("Второе число: ");
        int SecondNum = scanner.nextInt();
        int second = SecondNum > 0 ? SecondNum : -SecondNum;
        System.out.print("Третье число: ");
        int ThirdNum = scanner.nextInt();
        int third = ThirdNum > 0 ? ThirdNum : -ThirdNum;

        if (first < second && first < third) {
            System.out.println(first + " меньшее число ");
        } else if (second < first && second < third) {
            System.out.println(second + " меньшее число ");
        } else if  (third < first && third < second){
            System.out.println(third + " меньшее число ");
        }
    }


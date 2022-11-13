package com.example.myapplication;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
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

    static void task3() {
        System.out.println("Введите любое число в промежутке от 1 до 7");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неизвестный день недели");
        }
    }
}



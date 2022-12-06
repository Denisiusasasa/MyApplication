package com.example.myapplication.Lesson10.Practice;

import com.example.myapplication.Lesson10.Homework.ActionsWitTheDocumentNumber;

import java.util.Scanner;

public class HomeworkOfLesson10 {
    public static void main(String[] args) {
        checkingTheLastNumber();
    }

    private static final String REGEX_DOCUMENT = "\\d{4}-[A-z]{3}-\\d{4}-[A-z]{3}-\\d[A-z]\\d[A-z]";


    static void checkingTheLastNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер документа");
        String numberOfDocumentary = scanner.nextLine();
        while (true) {
            if (numberOfDocumentary.matches(REGEX_DOCUMENT)) {
                break;
            } else {
                System.out.println("Неправильный ввод");
                System.out.println("Введите номер документа ");
                numberOfDocumentary = scanner.nextLine();
            }
        }
        ActionsWitTheDocumentNumber.introduceTheTwoBlocksOfDigits(numberOfDocumentary);
        ActionsWitTheDocumentNumber.changingBlocksOfLetters(numberOfDocumentary);
        ActionsWitTheDocumentNumber.outputOnlyLetters(numberOfDocumentary);
        ActionsWitTheDocumentNumber.checkingTheContentOfTheSequence(numberOfDocumentary);
        ActionsWitTheDocumentNumber.checkingTheLastNumber(numberOfDocumentary);
    }


}




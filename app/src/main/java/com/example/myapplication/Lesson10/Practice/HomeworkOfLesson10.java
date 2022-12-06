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
        String numberDocumentary = scanner.nextLine();
        while (true) {
            if (numberDocumentary.matches(REGEX_DOCUMENT)) {
                break;
            } else {
                System.out.println("Неправильный ввод");
                System.out.println("Введите номер документа ");
                numberDocumentary = scanner.nextLine();
            }
        }
        ActionsWitTheDocumentNumber.introduceTheTwoBlocksOfDigits(numberDocumentary);
        ActionsWitTheDocumentNumber.changingBlocksOfLetters(numberDocumentary);
        ActionsWitTheDocumentNumber.outputOnlyLetters(numberDocumentary);
        ActionsWitTheDocumentNumber.checkingTheContentOfTheSequence(numberDocumentary);
        ActionsWitTheDocumentNumber.checkingTheLastNumber(numberDocumentary);
    }


}




package com.example.myapplication.lesson9.homework;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        registration();
    }

    static boolean isInputCorrect(String data) {
        String testWord = "[A-Za-z\\d_]{1,20}";
        if (data.matches(testWord)) {
            return true;
        } else {
            return false;
        }
    }

    static void receptionLoginAndPassword(String login, String password, String correctPassword) throws WrongLoginException, WrongPasswordException {
        if (isInputCorrect(login)) {
            System.out.println("Логин принят");
        } else {
            throw new WrongLoginException("Неправильно введён логин");
        }
        if (isInputCorrect(password)) {
            System.out.println("Пароль принят");
        } else {
            throw new WrongPasswordException("Неправильно введён пароль");
        }
        if (correctPassword.equals(password)) {
            System.out.println("Пароли совпадают");
        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    static void registration() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = in.nextLine();

        System.out.println("Введите пароль");
        String password = in.nextLine();

        System.out.println("Повторно введите пароль");

        String confirmPassword = in.nextLine();
        try {
            receptionLoginAndPassword(login, password, confirmPassword);
        } catch (WrongLoginException errorLogin) {
            System.out.println("Неправильный логин");
        } catch (WrongPasswordException errorPassword) {
            System.out.println("Неправильный пароль");
        }
    }
}



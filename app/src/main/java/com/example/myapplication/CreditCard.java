package com.example.myapplication;

import java.util.Scanner;

public class CreditCard {
    int nomerCheta;
    int tekSum;

    public CreditCard(int nomerCheta, int tekSum) {
        this.nomerCheta = nomerCheta;
        this.tekSum = tekSum;
    }

    public int getNomerCheta() {
        return this.nomerCheta;
    }

    public int getTekSum() {
        return this.tekSum;
    }

    public void addMoney(int addMoney) {
        this.tekSum += addMoney;

    }

    public void removeMoney(int removeMoney) {
        this.tekSum -= removeMoney;

    }

    public void status() {
        System.out.println("Номер Аккаунта" + " " + this.getNomerCheta() + "\n" + "Текущая Сумма" + " " + this.getTekSum());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите информацию о кредитных картах: ");
        System.out.println("Введите номер счета и начальную сумму денег на первой карте: ");
        CreditCard firstCard = new CreditCard(in.nextInt(), in.nextInt());
        System.out.println("Введите номер счета и начальную сумму денег со второй карты: ");
        CreditCard secondCard = new CreditCard(in.nextInt(), in.nextInt());
        System.out.println("Введите номер счета и начальную сумму денег третьей карты: ");
        CreditCard thirdCard = new CreditCard(in.nextInt(), in.nextInt());
        System.out.println();
        System.out.println("Информация о картах:");
        firstCard.status();
        secondCard.status();
        thirdCard.status();
        System.out.println();

        System.out.print("Введите сумму денег для добавления на первую карту: ");
        firstCard.addMoney(in.nextInt());
        System.out.print("Введите сумму денег для добавления на вторую карту: ");
        secondCard.addMoney(in.nextInt());
        System.out.print("Введите сумму денег для снятия с третьей карты: ");
        thirdCard.removeMoney(in.nextInt());
        System.out.println();
        firstCard.status();
        secondCard.status();
        thirdCard.status();
    }
}


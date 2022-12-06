package com.example.myapplication.Lesson10.Homework;

import java.util.Locale;

public class ActionsWitTheDocumentNumber {

    public static void introduceTheTwoBlocksOfDigits(String numberDocumentary) {
        System.out.println(numberDocumentary.substring(0, 4) + "" + numberDocumentary.substring(9, 13));

    }

    public static void changingBlocksOfLetters(String numberDocumentary) {
        System.out.println(numberDocumentary.replaceAll("[A-z]{3}", "***"));
    }

    public static void outputOnlyLetters(String numberDocumentary) {
        String topRegistry = numberDocumentary.toUpperCase(Locale.ROOT);
        StringBuilder onlyLetters = new StringBuilder();
        System.out.println(onlyLetters.append((topRegistry.substring(5, 8))).append("/").append(topRegistry.substring(14, 17)).append("/").append(topRegistry.charAt(19)).append("/").append(topRegistry.charAt(21)));
    }

    public static void checkingTheContentOfTheSequence(String numberDokument) {
        if ((numberDokument.toLowerCase(Locale.ROOT).regionMatches(5, "abc", 0, 3)) || numberDokument.toLowerCase(Locale.ROOT).regionMatches(14, "abc", 0, 3)) {
            System.out.println("Номер документа сожержит abc");
        } else {
            System.out.println("Номер документа не содержит abc");
        }
    }

    public static void checkingTheLastNumber(String numberDokument) {
        if (numberDokument.endsWith("1a2b")) {
            System.out.println("Номер документа заканчивается на 1a2b");
        } else {
            System.out.println("Номер документа не заканчивается на 1a2b");
        }
    }


}



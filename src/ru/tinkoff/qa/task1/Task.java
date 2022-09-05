package ru.tinkoff.qa.task1;


import java.util.Scanner;

public class Task {

    /**
     * Дать пользователю ввести букву, есть буква есть в исходном слове, вывести, что молодецэ
     * Иначе, что не молодец
     */
    public static void main(String[] args) {
        String line = "Интуиция";
        Scanner bykovka1 = new Scanner(System.in);
        System.out.println("Введите буковку");
        String byk = bykovka1.next();
        char bykovk = byk.charAt(0);
        char[] bykovki = line.toCharArray();
        boolean isExistLetter = isExistLetter(bykovk, bykovki);
        if (isExistLetter) {
            System.out.println("Маладес");
        } else {
            System.out.println("Не маладес");
        }

    }

    private static boolean isExistLetter(char bykovk, char[] bykovki) {
        boolean isExistLetter = false;
        for (char abc : bykovki) {
            if (bykovk == abc) {
                isExistLetter = true;
            }
        }
        return isExistLetter;
    }
}
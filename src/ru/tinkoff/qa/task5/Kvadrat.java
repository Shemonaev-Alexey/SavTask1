package ru.tinkoff.qa.task5;

import java.util.Scanner;

public class Kvadrat extends Fiigura {
    @Override
    public int getPloshad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата: ");
        int a = scanner.nextInt();
        return a*a;
    }
}

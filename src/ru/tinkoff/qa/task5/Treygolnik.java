package ru.tinkoff.qa.task5;

import java.util.Scanner;

public class Treygolnik extends Fiigura  {
    @Override
    public int getPloshad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны треугольника, затем введите длину его высоты: ");
        int a = scanner.nextInt();
        int h = scanner.nextInt();

        return (a * h) / 2;
    }
}

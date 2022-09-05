package ru.tinkoff.qa.task5;

import java.util.Scanner;

public class Kryg extends Fiigura{
    @Override
    public int getPloshad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double p = 3.14;
        int r = scanner.nextInt();
        return (int) (r*r*p);
    }
}

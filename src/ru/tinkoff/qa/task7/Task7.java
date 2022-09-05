package ru.tinkoff.qa.task7;

public class Task7 {

    /**
     * Написать интерфейс Convertable в котором есть один метод convert
     * Две реализации интерфейса
     * Цельсия в Кельвина
     * Цельсия в Фаренгейт
     * Вывести в консоль преобразование температуры в 25 градусов.
     */
    public static void main(String[] args) {
        int a = 25;
        print(a, new CalvinConventer());
        print(a, new FarengeytConventer());
    }

    public static void print(int a, Convertable convertable) {
        System.out.println(a);
        System.out.println(convertable.convert(a));
}}


package ru.tinkoff.qa.task5;

import java.util.Scanner;

/**
 * Написать программу, которая по типу фигуры и параметрам высчитывает ее площадь
 * Всего три фигуры, треугольник, квадрат и круг
 * Все фигуры являются отдельными классами, у классов есть общий родитель - Фигура
 * На вход программы:
 *  - Тип фигуры, параметры
 * На выход:
 *  - площадь
 * Взять за основу, что треугольник всегда прямоугольным
 * Например:
 * - "Треугольник"
 * - Высота: 4, Основание: 5
 * -Площадь - 10
 */
public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип фигуры." +
                "1-квадрат" +
                "2-треугольник" +
                "3-круг");
        int figura = scanner.nextInt();
        if (figura == 1){
            System.out.println("Площадь фигуры : " + new Kvadrat().getPloshad());
        }else if(figura == 2){
            System.out.println("Площадь фигуры : "+ new Treygolnik().getPloshad());
        }else if(figura == 3){
            System.out.println("Площадь фигуры : "+ new Kryg().getPloshad());
        }
    }

}


package ru.tinkoff.qa.task2;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Task2 {
    /**
     * Есть массив double чисел, пользователь вводит какое то число, нужно определить, есть ли оно в массиве.
     * Если есть - вывести маладец
     * Иначе вывести - не маладец
     *
     * @return
     */
    public static void main(String[] args) {
        double[] array = {12.3, 43.5, 23.5, 21.3};
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число");
        double number1 = number.nextDouble();
        boolean result = isExistarray(array, number1);
        if (result) {
            System.out.println("Маладес");
        } else {
            System.out.println("Не маладес");
        }


    }

    private static boolean isExistarray(double[] array, double number) {
        boolean result = false;
        for (double pyk : array) {
            if (Double.compare(pyk, number) == 0){
                result = true;
            }
        }
        return result;
    }
}

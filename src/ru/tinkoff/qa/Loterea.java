package ru.tinkoff.qa;

import java.util.Scanner;

public class Loterea {
    /**
     * Написать программу которая будет делать латерею
     * Пользователь вводит число от 0 до 100, если оно подходящее, получает сообщение о выигрыше
     * Если нет, получает сообщение о проигрыше
     */
    public static void main(String[] args) {
        int[] winnerNumber = {28, 43, 54, 2};
        Scanner popa = new Scanner(System.in);
        System.out.println("Сколько раз шлёпнуть Лёшу по попи?");
        int popa1 = popa.nextInt();
        boolean lol = isExistWinnerNumber(winnerNumber, popa1);
        if (lol) {
            System.out.println("Маладес");

        } else {
            System.out.println("фу");
        }

    }

    private static boolean isExistWinnerNumber(int[] winnerNumber, int popa) {
        boolean lol = false;
        for (int popa2 : winnerNumber) {
            if (popa == popa2) {
                lol = true;
            }
        }
        return lol;
    }

}

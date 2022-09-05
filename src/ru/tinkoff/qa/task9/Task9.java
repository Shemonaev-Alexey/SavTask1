package ru.tinkoff.qa.task9;

import java.io.FileReader;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("C:\\Users\\Sb05\\" +
                "IdeaProjects\\SavTask1\\src\\ru\\tinkoff\\qa\\task9\\input.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException exception) {
            System.out.println("Ошибка при чтении файла");
        }
        String[] simvol = sb.toString().split("");
        int count = 0;
        for (int i = 0; i <= simvol.length - 5; i++) {
            String newLine = getNextLine(simvol, i);
            if (newLine.equals(">>-->") || newLine.equals("<--<<")) {
                count++;
            }
        }
        System.out.println(count);

    }

    private static String getNextLine(String[] simvol, int i) {
        return simvol[i] + simvol[i + 1] + simvol[i + 2] + simvol[i + 3] + simvol[i + 4];
    }
}
package ru.tinkoff.qa.task8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("src/ru/tinkoff/qa/task8/popa.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(sb);
        String[] ssa = sb.toString().split("\\.");
        int r1 = Integer.parseInt(ssa[0]);
        int r2 = Integer.parseInt(ssa[1]);
        int r3 = Integer.parseInt(ssa[2]);
        String yn = "";
        if (r1 >= r2 + r3) {
            yn = "Yes";
        } else {
            yn = "No";
        }
        try (FileWriter writer = new FileWriter("lesha.txt", false)) {
            // запись всей строки
            writer.write(yn);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}


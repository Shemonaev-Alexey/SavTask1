package ru.tinkoff.qa.task3;

import java.util.*;

/**
 * Сгенерировать три случайный числа и найти самое большее из них
 */
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> generated = new HashSet<>();
        while(generated.size()<3) {
            generated.add(random.nextInt());
        }
        List<Integer> sortedList = new ArrayList<>(generated);
        Collections.sort(sortedList);
        System.out.println(sortedList.get(2));
        System.out.println(sortedList);
    }


}

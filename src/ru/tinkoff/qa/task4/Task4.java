package ru.tinkoff.qa.task4;

/**
 * Вывести самое максимальное по количеству символов слово из массива слов
 * [Молоко, огурец, яхта, апельсин, попа, машина]
 */
public class Task4 {
    public static void main(String[] args){
        String[] slova = {"Молоко", "огурец", "яхта", "апельсин", "попа", "машина"};
        int max = 0;
        for (String popa:slova) {
            if (popa.length()>max){
                max = popa.length();
            }
        }
        System.out.println(max);
    }
}

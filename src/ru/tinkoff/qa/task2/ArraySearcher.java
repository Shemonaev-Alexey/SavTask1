package ru.tinkoff.qa.task2;

public class ArraySearcher {
    private int[] array;

    ArraySearcher(int[] array) {
        this.array = array;
    }
    public ArrayData getArrayData(){
                int min = array[0];
        int max = array[array.length - 1];
        int sum = getSum(array);
        int average = sum / array.length;
        return new ArrayData(max, min,average);
    }
    private int getSum(int[] array) {
        int sum = 0;
        for (int popa : array) {
            sum += popa;
        }
        return sum;
    }
}

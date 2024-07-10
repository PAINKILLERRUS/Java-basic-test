package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrClass {

    public int[] extractedNewArray(int[] array) {
        int requiredNumber = 1;
        int last = IntStream.range(0, array.length)
                .filter(i -> array[i] == requiredNumber)
                .max().getAsInt();

        int[] resultArray = IntStream.range(last, array.length)
                .skip(1)
                .map(i -> array[i])
                .toArray();
        System.out.println(Arrays.toString(resultArray));
        for (int a : array) {
            if (a == requiredNumber) {
                return resultArray;
            } else {
                throw new RuntimeException("Массив не содержит 1 ");
            }
        }
        return resultArray;
    }

    public boolean checkedArray(int[] array) {
        boolean value1 = IntStream.of(array)
                .anyMatch(x -> x == 1);
        boolean value2 = IntStream.of(array)
                .anyMatch(x -> x == 2);
        boolean value3 = IntStream.of(array)
                .anyMatch(x -> x != 1 && x != 2);

        if (value3) {
            return false;
        } else return value1 && value2;
    }
}
package org.ritheshgopal.streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class SumAndAverageOfNumbers {

    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};


        int sum = IntStream.of(a).sum();
        OptionalDouble avg = IntStream.of(a).average();

        System.out.println("Sum "+sum);
        avg.ifPresent(d -> System.out.println("Avg "+d));
    }
}

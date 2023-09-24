package org.ritheshgopal.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfDigits {

    public static void main(String[] args) {
        int i = 15623;

        int j= Stream.of(String.valueOf(i).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(j);
    }
}

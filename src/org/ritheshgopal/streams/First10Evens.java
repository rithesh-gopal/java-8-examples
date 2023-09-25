package org.ritheshgopal.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class First10Evens {
    public static void main(String[] args) {
        int[] evens = IntStream.rangeClosed(1, 10)
                .map(i -> i*2)
                .toArray();
        System.out.println(Arrays.toString(evens));
    }
}

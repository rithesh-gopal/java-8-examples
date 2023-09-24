package org.ritheshgopal.streams;

import java.util.List;

public class MultiplesOf {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> multiplesOf5 = listOfIntegers.stream()
                .filter(n -> n % 5==0)
                .toList();

        System.out.println("Multiples of 5");
        System.out.println(multiplesOf5);
    }
}

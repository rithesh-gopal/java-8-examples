package org.ritheshgopal.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(45, 12, 56, 15, 24, 75, 31, 89);

        Optional<Integer> secondLargest = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        secondLargest.ifPresent(n -> System.out.println("Second largest "+n));
    }
}

package org.ritheshgopal.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MinMaxOfList {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(45, 12, 56, 15, 24, 75, 31, 89);

        Optional<Integer> min = listOfIntegers.stream()
                .min(Comparator.naturalOrder());
        Optional<Integer> max = listOfIntegers.stream()
                .max(Comparator.naturalOrder());

        min.ifPresent(num -> System.out.println("Min: "+num));
        max.ifPresent(num -> System.out.println("Max: "+num));



    }
}

package org.ritheshgopal.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExtractDuplicates {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = List.of(111, 222, 333, 111, 555, 333, 777, 222);

        List<Integer> duplicates = listOfIntegers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicates "+duplicates);


    }
}

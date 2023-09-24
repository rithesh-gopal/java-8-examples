package org.ritheshgopal.streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        // Collect into LinkedHashMap so that the order is retained
        LinkedHashMap<Character, Long> counts = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println("Frequency");
        System.out.println(counts);
    }
}

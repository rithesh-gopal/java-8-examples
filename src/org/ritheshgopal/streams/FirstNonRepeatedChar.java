package org.ritheshgopal.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        LinkedHashMap<String, Long> counts = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        Optional<String> firstNonRepeated = counts.entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .findFirst()
                .map(Map.Entry::getKey);
        firstNonRepeated.ifPresent(s -> System.out.println("First non repeated "+ s));
    }
}

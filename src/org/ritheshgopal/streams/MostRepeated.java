package org.ritheshgopal.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeated {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Optional<Map.Entry<String, Long>> entry = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        entry.ifPresent(e -> {
            System.out.println("Most repeated: "+e.getKey());
            System.out.println("Count "+e.getValue());
        });

    }
}

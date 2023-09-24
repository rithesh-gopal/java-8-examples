package org.ritheshgopal.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElementFrequency {

    public static void main(String[] args) {
        List<String> stationeryList = List.of("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> counts = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Element Frequency");
        System.out.println(counts);
    }
}

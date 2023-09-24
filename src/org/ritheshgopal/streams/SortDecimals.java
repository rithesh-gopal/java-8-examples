package org.ritheshgopal.streams;

import java.util.Comparator;
import java.util.List;

public class SortDecimals {

    public static void main(String[] args) {
        List<Double> decimalList = List.of(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> sorted = decimalList.stream()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted list");
        System.out.println(sorted);
    }
}

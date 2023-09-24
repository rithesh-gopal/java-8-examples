package org.ritheshgopal.streams;

import java.util.Comparator;
import java.util.List;

public class MinMaxs {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> min3 = listOfIntegers.stream()
                .sorted(Comparator.naturalOrder()).limit(3).toList();
        List<Integer> max3 = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder()).limit(3).toList();

        System.out.println("Min3 "+min3);
        System.out.println("Max3 "+max3);
    }
}

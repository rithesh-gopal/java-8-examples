package org.ritheshgopal.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SegregateOddAndEven {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // Get a map of counts. Key = true for evens, value the count of the same
        Map<Boolean, List<Integer>> oddEvenMap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n%2==0));

        List<Integer> evens = oddEvenMap.get(true);
        List<Integer> odds = oddEvenMap.get(false);

        System.out.println("Even numbers:");
        System.out.println(evens);
        System.out.println("Odd numbers:");
        System.out.println(odds);
    }
}

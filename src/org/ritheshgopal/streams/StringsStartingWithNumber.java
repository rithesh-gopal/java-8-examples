package org.ritheshgopal.streams;

import java.util.List;

public class StringsStartingWithNumber {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("One", "2wo", "3hree", "Four", "5ive", "Six", "");


        List<String> startsWithNum = listOfStrings.stream()
                .filter(s -> null!= s && !s.isEmpty() && Character.isDigit(s.charAt(0)))
                .toList();
        System.out.println("Starting with num "+startsWithNum);
    }
}

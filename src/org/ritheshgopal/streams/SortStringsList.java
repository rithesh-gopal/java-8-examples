package org.ritheshgopal.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortStringsList {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> sorted = listOfStrings.stream()
                .sorted(Comparator.comparing(String::length)).toList();

        System.out.println(sorted);
    }
}

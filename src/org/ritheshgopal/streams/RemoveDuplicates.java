package org.ritheshgopal.streams;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueStrings = listOfStrings.stream().distinct().toList();
        System.out.println("Unique Strings");
        System.out.println(uniqueStrings);
    }
}

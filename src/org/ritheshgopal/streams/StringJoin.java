package org.ritheshgopal.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringJoin {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = listOfStrings.stream()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println("Joined String");
        System.out.println(joinedString);
    }
}

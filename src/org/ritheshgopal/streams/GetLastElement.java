package org.ritheshgopal.streams;

import java.util.List;
import java.util.Optional;

public class GetLastElement {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("One", "Two", "Three", "Four", "Five", "Six");

        Optional<String> last = listOfStrings.stream()
                .skip(listOfStrings.size()-1)
                .findFirst();

        last.ifPresent(s -> System.out.println("Last element "+s));
    }
}

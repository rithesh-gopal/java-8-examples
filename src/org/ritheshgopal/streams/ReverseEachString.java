package org.ritheshgopal.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachString {

    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String reversed = Arrays.stream(str.split(" "))
                .map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversed);

    }

}

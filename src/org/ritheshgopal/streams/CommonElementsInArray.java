package org.ritheshgopal.streams;

import java.util.List;

public class CommonElementsInArray {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = List.of(12, 56, 17, 21, 94, 34);

        List<Integer> common = list1.stream().filter(list2::contains).toList();

        System.out.println("Common Elements");
        System.out.println(common);
    }
}

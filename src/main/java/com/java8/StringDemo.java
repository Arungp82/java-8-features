package com.module1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        String s = "{[](){[()][}}";
        String s1 = "[{}()[]{[(){[}]}]";

        Map<String, Long> countOfEachCharacter = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> countOfEachCharacter1 = Arrays.stream(s1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println("countOfEachCharacter -> " + countOfEachCharacter);
        System.out.println("countOfEachCharacter1 -> " + countOfEachCharacter1);


    }
}

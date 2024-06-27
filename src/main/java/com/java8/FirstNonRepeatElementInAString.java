package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElementInAString {
    public static void main(String[] args) {
        String input="ilovejavaprogramming";
        // expected output is 'l'

        String firstNonRepeatCharacter=Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()==1)
                .findFirst()
                .get().getKey();
        System.out.println("First non-repeat character :: "+firstNonRepeatCharacter);
    }
}

package com.module1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class CharacterCountInAStringAndSortBasedOnValues {
    public static void main(String[] args) {
        //String str = "charactercountinastringandsortbasedonvalues";
        String str = "computerrr";

        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().sorted(Map.Entry.comparingByValue())
                        .forEach(System.out::println);

    }
}

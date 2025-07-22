package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,2,3,3,6,6);

        System.out.println("Distinct integers");
        integerList.stream().collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Duplicate integers" );
        integerList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        //System.out.println(integerLongMap);
                .entrySet().stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                //.toList();
                .forEach(System.out::println);



    }
}

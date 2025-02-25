package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsFromArray {
    public static void main(String[] args){

        List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5,6,7,6,3,21,1,4,6,7);
        List<Integer> duplicateIntegers = listOfIntegers.stream()
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()>1)
                        .map(Map.Entry::getKey)
                                .toList();
        System.out.println("Duplicate integers list using Set : "+duplicateIntegers);
    }
}

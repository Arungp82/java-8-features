package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {
    public static void main(String[] args) {
        int[] intArray={5,9,11,2,8,21,1};

        List<String> numbersStartingWithOne=Arrays.stream(intArray)
                .boxed()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .toList();

        System.out.println("Numbers starting with 1 :: "+numbersStartingWithOne);
    }
}

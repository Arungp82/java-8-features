package com.module1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/*
    The Collectors.teeing() method is useful when we want to simultaneously process a stream in two different ways
    and then combine their results.
 */
public class TeeingDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 34, 21, 324, 562, 4134, 123, 34123);

        String result = integerList.stream().collect(Collectors.teeing(minBy(Integer::compareTo), maxBy(Integer::compareTo), (min, max) -> "Minimum:::::" + min.get() + "Maximum::::::" + max.get()));
        System.out.println("Result is ::::::" + result);
    }
}

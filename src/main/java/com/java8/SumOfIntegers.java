package com.module1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,1000000).boxed().toList();

        long startTime = System.currentTimeMillis();
        Long sumResult = Long.valueOf(integerList.stream().reduce(0,Integer::sum));
        long endTime = System.currentTimeMillis();

        System.out.println("sum result is :: "+sumResult);
        System.out.println("Time taken for execution -> "+ (endTime-startTime));
    }
}

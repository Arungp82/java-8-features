package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2,4,43,6,7,54,768,879,54,34);
        Integer secondHighestNumber = intList.stream().sorted().skip(intList.size()-2).findFirst().get();

        Integer highestNumber = intList.stream().sorted().skip(intList.size()-1).findFirst().get();
        System.out.println("Second Highest number :: "+secondHighestNumber);
        System.out.println("Highest number :: "+highestNumber);
    }
}

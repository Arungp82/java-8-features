package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByStringLength {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ads","wtwr","fas","bvsxc","etryer","yyyyyy");

        Map<Integer,List<String>> groupByStringLength = stringList.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(groupByStringLength);
    }
}

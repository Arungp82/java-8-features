package com.module1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingIntDemo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        IntSummaryStatistics stats=numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Statistical data :: "+ stats.getCount());
    }
}

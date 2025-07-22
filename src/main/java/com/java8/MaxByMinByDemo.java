package com.module1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByMinByDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 55, 43, 22);
        Optional<Integer> maxNos = integerList.stream().max(Comparator.comparing(Integer::intValue));
        Optional<Integer> minNos = integerList.stream().min(Comparator.comparing(Integer::intValue));
        System.out.println("Max no.-> "+maxNos.get());
        System.out.println("Min no. -> "+minNos.get());
    }
}

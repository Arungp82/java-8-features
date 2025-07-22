package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toMap;

public class HelloWorld {
    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(42,4,3,5,55,100);

        List<Integer> evenNumbers = numList.stream().filter(s->s%2==0).toList();
        Optional<Integer> maxNos = numList.stream().collect(maxBy(Integer::compareTo));
        System.out.println("even nos :: "+ evenNumbers);
        System.out.println("Max nos :: "+maxNos.get());


    }
}

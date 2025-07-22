package com.module1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuilderDemo {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.<Integer>builder().add(4).add(66).add(77).build();
        System.out.println(integerStream.collect(Collectors.toList()));
    }
}

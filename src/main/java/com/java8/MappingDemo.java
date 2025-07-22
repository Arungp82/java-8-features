package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingDemo {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengths=words.stream().collect(Collectors.mapping(String::length,Collectors.toList()));
        //Can be written like below
        List<Integer> lengths1= words.stream().map(String::length).toList();
        System.out.println(lengths);
        System.out.println(lengths1);
    }
}

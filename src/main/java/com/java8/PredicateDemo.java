package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateDemo {
public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    List<Integer> evenNumbers = intList.stream().filter(t->t%2==0).collect(Collectors.toList());
    System.out.println("Even numbers are :: "+evenNumbers);
}
     
}
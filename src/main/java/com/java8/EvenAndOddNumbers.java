package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenAndOddNumbers {
    public static void main(String[] args){
        List<Integer> inputArrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Even numbers are");
        inputArrList.stream().filter(i->i%2==0).forEach(System.out::println);

        System.out.println("Odd numbers are");
        inputArrList.stream().filter(i->i%2!=0).forEach(System.out::println);
    }
}

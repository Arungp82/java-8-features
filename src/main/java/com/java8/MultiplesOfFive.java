package com.module1;

import java.util.stream.IntStream;

public class MultiplesOfFive {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .filter(x->x%5==0)
                .forEach(System.out::println);
    }
}

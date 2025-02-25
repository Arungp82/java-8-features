package com.java8;

import java.util.stream.IntStream;

public class SumExample {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<=100){
            sum=sum+i;
            sum = i+sum;
            i+=1;
        }
        System.out.println(sum);

        Long sumResult = (long) IntStream.rangeClosed(0,100).sum();
        System.out.println("Sum result is :: "+sumResult);
    }
}

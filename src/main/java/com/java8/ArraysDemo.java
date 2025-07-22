package com.module1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysDemo {
    public static void main(String[] args){

        int arr_sample1[] = { 11, 2, 3, 42, 5, 6, 17, 8, 9,
                10, 11, 12, 13, 24, 55, 16, 47, 18, 19, 20 };

        System.out.println("Average of numbers");
        System.out.println(Arrays.stream(arr_sample1).average().getAsDouble());

        System.out.println("Sum of numbers");
        System.out.println(Arrays.stream(arr_sample1).sum());

        // findAny()
        // It can return any value from the stream
        // Most of the time it returns the first value
        // but it is not assured it can return any value
        System.out.println("Example of findAny() : ");
        System.out.println(Arrays.stream(arr_sample1)
                .findAny().getAsInt());

        // findFirst()
        // It returns the first element of the stream
        System.out.println("Example of findFirst() :");
        System.out.println(Arrays.stream(arr_sample1)
                .findFirst().getAsInt());

        // max()
        // It returns the max element in an array
        System.out.println("Example of max() :");
        System.out.println(Arrays.stream(arr_sample1)
                .max().getAsInt());

        // second max()
        // It returns the second max element in an array
        System.out.println("Example of second max() :");
        System.out.println(Arrays.stream(arr_sample1)
                .sorted().skip(arr_sample1.length-2).findFirst().getAsInt());

        // min()
        // It returns the min element in an array
        System.out.println("Example of min() :");
        System.out.println(Arrays.stream(arr_sample1)
                .min().getAsInt());

        // reduce()
        // It reduces the array by certain operation
        // Here it performs addition of array elements
        System.out.println("Example of reduce() :");
        System.out.println(Arrays.stream(arr_sample1)
                .reduce((x, y)->x + y).getAsInt());

        System.out.println("Even nos.");
        Arrays.stream(arr_sample1).filter(a->a%2==0).forEach(System.out::println);

        System.out.println("Odd nos.");
        Arrays.stream(arr_sample1).filter(a->a%2!=0).forEach(System.out::println);

        System.out.println("Sort numbers");
        Arrays.stream(arr_sample1).sorted().forEach(System.out::println);

        System.out.println("Sort numbers");
        Arrays.stream(arr_sample1).sorted().skip(arr_sample1.length-2);

    }
}

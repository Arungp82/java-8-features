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

        Integer sums1= inputArrList.stream().reduce(0, Integer::sum);
        Integer sums2 = inputArrList.stream().reduce(0,(a,b)->a+b);
        //Integer sums3 = inputArrList.stream().reduce(0,ArithmeticUtils::add); Another way. This library may be available in latest version of java
        Integer sums4 = inputArrList.stream().collect(Collectors.summingInt(Integer::intValue));
        int sums5 = inputArrList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the integers in the list Method reference : "+sums1);
        System.out.println("Sum of the integers in the list reduce method : "+sums2);
        System.out.println("Sum of the integers in the list collect method : "+sums4);
        System.out.println("Sum of the integers in the list maptoInt method : "+sums5);


        System.out.println("Odd numbers are");
        inputArrList.stream().filter(i->i%2!=0).forEach(System.out::println);
    }
}

package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumExample {
    public static void main(String[] args) {
        List<Integer> inputArrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
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

        Integer sums1= inputArrList.stream().reduce(0, Integer::sum);
        Integer sums2 = inputArrList.stream().reduce(0,(a,b)->a+b);
        //Integer sums3 = inputArrList.stream().reduce(0,ArithmeticUtils::add); Another way. This library may be available in latest version of java
        Integer sums4 = inputArrList.stream().collect(Collectors.summingInt(Integer::intValue));
        int sums5 = inputArrList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the integers in the list Method reference : "+sums1);
        System.out.println("Sum of the integers in the list reduce method : "+sums2);
        System.out.println("Sum of the integers in the list collect method : "+sums4);
        System.out.println("Sum of the integers in the list maptoInt method : "+sums5);
    }
}

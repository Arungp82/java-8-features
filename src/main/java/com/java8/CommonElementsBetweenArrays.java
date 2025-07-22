package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsBetweenArrays {
    public static void main(String[] args) {
//Print out the common elements between 2 arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        Set<Integer> set1= Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        List<Integer> intList=Arrays.stream(arr2).boxed().toList();

        List<Integer> matchingList=  Arrays.stream(arr1).filter(intList::contains).boxed().collect(Collectors.toList());

        System.out.println(matchingList);
    }
}

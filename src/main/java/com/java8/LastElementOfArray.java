package com.java8;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class LastElementOfArray {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("one","two","three","four","five");
        String lastElement = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
        System.out.println("Last element is : "+lastElement);
    }
}

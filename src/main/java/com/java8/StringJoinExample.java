package com.java8;

import java.util.Arrays;
import java.util.List;

public class StringJoinExample {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("1","2","3","4");

        String newString = String.join("-",stringList);

        System.out.println("New string is :: "+newString);
    }
}

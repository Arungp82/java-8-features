package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningDemo {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","banana","cherry");

        String result=words.stream().collect(Collectors.joining(", ","[ "," ]"));
        System.out.println(result);
    }
}

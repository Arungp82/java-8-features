package com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args){
        String s = "Javaprogrammingisgreat";
        Map<Character,Long> characterCount = s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Each character count is : "+ characterCount);
    }
}

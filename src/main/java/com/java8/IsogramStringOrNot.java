package com.module1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IsogramStringOrNot {
    public static void main(String[] args) {
        String s = "codedecode";
        String s1 = "machine";

        boolean isIsogram = isIsogram(s1);
        if(isIsogram)
            System.out.println("The string is isogram");
        else
            System.out.println("The string is not an isogram");
    }

    static boolean isIsogram(String input) {

        Map<String, Long> cMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(cMap);
        Long n = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).count();

        if (n > 0)
            return false;
        else return true;
    }
}

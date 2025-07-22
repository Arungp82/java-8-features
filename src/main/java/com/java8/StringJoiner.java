package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoiner {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("qw","aaa","ddf","weww");
        java.util.StringJoiner sjoin = new java.util.StringJoiner(" - ");
        for(String s:stringList){
            sjoin.add(s);
        }
        System.out.println(sjoin);

        String collected = stringList.stream().collect(Collectors.joining(" * "));
        System.out.println("collected------>"+collected);
    }
}

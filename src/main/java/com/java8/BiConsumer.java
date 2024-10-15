package com.java8;

import java.util.HashMap;
import java.util.Map;

public class BiConsumer implements java.util.function.BiConsumer<String,Integer> {
    @Override
    public void accept(String i1, Integer i2) {
        System.out.println("Traditional approach");
        System.out.println("input1: "+i1+" input2 : "+i2);
    }

    public static void main(String[] args) {

        BiConsumer biConsumer1 = new BiConsumer();

        biConsumer1.accept("wer",1111);

        java.util.function.BiConsumer<String,Integer> biConsumer2 = new java.util.function.BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("String input :: "+s+ "  Integer input :: "+integer);
            }
        };
        System.out.println("Anonymous approach");
        biConsumer2.accept("secondinput",1000);

        System.out.println("Lambda approach");

        java.util.function.BiConsumer<String,Integer> biConsumer3=(s1,i1)->System.out.println("String input :: "+s1+" Int input :: "+i1);
        biConsumer3.accept("Lambda approach",2020202020);

        Map<String,Integer> testMap=new HashMap<>();
        testMap.put("qwerr",2000);
        testMap.put("asd",200);
        testMap.put("czxcv",3000);
        testMap.put("hgsdf",7000);
        testMap.put("kjkfghj",100);

        testMap.forEach(biConsumer2);
    }
}

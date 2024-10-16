package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> strngList = Arrays.asList("adsf"," vbncbv","etyhst","ryturty","ncbcnbv");

        strngList.stream().forEach(t->System.out.println(t)); // otherwise we can use method reference strngList.stream().forEach(System.out::println);
        System.out.println("=============================================================");
        Map<Integer,String> integerStringMap = new HashMap<>();

        integerStringMap.put(1,"sfdgd");
        integerStringMap.put(2,"adfcxva");
        integerStringMap.put(3,"wtreywret");
        integerStringMap.put(4,"vbxvfbsdf");
        integerStringMap.put(5,"xvhnd");
        integerStringMap.put(6,"czvzcv");
        integerStringMap.put(7,"mcvbnmcvb");
        integerStringMap.put(8,"werqqrq");

        integerStringMap.forEach((key, value)->System.out.println(key +" : "+value));//or we can use method reference integerStringMap.forEach(System.out::println);

    }
}

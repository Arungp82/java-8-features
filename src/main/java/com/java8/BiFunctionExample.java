package com.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>,List<Integer>> {
    @Override
    public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
        return Stream.of(l1,l2)
        .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        BiFunctionExample example = new BiFunctionExample();
        List<Integer> l1=Stream.of(1,2,234,22,3,213,1,234,213,2342).collect(Collectors.toList());
        List<Integer> l2=Stream.of(1,2,234,22,3,213,1,34).collect(Collectors.toList());

        System.out.println("Traditional approach :: "+example.apply(l1,l2));

        BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
                return Stream.of(integers,integers2)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());
            }
        };

        System.out.println("Anonymous approach :: "+ biFunction1.apply(l1,l2));

        BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction2= (l11,l12)-> {
            return Stream.of(l11,l12)
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());
        };

        System.out.println("Lambda approach biFunction2 :: "+ biFunction2.apply(l1,l2));

        Map<String,Integer> testMap=new HashMap<>();
        testMap.put("qwerr",2000);
        testMap.put("asd",200);
        testMap.put("czxcv",3000);
        testMap.put("hgsdf",7000);
        testMap.put("kjkfghj",100);

        BiFunction<String,Integer,Integer> b1= new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer integer) {
                return integer=integer+100;
            }
        };

        testMap.replaceAll(b1);
        System.out.println("Map using BiFunction b1:: "+testMap);

        //Can also be coded as
        //BiFunction<String,Integer,Integer> sortedBiFunction= (key,value)->value+1000;


         testMap.replaceAll((key,value)->value+200);

         System.out.println("Lambda approach ::"+testMap);

        Function<List<Integer>,List<Integer>> sortedFunction = (lists)->lists.stream().sorted().collect(Collectors.toList());

System.out.println("Sorted results sortedFunction :: "+biFunction2.andThen(sortedFunction).apply(l1,l2));


    }
}

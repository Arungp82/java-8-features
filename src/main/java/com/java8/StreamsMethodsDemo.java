package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMethodsDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("besant",null,"marina","elliot","nilaankarai","goa","cochin","orissa",null);
        //ofNullable
        List<String> namesResults = names.stream().flatMap(Stream::ofNullable)
                .toList();

        System.out.println(namesResults);
        System.out.println("----------------------------" );

        Stream.iterate(0,n->n+2).limit(5).forEach(System.out::println);
        System.out.println("----------------------------" );


     /*   List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Alice","A",3564l),
                new Employee(2,"in","B",67465l),
                new Employee(3,"wonder","C",7467456l),
                new Employee(4,"land","A",875787l),
                new Employee(5,"name","C",243524l));

 Long empResult = employeeList.stream()
        .mapToDouble(Employee::getSalary)
        .boxed()
        .collect(Collectors.collectingAndThen(Collectors.averagingDouble(Double::doubleValue),avg->Math(avg)));
System.out.println("Result is :::::   "+ empResult);*/

List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,8,777,7643,234);
List<Integer> numResult1 = integerList.stream().takeWhile(n->n<5)
        .toList();

List<Integer> numResult2 = integerList.stream().dropWhile(n->n<5)
                .toList();


System.out.println("numResult1  "+numResult1);

        System.out.println("numResult2  "+numResult2);

        Map<String,Integer> minMaxMap = integerList.stream().collect(Collectors.teeing(
                Collectors.maxBy(Integer::compareTo),
                Collectors.minBy(Integer::compareTo)
                ,(e1,e2)->Map.of("Max",e1.get(),
                        "Min",e2.get())
        ));
        System.out.println("MinMaxMap is -> "+minMaxMap);
    }
}

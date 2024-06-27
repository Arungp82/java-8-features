package com.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import com.java8.Employee;
public class SortAMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("one",1);
        myMap.put("eight",8);
        myMap.put("ninety nine",99);
        myMap.put("hundred",100);
        myMap.put("ten",10);
        myMap.put("two",2);
    //Comparing by key
       // myMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        //Comparing by value
        //myMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


//Comparing by value reversed
        //myMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Employee,Integer> myObjectMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //ascending order of salary
                return (int) (o1.getSalary()- o2.getSalary());
                //descending order of salary
                //return (int) (o2.getSalary()- o1.getSalary());
            }
        });
        myObjectMap.put(new Employee(1,"qwreqwe","erq",23145L),1);
        myObjectMap.put(new Employee(1432,"itur","rtye",5768L),8);
        myObjectMap.put(new Employee(355,"dfgh","trfgdh",587567L),99);
        myObjectMap.put(new Employee(674,"gjhkh","gjhk",4657L),100);
        myObjectMap.put(new Employee(346,"wertwer","wret",2134L),10);
        myObjectMap.put(new Employee(8578,"pyui","cncvb",23145L),2);
//ascending order of dept
        myObjectMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept) )).forEach(System.out::println);
//descending order of dept
        myObjectMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed() )).forEach(System.out::println);
    }
}

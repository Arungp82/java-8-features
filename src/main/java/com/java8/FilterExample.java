package com.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {

        /*List<Employee> employeeList = EmployeeDatabase.getEmployees();

        List<Employee> taxableEmployeesList = employeeList.stream().filter(emp -> emp.getSalary() > 1000000L).collect(Collectors.toList());

        System.out.println("taxableEmployeesList :: "+taxableEmployeesList);
        System.out.println("==================================");
        List<Employee> nontaxableEmployeesList = employeeList.stream().filter(emp -> emp.getSalary() < 1000000L).collect(Collectors.toList());

        System.out.println("nontaxableEmployeesList  :: "+nontaxableEmployeesList);*/

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

        //integerStringMap.forEach((key, value)->System.out.println(key +" : "+value));//or we can use method reference integerStringMap.forEach(System.out::println);

        //another way

        integerStringMap.entrySet().stream().filter(q->q.getKey()%2==0).forEach(obj->System.out.println(obj));// to print only even key numbers from map


    }
}

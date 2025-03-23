package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalcAvgSalAndRoundNearInt {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"George","CSC",65000L),
                new Employee(2,"Singh","IT",80000L),
                new Employee(3,"Kumar","ECE",70000L),
                new Employee(4,"Ram","Mech",50000L),
                new Employee(5,"Suresh","Civil",45000L),
                new Employee(6,"Ramesh","VLSI",90000L)
        );

        // To Calculate average salary and round up to nearest Integer

        Long employeeResult = employeeList
                .stream()
                .mapToLong(Employee::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.averagingLong(Long::longValue),
                        Math::round));
System.out.println(employeeResult);
    }

}

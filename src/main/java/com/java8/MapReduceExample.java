package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<String> words = Arrays.asList("JavaProgramming","Pythonprogramming","NodeProgramming");

        int sum=0;
        for(int i : integerList){
            sum+=i;
        }
        System.out.println("Sum of nos. :: "+sum);

        int sumUsingMapFunction = integerList.stream().mapToInt(i -> i).sum();

        System.out.println("Sum using map function :: "+sumUsingMapFunction);

        //using reduce method

        Integer sumUsingReduceMethod = integerList.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Sum using reduce method :: "+sumUsingReduceMethod);

        //Using method reference

        Optional<Integer> sumUsingMethodReference = integerList.stream().reduce(Integer::sum);

        System.out.println("Sum using method reference :: "+sumUsingMethodReference.get());

        //multiply nos.
        Integer multiplyUsingMethodReference = integerList.stream().reduce(1,(a,b)->a*b);

        System.out.println("Sum using method reference :: "+multiplyUsingMethodReference);

        //max value

        Optional<Integer> maxValueUsingReduceMethod = integerList.stream().reduce((a, b) -> a > b ? a : b);

        System.out.println("Max value :: "+maxValueUsingReduceMethod.get());

        //max value with method reference
        Optional<Integer> maxValueUsingMethodReference = integerList.stream().reduce(Integer::max);

        System.out.println("Max value using method reference :: "+maxValueUsingMethodReference.get());

        //longest string

        Optional<String> longestWordUsingReduceMethod = words.stream().reduce((a, b) -> a.length() > b.length() ? a : b);

        System.out.println("Longest word using reduce method :: "+longestWordUsingReduceMethod.get());

        //Highest salary of employee of Electricals department

        double averageSalary = EmployeeDatabase.getEmployees().stream().filter(employee -> employee.getDept().equalsIgnoreCase("Electricals"))
                .map(employee -> employee.getSalary())
                .mapToLong(i -> i)
                .average().getAsDouble();

        System.out.println("Average salary of employees of Electricals department :: "+averageSalary);

        // Sum of salary of employees of Civil department
        double sumSalary = EmployeeDatabase.getEmployees().stream().filter(employee -> employee.getDept().equalsIgnoreCase("Civil"))
                .map(employee -> employee.getSalary())
                .mapToLong(i -> i)
                .sum();

        System.out.println("Sum of  salary of employees of Civil department :: "+sumSalary);


    }
}

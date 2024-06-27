package com.java8;

import java.util.*;
import com.java8.Employee;

public class SortListDemo {


    Employee e;
    public static void main(String[] args) {
//        List<Integer> intList=Arrays.asList(345,563,76,345,8576,32452,6,324,2,8,4444,85678);
//
//        //Natural sorting i.e Ascending order
//        Collections.sort(intList);
//        System.out.print(intList);
//        System.out.print("--------------------------------------------------------");
//
//        //Descending order
//        Collections.reverse(intList);
//        System.out.print(intList);
//        System.out.print("--------------------------------------------------------");
//        //Using streams and ascending order
//        intList.stream().sorted().forEach(System.out::println);
//        System.out.print("--------------------------------------------------------");
//        //Using streams and descending order
//        intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        System.out.print("--------------------------------------------------------");


        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        //Sort employees in ascending order of their salary
        //Traditional way
        Collections.sort(employeeList, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) ((Long) o1.getSalary()-o2.getSalary());
            }
        });
  //      Collections.sort(employeeList,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
//System.out.println(employeeList);
        //employeeList.stream().forEach(System.out::println);

        //Using stream API
        //employeeList.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);

        //another way
        //employeeList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);

        //With method reference
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }




}

//class MyComparator<Employee> implements Comparator<Employee>{
//
////    @Override
////    public int compare(Employee o1, Employee o2) {
////        return (int) (o1.getSalary()-o2.getSalary());
////    }
//}

package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {
    public static List<Employee> getEmployees(){
        List<Employee> employeeList = Arrays.asList(
                new Employee(21,"qrqwfa","IT", 63456L),
                new Employee(1,"zafgs","CSC", 12323L),
                new Employee(43,"afdsa","Mechanical", 4563L),
                new Employee(653,"uryytyu","Electronics", 52345L),
                new Employee(8745,"cnvbc","Electricals", 76435637L),
                new Employee(876,"oyuiot","Civil", 34567897L),
                new Employee(345,"wertwre","Architecture", 3245344L)
        );
        return employeeList;
    }

    public static List<Employee> getManyEmployees() {

        List<Employee> manyEmployeesList = new ArrayList<>();
        for (int i = 1; i < 10000000; i++) {
            manyEmployeesList.add(
                    new Employee(i,"A"+i,"Department",Long.valueOf(new Random().nextLong(1000*100))));
        }
        return manyEmployeesList;

    }
}

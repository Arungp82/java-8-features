package com.java8;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        int start = 0;
        int end = 0;

       /* start= (int) System.currentTimeMillis();
        IntStream.rangeClosed(1,1000).forEach(System.out::println);
        end=(int) System.currentTimeMillis();
        System.out.println("Time :: " + (end-start));

        System.out.println("=====================================================================================");

        start= (int) System.currentTimeMillis();
        IntStream.rangeClosed(1,1000).parallel().forEach(System.out::println);
        end=(int) System.currentTimeMillis();
        System.out.println("Time :: " + (end-start));*/

        /*IntStream.rangeClosed(1,10).forEach(x->{System.out.println("Current thread :: "+Thread.currentThread().getName()+" : "+x);
        });

        IntStream.rangeClosed(1,10).parallel().forEach(x->{System.out.println("Current thread :: "+Thread.currentThread().getName()+" : "+x);
        });*/


        List<Employee> manyEmployess = EmployeeDatabase.getManyEmployees();

        start= (int) System.currentTimeMillis();
        manyEmployess.stream().map(Employee::getSalary).mapToLong(i->i).average().getAsDouble();
        end=(int) System.currentTimeMillis();
        System.out.println("Print employees normal :: "+(end-start));

        start= (int) System.currentTimeMillis();
        manyEmployess.parallelStream().map(Employee::getSalary).mapToLong(i->i).average().getAsDouble();
        end=(int) System.currentTimeMillis();
        System.out.println("Print employees parallel :: "+(end-start));
    }
}

package com.java8;

import java.util.function.Function;
import java.util.stream.Stream;

public class FibExample {
    public static void main(String[] args) {
        //System.out.println(fib(7));
        fibStream(100);
    }

    public static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void fibStream(int n){
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]})
                .limit(n)
                .map(f->f[0])
                .forEach(System.out::println);
    }
}

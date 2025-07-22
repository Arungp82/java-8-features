package com.module1;

import java.util.stream.Stream;

public class Test1 {


    public static void main(String[] args){
       // int result = (2+3)*(5-2);

       // System.out.println("result is :: "+result);
fibStream(10);


    }

    public static void fibStream(int n){
        Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]})
                .limit(n)
                .map(f->f[0])
                .forEach(System.out::println);
    }
}

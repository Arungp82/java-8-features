package com.module1;



public class NthElementInFibonacci {
    //input: n=9
    //output: 34
    //0 1 1 2 3 5 8 13 21 34...
    public static void main(String[] args) {
        int n=9;
        System.out.println(fib(n));
    }

    static int fib(int n){
        if(n<=1) {
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }

    }



}

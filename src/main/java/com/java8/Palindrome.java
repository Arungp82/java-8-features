package com.java8;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args){
        String isPalindrome = "khlyifkufmjhfhgdjhgdfgdj";
        boolean isAPalindrome= IntStream.range(0,isPalindrome.length()/2)
                .noneMatch(i->isPalindrome.charAt(i) != isPalindrome.charAt(isPalindrome.length()-i-1) );
        if(isAPalindrome){
            System.out.println("its palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}

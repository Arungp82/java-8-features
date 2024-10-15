package com.java8;

public class BiPredicate {
    public static void main(String[] args) {
        java.util.function.BiPredicate<String,String> biPredicate1=new java.util.function.BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };

       System.out.println("Anonymous approach :: "+biPredicate1.test("madam","madam"));

        java.util.function.BiPredicate<String,String> biPredicate2 = String::equals;

        System.out.println("Lambda approach :: "+biPredicate2.test("liril","liril"));
    }
}

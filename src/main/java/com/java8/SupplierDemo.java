package com.java8;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo{
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("uiruyrty","sfgsf","wretwer","fsdf");

        String a = strList.stream().findFirst().orElseGet(()->"No matching data");
        System.out.println(a);
    }
}
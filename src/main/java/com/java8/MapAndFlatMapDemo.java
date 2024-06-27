package com.java8;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.CustomerDatabase;

public class MapAndFlatMapDemo {

    public static void main(String[] args) {

        List<Customer> customerList=CustomerDatabase.getCustomersList();
        //Map example to get the list of all customer's phone numbers
        //One to one mapping
        List<List<String>> phoneNumbers= customerList.stream().map(Customer::getPhoneNumbers).toList();
        System.out.println("phone numbers :: "+phoneNumbers);
        System.out.println("===============================================");
        //Map example to get the list of all customer's phone numbers
        //One to many mapping
        List<String> phoneNumbersFlatMap= customerList.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).toList();
        System.out.println("phone numbers flat map:: "+phoneNumbersFlatMap);
    }
}
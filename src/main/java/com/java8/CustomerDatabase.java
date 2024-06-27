package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDatabase {

    public static List<Customer> getCustomersList(){
        List<String> a=Arrays.asList("adf","asdf");

        List<Customer> customerList= new ArrayList<Customer>();

                customerList.add(new Customer(1,"sfg","abc@abc.com",Arrays.asList("2345","56345"),"Some address"));
                customerList.add(new Customer(122,"adf","abc@abc.com",Arrays.asList("2345","56345"),"Some address"));
                customerList.add(new Customer(2,"werewq","abc@abc.com",Arrays.asList("33456","5785678"),"Some address"));
                customerList.add(new Customer(3,"ywerrt","abc@abc.com",Arrays.asList("563456","7684567456"),"Some address"));
                customerList.add(new Customer(4,"yryuß","abc@abc.com",Arrays.asList("856785678","96789678"),"Some address"));
                return customerList;
    }
}

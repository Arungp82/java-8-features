package com.java8;

import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private String email;

    private List<String> phoneNumbers;
    private String address;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(int customerId, String customerName, String email, List<String> phoneNumbers, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
    }
}

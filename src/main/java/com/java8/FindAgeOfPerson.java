package com.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAgeOfPerson {
    public static void main(String[] args){
        //If birthday is on 5th Dec 1982

        LocalDate birthday = LocalDate.of(1982,12,05);
        LocalDate today = LocalDate.now();

        System.out.println("Age of the person :: "+ ChronoUnit.YEARS.between(birthday,today)+ " yrs");
    }
}

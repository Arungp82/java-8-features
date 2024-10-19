package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "s");

        // printList(stringList);
        stringList.forEach(printListAnother(s -> System.out.println(Integer.parseInt(s))));

    }


    static void printList(List<String> stringList) {
        for (String s : stringList) {
            try {
                System.out.println("Converting to integer :: " + Integer.parseInt(s));
            } catch (Exception ex) {
                System.out.println("Exception :: " + ex.getMessage());
            };
        }
    }

    //Another way
    static Consumer<String> printListAnother(Consumer<String> inputList) {
        return obj -> {
            try {
                inputList.accept(obj);
            } catch (Exception ex) {
                System.out.println("Exception :: " + ex.getMessage());
            }
        };
    }

    static <Target,ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
                                                                                    Class<ExObj> exObjClass){
        return obj -> {
            try {
                targetConsumer.accept(obj);
            } catch (Exception ex) {
                try{
                    System.out.println("Exception :::: "+ex.getMessage());
                }catch (NumberFormatException nfe){
                    throw nfe;
                }
            }
        };

    }
}

package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {
public static void main(String[] args) {
        //Lambda version of consumer 
        // List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
        // intList.stream().forEach(System.out::println);
        c.accept(5);
   };

   //Traditional approach
   //Remove the implements keyword from the class definition when using this approach
        static Consumer<Integer> c = new Consumer<Integer>() {
            public void accept(Integer t) {
            System.out.println("Given input->"+t);
    } 
        };
        

    //Traditional approach
    @Override
    public void accept(Integer t) {
        System.out.println("Given input->"+t);
    }   
    

    
}

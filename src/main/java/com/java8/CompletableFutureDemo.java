package com.module1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(
                ()->{
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                    return "Hello World";
                }


        );
        completableFuture.thenAccept(System.out::println);

    }
}

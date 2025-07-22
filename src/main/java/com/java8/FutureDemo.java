package com.module1;

import java.util.concurrent.*;

public class FutureDemo {

    // A Callable task that returns the factorial of a number
    static class FutureDemo1 implements Callable<Long> {
        private final int number;

        public FutureDemo1(int number) {
            this.number = number;
        }

        @Override
        public Long call() throws Exception {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
                Thread.sleep(5000); // Simulate long-running task
            }
            return result;
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        int input = 5;

        // Submit the task and get a Future
        Future<Long> futureResult = executor.submit(new FutureDemo1(input));

        try {
            System.out.println("Calculating factorial of " + input + "...");

            // Do other work here if needed...

            // Get the result (blocks if not ready)
            Long result = futureResult.get();

            System.out.println("Factorial of " + input + " is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

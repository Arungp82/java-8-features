package com.module1;

import java.util.concurrent.*;

public class FutureDemo1 {

    static class SquareCalculator implements Callable<Long> {

        private int number = 1;

        public SquareCalculator(Integer number) {
            this.number = number;
        }


        @Override
        public Long call() throws Exception {
            System.out.println("Calculating the square of the number " + number + " ");
            Thread.sleep(10000);
            return (long) number * number;

        }
    }

    public static void main(String[] args) throws ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Integer number = 5;
        Future<Long> futureResult = executorService.submit(new SquareCalculator(number));
        try {
            System.out.println("Square of the number " + number + "  " + futureResult.get());
        } catch (InterruptedException | ExecutionException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}

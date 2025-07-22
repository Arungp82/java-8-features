package com.module1;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
        public static void main(String[] args) {
            ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

            Runnable writer = () -> {
                for (int i = 0; i < 1000; i++) {
                    map.put("key" + i, i);
                }
            };

            Runnable reader = () -> {
                for (int i = 0; i < 1000; i++) {
                    map.get("key" + i);
                }
            };

            Thread t1 = new Thread(writer);
            Thread t2 = new Thread(reader);
            Thread t3 = new Thread(writer);

            t1.start();
            t2.start();
            t3.start();

            try {
                t1.join();
                t2.join();
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Map size: " + map.size());
        }


}

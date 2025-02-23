package com.java8;

public class DeadlockDemo {

    public static void main(String[] args){

    }

    class A {
        public int a =10;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }

    class B{
        public int b=20;

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
}

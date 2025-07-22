package com.module1;

@FunctionalInterface
public interface Validator<T> {
    boolean validate(T input);
}

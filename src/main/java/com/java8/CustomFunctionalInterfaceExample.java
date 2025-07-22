package com.module1;


public class CustomFunctionalInterfaceExample
{
    public static void main(String[] args) {
        Validator<String> stringValidator=input->{
            boolean isValid= !input.trim().isEmpty() && input.length()>5;
            return isValid;
        };

        String testString = "Functional";
        boolean isValid = stringValidator.validate(testString);
        System.out.println("Is the string valid? "+ isValid);

    }
}

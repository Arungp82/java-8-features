package com.module1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    // Regex pattern for password validation
    private static final String PASSWORD_PATTERN =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@!]).{8,}$";

    public static boolean isValidPassword(String password) {
        // Compile the regex
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

        // Match the password against the pattern
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password to validate: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid ✅");
        } else {
            System.out.println("Password is invalid ❌");
            System.out.println("Password must contain:");
            System.out.println("- At least 8 characters");
            System.out.println("- At least one lowercase letter");
            System.out.println("- At least one uppercase letter");
            System.out.println("- At least one digit");
            System.out.println("- At least one special character (@#$%^&+=!)");
        }

        scanner.close();

    }


}

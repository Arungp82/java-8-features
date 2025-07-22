package com.module1;

public class PermutationOfString {
    public static void main(String[] args) {
        //input: "cd"
        // output: cd dc
        String str = "cdef";
        System.out.println("All permutations of " + str + ":");
        permute(str, "");
    }

    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + ch);
        }
    }


}

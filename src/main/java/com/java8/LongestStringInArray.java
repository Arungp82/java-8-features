package com.java8;

import java.util.Arrays;

public class LongestStringInArray {
    public static void main(String[] args) {
        String[] strArray = {"dsqwer", "asdfdadfqwersdf", "fgsdfrgq", "ssfdg", "dgswertywetgzfdgbx"};

        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();

        System.out.println("longest string :: " + longestString);
    }
}

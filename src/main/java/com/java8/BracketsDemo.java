package com.module1;

import java.util.*;

public class BracketsDemo {
    public static void main(String[] args) {

        String s = "{[(]}";
        boolean result = isValid(s);
        System.out.println("result is :"+result);
        if (result) {
            System.out.println("Valid");
        }else System.out.println("Invalid");

    }

    private static boolean isValid(String brackets) {
        Map<Character, Character> characterMap = Map.of('}', '{', ']', '[', ')', '(');

        System.out.println(characterMap);
        Deque<Character> characterDeque = new ArrayDeque<>();
        for (char aa : brackets.toCharArray()) {
            if (characterMap.containsValue(aa)) {
                characterDeque.push(aa);
            } else if (characterMap.containsKey(aa)) {
                if (characterDeque.isEmpty() || characterDeque.pop() != characterMap.get(aa)) {
                    return false;
                }
            }
        }
        return characterDeque.isEmpty();
    }
}

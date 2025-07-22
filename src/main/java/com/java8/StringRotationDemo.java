package com.module1;

public class StringRotationDemo {

    public static void main(String[] args) {
        String orgiginalString = "decode";
        String toBeChecked = "codede";
        int rotationCharacters = 2;
        System.out.println("Result of Check for Rotation : " + checkForRotation(orgiginalString, toBeChecked));

        System.out.println("Result of left rotated string : " + leftRotatedString(orgiginalString, rotationCharacters));
        System.out.println("Result of right rotated string : " + rightRotatedString(orgiginalString, rotationCharacters));
        //rightRotationUsingLeftRotation(orgiginalString, rotationCharacters);
        System.out.println("Result of right rotation using left rotation : "+rightRotationUsingLeftRotation(orgiginalString,rotationCharacters));
    }

    static boolean checkForRotation(String original, String toBeChecked) {
        String concatenatedString = original + original;
        return concatenatedString.contains(toBeChecked);
    }

    static String leftRotatedString(String originalString, int r) {
        return originalString.substring(r) + originalString.substring(0, r);
    }

    static String rightRotatedString(String originalString, int rotationCharacters) {
        int partition = originalString.length() - rotationCharacters;
        return originalString.substring(partition) + originalString.substring(0, partition);
    }
//TODO
    //Right rotation can also be done using left rotation by changing few changes.

    static String rightRotationUsingLeftRotation(String originalString, int rotationCharacters) {
        int partition = originalString.length() - rotationCharacters;
        return leftRotatedString(originalString, partition);
    }
}

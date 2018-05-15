package code.vom.juventus.github.src.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionExercise {

    public static void main(String[] args) {
        List<String> testData = new ArrayList<>();
        testData.add("Anna");
        testData.add("Korb");
        testData.add("Bob");
        testData.add("Mein Computer");
        testData.add("Level");
        testData.add("Fuss");
        testData.add("Anna Bob Anna");
        testData.add("Kamel und Stein");
        testData.add("!+Level+!");

        for(String value : testData) {
            System.out.println("Is "+value+" a palindrome? " + isPalindrome(value));
        }
    }

    static boolean isPalindrome(String value) {
        if(value == null) return false;
        if(value.length() < 2) return true;

        String test = value.toUpperCase();

        if(test.substring(0,1).equals(test.substring(test.length()-1))) {
            return isPalindrome(test.substring(1, test.length()-1));
        } else {
            return false;
        }
    }
}

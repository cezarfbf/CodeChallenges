package com.codechallenges.stringmanipulation;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Civic";

//        System.out.println("is it a palindrome? "+isPalindrome(word));
        System.out.println("is it a palindrome? " + palindromeCheckStreams(word));

    }

    private static boolean palindromeCheckStreams(String word) {

        if (word == null) return false;

        String normalized = word.toLowerCase();

        System.out.println(normalized.length() / 2);

        return IntStream.range(0, normalized.length() / 2)
                .allMatch(i ->
                        normalized.charAt(i) ==
                                normalized.charAt(normalized.length() - 1 - i));

    }

    private static boolean isPalindrome(String word) {

        if (word == null) return false;

//        StringBuilder reversed = new StringBuilder();
        String normalized = word.toLowerCase();
//
//        for (int i = normalized.length() - 1; i >= 0; i--) {
//            reversed.append(normalized.charAt(i));
//        }

//        OR
        String reversed = StringUtils.reverse(word).toLowerCase();

        System.out.println("normalized: " + normalized);
        System.out.println("reverse: " + reversed);

        return normalized.contentEquals(reversed);
    }
}

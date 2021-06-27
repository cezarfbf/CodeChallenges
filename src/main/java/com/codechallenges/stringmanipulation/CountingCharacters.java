package com.codechallenges.stringmanipulation;

import java.util.List;
import java.util.stream.Collectors;

public class CountingCharacters {

    public static void main(String[] args) {
        String text = " aaa ggg  tRRT Ff 55      ";

        coutVowelsAndConsonants(text);
        findNumberOfVowelsAndConsonantsStreams(text);
    }

    private static void findNumberOfVowelsAndConsonantsStreams(String text) {

        if (text != null) {

            String vowels = "aeiouy";
            String normalized = text.toLowerCase().trim();

            List<Integer> letters = normalized.chars()
                    .filter(Character::isAlphabetic)
                    .boxed()
                    .collect(Collectors.toList());

            long vowelCount = letters.stream()
                    .filter(c -> vowels.indexOf(c) != -1)
                    .count();

            long consonantCount = letters.size() - vowelCount;

            System.out.println("vowels: " + vowelCount + " consonants: " + consonantCount);
        }
    }

    private static void coutVowelsAndConsonants(String text) {
        if (text != null) {

//            Arrays.stream(text.split(" ")).forEach(System.out::println);

            String vowels = "aeiouy";
            String normalized = text
                    .toLowerCase()
                    .replaceAll("\\s|\\d", "");

            System.out.println(normalized);

            int vowelCount = 0;
            int consonantCount = 0;

            for (char letter : normalized.toCharArray()) {
                if (vowels.indexOf(letter) != -1)
                    vowelCount++;
                else
                    consonantCount++;
            }

            System.out.println("vowels: " + vowelCount + " consonants: " + consonantCount);
        }
    }
}

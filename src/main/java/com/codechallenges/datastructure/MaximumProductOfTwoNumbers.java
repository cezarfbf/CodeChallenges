package com.codechallenges.datastructure;

import java.util.Arrays;

public class MaximumProductOfTwoNumbers {

    public static void main(String[] args) {
//        int[] numbers = {5, 3, 2, 5, 7, 10};
        int[] numbers = {-5, 3, 2, -5, 7, -10, 0};

        int maxProduct = getMaxProductArrays(numbers);

        System.out.println(maxProduct);
    }

    private static int getMaxProduct(int[] numbers) {

        int max = Integer.MIN_VALUE;

        if (numbers.length < 2) return max;

//        O(n²)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }

            }
        }

        return max;
    }

    private static int getMaxProductArrays(int[] numbers) {

        if (numbers.length < 2) return Integer.MIN_VALUE;

        System.out.println(Arrays.toString(numbers));

//        Quick sort
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int max = numbers[numbers.length-1] * numbers[numbers.length-2];
        int min = numbers[0] * numbers[1];

        return Math.max(max, min);
    }
}

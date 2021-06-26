package com.codechallenges.linkedin;

import java.util.Scanner;

public class EvenOrOdd {

    public static boolean isEven(int n) {
        return n % 2 == 0;
//        return (n & 1) == 0; bitwaser operator
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int insertedNum = scanner.nextInt();
        System.out.println("Is the number even?: " + isEven(insertedNum));

    }
}

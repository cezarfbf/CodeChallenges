package com.codechallenges.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
//        printBinary(6);
//        printBinary(-9);

        printBinaryUsingQueue(6);
        printBinaryUsingQueue(-9);
    }

    private static void printBinary(int n) {

        if (n <= 0){
            System.out.println("Nothing to print\n");
            return;
        }

        IntStream.range(1,n+1)
                .boxed()
                .map(Integer::toBinaryString)
                .forEach(System.out::println);

    }

    private static void printBinaryUsingQueue(int n) {

        if (n <= 0){
            System.out.println("Nothing to print\n");
            return;
        }

        Queue<Integer> queue = new LinkedList();
        queue.add(1);

        for (int i=1; i<=n; i++){
            Integer current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }

    }
}

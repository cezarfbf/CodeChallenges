package com.codechallenges.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }

        System.out.println("Unsorted: " + Arrays.toString(arr));

        //BUBBLE SORT O(N)^2
//        bubbleSort(arr);

        //SELECTION SORT O(N)^2
//        selectSort(arr);

        // QUICK SORT O(n log n)
//        quickSort(arr);

        // PANCAKE SORT O(n^2)
        pancakeSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int aux;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        System.out.println("Bubble Sort: " + Arrays.toString(arr));

    }

    private static void selectSort(int[] arr) {
        int menor_pos, aux;
        for (int i = 0; i < arr.length; i++) {
            menor_pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[menor_pos]) {
                    menor_pos = j;
                }
            }
            aux = arr[menor_pos];
            arr[menor_pos] = arr[i];
            arr[i] = aux;
        }

        System.out.println("Select Sort: " + Arrays.toString(arr));

    }

    private static void quickSort(int[] arr) {

        sortQS(arr, 0, arr.length - 1);

        System.out.println("Quick Sort: " + Arrays.toString(arr));

    }

    private static void sortQS(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partitionQS(arr, begin, end);

            sortQS(arr, begin, partitionIndex - 1);
            sortQS(arr, partitionIndex + 1, end);
        }
    }

    private static int partitionQS(int[] arr, int begin, int end) {

        // pivot is choosen randomly
        random(arr, begin, end);
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    // This Function helps in calculating
    // random numbers between low(inclusive)
    // and high(inclusive)
    static void random(int[] arr, int low, int high) {

        Random rand = new Random();
        int pivot = rand.nextInt(high - low) + low;

        int temp1 = arr[pivot];
        arr[pivot] = arr[high];
        arr[high] = temp1;
    }

    // The main function that
    // sorts given array using
    // flip operations
    private static void pancakeSort(int[] arr) {

        // Start from the complete
        // array and one by one
        // reduce current size by one
        for (int curr_size = arr.length; curr_size > 1;
             --curr_size) {
            // Find index of the
            // maximum element in
            // arr[0..curr_size-1]
            int mi = findMax(arr, curr_size);

            // Move the maximum element
            // to end of current array
            // if it's not already at
            // the end
            if (mi != curr_size - 1) {
                // To move at the end,
                // first move maximum
                // number to beginning
                flip(arr, mi);

                // Now move the maximum
                // number to end by
                // reversing current array
                flip(arr, curr_size - 1);
            }
        }

        System.out.println("Pancake Sort: " + Arrays.toString(arr));

    }

    private static int findMax(int arr[], int n) {
        int mi, i;
        for (mi = 0, i = 0; i < n; ++i)
            if (arr[i] > arr[mi])
                mi = i;
        return mi;
    }

    private static void flip(int arr[], int i) {
        int temp, start = 0;
        while (start < i) {
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }
}

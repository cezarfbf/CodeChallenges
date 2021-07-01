package com.codechallenges.datastructure;

import java.util.Arrays;

public class AlgoritmosOrdenacao {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * arr.length);
        }

        System.out.println("Unsorted: "+Arrays.toString(arr));

        //BUBBLE SORT O(N)^2
//        bubbleSort(arr);

        //SELECTION SORT O(N)^2
//        selectSort(arr);

        // QUICK SORT O(n log n)
        quickSort(arr);
    }

    private static void bubbleSort(int[] arr){
        int aux;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        System.out.println("Bubble Sort: "+Arrays.toString(arr));

    }

    private static void selectSort(int[] arr){
        int menor_pos, aux;
        for (int i=0; i<arr.length; i++){
            menor_pos = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[menor_pos]){
                    menor_pos = j;
                }
            }
            aux = arr[menor_pos];
            arr[menor_pos] = arr[i];
            arr[i] = aux;
        }

        System.out.println("Select Sort: "+Arrays.toString(arr));

    }

    private static void quickSort(int[] arr){

        sortQS(arr, 0, arr.length-1);

        System.out.println("Quick Sort: "+Arrays.toString(arr));

    }

    private static void sortQS(int[] arr, int begin, int end){
        if (begin < end) {
            int partitionIndex = partitionQS(arr, begin, end);

            sortQS(arr, begin, partitionIndex-1);
            sortQS(arr, partitionIndex+1, end);
        }
    }

    private static int partitionQS(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}

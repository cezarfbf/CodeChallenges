package com.codechallenges.general;

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.Collectors;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class CloseToZero {

    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(); // the number of temperatures to analyse
        List<Integer> temps = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            temps.add(in.nextInt());// a temperature expressed as an integer ranging from -273 to 5526
//            System.err.println("Debug messages:"+in.nextInt());
//        }

        temps.add(1);
        temps.add(-2);
        temps.add(-8);
        temps.add(4);
        temps.add(5);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(getClosestToZero(temps));
    }

    private static String getClosestToZero(List<Integer> temps) {
        if(temps.isEmpty()) return "0";
        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < temps.size(); i++) {
            int abs = Math.abs(temps.get(i));
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            } else if (abs == diff && temps.get(i) > 0 && temps.get(closestIndex) < 0) {
                //same distance to zero but positive
                closestIndex = i;
            }
        }
        return  temps.get(closestIndex).toString();
    }

    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        if (ts.length == 0)
            return 0;

        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < ts.length; i++) {
            int abs = Math.abs(ts[i]);
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            } else if (abs == diff && ts[i] > 0 && ts[closestIndex] < 0) {
                //same distance to zero but positive
                closestIndex = i;
            }
        }

        return ts[closestIndex];
    }

    public static int solve(int weight0, int weight1, int weight2) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        int[] arr = {weight0, weight1, weight2};

        int haviestIndex = 0;
        int max = 0;

        for (int i=0; i < arr.length; i++){

            if (arr[i] > max){
                max = arr[i];
                haviestIndex = i;
            }

        }

        return arr[haviestIndex];
    }

//    public static int[] filterDuplicates(int[] data) {
//        // Write your code here
//        // To debug: System.err.println("Debug messages...");
//        List<Integer> res = new ArrayList();
//
//        List<Integer> listWithoutDuplicates = new ArrayList<>(
//                new LinkedHashSet<Integer>(data));
//
//        for (int i=0; i < data.length; i++){
//
//            for (int i=0; i < data.length; i++){}
//
//        }
//
//            String a = "";
//            a = "asdf";
//
//        return res;
//    }


}
package com.codechallenges.codinggame;

import java.util.Scanner;

public class AneoFindMaxSpeedCrossTrafficLights {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        int lightCount = in.nextInt();
        int disDurArray[][] = new int[lightCount][2];

        for (int i = 0; i < lightCount; i++) {

            disDurArray[i][0] = in.nextInt();
            disDurArray[i][1] = in.nextInt();
        }

        for (int i = 0; i < lightCount; i++) {
            int dist = disDurArray[i][0];
            int dur = disDurArray[i][1];
            if (isRed(speed, dist, dur)){
                speed-- ;
                i = -1;
            }
            System.err.println("speed:"+speed+" lightCount:"+lightCount+" distance:"+dist+" duration:"+ dur);
        }

        // Write an answer using System.out.println()

        System.out.println(speed);
    }

    static boolean isRed(int speed, int dist, int dur){
        return (18 * dist) % (10 * speed * dur) >= (5 * speed * dur);
    }
}

package Massive;

import java.util.Scanner;

public class DisturbedOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenOfArray = scan.nextInt(), counterRes = 0;
        int[] buf = new int[lenOfArray];
        for (int i = 0; i <lenOfArray ; i++) {
            buf[i] = scan.nextInt();
        }
        for (int i = 0; i <lenOfArray -1 ; i++) {
            if (buf[i] > buf[i+1])
                counterRes++;
        }
        System.out.println(counterRes);
    }
}

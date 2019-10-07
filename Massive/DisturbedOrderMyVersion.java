package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class DisturbedOrderMyVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt(), counterRes = 0;
        int[] buf = new int[len];
        int[] sortBuf = new int[len];
        for (int i = 0; i <len ; i++) {
            buf[i] = scan.nextInt();
        }
        System.arraycopy(buf, 0, sortBuf, 0, len);
        Arrays.sort(sortBuf);

        for (int i = 0; i <len ; i++) {
            if (buf[i] != sortBuf[i])
                counterRes++;
        }
        System.out.println(Arrays.toString(buf));
        System.out.println(Arrays.toString(sortBuf));
        System.out.println(counterRes);
    }
}

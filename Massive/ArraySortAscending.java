package Massive;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAscending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenOfArray = scan.nextInt();
        int[] buf = new int[lenOfArray];
        for (int i = 0; i <lenOfArray ; i++)
            buf[i] = scan.nextInt();
        Arrays.sort(buf);
        for (int i = 0; i <lenOfArray ; i++) {
            System.out.print(buf[i]+ " ");
        }
//        System.out.println(Arrays.toString(buf));
    }
}

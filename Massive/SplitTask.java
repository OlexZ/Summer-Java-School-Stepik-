package Massive;

import java.util.Scanner;

public class SplitTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(", | - ");
        System.out.println(str[0] + ":");
        for (int i = 1; i <str.length ; i++)
            System.out.println("-" + str[i]);

    }
}

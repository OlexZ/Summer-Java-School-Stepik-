package DynamicArrayListS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BuildTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] temp = scan.nextLine().split("");
        int zero = temp.length - 2;
        for (String v : temp) System.out.print(v + " ");
        System.out.println();
        for (int i = 1, j = temp.length - 2; i < temp.length - 1; i++, j--) {
            System.out.print(temp[i] + " ");
            for (int k = 0; k < zero; k++) System.out.print(0 + " ");
            System.out.println(temp[j] + " ");
        }

        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print(temp[i] + " ");
        }


    }
}

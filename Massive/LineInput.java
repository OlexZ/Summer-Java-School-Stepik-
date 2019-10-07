package Massive;

import java.util.Scanner;

public class LineInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name1 = scan.next();
        String name2 = scan.next();
        if (name1.compareTo(name2) < 0) //-8
            System.out.println(name1);
        else
            System.out.println(name2);

    }
}

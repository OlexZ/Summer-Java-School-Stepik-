package Massive;

import java.util.Scanner;

public class TheLargestInCrementalSliceOfTheArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenOfArray = scan.nextInt();
        int[] buf = new int[lenOfArray];
        String temp = "";

        for (int i = 0; i <lenOfArray; i++)
            buf[i] = scan.nextInt();

        for (int i = 0; i <lenOfArray -1; i++) {
            temp += buf[i];
            if (buf[i] > buf[i+1])
                temp += "-";
            if (i == lenOfArray -2)
                temp += buf[i+1];
        }

        String[] stringArray = temp.split("-");

        int count = 0;
        for (String a: stringArray) {
            if (count < a.length()){
                count = a.length();
            }
        }
        System.out.println(count);
        for (String a: stringArray) {
            if(a.length() == count)
                System.out.println(a.replace(""," ").trim());
        }



    }
}

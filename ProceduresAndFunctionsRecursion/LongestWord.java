package ProceduresAndFunctionsRecursion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");

        System.out.println(maxLengthWord(s));
    }
    static String maxLengthWord(String [] s){
        Arrays.sort(s);
        String temp = "";
        for (String a:s) {
            if (temp.length() < a.length())
                temp = a;
        }
        return temp;
    }
}

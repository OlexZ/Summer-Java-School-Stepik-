package Massive;

import java.util.Scanner;
//abcdef abcfonpq
public class SubtractionOfLines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstWord = scan.next();
        String secondWord = scan.next();
        int a;
        for (int i = 0; i < firstWord.length(); i++) {
            a = secondWord.indexOf(firstWord.charAt(i));
            if (a == -1)
                System.out.print(firstWord.charAt(i));
        }
        for (int i = 0; i < secondWord.length(); i++) {
            a = firstWord.indexOf(secondWord.charAt(i));
            if (a == -1)
                System.out.print(secondWord.charAt(i));
        }
        }
    }


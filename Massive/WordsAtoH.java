package Massive;

import java.util.Scanner;

public class WordsAtoH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] symbol = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',};
        String[] text = scan.nextLine().split(" ");
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < symbol.length; j++) {
                if (text[i].startsWith(String.valueOf(symbol[j])))
                    System.out.println(text[i]);
            }
        }
    }
}

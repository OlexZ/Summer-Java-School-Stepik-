package Massive;

import java.util.Scanner;

public class ArrayDataProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int temp;
        String buf = "";
        for (int i = 0; i < count ; i++) {
            temp = in.nextInt();
            if(temp> 9 && temp < 100){
                if (temp % 2 == 0){
                    buf += (temp + " ");
                }
            }

        }
        if (buf.isEmpty())
            System.out.println(-1);
        else
            System.out.println(buf);
    }
}

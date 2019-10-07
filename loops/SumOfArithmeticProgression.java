package loops;

import java.util.Scanner;

public class SumOfArithmeticProgression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long res = 0;
        for (long i = 0; i <= n; i++) {
           res =  res + i;
        }
        System.out.println(res);
    }
}

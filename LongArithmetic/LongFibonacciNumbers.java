package LongArithmetic;

import java.math.BigInteger;
import java.util.Scanner;

public class LongFibonacciNumbers {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println(getFibonacci(stdIn.nextInt()));

    }

    private static BigInteger getFibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 31 - Integer.numberOfLeadingZeros(n); i >= 0; i--) {
            BigInteger d = a.multiply(b.shiftLeft(1).subtract(a));
            BigInteger e = a.multiply(a).add(b.multiply(b));
            a = d;
            b = e;
            if (((n >>> i) & 1) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
            }
        }
        return a;
    }
}

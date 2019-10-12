package LongArithmetic;

import java.math.BigInteger;
import java.util.Scanner;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println(stdIn.nextBigInteger().gcd(stdIn.nextBigInteger()));
    }

}

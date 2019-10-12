package LongArithmetic;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(String.valueOf(stdIn.nextBigInteger()));
        System.out.println(bigInteger.multiply(stdIn.nextBigInteger()));
    }
}

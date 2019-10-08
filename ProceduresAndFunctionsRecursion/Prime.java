package ProceduresAndFunctionsRecursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPrime(n));

        //Best Solution
//          static boolean isPrime(long n){
//          return java.math.BigInteger.valueOf(n).isProbablePrime(1);
//          }
        // d


    }

    static boolean isPrime(long n) {
        long temp;
        boolean isP = true;
        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0) {
                isP = false;
                break;
            }
        }
        return isP;
    }
}

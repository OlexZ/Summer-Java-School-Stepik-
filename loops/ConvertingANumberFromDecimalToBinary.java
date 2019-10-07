package loops;

import java.util.Scanner;

public class ConvertingANumberFromDecimalToBinary {
    public static void main(String[] args) {
//        int n = new Scanner(System.in).nextInt();
//        System.out.println(Integer.toBinaryString(n));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0, r = 1;
        while(n > 0){
            ans += n % 2 * r;
            r*=10;
            n/=2;
        }
        System.out.print(ans);
    }
}

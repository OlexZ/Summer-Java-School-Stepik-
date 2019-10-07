package DynamicArrayListS;

import java.util.Arrays;
import java.util.Scanner;
// uguutu        abcb        abcded        abcdefghijkjihgfe
// utuugu        bcda        dedcba
// uguutuugu     abcba       abcdedcba      abcdefghijkjihgfedcba
public class ComplexPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scan.next());
        int a = 0;
        for (int i = 0; i <str.length(); i++) {
            if (str.toString().equals(str.reverse().toString()))
                break;
            str.reverse();
            str.insert(str.length() - a, str.charAt(i));
            a++;
        }
        System.out.println(str);
    }
}

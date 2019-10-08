package ProceduresAndFunctionsRecursion;

import java.util.Scanner;

//a.a a?a- #@*?&_*%!`aA/A!a
public class FPalindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(isPalindrome(s));


    }

    static boolean isPalindrome(String s) {
        String temp = "";
        boolean res = false;
        for (char i : s.toCharArray())
            if (Character.isLetter(i))
                temp += i;
        StringBuilder str = new StringBuilder(temp.toLowerCase());
        if (str.toString().equals(str.reverse().toString()))
            return true;
        return false;
    }
}

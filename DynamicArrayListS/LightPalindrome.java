package DynamicArrayListS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LightPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList listRev = new ArrayList<Character>();
        String words =  scan.next();
        for (int i = 0; i <words.length() ; i++) {
            listRev.add(words.charAt(i));
            System.out.print(words.charAt(i));
        }
        Collections.reverse(listRev);
        for (int i = 0; i <listRev.size() ; i++) {
            System.out.print(listRev.get(i));
        }

    }
}

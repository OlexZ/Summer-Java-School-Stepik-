package HashSetANDTreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class RowAssembly {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        TreeSet<Character> treeSet = new TreeSet<>();
        String s = stdIn.nextLine().toLowerCase();
        for (int i = 0; i <s.length();i++)
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') treeSet.add(s.charAt(i));
        System.out.println(treeSet);

        for (Character i: treeSet) {
            System.out.print(i + " ");
        }
    }
}
